package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.bytedance.sdk.component.utils.h */
/* compiled from: HandlerUtils */
public class C2898h {

    /* renamed from: a */
    private static volatile HandlerThread f6510a = new HandlerThread("csj_io_handler");

    /* renamed from: b */
    private static volatile Handler f6511b;

    /* renamed from: c */
    private static volatile Handler f6512c = new Handler(f6510a.getLooper());

    static {
        f6510a.start();
    }

    /* renamed from: a */
    public static Handler m8093a() {
        if (f6510a == null || !f6510a.isAlive()) {
            synchronized (C2898h.class) {
                if (f6510a == null || !f6510a.isAlive()) {
                    f6510a = new HandlerThread("csj_io_handler");
                    f6510a.start();
                    f6512c = new Handler(f6510a.getLooper());
                }
            }
        }
        return f6512c;
    }

    /* renamed from: b */
    public static Handler m8094b() {
        if (f6511b == null) {
            synchronized (C2898h.class) {
                if (f6511b == null) {
                    f6511b = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f6511b;
    }
}
