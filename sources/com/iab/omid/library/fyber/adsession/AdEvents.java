package com.iab.omid.library.fyber.adsession;

import com.iab.omid.library.fyber.adsession.media.VastProperties;
import com.iab.omid.library.fyber.p245d.C7795e;

public final class AdEvents {
    private final C7774a adSession;

    private AdEvents(C7774a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7774a aVar = (C7774a) adSession2;
        C7795e.m21790a((Object) adSession2, "AdSession is null");
        C7795e.m21795d(aVar);
        C7795e.m21793b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55002a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7795e.m21793b(this.adSession);
        C7795e.m21797f(this.adSession);
        if (!this.adSession.mo54917f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo54917f()) {
            this.adSession.mo54914c();
        }
    }

    public void loaded() {
        C7795e.m21794c(this.adSession);
        C7795e.m21797f(this.adSession);
        this.adSession.mo54915d();
    }

    public void loaded(VastProperties vastProperties) {
        C7795e.m21790a((Object) vastProperties, "VastProperties is null");
        C7795e.m21794c(this.adSession);
        C7795e.m21797f(this.adSession);
        this.adSession.mo54912a(vastProperties.mo54938a());
    }
}
