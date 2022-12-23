package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.tools.k */
/* compiled from: FastKVConfig */
public final class C8644k {

    /* renamed from: a */
    static FastKV.C8609b f21167a;

    /* renamed from: b */
    static volatile Executor f21168b;

    private C8644k() {
    }

    /* renamed from: a */
    static Executor m24773a() {
        if (f21168b == null) {
            synchronized (C8644k.class) {
                if (f21168b == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
                        public final Thread newThread(Runnable runnable) {
                            return new Thread(runnable, "mb-sp-handler");
                        }
                    }, new ThreadPoolExecutor.DiscardPolicy());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f21168b = threadPoolExecutor;
                }
            }
        }
        return f21168b;
    }
}
