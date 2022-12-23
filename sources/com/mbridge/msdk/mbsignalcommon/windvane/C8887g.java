package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.mbsignalcommon.base.C8860e;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.g */
/* compiled from: WindVaneCallJs */
public final class C8887g {

    /* renamed from: a */
    private static C8887g f21906a = new C8887g();

    private C8887g() {
    }

    /* renamed from: a */
    public static C8887g m25669a() {
        return f21906a;
    }

    /* renamed from: a */
    public final void mo58689a(Object obj, String str, String str2) {
        String str3;
        if (obj instanceof C8881a) {
            C8881a aVar = (C8881a) obj;
            if (TextUtils.isEmpty(str2)) {
                str3 = String.format("javascript:window.WindVane.fireEvent('%s', '');", new Object[]{str});
            } else {
                str3 = String.format("javascript:window.WindVane.fireEvent('%s','%s');", new Object[]{str, C8890j.m25680c(str2)});
            }
            if (aVar.f21883a != null && !aVar.f21883a.isDestoryed()) {
                try {
                    aVar.f21883a.loadUrl(str3);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58687a(WebView webView, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = String.format("javascript:window.WindVane.fireEvent('%s', '');", new Object[]{str});
        } else {
            str3 = String.format("javascript:window.WindVane.fireEvent('%s','%s');", new Object[]{str, C8890j.m25680c(str2)});
        }
        if (webView == null) {
            return;
        }
        if (!(webView instanceof WindVaneWebView) || !((WindVaneWebView) webView).isDestoryed()) {
            try {
                webView.loadUrl(str3);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo58688a(Object obj, String str) {
        String str2;
        if (obj instanceof C8881a) {
            C8881a aVar = (C8881a) obj;
            if (TextUtils.isEmpty(str)) {
                str2 = String.format("javascript:window.WindVane.onSuccess(%s,'');", new Object[]{aVar.f21889g});
            } else {
                str2 = String.format("javascript:window.WindVane.onSuccess(%s,'%s');", new Object[]{aVar.f21889g, C8890j.m25680c(str)});
            }
            if (aVar.f21883a != null && !aVar.f21883a.isDestoryed()) {
                try {
                    aVar.f21883a.loadUrl(str2);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo58690b(Object obj, String str) {
        if (obj instanceof C8881a) {
            C8881a aVar = (C8881a) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.WindVane.onFailure(%s,'');", new Object[]{aVar.f21889g});
            } else {
                str = C8890j.m25680c(str);
            }
            String format = String.format("javascript:window.WindVane.onFailure(%s,'%s');", new Object[]{aVar.f21889g, str});
            if (aVar.f21883a != null && !aVar.f21883a.isDestoryed()) {
                try {
                    aVar.f21883a.loadUrl(format);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58686a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            f21906a.mo58687a(webView, C8860e.f21839j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            f21906a.mo58687a(webView, C8860e.f21839j, "");
        } catch (Throwable unused2) {
            f21906a.mo58687a(webView, C8860e.f21839j, "");
        }
    }
}
