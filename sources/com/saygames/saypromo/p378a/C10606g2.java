package com.saygames.saypromo.p378a;

import kotlin.Unit;

/* renamed from: com.saygames.saypromo.a.g2 */
public final class C10606g2 implements C10598f2 {

    /* renamed from: a */
    private boolean f26129a;

    /* renamed from: b */
    private final C10717u4 f26130b = new C10717u4();

    C10606g2() {
    }

    /* renamed from: a */
    public final void mo65459a(boolean z) {
        synchronized (this.f26130b.f26352a) {
            this.f26129a = z;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final boolean mo65460a() {
        boolean z;
        synchronized (this.f26130b.f26352a) {
            z = this.f26129a;
        }
        return z;
    }
}
