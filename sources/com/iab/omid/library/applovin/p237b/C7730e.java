package com.iab.omid.library.applovin.p237b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.p239d.C7742c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.b.e */
public class C7730e {

    /* renamed from: a */
    private static C7730e f18694a = new C7730e();

    private C7730e() {
    }

    /* renamed from: a */
    public static final C7730e m21489a() {
        return f18694a;
    }

    /* renamed from: a */
    public void mo54773a(WebView webView) {
        mo54779a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo54774a(WebView webView, float f) {
        mo54779a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo54775a(WebView webView, ErrorType errorType, String str) {
        mo54779a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo54776a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo54783a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo54777a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo54779a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo54779a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo54778a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo54779a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54779a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo54782a(sb, objArr);
            sb.append(")}");
            mo54780a(webView, sb);
            return;
        }
        C7742c.m21554a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54780a(final WebView webView, StringBuilder sb) {
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
    public void mo54781a(WebView webView, JSONObject jSONObject) {
        mo54779a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54782a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo54783a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo54784b(WebView webView) {
        mo54779a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo54785b(WebView webView, String str) {
        mo54779a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo54786b(WebView webView, JSONObject jSONObject) {
        mo54779a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo54787c(WebView webView) {
        mo54779a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo54788c(WebView webView, String str) {
        mo54779a(webView, "setState", str);
    }
}
