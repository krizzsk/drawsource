package p401io.presage.interstitial.optinvideo;

import p401io.presage.common.network.models.RewardItem;
import p401io.presage.interstitial.PresageInterstitialCallback;

@Deprecated
/* renamed from: io.presage.interstitial.optinvideo.PresageOptinVideoCallback */
public interface PresageOptinVideoCallback extends PresageInterstitialCallback {
    void onAdRewarded(RewardItem rewardItem);
}
