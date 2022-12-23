package com.ironsource.sdk.p280c;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ironsource.environment.p204e.C6385a;
import com.ironsource.sdk.C8099a;
import com.ironsource.sdk.p278a.C8100a;
import com.ironsource.sdk.p278a.C8104d;
import com.ironsource.sdk.p278a.C8106f;
import com.ironsource.sdk.p279b.C8109a;
import com.ironsource.sdk.p279b.C8110b;
import com.ironsource.sdk.p279b.C8112c;
import com.ironsource.sdk.p280c.C8125e;
import com.ironsource.sdk.utils.C8345d;
import com.ironsource.sdk.utils.Logger;
import com.vungle.warren.model.Advertisement;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.c */
public class C8119c implements C8125e {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f19683f = C8119c.class.getSimpleName();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final String f19684a;

    /* renamed from: b */
    public String f19685b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public WebView f19686c;

    /* renamed from: d */
    public C8110b f19687d;

    /* renamed from: e */
    public C8099a f19688e;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Activity f19689g;

    public C8119c(C8109a aVar, Activity activity, String str, C8099a aVar2) {
        this.f19689g = activity;
        C8110b bVar = new C8110b();
        this.f19687d = bVar;
        bVar.f19657d = str;
        this.f19684a = str;
        this.f19687d.f19654a = aVar;
        this.f19688e = aVar2;
    }

    /* renamed from: a */
    static /* synthetic */ void m23210a(C8119c cVar, final String str) {
        Logger.m23749i(f19683f, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.f19689g);
        cVar.f19686c = webView;
        webView.addJavascriptInterface(new C8118b(cVar), "containerMsgHandler");
        cVar.f19686c.setWebViewClient(new C8112c(new C8125e.C8126a() {
            /* renamed from: a */
            public final void mo56343a(String str) {
                String a = C8119c.f19683f;
                Logger.m23749i(a, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
                C8119c.this.mo56339b(str, str);
            }

            /* renamed from: b */
            public final void mo56344b(String str) {
                String a = C8119c.f19683f;
                Logger.m23749i(a, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
                try {
                    ((ViewGroup) C8119c.this.f19686c.getParent()).removeView(C8119c.this.f19686c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C8119c.this.m23214c();
            }
        }));
        C8345d.m23776a(cVar.f19686c);
        cVar.f19687d.f19656c = cVar.f19686c;
    }

    /* renamed from: b */
    static /* synthetic */ String m23212b(C8119c cVar, String str) {
        if (!str.startsWith(".")) {
            return str;
        }
        StringBuilder sb = new StringBuilder(Advertisement.FILE_SCHEME);
        sb.append(cVar.f19685b);
        String substring = str.substring(str.indexOf("/") + 1);
        sb.append(substring.substring(substring.indexOf("/")));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m23214c() {
        mo56328a("", "");
    }

    /* renamed from: a */
    public final synchronized void mo56328a(final String str, final String str2) {
        if (this.f19689g != null) {
            Logger.m23749i(f19683f, "performCleanup");
            C6385a.f16166a.mo35891a(new Runnable() {
                public final void run() {
                    try {
                        if (C8119c.this.f19686c != null) {
                            C8119c.this.f19686c.destroy();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("adViewId", C8119c.this.f19684a);
                        if (C8119c.this.f19687d != null) {
                            C8119c.this.f19687d.mo56317a(str, jSONObject);
                            C8110b c = C8119c.this.f19687d;
                            c.f19654a = null;
                            c.f19655b = null;
                        }
                        C8110b unused = C8119c.this.f19687d = null;
                        Activity unused2 = C8119c.this.f19689g = null;
                    } catch (Exception e) {
                        String a = C8119c.f19683f;
                        Log.e(a, "performCleanup | could not destroy ISNAdView webView ID: " + C8119c.this.f19684a);
                        C8104d.m23161a(C8106f.f19636o, (Map<String, Object>) new C8100a().mo56293a("callfailreason", e.getMessage()).f19613a);
                        C8119c.this.mo56339b(str2, e.getMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56329a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            mo56339b(str3, "action parameter empty");
            return;
        }
        String str4 = f19683f;
        Logger.m23749i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.f19686c.onPause();
            } else if (str.equals("onResume")) {
                this.f19686c.onResume();
            } else {
                mo56339b(str3, "action not supported");
                return;
            }
            this.f19687d.mo56313a(str2);
        } catch (Exception unused) {
            mo56339b(str3, "failed to perform action");
        }
    }

    /* renamed from: a */
    public final void mo56330a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f19687d.mo56318b(str);
        } catch (Exception e) {
            String str3 = f19683f;
            Logger.m23749i(str3, "sendHandleGetViewVisibility fail with reason: " + e.getMessage());
        }
    }

    /* renamed from: b */
    public final WebView mo56331b() {
        return this.f19686c;
    }

    /* renamed from: b */
    public final void mo56339b(String str, String str2) {
        C8110b bVar = this.f19687d;
        if (bVar != null) {
            bVar.mo56315a(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo56332b(JSONObject jSONObject, String str, String str2) {
        try {
            this.f19687d.mo56316a(jSONObject.getString("params"), str, str2);
        } catch (Exception e) {
            String str3 = f19683f;
            Logger.m23749i(str3, "sendMessageToAd fail message: " + e.getMessage());
            throw e;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        C8110b bVar = this.f19687d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !bVar.mo56319c(optString)) {
                bVar.mo56317a("containerSendMessage", jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.mo56316a(bVar.mo56312a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e) {
            String str2 = bVar.f19658e;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e.printStackTrace();
        }
    }
}
