package com.iab.omid.library.vungle.p273b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.p275d.C8058c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.b.e */
public class C8046e {

    /* renamed from: a */
    private static C8046e f19460a = new C8046e();

    private C8046e() {
    }

    /* renamed from: a */
    public static final C8046e m22948a() {
        return f19460a;
    }

    /* renamed from: a */
    public void mo56084a(WebView webView) {
        mo56090a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo56085a(WebView webView, float f) {
        mo56090a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo56086a(WebView webView, ErrorType errorType, String str) {
        mo56090a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo56087a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo56094a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo56088a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo56090a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo56090a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo56089a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo56090a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56090a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo56093a(sb, objArr);
            sb.append(")}");
            mo56091a(webView, sb);
            return;
        }
        C8058c.m23011a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56091a(final WebView webView, StringBuilder sb) {
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
    public void mo56092a(WebView webView, JSONObject jSONObject) {
        mo56090a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56093a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo56094a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo56095b(WebView webView) {
        mo56090a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo56096b(WebView webView, String str) {
        mo56090a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo56097b(WebView webView, JSONObject jSONObject) {
        mo56090a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo56098c(WebView webView) {
        mo56090a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo56099c(WebView webView, String str) {
        mo56090a(webView, "setState", str);
    }
}
