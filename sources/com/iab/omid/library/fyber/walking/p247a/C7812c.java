package com.iab.omid.library.fyber.walking.p247a;

import com.iab.omid.library.fyber.walking.p247a.C7809b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.fyber.walking.a.c */
public class C7812c implements C7809b.C7810a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18882a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f18883b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f18882a);

    /* renamed from: c */
    private final ArrayDeque<C7809b> f18884c = new ArrayDeque<>();

    /* renamed from: d */
    private C7809b f18885d = null;

    /* renamed from: a */
    private void m21877a() {
        C7809b poll = this.f18884c.poll();
        this.f18885d = poll;
        if (poll != null) {
            poll.mo55052a(this.f18883b);
        }
    }

    /* renamed from: a */
    public void mo55054a(C7809b bVar) {
        this.f18885d = null;
        m21877a();
    }

    /* renamed from: b */
    public void mo55057b(C7809b bVar) {
        bVar.mo55050a((C7809b.C7810a) this);
        this.f18884c.add(bVar);
        if (this.f18885d == null) {
            m21877a();
        }
    }
}
