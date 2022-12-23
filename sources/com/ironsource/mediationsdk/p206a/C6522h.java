package com.ironsource.mediationsdk.p206a;

import com.ironsource.mediationsdk.p206a.C6509b;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.mediationsdk.a.h */
public final class C6522h extends C6509b {

    /* renamed from: w */
    private static C6522h f16809w;

    /* renamed from: x */
    private String f16810x = "";

    private C6522h() {
        this.f16772r = "outcome";
        this.f16771q = 3;
        this.f16773s = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    /* renamed from: d */
    public static synchronized C6522h m19751d() {
        C6522h hVar;
        synchronized (C6522h.class) {
            if (f16809w == null) {
                C6522h hVar2 = new C6522h();
                f16809w = hVar2;
                hVar2.mo36337a();
            }
            hVar = f16809w;
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36347b() {
        this.f16774t.add(1000);
        this.f16774t.add(1001);
        this.f16774t.add(1002);
        this.f16774t.add(1003);
        this.f16774t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_TRUE));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_FALSE));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f16774t.add(Integer.valueOf(IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo36356c(C6517c cVar) {
        return cVar.mo36368a() == 305;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo36357d(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.f16810x : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo36359d(C6517c cVar) {
        int a = cVar.mo36368a();
        return a == 14 || a == 514 || a == 305 || a == 1003 || a == 1005 || a == 1203 || a == 1010 || a == 1301 || a == 1302;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo36360e(C6517c cVar) {
        return C6753o.m20481a().mo36990b((m19694e(cVar.mo36368a()) == C6509b.C6515a.OFFERWALL.f16795f ? 1 : 0) ^ 1);
    }
}
