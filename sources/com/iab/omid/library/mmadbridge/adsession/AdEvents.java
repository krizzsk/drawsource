package com.iab.omid.library.mmadbridge.adsession;

import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.iab.omid.library.mmadbridge.p263d.C7946e;

public final class AdEvents {
    private final C7925a adSession;

    private AdEvents(C7925a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7925a aVar = (C7925a) adSession2;
        C7946e.m22465a((Object) adSession2, "AdSession is null");
        C7946e.m22470d(aVar);
        C7946e.m22468b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55581a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7946e.m22468b(this.adSession);
        C7946e.m22472f(this.adSession);
        if (!this.adSession.mo55496f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo55496f()) {
            this.adSession.mo55493c();
        }
    }

    public void loaded() {
        C7946e.m22469c(this.adSession);
        C7946e.m22472f(this.adSession);
        this.adSession.mo55494d();
    }

    public void loaded(VastProperties vastProperties) {
        C7946e.m22465a((Object) vastProperties, "VastProperties is null");
        C7946e.m22469c(this.adSession);
        C7946e.m22472f(this.adSession);
        this.adSession.mo55491a(vastProperties.mo55517a());
    }
}
