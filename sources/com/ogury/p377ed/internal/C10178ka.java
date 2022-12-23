package com.ogury.p377ed.internal;

import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.ka */
final class C10178ka<T> implements C10171ju<T>, Serializable {

    /* renamed from: a */
    private C10227lj<? extends T> f25538a;

    /* renamed from: b */
    private volatile Object f25539b;

    /* renamed from: c */
    private final Object f25540c;

    private C10178ka(C10227lj<? extends T> ljVar) {
        C10263mq.m29882b(ljVar, "initializer");
        this.f25538a = ljVar;
        this.f25539b = C10180kc.f25541a;
        this.f25540c = this;
    }

    public /* synthetic */ C10178ka(C10227lj ljVar, byte b) {
        this(ljVar);
    }

    /* renamed from: a */
    public final T mo65016a() {
        T t;
        T t2 = this.f25539b;
        if (t2 != C10180kc.f25541a) {
            return t2;
        }
        synchronized (this.f25540c) {
            t = this.f25539b;
            if (t == C10180kc.f25541a) {
                C10227lj ljVar = this.f25538a;
                C10263mq.m29878a((Object) ljVar);
                t = ljVar.mo64355a();
                this.f25539b = t;
                this.f25538a = null;
            }
        }
        return t;
    }

    /* renamed from: b */
    private boolean m29742b() {
        return this.f25539b != C10180kc.f25541a;
    }

    public final String toString() {
        return m29742b() ? String.valueOf(mo65016a()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C10170jt(mo65016a());
    }
}
