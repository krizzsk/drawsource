package com.fyber.inneractive.sdk.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.fyber.inneractive.sdk.util.j */
public class C5287j<T> {

    /* renamed from: a */
    public final Queue<T> f14004a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public C5288a<T> f14005b;

    /* renamed from: com.fyber.inneractive.sdk.util.j$a */
    public interface C5288a<TT> {
        /* renamed from: a */
        TT mo26253a();
    }

    public C5287j(int i, C5288a<T> aVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f14004a.offer(aVar.mo26253a());
        }
        this.f14005b = aVar;
    }

    /* renamed from: a */
    public T mo26381a() {
        T poll = this.f14004a.poll();
        return poll == null ? this.f14005b.mo26253a() : poll;
    }
}
