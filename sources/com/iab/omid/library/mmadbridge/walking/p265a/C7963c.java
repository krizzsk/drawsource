package com.iab.omid.library.mmadbridge.walking.p265a;

import com.iab.omid.library.mmadbridge.walking.p265a.C7960b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a.c */
public class C7963c implements C7960b.C7961a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f19226a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f19227b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f19226a);

    /* renamed from: c */
    private final ArrayDeque<C7960b> f19228c = new ArrayDeque<>();

    /* renamed from: d */
    private C7960b f19229d = null;

    /* renamed from: a */
    private void m22552a() {
        C7960b poll = this.f19228c.poll();
        this.f19229d = poll;
        if (poll != null) {
            poll.mo55631a(this.f19227b);
        }
    }

    /* renamed from: a */
    public void mo55633a(C7960b bVar) {
        this.f19229d = null;
        m22552a();
    }

    /* renamed from: b */
    public void mo55636b(C7960b bVar) {
        bVar.mo55629a((C7960b.C7961a) this);
        this.f19228c.add(bVar);
        if (this.f19229d == null) {
            m22552a();
        }
    }
}
