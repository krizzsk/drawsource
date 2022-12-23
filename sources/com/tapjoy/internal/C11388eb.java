package com.tapjoy.internal;

import com.tapjoy.internal.C11385ea;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.eb */
public final class C11388eb implements C11385ea.C11386a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f27191a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f27192b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f27191a);

    /* renamed from: c */
    private final ArrayDeque<C11385ea> f27193c = new ArrayDeque<>();

    /* renamed from: d */
    private C11385ea f27194d = null;

    /* renamed from: b */
    private void m31131b() {
        C11385ea poll = this.f27193c.poll();
        this.f27194d = poll;
        if (poll != null) {
            poll.mo69831a(this.f27192b);
        }
    }

    /* renamed from: a */
    public final void mo69833a() {
        this.f27194d = null;
        m31131b();
    }

    /* renamed from: a */
    public final void mo69836a(C11385ea eaVar) {
        eaVar.f27189d = this;
        this.f27193c.add(eaVar);
        if (this.f27194d == null) {
            m31131b();
        }
    }
}
