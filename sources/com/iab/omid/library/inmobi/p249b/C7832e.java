package com.iab.omid.library.inmobi.p249b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.p251d.C7844c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.b.e */
public class C7832e {

    /* renamed from: a */
    private static C7832e f18927a = new C7832e();

    private C7832e() {
    }

    /* renamed from: a */
    public static final C7832e m21947a() {
        return f18927a;
    }

    /* renamed from: a */
    public void mo55167a(WebView webView) {
        mo55173a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo55168a(WebView webView, float f) {
        mo55173a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo55169a(WebView webView, ErrorType errorType, String str) {
        mo55173a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo55170a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo55177a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo55171a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo55173a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo55173a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo55172a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo55173a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55173a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo55176a(sb, objArr);
            sb.append(")}");
            mo55174a(webView, sb);
            return;
        }
        C7844c.m22010a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55174a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new Runnable() {
                public void run() {
                    webView.loadUrl(sb2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo55175a(WebView webView, JSONObject jSONObject) {
        mo55173a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55176a(StringBuilder sb, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append(Typography.quote);
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append(Typography.quote);
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append(Typography.quote);
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    /* renamed from: a */
    public boolean mo55177a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo55178b(WebView webView) {
        mo55173a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo55179b(WebView webView, String str) {
        mo55173a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo55180b(WebView webView, JSONObject jSONObject) {
        mo55173a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo55181c(WebView webView) {
        mo55173a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo55182c(WebView webView, String str) {
        mo55173a(webView, "setState", str);
    }
}
