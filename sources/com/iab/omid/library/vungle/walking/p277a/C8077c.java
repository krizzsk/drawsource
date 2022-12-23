package com.iab.omid.library.vungle.walking.p277a;

import com.iab.omid.library.vungle.walking.p277a.C8074b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.vungle.walking.a.c */
public class C8077c implements C8074b.C8075a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f19528a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f19529b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f19528a);

    /* renamed from: c */
    private final ArrayDeque<C8074b> f19530c = new ArrayDeque<>();

    /* renamed from: d */
    private C8074b f19531d = null;

    /* renamed from: a */
    private void m23102a() {
        C8074b poll = this.f19530c.poll();
        this.f19531d = poll;
        if (poll != null) {
            poll.mo56163a(this.f19529b);
        }
    }

    /* renamed from: a */
    public void mo56165a(C8074b bVar) {
        this.f19531d = null;
        m23102a();
    }

    /* renamed from: b */
    public void mo56168b(C8074b bVar) {
        bVar.mo56161a((C8074b.C8075a) this);
        this.f19530c.add(bVar);
        if (this.f19531d == null) {
            m23102a();
        }
    }
}
