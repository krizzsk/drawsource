package com.unity3d.services.core.request;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.services.core.request.a */
/* compiled from: CancelableThreadPoolExecutor */
public class C12092a extends ThreadPoolExecutor {

    /* renamed from: a */
    private final List<Runnable> f29495a = new LinkedList();

    public C12092a(int i, int i2, long j, TimeUnit timeUnit, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        super(i, i2, j, timeUnit, linkedBlockingQueue);
    }

    /* renamed from: a */
    public synchronized void mo71241a() {
        for (Runnable next : this.f29495a) {
            if (next instanceof C12103k) {
                ((C12103k) next).mo71261a(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.f29495a.remove(runnable);
    }

    /* access modifiers changed from: protected */
    public synchronized void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.f29495a.add(runnable);
    }
}
