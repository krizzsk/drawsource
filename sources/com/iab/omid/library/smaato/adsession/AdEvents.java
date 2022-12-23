package com.iab.omid.library.smaato.adsession;

import com.iab.omid.library.smaato.adsession.media.VastProperties;
import p397e.C12469e;

public final class AdEvents {
    private final C8021a adSession;

    private AdEvents(C8021a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C8021a aVar = (C8021a) adSession2;
        C12469e.m33308a((Object) adSession2, "AdSession is null");
        C12469e.m33316g(aVar);
        C12469e.m33311b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55935a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C12469e.m33311b(this.adSession);
        C12469e.m33314e(this.adSession);
        if (!this.adSession.mo55904f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo55904f()) {
            this.adSession.mo55909k();
        }
    }

    public void loaded() {
        C12469e.m33307a(this.adSession);
        C12469e.m33314e(this.adSession);
        this.adSession.mo55910l();
    }

    public void loaded(VastProperties vastProperties) {
        C12469e.m33308a((Object) vastProperties, "VastProperties is null");
        C12469e.m33307a(this.adSession);
        C12469e.m33314e(this.adSession);
        this.adSession.mo55900a(vastProperties.mo55927a());
    }
}
