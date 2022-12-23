package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.inmobi.media.jr */
/* compiled from: Task */
public final class C6269jr {

    /* renamed from: a */
    private static final Object f15790a = new Object();

    /* renamed from: b */
    private final Handler f15791b;

    /* renamed from: com.inmobi.media.jr$a */
    /* compiled from: Task */
    static class C6270a {

        /* renamed from: a */
        static final C6269jr f15792a = new C6269jr((byte) 0);
    }

    /* synthetic */ C6269jr(byte b) {
        this();
    }

    private C6269jr() {
        this.f15791b = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static C6269jr m18643a() {
        return C6270a.f15792a;
    }

    /* renamed from: a */
    public final void mo35508a(Runnable runnable) {
        this.f15791b.post(runnable);
    }
}
