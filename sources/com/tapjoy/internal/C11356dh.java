package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dh */
public final class C11356dh {

    /* renamed from: a */
    private static C11356dh f27123a = new C11356dh();

    private C11356dh() {
    }

    /* renamed from: a */
    public static final C11356dh m31057a() {
        return f27123a;
    }

    /* renamed from: a */
    private void m31058a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new Runnable() {
                public final void run() {
                    webView.loadUrl(sb2);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m31059a(StringBuilder sb, Object[] objArr) {
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
    public static boolean m31060a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        return true;
    }

    /* renamed from: a */
    public final void mo69803a(WebView webView, float f) {
        mo69806a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo69804a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo69806a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo69806a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public final void mo69805a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo69806a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public final void mo69806a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            m31059a(sb, objArr);
            sb.append(")}");
            m31058a(webView, sb);
            return;
        }
        C11367dp.m31088a("The WebView is null for ".concat(String.valueOf(str)));
    }

    /* renamed from: b */
    public final void mo69807b(WebView webView, String str) {
        mo69806a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: c */
    public final void mo69808c(WebView webView, String str) {
        mo69806a(webView, "setState", str);
    }
}
