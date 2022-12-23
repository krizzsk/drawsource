package com.ogury.p377ed;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p377ed.internal.C10010f;
import com.ogury.p377ed.internal.C10072gw;
import com.ogury.p377ed.internal.C10076h;
import com.ogury.p377ed.internal.C10177k;
import com.ogury.p377ed.internal.C10182ke;
import com.ogury.p377ed.internal.C10228lk;
import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C10264mr;
import com.ogury.p377ed.internal.C10330t;
import com.ogury.p377ed.internal.C9864bm;
import com.ogury.p377ed.internal.C9978e;
import com.ogury.p377ed.internal.C9989ej;
import p401io.presage.common.AdConfig;
import p401io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.OguryOptinVideoAd */
public final class OguryOptinVideoAd {

    /* renamed from: a */
    private final C9864bm f24704a;

    private OguryOptinVideoAd(C9864bm bmVar) {
        this.f24704a = bmVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryOptinVideoAd(Context context, String str) {
        this(new C9864bm(context, new AdConfig(str), C9989ej.OPTIN_VIDEO));
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(str, "adUnitId");
    }

    public final boolean isLoaded() {
        return this.f24704a.mo64385b();
    }

    public final void setListener(OguryOptinVideoAdListener oguryOptinVideoAdListener) {
        OguryIntegrationLogger.m28105d("[Ads] Optin Video Ad - setListener() called");
        C9864bm bmVar = this.f24704a;
        C10010f.C10011a aVar = C10010f.f25174a;
        bmVar.mo64379a((C10076h) C10010f.C10011a.m28994a(oguryOptinVideoAdListener));
        this.f24704a.mo64381a((C10228lk<? super RewardItem, C10182ke>) new C9800a(oguryOptinVideoAdListener));
    }

    /* renamed from: com.ogury.ed.OguryOptinVideoAd$a */
    static final class C9800a extends C10264mr implements C10228lk<RewardItem, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ OguryOptinVideoAdListener f24705a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9800a(OguryOptinVideoAdListener oguryOptinVideoAdListener) {
            super(1);
            this.f24705a = oguryOptinVideoAdListener;
        }

        /* renamed from: a */
        private void m28253a(RewardItem rewardItem) {
            C10263mq.m29882b(rewardItem, "rewardItem");
            OguryOptinVideoAdListener oguryOptinVideoAdListener = this.f24705a;
            if (oguryOptinVideoAdListener != null) {
                oguryOptinVideoAdListener.onAdRewarded(new OguryReward(rewardItem.getName(), rewardItem.getValue()));
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28253a((RewardItem) obj);
            return C10182ke.f25542a;
        }
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C9864bm bmVar = this.f24704a;
        C9978e.C9979a aVar = C9978e.f25079a;
        bmVar.mo64380a((C10177k) C9978e.C9979a.m28794a(oguryAdImpressionListener));
    }

    private final void setCampaignId(String str) {
        this.f24704a.mo64384b(str);
    }

    private final void setCreativeId(String str) {
        this.f24704a.mo64386c(str);
    }

    public final void load() {
        OguryIntegrationLogger.m28105d("[Ads] Optin Video Ad - load() called");
        this.f24704a.mo64378a();
    }

    public final void show() {
        OguryIntegrationLogger.m28105d("[Ads] Optin Video Ad - show() called");
        this.f24704a.mo64382a((C10330t) C10072gw.f25302a);
    }

    public final void setUserId(String str) {
        C10263mq.m29882b(str, DataKeys.USER_ID);
        this.f24704a.mo64383a(str);
    }
}
