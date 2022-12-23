package com.mbridge.msdk.video.p347bt.module.p350b;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

/* renamed from: com.mbridge.msdk.video.bt.module.b.a */
/* compiled from: DecoratorRewardVideoListener */
public final class C9303a implements InterVideoOutListener {

    /* renamed from: a */
    private C9310g f22836a;

    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }

    public C9303a(C9310g gVar) {
        this.f22836a = gVar;
    }

    public final void onAdShow(MBridgeIds mBridgeIds) {
        C9310g gVar = this.f22836a;
        if (gVar != null) {
            gVar.onAdShow(mBridgeIds);
        }
    }

    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        C9310g gVar = this.f22836a;
        if (gVar != null) {
            gVar.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        C9310g gVar = this.f22836a;
        if (gVar != null) {
            gVar.onShowFail(mBridgeIds, str);
        }
    }

    public final void onVideoAdClicked(boolean z, MBridgeIds mBridgeIds) {
        C9310g gVar = this.f22836a;
        if (gVar != null) {
            gVar.onVideoAdClicked(mBridgeIds);
        }
    }

    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        C9310g gVar = this.f22836a;
        if (gVar != null) {
            gVar.onVideoComplete(mBridgeIds);
        }
    }

    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        C9310g gVar = this.f22836a;
        if (gVar != null) {
            gVar.onEndcardShow(mBridgeIds);
        }
    }

    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        C9310g gVar = this.f22836a;
        if (gVar != null) {
            gVar.onVideoLoadFail(mBridgeIds, str);
        }
    }

    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        C9310g gVar = this.f22836a;
        if (gVar != null) {
            gVar.onVideoLoadSuccess(mBridgeIds);
        }
    }

    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        C9310g gVar = this.f22836a;
        if (gVar != null) {
            gVar.onLoadSuccess(mBridgeIds);
        }
    }
}
