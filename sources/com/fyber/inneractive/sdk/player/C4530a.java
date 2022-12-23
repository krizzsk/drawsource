package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.C4204a0;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C4232h;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.response.C5235g;
import com.fyber.inneractive.sdk.util.C5292l;

/* renamed from: com.fyber.inneractive.sdk.player.a */
public class C4530a {

    /* renamed from: a */
    public C4392y f11200a;

    /* renamed from: b */
    public C4531a f11201b;

    /* renamed from: com.fyber.inneractive.sdk.player.a$a */
    public interface C4531a {
    }

    public C4530a(C4392y yVar) {
        this.f11200a = yVar;
    }

    /* renamed from: a */
    public C4531a mo24711a() throws Throwable {
        C4204a0 a0Var;
        UnitDisplayType unitDisplayType;
        if (this.f11201b == null) {
            Application application = C5292l.f14015a;
            C4392y yVar = this.f11200a;
            C5235g gVar = (C5235g) yVar.f10713b;
            C4288z zVar = yVar.f10715d;
            InneractiveAdRequest inneractiveAdRequest = yVar.f10712a;
            C4401a aVar = null;
            if (!(yVar == null || zVar == null || !((C4232h) yVar.f10714c.mo24264a(C4232h.class)).mo24244c() || (a0Var = ((C4287y) this.f11200a.f10715d).f10549f) == null || ((unitDisplayType = a0Var.f10378j) != UnitDisplayType.INTERSTITIAL && unitDisplayType != UnitDisplayType.REWARDED))) {
                aVar = IAConfigManager.f10324J.f10334I;
            }
            this.f11201b = new C5008f(application, gVar, zVar, inneractiveAdRequest, yVar, aVar);
        }
        return this.f11201b;
    }
}
