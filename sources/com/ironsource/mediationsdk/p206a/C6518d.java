package com.ironsource.mediationsdk.p206a;

import com.ironsource.mediationsdk.p206a.C6509b;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.mediationsdk.a.d */
public final class C6518d extends C6509b {

    /* renamed from: w */
    private static C6518d f16801w;

    /* renamed from: x */
    private String f16802x = "";

    private C6518d() {
        this.f16772r = "ironbeast";
        this.f16771q = 2;
        this.f16773s = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    /* renamed from: d */
    public static synchronized C6518d m19731d() {
        C6518d dVar;
        synchronized (C6518d.class) {
            if (f16801w == null) {
                C6518d dVar2 = new C6518d();
                f16801w = dVar2;
                dVar2.mo36337a();
            }
            dVar = f16801w;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36347b() {
        this.f16774t.add(2001);
        this.f16774t.add(2002);
        this.f16774t.add(2003);
        this.f16774t.add(2004);
        this.f16774t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_TRUE));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_FALSE));
        this.f16774t.add(3001);
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_RELOAD));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_RELOAD_FAILED));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.f16774t.add(3002);
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_ERROR));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_SHOW));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo36356c(C6517c cVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo36357d(int i) {
        return this.f16802x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo36359d(C6517c cVar) {
        int a = cVar.mo36368a();
        return a == 2204 || a == 2004 || a == 2005 || a == 2301 || a == 2300 || a == 3009;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo36360e(C6517c cVar) {
        return C6753o.m20481a().mo36990b(m19694e(cVar.mo36368a()) == C6509b.C6515a.BANNER.f16795f ? 3 : 2);
    }
}
