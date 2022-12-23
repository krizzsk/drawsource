package com.iab.omid.library.inmobi.adsession;

import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.iab.omid.library.inmobi.p251d.C7846e;

public final class AdEvents {
    private final C7825a adSession;

    private AdEvents(C7825a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7825a aVar = (C7825a) adSession2;
        C7846e.m22016a((Object) adSession2, "AdSession is null");
        C7846e.m22021d(aVar);
        C7846e.m22019b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55197a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7846e.m22019b(this.adSession);
        C7846e.m22023f(this.adSession);
        if (!this.adSession.mo55112e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo55112e()) {
            this.adSession.mo55109b();
        }
    }

    public void loaded() {
        C7846e.m22020c(this.adSession);
        C7846e.m22023f(this.adSession);
        this.adSession.mo55110c();
    }

    public void loaded(VastProperties vastProperties) {
        C7846e.m22016a((Object) vastProperties, "VastProperties is null");
        C7846e.m22020c(this.adSession);
        C7846e.m22023f(this.adSession);
        this.adSession.mo55108a(vastProperties.mo55133a());
    }
}
