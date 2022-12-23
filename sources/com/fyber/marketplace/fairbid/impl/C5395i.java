package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd;
import com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedAd;
import com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedDisplayEventsListener;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.i */
public class C5395i extends C5393g<MarketplaceRewardedDisplayEventsListener> implements MarketplaceRewardedAd, InneractiveFullScreenAdRewardedListener {
    public C5395i(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceAdLoadListener<MarketplaceFullscreenAd<MarketplaceRewardedDisplayEventsListener>> marketplaceAdLoadListener, MarketplaceAuctionParameters marketplaceAuctionParameters) {
        super(str, jSONObject, map, false, marketplaceAdLoadListener, marketplaceAuctionParameters);
        this.mController.setRewardedListener(this);
    }

    public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
        T t = this.mEventsListener;
        if (t != null) {
            ((MarketplaceRewardedDisplayEventsListener) t).onReward();
        }
    }
}
