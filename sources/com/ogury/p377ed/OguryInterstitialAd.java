package com.ogury.p377ed;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p377ed.internal.C10010f;
import com.ogury.p377ed.internal.C10072gw;
import com.ogury.p377ed.internal.C10076h;
import com.ogury.p377ed.internal.C10177k;
import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C10330t;
import com.ogury.p377ed.internal.C9864bm;
import com.ogury.p377ed.internal.C9978e;
import com.ogury.p377ed.internal.C9989ej;
import p401io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.OguryInterstitialAd */
public final class OguryInterstitialAd {

    /* renamed from: a */
    private final C9864bm f24703a;

    private OguryInterstitialAd(C9864bm bmVar) {
        this.f24703a = bmVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryInterstitialAd(Context context, String str) {
        this(new C9864bm(context, new AdConfig(str), C9989ej.INTERSTITIAL));
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(str, "adUnitId");
    }

    public final boolean isLoaded() {
        return this.f24703a.mo64385b();
    }

    public final void setListener(OguryInterstitialAdListener oguryInterstitialAdListener) {
        OguryIntegrationLogger.m28105d("[Ads] Interstitial Ad - setListener() called");
        C9864bm bmVar = this.f24703a;
        C10010f.C10011a aVar = C10010f.f25174a;
        bmVar.mo64379a((C10076h) C10010f.C10011a.m28994a(oguryInterstitialAdListener));
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C9864bm bmVar = this.f24703a;
        C9978e.C9979a aVar = C9978e.f25079a;
        bmVar.mo64380a((C10177k) C9978e.C9979a.m28794a(oguryAdImpressionListener));
    }

    private final void setCampaignId(String str) {
        this.f24703a.mo64384b(str);
    }

    public final void setAdMarkup(String str) {
        C10263mq.m29882b(str, "adMarkup");
        this.f24703a.mo64387d(str);
    }

    private final void setCreativeId(String str) {
        this.f24703a.mo64386c(str);
    }

    public final void load() {
        OguryIntegrationLogger.m28105d("[Ads] Interstitial Ad - load() called");
        this.f24703a.mo64378a();
    }

    public final void show() {
        OguryIntegrationLogger.m28105d("[Ads] Interstitial Ad - show() called");
        this.f24703a.mo64382a((C10330t) C10072gw.f25302a);
    }
}
