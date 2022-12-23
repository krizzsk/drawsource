package com.tapjoy.internal;

import com.tapjoy.internal.C11352de;
import java.util.Collections;

/* renamed from: com.tapjoy.internal.di */
public final class C11358di implements C11329ci, C11352de.C11353a {

    /* renamed from: c */
    private static C11358di f27127c;

    /* renamed from: a */
    public float f27128a = 0.0f;

    /* renamed from: b */
    public C11330cj f27129b;

    /* renamed from: d */
    private final C11331ck f27130d;

    /* renamed from: e */
    private final C11328ch f27131e;

    /* renamed from: f */
    private C11351dd f27132f;

    private C11358di(C11331ck ckVar, C11328ch chVar) {
        this.f27130d = ckVar;
        this.f27131e = chVar;
    }

    /* renamed from: a */
    public static C11358di m31067a() {
        if (f27127c == null) {
            f27127c = new C11358di(new C11331ck(), new C11328ch());
        }
        return f27127c;
    }

    /* renamed from: a */
    public final void mo69802a(boolean z) {
        if (z) {
            C11377dx.m31113a();
            C11377dx.m31117b();
            return;
        }
        C11377dx.m31113a();
        C11377dx.m31119c();
    }

    /* renamed from: a */
    public final void mo69775a(float f) {
        this.f27128a = f;
        if (this.f27132f == null) {
            this.f27132f = C11351dd.m31050a();
        }
        for (T t : Collections.unmodifiableCollection(this.f27132f.f27112b)) {
            t.f27079c.mo69814a(f);
        }
    }
}
