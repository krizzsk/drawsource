package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;

/* renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a */
/* compiled from: MBWebViewChecker */
public final class C8878a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static volatile Boolean f21864a;

    /* renamed from: b */
    private static volatile Handler f21865b;

    /* renamed from: c */
    private static Boolean f21866c;

    /* renamed from: a */
    public static boolean m25646a(final Context context) {
        C2440a aVar;
        try {
            aVar = C2445b.m6020a().mo16294f(C8388a.m23845e().mo56914h());
        } catch (Exception unused) {
            aVar = null;
        }
        if (aVar != null) {
            f21866c = Boolean.valueOf(aVar.mo16238j());
        } else {
            f21866c = false;
        }
        Boolean bool = f21866c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f21864a == null) {
                try {
                    f21864a = Boolean.valueOf(m25648c(context));
                } catch (Exception unused2) {
                    f21864a = false;
                }
            }
            if (f21864a == null) {
                f21864a = new Boolean(false);
            }
            return f21864a.booleanValue();
        }
        if (f21864a == null && f21865b == null) {
            f21865b = new Handler(Looper.getMainLooper());
            f21865b.post(new Runnable() {
                public final void run() {
                    if (C8878a.f21864a == null) {
                        try {
                            Boolean unused = C8878a.f21864a = Boolean.valueOf(C8878a.m25648c(context));
                        } catch (Exception unused2) {
                            Boolean unused3 = C8878a.f21864a = false;
                        }
                    }
                }
            });
        }
        if (f21864a == null) {
            return true;
        }
        return f21864a.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m25648c(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
        } catch (Exception unused) {
            webView = null;
        }
        return webView != null;
    }
}
