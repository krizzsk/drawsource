package com.mbridge.msdk.video.module.p367a.p368a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.p373b.C9630c;

/* renamed from: com.mbridge.msdk.video.module.a.a.b */
/* compiled from: ContainerViewDefaultListener */
public final class C9475b extends C9477d {

    /* renamed from: k */
    private MBridgeVideoView f23487k;

    /* renamed from: l */
    private MBridgeContainerView f23488l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9475b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C9630c cVar, C9641a aVar, String str, String str2, C9473a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        MBridgeVideoView mBridgeVideoView2 = mBridgeVideoView;
        MBridgeContainerView mBridgeContainerView2 = mBridgeContainerView;
        this.f23487k = mBridgeVideoView2;
        this.f23488l = mBridgeContainerView2;
        if (mBridgeVideoView2 == null || mBridgeContainerView2 == null) {
            this.f23498a = false;
        }
    }

    /* renamed from: a */
    public final void mo62631a(int i, Object obj) {
        if (this.f23498a) {
            if (i == 8) {
                MBridgeContainerView mBridgeContainerView = this.f23488l;
                if (mBridgeContainerView == null) {
                    MBridgeVideoView mBridgeVideoView = this.f23487k;
                    if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else if (!mBridgeContainerView.showAlertWebView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f23487k;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.showAlertView();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f23487k;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.alertWebViewShowed();
                    }
                }
            } else if (i == 107) {
                this.f23488l.showVideoClickView(-1);
                this.f23487k.setCover(false);
                this.f23487k.setMiniEndCardState(false);
                this.f23487k.videoOperate(1);
            } else if (i == 112) {
                this.f23487k.setCover(true);
                this.f23487k.setMiniEndCardState(true);
                this.f23487k.videoOperate(2);
            } else if (i == 115) {
                this.f23488l.resizeMiniCard(this.f23487k.getBorderViewWidth(), this.f23487k.getBorderViewHeight(), this.f23487k.getBorderViewRadius());
            }
        }
        super.mo62631a(i, obj);
    }
}
