package com.smaato.sdk.banner.widget;

import com.smaato.sdk.core.util.p384fi.Consumer;

/* renamed from: com.smaato.sdk.banner.widget.-$$Lambda$BannerViewLoader$BannerAdPresenterListenerImpl$zsMdP4NwY1iBdOXWebBlinK0RlM */
/* compiled from: lambda */
public final /* synthetic */ class C10770x951d2ac3 implements Consumer {
    public static final /* synthetic */ C10770x951d2ac3 INSTANCE = new C10770x951d2ac3();

    private /* synthetic */ C10770x951d2ac3() {
    }

    public final void accept(Object obj) {
        ((BannerView) obj).onAdFailedToLoad(BannerError.AD_UNLOADED);
    }
}
