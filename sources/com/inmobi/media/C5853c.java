package com.inmobi.media;

import android.os.Handler;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;

/* renamed from: com.inmobi.media.c */
/* compiled from: BannerRefreshHandler */
public final class C5853c extends Handler {

    /* renamed from: a */
    private static final String f14745a = C5853c.class.getSimpleName();

    /* renamed from: b */
    private InMobiBanner f14746b;

    public C5853c(InMobiBanner inMobiBanner) {
        this.f14746b = inMobiBanner;
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            int i = message.what;
            return;
        }
        InMobiBanner inMobiBanner = this.f14746b;
        inMobiBanner.mo56185a((PublisherCallbacks) inMobiBanner.f19548e, true);
    }
}
