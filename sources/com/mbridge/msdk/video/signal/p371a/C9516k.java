package com.mbridge.msdk.video.signal.p371a;

import com.mbridge.msdk.video.module.MBridgeContainerView;

/* renamed from: com.mbridge.msdk.video.signal.a.k */
/* compiled from: JSContainerModule */
public final class C9516k extends C9508d {

    /* renamed from: a */
    private MBridgeContainerView f23578a;

    public C9516k(MBridgeContainerView mBridgeContainerView) {
        this.f23578a = mBridgeContainerView;
    }

    public final boolean showAlertWebView() {
        super.showAlertWebView();
        MBridgeContainerView mBridgeContainerView = this.f23578a;
        if (mBridgeContainerView != null) {
            return mBridgeContainerView.showAlertWebView();
        }
        return false;
    }

    public final void showVideoClickView(int i) {
        super.showVideoClickView(i);
        MBridgeContainerView mBridgeContainerView = this.f23578a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.showVideoClickView(i);
        }
    }

    public final void showEndcard(int i) {
        super.showEndcard(i);
        try {
            if (this.f23578a != null) {
                this.f23578a.showEndcard(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void showVideoEndCover() {
        super.showVideoEndCover();
        try {
            if (this.f23578a != null) {
                this.f23578a.showVideoEndCover();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        try {
            if (this.f23578a != null) {
                this.f23578a.toggleCloseBtn(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean endCardShowing() {
        try {
            if (this.f23578a != null) {
                return this.f23578a.endCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.endCardShowing();
    }

    public final boolean miniCardShowing() {
        try {
            if (this.f23578a != null) {
                return this.f23578a.miniCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardShowing();
    }

    public final void readyStatus(int i) {
        try {
            if (this.f23578a != null) {
                this.f23578a.readyStatus(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.readyStatus(i);
    }

    public final void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        super.showMiniCard(i, i2, i3, i4, i5);
        try {
            if (this.f23578a != null) {
                this.f23578a.showMiniCard(i, i2, i3, i4, i5);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void resizeMiniCard(int i, int i2, int i3) {
        super.resizeMiniCard(i, i2, i3);
        try {
            if (this.f23578a != null) {
                this.f23578a.resizeMiniCard(i, i2, i3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void configurationChanged(int i, int i2, int i3) {
        super.configurationChanged(i, i2, i3);
        try {
            if (this.f23578a != null) {
                this.f23578a.configurationChanged(i, i2, i3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void hideAlertWebview() {
        super.hideAlertWebview();
        MBridgeContainerView mBridgeContainerView = this.f23578a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.hideAlertWebview();
        }
    }

    public final void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        MBridgeContainerView mBridgeContainerView = this.f23578a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.ivRewardAdsWithoutVideo(str);
        }
    }
}
