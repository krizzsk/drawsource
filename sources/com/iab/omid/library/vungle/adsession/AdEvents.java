package com.iab.omid.library.vungle.adsession;

import com.iab.omid.library.vungle.adsession.media.VastProperties;
import com.iab.omid.library.vungle.p275d.C8060e;

public final class AdEvents {
    private final C8039a adSession;

    private AdEvents(C8039a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C8039a aVar = (C8039a) adSession2;
        C8060e.m23017a((Object) adSession2, "AdSession is null");
        C8060e.m23022d(aVar);
        C8060e.m23020b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo56114a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C8060e.m23020b(this.adSession);
        C8060e.m23024f(this.adSession);
        if (!this.adSession.mo56029e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo56029e()) {
            this.adSession.mo56026b();
        }
    }

    public void loaded() {
        C8060e.m23021c(this.adSession);
        C8060e.m23024f(this.adSession);
        this.adSession.mo56027c();
    }

    public void loaded(VastProperties vastProperties) {
        C8060e.m23017a((Object) vastProperties, "VastProperties is null");
        C8060e.m23021c(this.adSession);
        C8060e.m23024f(this.adSession);
        this.adSession.mo56025a(vastProperties.mo56050a());
    }
}
