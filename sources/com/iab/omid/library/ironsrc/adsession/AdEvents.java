package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.adsession.media.VastProperties;
import com.iab.omid.library.ironsrc.p257d.C7896e;

public final class AdEvents {
    private final C7875a adSession;

    private AdEvents(C7875a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7875a aVar = (C7875a) adSession2;
        C7896e.m22237a((Object) adSession2, "AdSession is null");
        C7896e.m22242d(aVar);
        C7896e.m22240b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55383a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C7896e.m22240b(this.adSession);
        C7896e.m22244f(this.adSession);
        if (!this.adSession.mo55306e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo55306e()) {
            this.adSession.mo55303b();
        }
    }

    public final void loaded() {
        C7896e.m22241c(this.adSession);
        C7896e.m22244f(this.adSession);
        this.adSession.mo55304c();
    }

    public final void loaded(VastProperties vastProperties) {
        C7896e.m22237a((Object) vastProperties, "VastProperties is null");
        C7896e.m22241c(this.adSession);
        C7896e.m22244f(this.adSession);
        this.adSession.mo55302a(vastProperties.mo55327a());
    }
}
