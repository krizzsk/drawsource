package com.iab.omid.library.fyber.p243b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.fyber.adsession.ErrorType;
import com.iab.omid.library.fyber.p245d.C7793c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.b.e */
public class C7781e {

    /* renamed from: a */
    private static C7781e f18811a = new C7781e();

    private C7781e() {
    }

    /* renamed from: a */
    public static final C7781e m21719a() {
        return f18811a;
    }

    /* renamed from: a */
    public void mo54972a(WebView webView) {
        mo54978a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo54973a(WebView webView, float f) {
        mo54978a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo54974a(WebView webView, ErrorType errorType, String str) {
        mo54978a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo54975a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo54982a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo54976a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo54978a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo54978a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo54977a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo54978a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54978a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo54981a(sb, objArr);
            sb.append(")}");
            mo54979a(webView, sb);
            return;
        }
        C7793c.m21784a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54979a(final WebView webView, StringBuilder sb) {
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
    public void mo54980a(WebView webView, JSONObject jSONObject) {
        mo54978a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54981a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo54982a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo54983b(WebView webView) {
        mo54978a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo54984b(WebView webView, String str) {
        mo54978a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo54985b(WebView webView, JSONObject jSONObject) {
        mo54978a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo54986c(WebView webView) {
        mo54978a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo54987c(WebView webView, String str) {
        mo54978a(webView, "setState", str);
    }
}
