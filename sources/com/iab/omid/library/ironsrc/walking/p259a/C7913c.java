package com.iab.omid.library.ironsrc.walking.p259a;

import com.iab.omid.library.ironsrc.walking.p259a.C7910b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.c */
public class C7913c implements C7910b.C7911a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f19109a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f19110b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f19109a);

    /* renamed from: c */
    private final ArrayDeque<C7910b> f19111c = new ArrayDeque<>();

    /* renamed from: d */
    private C7910b f19112d = null;

    /* renamed from: a */
    private void m22322a() {
        C7910b poll = this.f19111c.poll();
        this.f19112d = poll;
        if (poll != null) {
            poll.mo55432a(this.f19110b);
        }
    }

    /* renamed from: a */
    public void mo55434a(C7910b bVar) {
        this.f19112d = null;
        m22322a();
    }

    /* renamed from: b */
    public void mo55437b(C7910b bVar) {
        bVar.mo55430a((C7910b.C7911a) this);
        this.f19111c.add(bVar);
        if (this.f19112d == null) {
            m22322a();
        }
    }
}
