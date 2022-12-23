package com.iab.omid.library.amazon.adsession;

import com.iab.omid.library.amazon.adsession.media.VastProperties;
import com.iab.omid.library.amazon.p233d.C7694e;

public final class AdEvents {
    private final C7673a adSession;

    private AdEvents(C7673a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7673a aVar = (C7673a) adSession2;
        C7694e.m21330a((Object) adSession2, "AdSession is null");
        C7694e.m21335d(aVar);
        C7694e.m21333b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54604a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7694e.m21333b(this.adSession);
        C7694e.m21337f(this.adSession);
        if (!this.adSession.mo54519f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo54519f()) {
            this.adSession.mo54516c();
        }
    }

    public void loaded() {
        C7694e.m21334c(this.adSession);
        C7694e.m21337f(this.adSession);
        this.adSession.mo54517d();
    }

    public void loaded(VastProperties vastProperties) {
        C7694e.m21330a((Object) vastProperties, "VastProperties is null");
        C7694e.m21334c(this.adSession);
        C7694e.m21337f(this.adSession);
        this.adSession.mo54514a(vastProperties.mo54540a());
    }
}
