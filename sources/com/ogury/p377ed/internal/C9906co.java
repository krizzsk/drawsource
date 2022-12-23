package com.ogury.p377ed.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ogury.ed.internal.co */
public final class C9906co implements C9913ct {

    /* renamed from: a */
    public static final C9907a f24949a = new C9907a((byte) 0);

    /* renamed from: b */
    private final ExecutorService f24950b;

    public C9906co() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(4, Runtime.getRuntime().availableProcessors()));
        C10263mq.m29879a((Object) newFixedThreadPool, "newFixedThreadPool(nrOfCachedThreads)");
        this.f24950b = newFixedThreadPool;
    }

    /* renamed from: com.ogury.ed.internal.co$a */
    public static final class C9907a {
        public /* synthetic */ C9907a(byte b) {
            this();
        }

        private C9907a() {
        }
    }

    /* renamed from: a */
    public final void mo64443a(Runnable runnable) {
        C10263mq.m29882b(runnable, "runnable");
        this.f24950b.execute(runnable);
    }
}
