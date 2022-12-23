package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.util.n */
public class C5299n {

    /* renamed from: a */
    public static final Executor f14023a;

    /* renamed from: b */
    public static final Handler f14024b = new Handler(Looper.getMainLooper());

    /* renamed from: com.fyber.inneractive.sdk.util.n$a */
    public class C5300a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f14025a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "IAConcurrencyUtil#" + this.f14025a.getAndIncrement());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.n$b */
    public class C5301b implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IAlog.m16446a("rejectedExecution received for - %s", runnable);
        }
    }

    static {
        C5300a aVar = new C5300a();
        C5301b bVar = new C5301b();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(32), aVar, bVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14023a = threadPoolExecutor;
    }

    /* renamed from: a */
    public static void m16520a(Runnable runnable) {
        ((ThreadPoolExecutor) f14023a).execute(runnable);
    }
}
