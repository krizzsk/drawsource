package com.iab.omid.library.applovin.adsession;

import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.iab.omid.library.applovin.p239d.C7744e;

public final class AdEvents {
    private final C7723a adSession;

    private AdEvents(C7723a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7723a aVar = (C7723a) adSession2;
        C7744e.m21560a((Object) adSession2, "AdSession is null");
        C7744e.m21565d(aVar);
        C7744e.m21563b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54803a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7744e.m21563b(this.adSession);
        C7744e.m21567f(this.adSession);
        if (!this.adSession.mo54718f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo54718f()) {
            this.adSession.mo54715c();
        }
    }

    public void loaded() {
        C7744e.m21564c(this.adSession);
        C7744e.m21567f(this.adSession);
        this.adSession.mo54716d();
    }

    public void loaded(VastProperties vastProperties) {
        C7744e.m21560a((Object) vastProperties, "VastProperties is null");
        C7744e.m21564c(this.adSession);
        C7744e.m21567f(this.adSession);
        this.adSession.mo54713a(vastProperties.mo54739a());
    }
}
