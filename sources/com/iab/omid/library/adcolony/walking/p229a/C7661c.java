package com.iab.omid.library.adcolony.walking.p229a;

import com.iab.omid.library.adcolony.walking.p229a.C7658b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.adcolony.walking.a.c */
public class C7661c implements C7658b.C7659a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18531a;

    /* renamed from: b */
    private final ThreadPoolExecutor f18532b;

    /* renamed from: c */
    private final ArrayDeque<C7658b> f18533c = new ArrayDeque<>();

    /* renamed from: d */
    private C7658b f18534d = null;

    public C7661c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f18531a = linkedBlockingQueue;
        this.f18532b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m21187a() {
        C7658b poll = this.f18533c.poll();
        this.f18534d = poll;
        if (poll != null) {
            poll.mo54455a(this.f18532b);
        }
    }

    /* renamed from: a */
    public void mo54457a(C7658b bVar) {
        this.f18534d = null;
        m21187a();
    }

    /* renamed from: b */
    public void mo54460b(C7658b bVar) {
        bVar.mo54453a((C7658b.C7659a) this);
        this.f18533c.add(bVar);
        if (this.f18534d == null) {
            m21187a();
        }
    }
}
