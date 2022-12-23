package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.p188dv.C4306g;
import com.fyber.inneractive.sdk.serverapi.C5242b;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBannerListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridge;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;
import com.fyber.marketplace.fairbid.bridge.MarketplaceInterstitialListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceOnUserAgentAvailableListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedListener;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.f */
public class C5390f extends MarketplaceBridge {

    /* renamed from: b */
    public final C5384b f14247b = new C5384b(new C5242b(C4251s.m13278b()));

    /* renamed from: c */
    public boolean f14248c = false;

    /* renamed from: com.fyber.marketplace.fairbid.impl.f$a */
    public class C5391a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ MarketplaceOnUserAgentAvailableListener f14249a;

        public C5391a(C5390f fVar, MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
            this.f14249a = marketplaceOnUserAgentAvailableListener;
        }

        public void run() {
            IAConfigManager iAConfigManager;
            int i = 0;
            while (true) {
                iAConfigManager = IAConfigManager.f10324J;
                if (iAConfigManager.f10359y.f14052c.compareAndSet(true, true) || i >= 100) {
                    String a = iAConfigManager.f10359y.mo26394a();
                } else {
                    IAlog.m16446a("UserAgentProvider | waiting on user agent", new Object[0]);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                }
            }
            String a2 = iAConfigManager.f10359y.mo26394a();
            if (!a2.isEmpty()) {
                IAlog.m16446a("UserAgentAvailable", new Object[0]);
                this.f14249a.onUserAgentAvailable(a2);
            }
        }
    }

    /* renamed from: com.fyber.marketplace.fairbid.impl.f$b */
    public class C5392b implements IAConfigManager.OnConfigurationReadyAndValidListener {

        /* renamed from: a */
        public final /* synthetic */ MarketplaceBridgeAd f14250a;

        /* renamed from: b */
        public final /* synthetic */ MarketplaceAdLoadListener f14251b;

        public C5392b(C5390f fVar, MarketplaceBridgeAd marketplaceBridgeAd, MarketplaceAdLoadListener marketplaceAdLoadListener) {
            this.f14250a = marketplaceBridgeAd;
            this.f14251b = marketplaceAdLoadListener;
        }

        public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
            IAConfigManager.removeListener(this);
            if (IAConfigManager.m13181g()) {
                this.f14250a.load();
                return;
            }
            MarketplaceAdLoadListener marketplaceAdLoadListener = this.f14251b;
            if (marketplaceAdLoadListener != null) {
                marketplaceAdLoadListener.onAdLoadFailed(MarketplaceAdLoadError.FMP_NOT_READY_TO_LOAD_ADS);
            }
        }
    }

    /* renamed from: a */
    public void mo26593a(MarketplaceBridgeAd marketplaceBridgeAd, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        IAConfigManager.addListener(new C5392b(this, marketplaceBridgeAd, marketplaceAdLoadListener));
        IAConfigManager.m13175a();
    }

    public MarketplaceAuctionParameters getAuctionParameters(String str) {
        this.f14247b.mo26590a(str);
        return this.f14247b;
    }

    public boolean isMuted() {
        return this.f14248c;
    }

    public void loadBannerAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceBannerListener marketplaceBannerListener) {
        IAlog.m16446a("Request Banner with spotId = %s", str);
        C5387d dVar = new C5387d(str, jSONObject, map, this.f14248c, marketplaceBannerListener, this.f14247b);
        C5384b bVar = this.f14247b;
        C4306g gVar = bVar.f14218b.get(bVar.f14220d);
        bVar.f14218b.remove(bVar.f14220d);
        if (gVar != null) {
            dVar.setQueryInfo(gVar);
        }
        mo26593a(dVar, marketplaceBannerListener);
    }

    public void loadInterstitialAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceInterstitialListener marketplaceInterstitialListener) {
        IAlog.m16446a("Request Interstitial with spotId = %s", str);
        mo26593a(new C5394h(str, jSONObject, map, this.f14248c, marketplaceInterstitialListener, this.f14247b), marketplaceInterstitialListener);
    }

    public void loadRewardedAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceRewardedListener marketplaceRewardedListener) {
        IAlog.m16446a("Request Interstitial with spotId = %s", str);
        mo26593a(new C5395i(str, jSONObject, map, marketplaceRewardedListener, this.f14247b), marketplaceRewardedListener);
    }

    public String requestUserAgent(MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
        C5299n.m16520a(new C5391a(this, marketplaceOnUserAgentAvailableListener));
        return IAConfigManager.f10324J.f10359y.mo26394a();
    }

    public void setMuted(boolean z) {
        this.f14248c = z;
    }

    public MarketplaceAuctionParameters getAuctionParameters() {
        this.f14247b.mo26590a("");
        return this.f14247b;
    }
}
