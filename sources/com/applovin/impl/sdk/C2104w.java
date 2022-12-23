package com.applovin.impl.sdk;

import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p031a.C1588f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.w */
public class C2104w {

    /* renamed from: a */
    private final C1969m f4132a;

    /* renamed from: b */
    private final C2102v f4133b;

    /* renamed from: c */
    private final Map<String, C1583a> f4134c = new HashMap(4);

    /* renamed from: d */
    private final Object f4135d = new Object();

    C2104w(C1969m mVar) {
        this.f4132a = mVar;
        this.f4133b = mVar.mo14509A();
    }

    /* renamed from: a */
    public C1583a mo15017a(String str) {
        C1583a aVar;
        synchronized (this.f4135d) {
            aVar = this.f4134c.get(str);
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo15018a(C1583a aVar) {
        synchronized (this.f4135d) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f4133b;
                vVar.mo15012b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + aVar);
            }
            this.f4134c.put(aVar.getAdUnitId(), aVar);
        }
    }

    /* renamed from: b */
    public void mo15019b(C1583a aVar) {
        synchronized (this.f4135d) {
            String adUnitId = aVar.getAdUnitId();
            C1588f fVar = this.f4134c.get(adUnitId);
            if (aVar == fVar) {
                if (C2102v.m5104a()) {
                    C2102v vVar = this.f4133b;
                    vVar.mo15012b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + fVar);
                }
                this.f4134c.remove(adUnitId);
            } else if (C2102v.m5104a()) {
                C2102v vVar2 = this.f4133b;
                vVar2.mo15012b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + aVar + " , since it could have already been updated with a new ad: " + fVar);
            }
        }
    }
}
