package p399g;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p399g.C12473b;

/* renamed from: g.c */
public class C12476c implements C12473b.C12474a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f29798a;

    /* renamed from: b */
    private final ThreadPoolExecutor f29799b;

    /* renamed from: c */
    private final ArrayDeque<C12473b> f29800c = new ArrayDeque<>();

    /* renamed from: d */
    private C12473b f29801d = null;

    public C12476c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f29798a = linkedBlockingQueue;
        this.f29799b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m33334a() {
        C12473b poll = this.f29800c.poll();
        this.f29801d = poll;
        if (poll != null) {
            poll.mo72496a(this.f29799b);
        }
    }

    /* renamed from: a */
    public void mo72498a(C12473b bVar) {
        this.f29801d = null;
        m33334a();
    }

    /* renamed from: b */
    public void mo72499b(C12473b bVar) {
        bVar.mo72494a((C12473b.C12474a) this);
        this.f29800c.add(bVar);
        if (this.f29801d == null) {
            m33334a();
        }
    }
}
