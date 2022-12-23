package com.mbridge.msdk.video.module.p367a.p368a;

import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.video.p347bt.module.p350b.C9308f;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.p373b.C9630c;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.mbridge.msdk.video.module.a.a.m */
/* compiled from: VideoViewDefaultListener */
public final class C9491m extends C9495o {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MBridgeVideoView f23515l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public MBridgeContainerView f23516m;

    /* renamed from: n */
    private int f23517n;

    /* renamed from: o */
    private Timer f23518o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Handler f23519p = new Handler();

    /* renamed from: q */
    private boolean f23520q = false;

    /* renamed from: r */
    private boolean f23521r = false;

    /* renamed from: s */
    private int f23522s;

    /* renamed from: t */
    private int f23523t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9491m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C9630c cVar, C9641a aVar, String str, String str2, int i, int i2, C9473a aVar2, int i3, boolean z, int i4) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i3, z);
        MBridgeVideoView mBridgeVideoView2 = mBridgeVideoView;
        MBridgeContainerView mBridgeContainerView2 = mBridgeContainerView;
        boolean z2 = true;
        this.f23522s = 1;
        this.f23515l = mBridgeVideoView2;
        this.f23516m = mBridgeContainerView2;
        this.f23523t = i;
        this.f23517n = i2;
        this.f23522s = i4;
        if (mBridgeVideoView2 != null) {
            this.f23520q = mBridgeVideoView.getVideoSkipTime() != 0 ? false : z2;
        }
        if (mBridgeVideoView2 == null || mBridgeContainerView2 == null) {
            this.f23498a = false;
        }
    }

    /* renamed from: a */
    public final void mo62631a(int i, Object obj) {
        Integer num;
        if (this.f23498a) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 8) {
                                switch (i) {
                                    case 10:
                                        this.f23521r = true;
                                        this.f23515l.soundOperate(0, 2);
                                        this.f23515l.progressOperate(0, 2);
                                        break;
                                    case 11:
                                        this.f23515l.videoOperate(3);
                                        this.f23515l.dismissAllAlert();
                                        if (this.f23499b.getVideo_end_type() == 3) {
                                            this.f23515l.setVisibility(0);
                                        } else if (this.f23499b.getAdSpaceT() != 2) {
                                            this.f23515l.setVisibility(8);
                                        }
                                        if (this.f23499b == null || this.f23499b.getDynamicTempCode() != 5 || this.f23515l.mCurrPlayNum != this.f23515l.mCampaignSize) {
                                            if (this.f23499b.getAdSpaceT() != 2) {
                                                this.f23516m.showEndcard(this.f23499b.getVideo_end_type());
                                                break;
                                            } else {
                                                this.f23516m.showVideoEndCover();
                                                break;
                                            }
                                        } else {
                                            MBridgeContainerView mBridgeContainerView = this.f23516m;
                                            if (mBridgeContainerView != null) {
                                                mBridgeContainerView.setRewardStatus(true);
                                                this.f23516m.showOrderCampView();
                                                break;
                                            }
                                        }
                                        break;
                                    case 12:
                                        mo63220h();
                                        this.f23515l.videoOperate(3);
                                        this.f23515l.dismissAllAlert();
                                        if (this.f23499b.getVideo_end_type() != 3) {
                                            this.f23515l.setVisibility(8);
                                        } else {
                                            this.f23515l.setVisibility(0);
                                        }
                                        if (this.f23521r || this.f23522s != 0) {
                                            if (this.f23499b.isDynamicView() && this.f23499b.getDynamicTempCode() == 5 && TextUtils.isEmpty(this.f23499b.getendcard_url())) {
                                                m27009j();
                                                this.f23522s = 0;
                                            }
                                            if (!this.f23521r && this.f23522s == 1) {
                                                mo63219g();
                                                mo63218f();
                                                mo63217e();
                                            }
                                            if (this.f23499b.getAdSpaceT() == 2) {
                                                this.f23516m.showVideoEndCover();
                                                break;
                                            } else {
                                                this.f23516m.showEndcard(this.f23499b.getVideo_end_type());
                                                break;
                                            }
                                        }
                                    case 13:
                                        this.f23515l.closeVideoOperate(0, 2);
                                        break;
                                    case 14:
                                        if (!this.f23520q) {
                                            this.f23515l.closeVideoOperate(0, 1);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        if (obj != null && (obj instanceof MBridgeVideoView.C9471a)) {
                                            MBridgeVideoView.C9471a aVar = (MBridgeVideoView.C9471a) obj;
                                            int videoInteractiveType = this.f23516m.getVideoInteractiveType();
                                            if (this.f23499b.getAdSpaceT() == 2) {
                                                this.f23516m.showVideoClickView(1);
                                            } else if (videoInteractiveType >= 0 && aVar.f23467a >= videoInteractiveType) {
                                                this.f23516m.showVideoClickView(1);
                                                this.f23515l.soundOperate(0, 1);
                                            }
                                            this.f23520q = aVar.f23469c;
                                            if (this.f23499b.getDynamicTempCode() != 5) {
                                                if (((this.f23517n >= 0 && (aVar.f23467a >= this.f23517n || aVar.f23467a == aVar.f23468b)) || (this.f23499b.getVideoCompleteTime() > 0 && (aVar.f23467a > this.f23499b.getVideoCompleteTime() || aVar.f23467a == aVar.f23468b))) && !this.f23520q) {
                                                    this.f23515l.closeVideoOperate(0, 2);
                                                    this.f23520q = true;
                                                    break;
                                                }
                                            } else {
                                                int i2 = aVar.f23467a;
                                                int i3 = aVar.f23468b;
                                                if (!(this.f23520q || this.f23515l == null || this.f23499b == null)) {
                                                    int i4 = this.f23517n;
                                                    int i5 = (i4 < 0 || i2 < i4) ? 1 : 2;
                                                    if (i5 != 2 && (this.f23499b.getVideoCompleteTime() != 0 ? i2 > this.f23499b.getVideoCompleteTime() : this.f23515l.mCurrPlayNum > 1)) {
                                                        i5 = 2;
                                                    }
                                                    if (i5 != 2 && this.f23515l.mCurrPlayNum > 1 && i2 == i3) {
                                                        i5 = 2;
                                                    }
                                                    if (i5 == 2) {
                                                        this.f23515l.closeVideoOperate(0, i5);
                                                        this.f23520q = true;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                }
                            } else {
                                MBridgeContainerView mBridgeContainerView2 = this.f23516m;
                                if (mBridgeContainerView2 == null) {
                                    MBridgeVideoView mBridgeVideoView = this.f23515l;
                                    if (mBridgeVideoView != null) {
                                        mBridgeVideoView.showAlertView();
                                    }
                                } else if (!mBridgeContainerView2.showAlertWebView()) {
                                    MBridgeVideoView mBridgeVideoView2 = this.f23515l;
                                    if (mBridgeVideoView2 != null) {
                                        mBridgeVideoView2.showAlertView();
                                    }
                                } else {
                                    MBridgeVideoView mBridgeVideoView3 = this.f23515l;
                                    if (mBridgeVideoView3 != null) {
                                        mBridgeVideoView3.alertWebViewShowed();
                                    }
                                }
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.f23515l.soundOperate(num.intValue(), -1);
                    }
                }
                this.f23515l.dismissAllAlert();
                this.f23515l.videoOperate(3);
                if (this.f23499b != null && this.f23499b.isDynamicView() && this.f23499b.getDynamicTempCode() == 5) {
                    if (this.f23516m == null || this.f23515l.mCurrPlayNum != this.f23515l.mCampaignSize) {
                        C9308f.m26486a(this.f23499b, this.f23504g, this.f23515l.mCurrentPlayProgressTime);
                    } else {
                        if (this.f23499b.getAdSpaceT() != 2) {
                            this.f23516m.setRewardStatus(true);
                            this.f23516m.showOrderCampView();
                        }
                        i = 16;
                    }
                }
                if (this.f23523t == 2 && !this.f23516m.endCardShowing() && this.f23499b.getAdSpaceT() != 2) {
                    this.f23516m.showEndcard(this.f23499b.getVideo_end_type());
                }
                i = 16;
            } else if (!this.f23516m.endCardShowing()) {
                int videoInteractiveType2 = this.f23516m.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.f23516m.isLast()) {
                            this.f23516m.showVideoClickView(1);
                            this.f23515l.soundOperate(0, 1);
                            try {
                                m27008i();
                                this.f23518o = new Timer();
                                this.f23518o.schedule(new TimerTask() {
                                    public final void run() {
                                        try {
                                            C9491m.this.f23519p.post(new Runnable() {
                                                public final void run() {
                                                    C9491m.this.f23516m.showVideoClickView(-1);
                                                    C9491m.this.f23515l.soundOperate(0, 2);
                                                }
                                            });
                                        } catch (Throwable th) {
                                            if (MBridgeConstans.DEBUG) {
                                                th.printStackTrace();
                                            }
                                        }
                                    }
                                }, 3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            this.f23516m.showVideoClickView(-1);
                            this.f23515l.soundOperate(0, 2);
                            m27008i();
                        }
                    }
                } else if (this.f23516m.miniCardLoaded()) {
                    this.f23516m.showVideoClickView(2);
                }
            }
        }
        super.mo62631a(i, obj);
    }

    /* renamed from: i */
    private void m27008i() {
        try {
            if (this.f23518o != null) {
                this.f23518o.cancel();
                this.f23518o = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    private void m27009j() {
        if (this.f23499b != null && this.f23499b.getDynamicTempCode() == 5) {
            CampaignEx campaignEx = null;
            MBridgeVideoView mBridgeVideoView = this.f23515l;
            if (!(mBridgeVideoView == null || mBridgeVideoView.mCampOrderViewData == null)) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 < this.f23515l.mCampOrderViewData.size()) {
                        if (this.f23515l.mCampOrderViewData.get(i2) != null && this.f23515l.mCampOrderViewData.get(i2).getId() == this.f23499b.getId()) {
                            i = i2 - 1;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                if (i >= 0 && this.f23515l.mCampOrderViewData.get(i) != null) {
                    campaignEx = this.f23515l.mCampOrderViewData.get(i);
                }
            }
            if (campaignEx != null) {
                MBridgeVideoView mBridgeVideoView2 = this.f23515l;
                if (mBridgeVideoView2 != null) {
                    mBridgeVideoView2.setCampaign(campaignEx);
                }
                MBridgeContainerView mBridgeContainerView = this.f23516m;
                if (mBridgeContainerView != null) {
                    mBridgeContainerView.setCampaign(campaignEx);
                }
                mo63209a(campaignEx);
            }
        }
    }
}
