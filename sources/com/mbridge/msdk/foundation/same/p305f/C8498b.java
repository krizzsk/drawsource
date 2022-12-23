package com.mbridge.msdk.foundation.same.p305f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.f.b */
/* compiled from: ThreadPoolUtils */
public final class C8498b {

    /* renamed from: a */
    public static ThreadPoolExecutor f20842a;

    /* renamed from: b */
    private static ThreadPoolExecutor f20843b;

    /* renamed from: c */
    private static ThreadPoolExecutor f20844c;

    /* renamed from: d */
    private static Handler f20845d;

    /* renamed from: a */
    public static ThreadPoolExecutor m24359a() {
        if (f20842a == null) {
            f20842a = new ThreadPoolExecutor(5, 10, 15, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactory() {
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("CommonThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20842a;
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m24360b() {
        if (f20843b == null) {
            f20843b = new ThreadPoolExecutor(5, 10, 5, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactory() {
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("ReportThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20843b;
    }

    /* renamed from: c */
    public static ThreadPoolExecutor m24361c() {
        if (f20844c == null) {
            f20844c = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new ThreadFactory() {
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("NwtThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20844c;
    }

    /* renamed from: d */
    public static Handler m24362d() {
        if (f20845d == null) {
            f20845d = new C8502a();
        }
        return f20845d;
    }

    /* renamed from: com.mbridge.msdk.foundation.same.f.b$a */
    /* compiled from: ThreadPoolUtils */
    private static class C8502a extends Handler {
        public C8502a() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }
}
