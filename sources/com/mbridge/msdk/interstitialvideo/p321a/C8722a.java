package com.mbridge.msdk.interstitialvideo.p321a;

import com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

/* renamed from: com.mbridge.msdk.interstitialvideo.a.a */
/* compiled from: DecoratorInterstitialListener */
public final class C8722a implements InterVideoOutListener {

    /* renamed from: a */
    private InterstitialVideoListener f21393a;

    public C8722a(InterstitialVideoListener interstitialVideoListener) {
        this.f21393a = interstitialVideoListener;
    }

    public final void onAdShow(MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.f21393a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onAdShow(mBridgeIds);
        }
    }

    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        InterstitialVideoListener interstitialVideoListener = this.f21393a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        InterstitialVideoListener interstitialVideoListener = this.f21393a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onShowFail(mBridgeIds, str);
        }
    }

    public final void onVideoAdClicked(boolean z, MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.f21393a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onVideoAdClicked(mBridgeIds);
        }
    }

    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.f21393a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onVideoComplete(mBridgeIds);
        }
    }

    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        InterstitialVideoListener interstitialVideoListener = this.f21393a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onAdCloseWithIVReward(mBridgeIds, rewardInfo);
        }
    }

    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.f21393a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onEndcardShow(mBridgeIds);
        }
    }

    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        InterstitialVideoListener interstitialVideoListener = this.f21393a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onVideoLoadFail(mBridgeIds, str);
        }
    }

    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.f21393a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onVideoLoadSuccess(mBridgeIds);
        }
    }

    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        InterstitialVideoListener interstitialVideoListener = this.f21393a;
        if (interstitialVideoListener != null) {
            interstitialVideoListener.onLoadSuccess(mBridgeIds);
        }
    }
}
