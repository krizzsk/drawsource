package com.iab.omid.library.ironsrc.p255b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.p257d.C7894c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.b.e */
public class C7882e {

    /* renamed from: a */
    private static C7882e f19041a = new C7882e();

    private C7882e() {
    }

    /* renamed from: a */
    public static C7882e m22169a() {
        return f19041a;
    }

    /* renamed from: a */
    public void mo55353a(WebView webView) {
        mo55359a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo55354a(WebView webView, float f) {
        mo55359a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo55355a(WebView webView, ErrorType errorType, String str) {
        mo55359a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo55356a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo55363a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo55357a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo55359a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo55359a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo55358a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo55359a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55359a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo55362a(sb, objArr);
            sb.append(")}");
            mo55360a(webView, sb);
            return;
        }
        C7894c.m22231a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55360a(final WebView webView, StringBuilder sb) {
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
    public void mo55361a(WebView webView, JSONObject jSONObject) {
        mo55359a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55362a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo55363a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo55364b(WebView webView) {
        mo55359a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo55365b(WebView webView, String str) {
        mo55359a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo55366b(WebView webView, JSONObject jSONObject) {
        mo55359a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo55367c(WebView webView) {
        mo55359a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo55368c(WebView webView, String str) {
        mo55359a(webView, "setState", str);
    }
}
