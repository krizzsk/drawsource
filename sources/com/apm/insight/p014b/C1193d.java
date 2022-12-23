package com.apm.insight.p014b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.C1186b;
import com.apm.insight.C1221e;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1322r;
import com.apm.insight.p026l.C1326v;
import org.json.JSONObject;

/* renamed from: com.apm.insight.b.d */
public class C1193d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f998a = null;

    /* renamed from: b */
    private static long f999b = -1;

    /* renamed from: c */
    private static boolean f1000c = false;

    /* renamed from: d */
    private static FileObserver f1001d;

    /* renamed from: e */
    private static ActivityManager.ProcessErrorStateInfo f1002e;

    /* renamed from: a */
    static String m1344a(Context context, int i) {
        if (C1322r.m1939a(256)) {
            f1000c = false;
            return "TEST_ANR_INFO";
        } else if (SystemClock.uptimeMillis() - f999b < 5000) {
            return null;
        } else {
            try {
                ActivityManager.ProcessErrorStateInfo a = C1295a.m1773a(context, i);
                if (a != null && Process.myPid() == a.pid) {
                    if (f1002e != null && C1187a.m1309a(f1002e, a)) {
                        return null;
                    }
                    f1002e = a;
                    f998a = null;
                    f999b = SystemClock.uptimeMillis();
                    f1000c = false;
                    return C1187a.m1308a(a);
                }
            } catch (Throwable unused) {
            }
            String str = f998a;
            if (str == null) {
                return null;
            }
            f1000c = true;
            f998a = null;
            f999b = SystemClock.uptimeMillis();
            return str;
        }
    }

    /* renamed from: a */
    public static JSONObject m1346a(boolean z) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", C1326v.m1963a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m1347a(final String str, final C1221e eVar) {
        FileObserver fileObserver = f1001d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        C11941 r0 = new FileObserver(136, str) {
            public void onEvent(int i, String str) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String unused = C1193d.f998a = eVar.mo12446a(str, str);
                    } catch (Throwable th) {
                        C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                    }
                }
            }
        };
        f1001d = r0;
        r0.startWatching();
    }

    /* renamed from: a */
    public static boolean m1348a() {
        return f1000c;
    }

    /* renamed from: b */
    public static void m1349b() {
        f1002e = null;
    }
}
