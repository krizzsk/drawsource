package com.tapjoy.internal;

import com.tapjoy.internal.C11400el;
import com.tapjoy.internal.C11418eo;

/* renamed from: com.tapjoy.internal.eh */
public abstract class C11394eh<E extends C11418eo> extends C11400el<E> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo69842a(int i);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo69841a(Object obj) {
        return C11417en.m31215a(((C11418eo) obj).mo69871a());
    }

    /* renamed from: a */
    public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
        enVar.mo69867c(((C11418eo) obj).mo69871a());
    }

    protected C11394eh(Class<E> cls) {
        super(C11395ei.VARINT, cls);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo69843a(C11416em emVar) {
        int c = emVar.mo69861c();
        C11418eo a = mo69842a(c);
        if (a != null) {
            return a;
        }
        throw new C11400el.C11415a(c, this.f27229a);
    }
}
