package com.iab.omid.library.mmadbridge.p261b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.ErrorType;
import com.iab.omid.library.mmadbridge.p263d.C7944c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.b.e */
public class C7932e {

    /* renamed from: a */
    private static C7932e f19155a = new C7932e();

    private C7932e() {
    }

    /* renamed from: a */
    public static final C7932e m22394a() {
        return f19155a;
    }

    /* renamed from: a */
    public void mo55551a(WebView webView) {
        mo55557a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo55552a(WebView webView, float f) {
        mo55557a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo55553a(WebView webView, ErrorType errorType, String str) {
        mo55557a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo55554a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo55561a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo55555a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo55557a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo55557a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo55556a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo55557a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55557a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo55560a(sb, objArr);
            sb.append(")}");
            mo55558a(webView, sb);
            return;
        }
        C7944c.m22459a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55558a(final WebView webView, StringBuilder sb) {
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
    public void mo55559a(WebView webView, JSONObject jSONObject) {
        mo55557a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55560a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo55561a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo55562b(WebView webView) {
        mo55557a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo55563b(WebView webView, String str) {
        mo55557a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo55564b(WebView webView, JSONObject jSONObject) {
        mo55557a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo55565c(WebView webView) {
        mo55557a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo55566c(WebView webView, String str) {
        mo55557a(webView, "setState", str);
    }
}
