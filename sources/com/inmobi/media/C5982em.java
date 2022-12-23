package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;

/* renamed from: com.inmobi.media.em */
/* compiled from: AdEventHandler */
final class C5982em {

    /* renamed from: a */
    AdEvents f15164a;

    /* renamed from: b */
    MediaEvents f15165b;

    public C5982em(AdSession adSession, String str) {
        if (((str.hashCode() == -1191784049 && str.equals("native_video_ad")) ? (char) 0 : 65535) == 0) {
            this.f15165b = MediaEvents.createMediaEvents(adSession);
        }
        this.f15164a = AdEvents.createAdEvents(adSession);
    }

    /* renamed from: a */
    public final void mo35113a() {
        AdEvents adEvents = this.f15164a;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
    }
}
