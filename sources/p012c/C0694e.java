package p012c;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.ErrorType;
import kotlin.text.Typography;
import org.json.JSONObject;
import p397e.C12467c;

/* renamed from: c.e */
public class C0694e {

    /* renamed from: a */
    private static C0694e f65a = new C0694e();

    /* renamed from: c.e$a */
    class C0695a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f66a;

        /* renamed from: b */
        final /* synthetic */ String f67b;

        C0695a(C0694e eVar, WebView webView, String str) {
            this.f66a = webView;
            this.f67b = str;
        }

        public void run() {
            this.f66a.loadUrl(this.f67b);
        }
    }

    private C0694e() {
    }

    /* renamed from: a */
    public static final C0694e m57a() {
        return f65a;
    }

    /* renamed from: a */
    public void mo10286a(WebView webView) {
        mo10293a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo10287a(WebView webView, float f) {
        mo10293a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo10288a(WebView webView, ErrorType errorType, String str) {
        mo10293a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo10289a(WebView webView, String str) {
        mo10293a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: a */
    public void mo10290a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo10301c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo10291a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo10293a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo10293a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo10292a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo10293a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10293a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo10296a(sb, objArr);
            sb.append(")}");
            mo10294a(webView, sb);
            return;
        }
        C12467c.m33302a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10294a(WebView webView, StringBuilder sb) {
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new C0695a(this, webView, sb2));
        }
    }

    /* renamed from: a */
    public void mo10295a(WebView webView, JSONObject jSONObject) {
        mo10293a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10296a(StringBuilder sb, Object[] objArr) {
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

    /* renamed from: b */
    public void mo10297b(WebView webView) {
        mo10293a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo10298b(WebView webView, String str) {
        mo10293a(webView, "setState", str);
    }

    /* renamed from: b */
    public void mo10299b(WebView webView, JSONObject jSONObject) {
        mo10293a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo10300c(WebView webView) {
        mo10293a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public boolean mo10301c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }
}
