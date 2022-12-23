package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.apm.insight.runtime.p */
public class C1394p {

    /* renamed from: a */
    private static volatile C1403u f1489a;

    /* renamed from: b */
    private static volatile Handler f1490b;

    /* renamed from: a */
    public static HandlerThread m2320a() {
        if (f1489a == null) {
            synchronized (C1394p.class) {
                if (f1489a == null) {
                    f1489a = new C1403u("default_npth_thread");
                    f1489a.mo12751b();
                }
            }
        }
        return f1489a.mo12753c();
    }

    /* renamed from: b */
    public static C1403u m2321b() {
        if (f1489a == null) {
            m2320a();
        }
        return f1489a;
    }
}
