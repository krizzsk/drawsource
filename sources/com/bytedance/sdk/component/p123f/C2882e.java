package com.bytedance.sdk.component.p123f;

import com.bytedance.sdk.component.p123f.C2874a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.f.e */
/* compiled from: TTExecutor */
public class C2882e {

    /* renamed from: a */
    public static final int f6486a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    public static C2879c f6487b;

    /* renamed from: c */
    public static int f6488c = 120;

    /* renamed from: d */
    public static boolean f6489d = true;

    /* renamed from: e */
    private static volatile ThreadPoolExecutor f6490e;

    /* renamed from: f */
    private static volatile ThreadPoolExecutor f6491f;

    /* renamed from: g */
    private static volatile ThreadPoolExecutor f6492g;

    /* renamed from: h */
    private static volatile ScheduledExecutorService f6493h;

    /* renamed from: a */
    public static ExecutorService m8032a() {
        return m8033a(10);
    }

    /* renamed from: a */
    public static ExecutorService m8033a(int i) {
        if (f6490e == null) {
            synchronized (C2882e.class) {
                if (f6490e == null) {
                    f6490e = new C2874a.C2876a().mo17778a("io").mo17776a(4).mo17783b(i).mo17777a(40).mo17781a(TimeUnit.SECONDS).mo17779a((BlockingQueue<Runnable>) new PriorityBlockingQueue(f6486a)).mo17780a(m8047f()).mo17782a();
                    f6490e.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f6490e;
    }

    /* renamed from: a */
    public static void m8035a(C2885g gVar) {
        if (f6490e == null) {
            m8032a();
        }
        if (f6490e != null) {
            f6490e.execute(gVar);
        }
    }

    /* renamed from: a */
    public static void m8036a(C2885g gVar, int i) {
        if (f6490e == null) {
            m8032a();
        }
        if (gVar != null && f6490e != null) {
            gVar.mo17800a(i);
            f6490e.execute(gVar);
        }
    }

    /* renamed from: a */
    public static void m8037a(C2885g gVar, int i, int i2) {
        if (f6490e == null) {
            m8033a(i2);
        }
        if (gVar != null && f6490e != null) {
            gVar.mo17800a(i);
            f6490e.execute(gVar);
        }
    }

    /* renamed from: b */
    public static ExecutorService m8039b() {
        if (f6491f == null) {
            synchronized (C2882e.class) {
                if (f6491f == null) {
                    f6491f = new C2874a.C2876a().mo17778a("log").mo17783b(10).mo17776a(2).mo17777a(40).mo17781a(TimeUnit.SECONDS).mo17779a((BlockingQueue<Runnable>) new PriorityBlockingQueue()).mo17780a(m8047f()).mo17782a();
                    f6491f.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f6491f;
    }

    /* renamed from: b */
    public static void m8041b(C2885g gVar) {
        if (f6491f == null) {
            m8039b();
        }
        if (f6491f != null) {
            f6491f.execute(gVar);
        }
    }

    /* renamed from: b */
    public static void m8042b(C2885g gVar, int i) {
        if (f6491f == null) {
            m8039b();
        }
        if (gVar != null && f6491f != null) {
            gVar.mo17800a(i);
            f6491f.execute(gVar);
        }
    }

    /* renamed from: c */
    public static void m8044c(C2885g gVar, int i) {
        if (f6492g == null) {
            m8043c();
        }
        if (gVar != null && f6492g != null) {
            gVar.mo17800a(i);
            f6492g.execute(gVar);
        }
    }

    /* renamed from: c */
    public static ExecutorService m8043c() {
        if (f6492g == null) {
            synchronized (C2882e.class) {
                if (f6492g == null) {
                    f6492g = new C2874a.C2876a().mo17778a("aidl").mo17783b(10).mo17776a(2).mo17777a(30).mo17781a(TimeUnit.SECONDS).mo17779a((BlockingQueue<Runnable>) new PriorityBlockingQueue()).mo17780a(m8047f()).mo17782a();
                    f6492g.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f6492g;
    }

    /* renamed from: d */
    public static ScheduledExecutorService m8045d() {
        if (f6493h == null) {
            synchronized (C2882e.class) {
                if (f6493h == null) {
                    f6493h = Executors.newSingleThreadScheduledExecutor(new C2886h(5, "scheduled"));
                }
            }
        }
        return f6493h;
    }

    /* renamed from: e */
    public static boolean m8046e() {
        return f6489d;
    }

    /* renamed from: a */
    public static void m8038a(boolean z) {
        f6489d = z;
    }

    /* renamed from: f */
    public static RejectedExecutionHandler m8047f() {
        return new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    /* renamed from: g */
    public static C2879c m8048g() {
        return f6487b;
    }

    /* renamed from: a */
    public static void m8034a(C2879c cVar) {
        f6487b = cVar;
    }

    /* renamed from: b */
    public static void m8040b(int i) {
        f6488c = i;
    }
}
