package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Queue;

/* renamed from: com.inmobi.media.ah */
/* compiled from: BackgroundRunnable */
public abstract class C5727ah<T> implements Runnable {

    /* renamed from: a */
    private static final String f14399a = C5727ah.class.getSimpleName();

    /* renamed from: b */
    private Handler f14400b;

    /* renamed from: c */
    private byte f14401c = -1;

    /* renamed from: f */
    WeakReference<T> f14402f;

    /* renamed from: a */
    public abstract void mo34371a();

    protected C5727ah(T t, byte b) {
        this.f14401c = b;
        this.f14402f = new WeakReference<>(t);
        this.f14400b = new Handler(Looper.getMainLooper());
    }

    public final void run() {
        mo34371a();
        this.f14400b.post(new Runnable() {
            public final void run() {
                Object obj = C5727ah.this.f14402f.get();
                if (obj != null) {
                    C6185hy a = C6185hy.m18355a();
                    int hashCode = obj.hashCode();
                    Queue queue = a.f15614a.get(hashCode);
                    if (queue != null) {
                        queue.poll();
                        C5727ah ahVar = (C5727ah) queue.peek();
                        if (queue.size() > 0 && ahVar != null) {
                            a.mo35397a(ahVar);
                        }
                        if (queue.size() == 0) {
                            a.f15614a.remove(hashCode);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo34373b() {
        C6195ic.m18378a((byte) 1, f14399a, "Could not execute runnable due to OutOfMemory.");
        Object obj = this.f14402f.get();
        if (obj != null) {
            C6185hy.m18355a().mo35395a(obj.hashCode());
        }
    }
}
