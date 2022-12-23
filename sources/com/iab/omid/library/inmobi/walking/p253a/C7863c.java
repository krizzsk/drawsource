package com.iab.omid.library.inmobi.walking.p253a;

import com.iab.omid.library.inmobi.walking.p253a.C7860b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.inmobi.walking.a.c */
public class C7863c implements C7860b.C7861a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f18995a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f18996b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f18995a);

    /* renamed from: c */
    private final ArrayDeque<C7860b> f18997c = new ArrayDeque<>();

    /* renamed from: d */
    private C7860b f18998d = null;

    /* renamed from: a */
    private void m22101a() {
        C7860b poll = this.f18997c.poll();
        this.f18998d = poll;
        if (poll != null) {
            poll.mo55246a(this.f18996b);
        }
    }

    /* renamed from: a */
    public void mo55248a(C7860b bVar) {
        this.f18998d = null;
        m22101a();
    }

    /* renamed from: b */
    public void mo55251b(C7860b bVar) {
        bVar.mo55244a((C7860b.C7861a) this);
        this.f18997c.add(bVar);
        if (this.f18998d == null) {
            m22101a();
        }
    }
}
