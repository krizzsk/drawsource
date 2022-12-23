package com.mbridge.msdk.video.module.p367a.p368a;

import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;
import com.mbridge.msdk.video.module.p367a.C9473a;

/* renamed from: com.mbridge.msdk.video.module.a.a.g */
/* compiled from: MiniCardProxyNotifyListener */
public final class C9481g extends C9483i {

    /* renamed from: a */
    private MBridgeClickMiniCardView f23495a;

    public C9481g(MBridgeClickMiniCardView mBridgeClickMiniCardView, C9473a aVar) {
        super(aVar);
        this.f23495a = mBridgeClickMiniCardView;
    }

    /* renamed from: a */
    public final void mo62631a(int i, Object obj) {
        boolean z = false;
        switch (i) {
            case 100:
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23495a;
                if (mBridgeClickMiniCardView != null) {
                    mBridgeClickMiniCardView.webviewshow();
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f23495a;
                    mBridgeClickMiniCardView2.onSelfConfigurationChanged(mBridgeClickMiniCardView2.getResources().getConfiguration());
                    break;
                }
                break;
            case 101:
            case 102:
                z = true;
                break;
            case 103:
                i = 107;
                break;
        }
        if (!z) {
            super.mo62631a(i, obj);
        }
    }
}
