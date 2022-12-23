package com.iab.omid.library.amazon.walking.p235a;

import com.iab.omid.library.amazon.walking.p235a.C7708b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.amazon.walking.a.c */
public class C7711c implements C7708b.C7709a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18648a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f18649b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f18648a);

    /* renamed from: c */
    private final ArrayDeque<C7708b> f18650c = new ArrayDeque<>();

    /* renamed from: d */
    private C7708b f18651d = null;

    /* renamed from: a */
    private void m21417a() {
        C7708b poll = this.f18650c.poll();
        this.f18651d = poll;
        if (poll != null) {
            poll.mo54654a(this.f18649b);
        }
    }

    /* renamed from: a */
    public void mo54656a(C7708b bVar) {
        this.f18651d = null;
        m21417a();
    }

    /* renamed from: b */
    public void mo54659b(C7708b bVar) {
        bVar.mo54652a((C7708b.C7709a) this);
        this.f18650c.add(bVar);
        if (this.f18651d == null) {
            m21417a();
        }
    }
}
