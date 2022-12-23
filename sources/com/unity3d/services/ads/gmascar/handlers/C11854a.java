package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.ads.gmascar.utils.C11861a;
import com.unity3d.services.core.misc.C12070a;
import com.unity3d.services.core.misc.C12072b;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;

/* renamed from: com.unity3d.services.ads.gmascar.handlers.a */
/* compiled from: ScarAdHandlerBase */
public abstract class C11854a implements IScarAdListenerWrapper {

    /* renamed from: a */
    protected final ScarAdMetadata f28779a;

    /* renamed from: b */
    protected final C12070a<GMAEvent> f28780b;

    /* renamed from: c */
    protected final C11861a f28781c = new C11861a();

    /* renamed from: com.unity3d.services.ads.gmascar.handlers.a$a */
    /* compiled from: ScarAdHandlerBase */
    class C11855a implements C12072b<GMAEvent> {
        C11855a() {
        }

        /* renamed from: a */
        public void mo70805a(GMAEvent gMAEvent) {
            C11854a.this.f28781c.mo70807a(gMAEvent, new Object[0]);
        }
    }

    public C11854a(ScarAdMetadata scarAdMetadata, C12070a<GMAEvent> aVar) {
        this.f28779a = scarAdMetadata;
        this.f28780b = aVar;
    }

    public void onAdClosed() {
        this.f28781c.mo70807a(GMAEvent.AD_CLOSED, new Object[0]);
        this.f28780b.mo71214e();
    }

    public void onAdFailedToLoad(int i, String str) {
        this.f28781c.mo70807a(GMAEvent.LOAD_ERROR, this.f28779a.getPlacementId(), this.f28779a.getQueryId(), str, Integer.valueOf(i));
    }

    public void onAdLoaded() {
        this.f28781c.mo70807a(GMAEvent.AD_LOADED, this.f28779a.getPlacementId(), this.f28779a.getQueryId());
    }

    public void onAdOpened() {
        C12136a.m33103c().mo71310a((Enum) C12143b.GMA, (Enum) GMAEvent.AD_STARTED, new Object[0]);
        this.f28780b.mo71211a(new C11855a());
    }

    public void onAdSkipped() {
        this.f28781c.mo70807a(GMAEvent.AD_SKIPPED, new Object[0]);
    }
}
