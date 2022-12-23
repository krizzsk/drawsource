package com.tapjoy.internal;

import com.tapjoy.internal.C11520gi;

/* renamed from: com.tapjoy.internal.fy */
public final class C11496fy {

    /* renamed from: a */
    public C11488fs f27591a;

    /* renamed from: b */
    public volatile C11520gi.C11522a f27592b;

    /* renamed from: c */
    public int f27593c;

    /* renamed from: d */
    public volatile C11520gi.C11522a f27594d;

    /* renamed from: e */
    public volatile C11520gi.C11522a f27595e;

    /* renamed from: a */
    public final void mo70020a() {
        C11488fs fsVar = this.f27591a;
        if (fsVar != null) {
            fsVar.mo70017c();
        }
    }

    /* renamed from: b */
    public final void mo70022b() {
        mo70021a(16);
        C11520gi.C11522a aVar = this.f27594d;
        if (aVar != null) {
            this.f27594d = null;
            aVar.mo70068b().mo70071c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo70021a(int i) {
        C11520gi.C11522a aVar = this.f27592b;
        if (aVar != null && this.f27593c < i) {
            int i2 = i | this.f27593c;
            this.f27593c = i2;
            aVar.mo70066a("state", (Object) Integer.valueOf(i2)).mo70068b().mo70071c();
        }
    }
}
