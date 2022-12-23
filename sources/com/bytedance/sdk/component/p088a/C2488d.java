package com.bytedance.sdk.component.p088a;

/* renamed from: com.bytedance.sdk.component.a.d */
/* compiled from: BaseStatefulMethod */
public abstract class C2488d<P, R> extends C2486b<P, R> {

    /* renamed from: a */
    private boolean f5235a = true;

    /* renamed from: b */
    private C2489a f5236b;

    /* renamed from: c */
    private C2492f f5237c;

    /* renamed from: com.bytedance.sdk.component.a.d$a */
    /* compiled from: BaseStatefulMethod */
    interface C2489a {
        /* renamed from: a */
        void mo16483a(Object obj);

        /* renamed from: a */
        void mo16484a(Throwable th);
    }

    /* renamed from: com.bytedance.sdk.component.a.d$b */
    /* compiled from: BaseStatefulMethod */
    public interface C2490b {
        /* renamed from: a */
        C2488d mo16485a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16476a(P p, C2492f fVar) throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo16480d();

    /* renamed from: a */
    public /* bridge */ /* synthetic */ String mo16471a() {
        return super.mo16471a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16475a(R r) {
        if (m6216g()) {
            this.f5236b.mo16483a((Object) r);
            mo16481e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16478a(Throwable th) {
        if (m6216g()) {
            this.f5236b.mo16484a(th);
            mo16481e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo16479c() {
        mo16478a((Throwable) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo16481e() {
        this.f5235a = false;
        this.f5237c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16477a(P p, C2492f fVar, C2489a aVar) throws Exception {
        this.f5237c = fVar;
        this.f5236b = aVar;
        mo16476a(p, fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16482f() {
        mo16480d();
        mo16481e();
    }

    /* renamed from: g */
    private boolean m6216g() {
        if (this.f5235a) {
            return true;
        }
        C2498i.m6250a((RuntimeException) new IllegalStateException("Jsb async call already finished: " + mo16471a() + ", hashcode: " + hashCode()));
        return false;
    }
}
