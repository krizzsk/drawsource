package com.unity3d.services.core.misc;

import com.unity3d.services.core.timer.C12130d;
import com.unity3d.services.core.timer.C12131e;
import com.unity3d.services.core.timer.C12132f;
import java.util.Queue;
import java.util.concurrent.Executors;

/* renamed from: com.unity3d.services.core.misc.a */
/* compiled from: EventSubject */
public class C12070a<T> {

    /* renamed from: a */
    C12130d f29457a;

    /* renamed from: b */
    Queue<T> f29458b;

    /* renamed from: c */
    private C12072b<T> f29459c;

    /* renamed from: com.unity3d.services.core.misc.a$a */
    /* compiled from: EventSubject */
    class C12071a implements C12132f {
        C12071a() {
        }

        /* renamed from: a */
        public void mo71215a() {
            C12070a.this.mo71213c();
        }
    }

    public C12070a(Queue<T> queue, Integer num, C12131e eVar) {
        this.f29458b = queue;
        this.f29457a = eVar.mo71299a(num, Integer.valueOf(queue.size()), new C12071a());
    }

    /* renamed from: b */
    private void m32856b() {
        C12130d dVar = this.f29457a;
        if (dVar != null) {
            dVar.mo71291a();
            this.f29457a = null;
        }
    }

    /* renamed from: d */
    private void m32857d() {
        C12130d dVar = this.f29457a;
        if (dVar != null) {
            dVar.mo71292a(Executors.newSingleThreadScheduledExecutor());
        }
    }

    /* renamed from: a */
    public void mo71211a(C12072b<T> bVar) {
        Queue<T> queue = this.f29458b;
        if (queue != null && queue.size() > 0 && this.f29457a != null && bVar != null) {
            this.f29459c = bVar;
            m32857d();
        }
    }

    /* renamed from: c */
    public void mo71213c() {
        C12072b<T> bVar = this.f29459c;
        if (bVar != null) {
            bVar.mo70805a(this.f29458b.remove());
        }
        if (this.f29458b.size() <= 0) {
            mo71214e();
        }
    }

    /* renamed from: e */
    public void mo71214e() {
        m32856b();
        this.f29459c = null;
    }

    /* renamed from: a */
    public boolean mo71212a() {
        return this.f29458b.isEmpty();
    }
}
