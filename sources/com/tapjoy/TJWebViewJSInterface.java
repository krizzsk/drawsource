package com.tapjoy;

import android.os.AsyncTask;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public class TJWebViewJSInterface {

    /* renamed from: a */
    WebView f26737a;

    /* renamed from: b */
    TJWebViewJSInterfaceListener f26738b;

    /* renamed from: c */
    private final ConcurrentLinkedQueue<String> f26739c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    private boolean f26740d;

    public TJWebViewJSInterface(WebView webView, TJWebViewJSInterfaceListener tJWebViewJSInterfaceListener) {
        this.f26737a = webView;
        this.f26738b = tJWebViewJSInterfaceListener;
    }

    @JavascriptInterface
    public void dispatchMethod(String str) {
        TapjoyLog.m30839d("TJWebViewJSInterface", "dispatchMethod params: ".concat(String.valueOf(str)));
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getJSONObject("data").getString("method");
            TapjoyLog.m30839d("TJWebViewJSInterface", "method: ".concat(String.valueOf(string)));
            if (this.f26738b != null && this.f26737a != null) {
                this.f26738b.onDispatchMethod(string, jSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callback(ArrayList<?> arrayList, String str, String str2) {
        try {
            callbackToJavaScript(new JSONArray(arrayList), str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callback(Map<?, ?> map, String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject(map));
            callbackToJavaScript(jSONArray, str, str2);
        } catch (Exception e) {
            TapjoyLog.m30841e("TJWebViewJSInterface", "Exception in callback to JS: " + e.toString());
            e.printStackTrace();
        }
    }

    public void callbackToJavaScript(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TJAdUnitConstants.String.ARGUMENTS, obj);
            if (str != null && str.length() > 0) {
                jSONObject.put("method", str);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (str2 != null && str2.length() > 0) {
                jSONObject2.put(TJAdUnitConstants.String.CALLBACK_ID, str2);
            }
            jSONObject2.put("data", jSONObject);
            String str3 = "javascript:if(window.AndroidWebViewJavascriptBridge) AndroidWebViewJavascriptBridge._handleMessageFromAndroid('" + jSONObject2 + "');";
            if (!this.f26740d) {
                this.f26739c.add(str3);
            } else if (this.f26737a != null) {
                new C11241a(this.f26737a).execute(new String[]{str3});
            } else {
                TapjoyLog.m30844w("TJWebViewJSInterface", "No available webview to execute js");
            }
        } catch (Exception e) {
            TapjoyLog.m30841e("TJWebViewJSInterface", "Exception in callback to JS: " + e.toString());
            e.printStackTrace();
        }
    }

    public void flushMessageQueue() {
        if (!this.f26740d) {
            while (true) {
                String poll = this.f26739c.poll();
                if (poll == null) {
                    this.f26740d = true;
                    return;
                } else if (this.f26737a != null) {
                    new C11241a(this.f26737a).execute(new String[]{poll});
                }
            }
        }
    }

    /* renamed from: com.tapjoy.TJWebViewJSInterface$a */
    class C11241a extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        WebView f26741a;

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return ((String[]) objArr)[0];
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            if (this.f26741a == null) {
                return;
            }
            if (!str.startsWith("javascript:") || Build.VERSION.SDK_INT < 19) {
                try {
                    this.f26741a.loadUrl(str);
                } catch (Exception e) {
                    TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.INTERNAL_ERROR;
                    TapjoyLog.m30840e("TJWebViewJSInterface", new TapjoyErrorMessage(errorType, "Exception in loadUrl. Device not supported. " + e.toString()));
                }
            } else {
                try {
                    String replaceFirst = str.replaceFirst("javascript:", "");
                    if (this.f26741a != null) {
                        this.f26741a.evaluateJavascript(replaceFirst, (ValueCallback) null);
                    }
                } catch (Exception e2) {
                    TapjoyErrorMessage.ErrorType errorType2 = TapjoyErrorMessage.ErrorType.INTERNAL_ERROR;
                    TapjoyLog.m30840e("TJWebViewJSInterface", new TapjoyErrorMessage(errorType2, "Exception in evaluateJavascript. Device not supported. " + e2.toString()));
                }
            }
        }

        public C11241a(WebView webView) {
            this.f26741a = webView;
        }
    }
}
