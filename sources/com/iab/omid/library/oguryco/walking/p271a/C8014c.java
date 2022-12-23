package com.iab.omid.library.oguryco.walking.p271a;

import com.iab.omid.library.oguryco.walking.p271a.C8011b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.oguryco.walking.a.c */
public class C8014c implements C8011b.C8012a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f19347a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f19348b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f19347a);

    /* renamed from: c */
    private final ArrayDeque<C8011b> f19349c = new ArrayDeque<>();

    /* renamed from: d */
    private C8011b f19350d = null;

    /* renamed from: a */
    private void m22781a() {
        C8011b poll = this.f19349c.poll();
        this.f19350d = poll;
        if (poll != null) {
            poll.mo55845a(this.f19348b);
        }
    }

    /* renamed from: a */
    public void mo55847a(C8011b bVar) {
        this.f19350d = null;
        m22781a();
    }

    /* renamed from: b */
    public void mo55850b(C8011b bVar) {
        bVar.mo55843a((C8011b.C8012a) this);
        this.f19349c.add(bVar);
        if (this.f19350d == null) {
            m22781a();
        }
    }
}
