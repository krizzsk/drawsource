package com.tapjoy;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11554hg;
import com.tapjoy.internal.C11558hj;

public class TapjoyLog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f26900a = TapjoyLog.class.getSimpleName();

    /* renamed from: b */
    private static int f26901b = 6;

    /* renamed from: c */
    private static int f26902c = 4;

    /* renamed from: d */
    private static int f26903d = 2;

    /* renamed from: e */
    private static boolean f26904e = false;

    /* renamed from: f */
    private static int f26905f = 6;

    public static void setDebugEnabled(boolean z) {
        boolean z2;
        f26904e = z;
        C11558hj a = C11558hj.m31644a();
        if (C11554hg.f27724a != z) {
            C11554hg.f27724a = z;
            if (z) {
                C11554hg.m31620a("The debug mode has been enabled");
            } else {
                C11554hg.m31620a("The debug mode has been disabled");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z && a.f27749j) {
            a.f27747h.mo70097a();
        }
        if (f26904e) {
            m30838a(TapjoyConstants.LOG_LEVEL_DEBUG_ON, false);
        } else {
            m30838a(TapjoyConstants.LOG_LEVEL_DEBUG_OFF, false);
        }
    }

    public static void setInternalLogging(boolean z) {
        if (z) {
            m30838a(TapjoyConstants.LOG_LEVEL_INTERNAL, true);
        }
    }

    /* renamed from: a */
    static void m30838a(String str, boolean z) {
        if (z || TapjoyAppSettings.getInstance() == null || TapjoyAppSettings.getInstance().f26747a == null) {
            if (str.equals(TapjoyConstants.LOG_LEVEL_INTERNAL)) {
                f26905f = f26903d;
                if (Build.VERSION.SDK_INT >= 19) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            TapjoyLog.m30839d(TapjoyLog.f26900a, "Enabling WebView debugging");
                            WebView.setWebContentsDebuggingEnabled(true);
                        }
                    });
                }
            } else if (str.equals(TapjoyConstants.LOG_LEVEL_DEBUG_ON)) {
                f26905f = f26902c;
            } else if (str.equals(TapjoyConstants.LOG_LEVEL_DEBUG_OFF)) {
                f26905f = f26901b;
            } else {
                m30839d(f26900a, "unrecognized loggingLevel: ".concat(String.valueOf(str)));
                f26905f = f26901b;
            }
            String str2 = f26900a;
            m30839d(str2, "logThreshold=" + f26905f);
            return;
        }
        m30839d(f26900a, "setLoggingLevel -- log setting already persisted");
    }

    public static boolean isLoggingEnabled() {
        return f26904e;
    }

    /* renamed from: i */
    public static void m30842i(String str, String str2) {
        m30837a(4, str, str2);
    }

    /* renamed from: e */
    public static void m30841e(String str, String str2) {
        m30840e(str, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTERNAL_ERROR, str2));
    }

    /* renamed from: e */
    public static void m30840e(String str, TapjoyErrorMessage tapjoyErrorMessage) {
        if (tapjoyErrorMessage == null) {
            return;
        }
        if (f26905f == f26903d || tapjoyErrorMessage.getType() != TapjoyErrorMessage.ErrorType.INTERNAL_ERROR) {
            m30837a(6, str, tapjoyErrorMessage.toString());
        }
    }

    /* renamed from: w */
    public static void m30844w(String str, String str2) {
        m30837a(5, str, str2);
    }

    /* renamed from: d */
    public static void m30839d(String str, String str2) {
        m30837a(3, str, str2);
    }

    /* renamed from: v */
    public static void m30843v(String str, String str2) {
        m30837a(2, str, str2);
    }

    /* renamed from: a */
    private static void m30837a(int i, String str, String str2) {
        String str3 = f26900a + CertificateUtil.DELIMITER + str;
        if (f26905f > i) {
            return;
        }
        if (str2.length() > 4096) {
            int i2 = 0;
            while (i2 <= str2.length() / 4096) {
                int i3 = i2 * 4096;
                i2++;
                int i4 = i2 * 4096;
                if (i4 > str2.length()) {
                    i4 = str2.length();
                }
                Log.println(i, str3, str2.substring(i3, i4));
            }
            return;
        }
        Log.println(i, str3, str2);
    }
}
