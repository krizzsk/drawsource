package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a */
/* compiled from: CallMraidJS */
public final class C8871a {

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a */
    /* compiled from: CallMraidJS */
    private static class C8872a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8871a f21854a = new C8871a();
    }

    /* renamed from: a */
    public static C8871a m25621a() {
        return C8872a.f21854a;
    }

    /* renamed from: a */
    public final void mo58628a(WebView webView) {
        m25622c(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    /* renamed from: a */
    public final void mo58634a(WebView webView, Map<String, Object> map) {
        if (map != null && map.size() != 0) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), next.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            m25622c(webView, String.format("javascript:window.mraidbridge.fireChangeEvent(%s);", new Object[]{jSONObject.toString()}));
        }
    }

    /* renamed from: a */
    public final void mo58633a(WebView webView, String str, String str2) {
        m25622c(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", new Object[]{str2, str}));
    }

    /* renamed from: a */
    public final void mo58630a(WebView webView, float f, float f2) {
        m25622c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: a */
    public final void mo58629a(WebView webView, double d) {
        m25622c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.audioVolumeChange(%s);", new Object[]{Double.valueOf(d)}));
    }

    /* renamed from: b */
    public final void mo58635b(WebView webView, float f, float f2) {
        m25622c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: c */
    public final void mo58638c(WebView webView, float f, float f2) {
        m25622c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: a */
    public final void mo58631a(WebView webView, float f, float f2, float f3, float f4) {
        m25622c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}));
    }

    /* renamed from: b */
    public final void mo58636b(WebView webView, float f, float f2, float f3, float f4) {
        m25622c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}));
    }

    /* renamed from: a */
    public final void mo58632a(WebView webView, String str) {
        m25622c(webView, String.format("javascript:window.mraidbridge.nativeCallComplete('%s');", new Object[]{str}));
    }

    /* renamed from: b */
    public final void mo58637b(WebView webView, String str) {
        m25622c(webView, String.format("javascript:window.mraidbridge.setIsViewable(%s);", new Object[]{str}));
    }

    /* renamed from: c */
    private void m25622c(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
