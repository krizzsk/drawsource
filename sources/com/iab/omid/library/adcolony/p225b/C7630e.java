package com.iab.omid.library.adcolony.p225b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.p227d.C7642c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.b.e */
public class C7630e {

    /* renamed from: a */
    private static C7630e f18460a = new C7630e();

    private C7630e() {
    }

    /* renamed from: a */
    public static final C7630e m21029a() {
        return f18460a;
    }

    /* renamed from: a */
    public void mo54375a(WebView webView) {
        mo54381a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo54376a(WebView webView, float f) {
        mo54381a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo54377a(WebView webView, ErrorType errorType, String str) {
        mo54381a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo54378a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo54385a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo54379a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo54381a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo54381a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo54380a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo54381a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54381a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo54384a(sb, objArr);
            sb.append(")}");
            mo54382a(webView, sb);
            return;
        }
        C7642c.m21094a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54382a(final WebView webView, StringBuilder sb) {
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
    public void mo54383a(WebView webView, JSONObject jSONObject) {
        mo54381a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54384a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo54385a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo54386b(WebView webView) {
        mo54381a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo54387b(WebView webView, String str) {
        mo54381a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo54388b(WebView webView, JSONObject jSONObject) {
        mo54381a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo54389c(WebView webView) {
        mo54381a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo54390c(WebView webView, String str) {
        mo54381a(webView, "setState", str);
    }
}
