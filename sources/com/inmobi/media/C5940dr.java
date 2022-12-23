package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.lang.ref.WeakReference;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.inmobi.media.dr */
/* compiled from: VastNetworkClient */
final class C5940dr {

    /* renamed from: d */
    public static final Executor f15044d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f15045e = C5940dr.class.getSimpleName();

    /* renamed from: g */
    private static final int f15046g;

    /* renamed from: h */
    private static final int f15047h;

    /* renamed from: i */
    private static final int f15048i = ((f15046g * 2) + 1);

    /* renamed from: j */
    private static final ThreadFactory f15049j = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f15055a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "VastNetworkTask #" + this.f15055a.getAndIncrement());
        }
    };

    /* renamed from: k */
    private static final BlockingQueue<Runnable> f15050k = new LinkedBlockingQueue(128);
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C6156ha f15051a;

    /* renamed from: b */
    WeakReference<C5939dq> f15052b;

    /* renamed from: c */
    long f15053c = 0;

    /* renamed from: f */
    private final CountDownLatch f15054f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f15046g = availableProcessors;
        f15047h = Math.max(2, Math.min(availableProcessors - 1, 4));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f15047h, f15048i, 30, TimeUnit.SECONDS, f15050k, f15049j);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f15044d = threadPoolExecutor;
    }

    public C5940dr(C5939dq dqVar, int i, CountDownLatch countDownLatch) {
        C6156ha haVar = new C6156ha(ShareTarget.METHOD_GET, dqVar.f15039a);
        this.f15051a = haVar;
        haVar.f15534o = false;
        this.f15051a.f15539t = false;
        this.f15051a.f15531l = i;
        this.f15052b = new WeakReference<>(dqVar);
        this.f15054f = countDownLatch;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35051a() {
        CountDownLatch countDownLatch = this.f15054f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* renamed from: a */
    public final void mo35052a(C6157hb hbVar) {
        try {
            C6244je.m18561a().mo35474a(this.f15051a.mo35347g());
            C6244je.m18561a().mo35475b(hbVar.mo35352d());
        } catch (Exception unused) {
        } finally {
            mo35051a();
        }
    }
}
