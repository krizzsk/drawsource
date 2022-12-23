package com.iab.omid.library.oguryco.adsession;

import com.iab.omid.library.oguryco.adsession.media.VastProperties;
import com.iab.omid.library.oguryco.p269d.C7997e;

public final class AdEvents {
    private final C7975a adSession;

    private AdEvents(C7975a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7975a aVar = (C7975a) adSession2;
        C7997e.m22696a((Object) adSession2, "AdSession is null");
        C7997e.m22701d(aVar);
        C7997e.m22699b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55796a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C7997e.m22699b(this.adSession);
        C7997e.m22703f(this.adSession);
        if (!this.adSession.mo55693e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo55693e()) {
            this.adSession.mo55690b();
        }
    }

    public final void loaded() {
        C7997e.m22700c(this.adSession);
        C7997e.m22703f(this.adSession);
        this.adSession.mo55691c();
    }

    public final void loaded(VastProperties vastProperties) {
        C7997e.m22700c(this.adSession);
        C7997e.m22703f(this.adSession);
        this.adSession.mo55689a(vastProperties.mo55715a());
    }
}
