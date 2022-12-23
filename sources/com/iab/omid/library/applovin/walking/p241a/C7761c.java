package com.iab.omid.library.applovin.walking.p241a;

import com.iab.omid.library.applovin.walking.p241a.C7758b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.applovin.walking.a.c */
public class C7761c implements C7758b.C7759a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18765a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f18766b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f18765a);

    /* renamed from: c */
    private final ArrayDeque<C7758b> f18767c = new ArrayDeque<>();

    /* renamed from: d */
    private C7758b f18768d = null;

    /* renamed from: a */
    private void m21647a() {
        C7758b poll = this.f18767c.poll();
        this.f18768d = poll;
        if (poll != null) {
            poll.mo54853a(this.f18766b);
        }
    }

    /* renamed from: a */
    public void mo54855a(C7758b bVar) {
        this.f18768d = null;
        m21647a();
    }

    /* renamed from: b */
    public void mo54858b(C7758b bVar) {
        bVar.mo54851a((C7758b.C7759a) this);
        this.f18767c.add(bVar);
        if (this.f18768d == null) {
            m21647a();
        }
    }
}
