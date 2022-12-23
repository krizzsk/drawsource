package com.iab.omid.library.amazon.p231b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.amazon.adsession.ErrorType;
import com.iab.omid.library.amazon.p233d.C7692c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.b.e */
public class C7680e {

    /* renamed from: a */
    private static C7680e f18577a = new C7680e();

    private C7680e() {
    }

    /* renamed from: a */
    public static final C7680e m21259a() {
        return f18577a;
    }

    /* renamed from: a */
    public void mo54574a(WebView webView) {
        mo54580a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo54575a(WebView webView, float f) {
        mo54580a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo54576a(WebView webView, ErrorType errorType, String str) {
        mo54580a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo54577a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo54584a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo54578a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo54580a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo54580a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo54579a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo54580a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54580a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo54583a(sb, objArr);
            sb.append(")}");
            mo54581a(webView, sb);
            return;
        }
        C7692c.m21324a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54581a(final WebView webView, StringBuilder sb) {
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
    public void mo54582a(WebView webView, JSONObject jSONObject) {
        mo54580a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54583a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo54584a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo54585b(WebView webView) {
        mo54580a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo54586b(WebView webView, String str) {
        mo54580a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo54587b(WebView webView, JSONObject jSONObject) {
        mo54580a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo54588c(WebView webView) {
        mo54580a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo54589c(WebView webView, String str) {
        mo54580a(webView, "setState", str);
    }
}
