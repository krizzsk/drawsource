package com.ironsource.sdk.p284f;

import com.ironsource.mediationsdk.adunit.p207a.C6538a;
import com.ironsource.sdk.p285g.C8293d;

/* renamed from: com.ironsource.sdk.f.a */
public class C8286a {

    /* renamed from: a */
    private C6538a f20185a = new C6538a();

    /* renamed from: com.ironsource.sdk.f.a$a */
    public static class C8287a {

        /* renamed from: a */
        public String f20186a;

        /* renamed from: b */
        public String f20187b;

        /* renamed from: c */
        public String f20188c;

        /* renamed from: a */
        public static C8287a m23624a(C8293d.C8298e eVar) {
            String str;
            C8287a aVar = new C8287a();
            if (eVar == C8293d.C8298e.RewardedVideo) {
                aVar.f20186a = "showRewardedVideo";
                aVar.f20187b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar == C8293d.C8298e.Interstitial) {
                aVar.f20186a = "showInterstitial";
                aVar.f20187b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            } else {
                if (eVar == C8293d.C8298e.OfferWall) {
                    aVar.f20186a = "showOfferWall";
                    aVar.f20187b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return aVar;
            }
            aVar.f20188c = str;
            return aVar;
        }
    }

    /* renamed from: a */
    public void mo56714a(int i) {
        C6538a.m19816a("sdia", (Object) Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo56715b(int i) {
        C6538a.m19816a("sdra", (Object) Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo56716c(int i) {
        C6538a.m19816a("sdba", (Object) Integer.valueOf(i));
    }
}
