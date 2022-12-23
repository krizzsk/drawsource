package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.iab.omid.library.adcolony.p227d.C7644e;

public final class AdEvents {
    private final C7623a adSession;

    private AdEvents(C7623a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7623a aVar = (C7623a) adSession2;
        C7644e.m21100a((Object) adSession2, "AdSession is null");
        C7644e.m21105d(aVar);
        C7644e.m21103b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54405a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7644e.m21103b(this.adSession);
        C7644e.m21107f(this.adSession);
        if (!this.adSession.mo54320f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo54320f()) {
            this.adSession.mo54317c();
        }
    }

    public void loaded() {
        C7644e.m21104c(this.adSession);
        C7644e.m21107f(this.adSession);
        this.adSession.mo54318d();
    }

    public void loaded(VastProperties vastProperties) {
        C7644e.m21100a((Object) vastProperties, "VastProperties is null");
        C7644e.m21104c(this.adSession);
        C7644e.m21107f(this.adSession);
        this.adSession.mo54315a(vastProperties.mo54341a());
    }
}
