package com.mbridge.msdk.video.module.p367a.p368a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.video.signal.C9616f;
import com.mbridge.msdk.video.signal.C9621i;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.p373b.C9630c;

/* renamed from: com.mbridge.msdk.video.module.a.a.n */
/* compiled from: VideoViewJSListener */
public final class C9494n extends C9495o {

    /* renamed from: l */
    private IJSFactory f23526l;

    /* renamed from: m */
    private int f23527m;

    /* renamed from: n */
    private boolean f23528n = false;

    /* renamed from: o */
    private int f23529o;

    /* renamed from: p */
    private boolean f23530p = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9494n(IJSFactory iJSFactory, CampaignEx campaignEx, C9630c cVar, C9641a aVar, String str, String str2, int i, int i2, C9473a aVar2, int i3, boolean z, int i4) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i3, z);
        IJSFactory iJSFactory2 = iJSFactory;
        this.f23526l = iJSFactory2;
        this.f23527m = i;
        this.f23528n = i2 == 0;
        if (iJSFactory2 == null) {
            this.f23498a = false;
        }
        this.f23529o = i4;
    }

    /* renamed from: a */
    public final void mo62631a(int i, Object obj) {
        Integer num;
        int i2;
        if (this.f23498a) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        int i3 = 6;
                        if (i != 6) {
                            if (i != 8) {
                                if (i != 114) {
                                    if (i != 116) {
                                        switch (i) {
                                            case 10:
                                                this.f23530p = true;
                                                this.f23526l.getJSNotifyProxy().mo63267a(0);
                                                break;
                                            case 11:
                                            case 12:
                                                this.f23526l.getJSVideoModule().videoOperate(3);
                                                if (this.f23499b.getVideo_end_type() == 3) {
                                                    this.f23526l.getJSVideoModule().setVisible(0);
                                                } else if (this.f23499b.getAdSpaceT() != 2) {
                                                    this.f23526l.getJSVideoModule().setVisible(8);
                                                }
                                                if (i == 12) {
                                                    mo63220h();
                                                    i2 = 2;
                                                } else {
                                                    i2 = 1;
                                                }
                                                this.f23526l.getJSNotifyProxy().mo63267a(i2);
                                                if (this.f23526l.getJSCommon().mo63258g() == 2) {
                                                    this.f23526l.getJSVideoModule().setVisible(0);
                                                    C9621i jSVideoModule = this.f23526l.getJSVideoModule();
                                                    this.f23526l.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                                } else if (i == 12) {
                                                    if (this.f23529o == 1) {
                                                        if (this.f23499b.getAdSpaceT() != 2) {
                                                            this.f23526l.getJSContainerModule().showEndcard(this.f23499b.getVideo_end_type());
                                                        } else {
                                                            this.f23526l.getJSContainerModule().showVideoEndCover();
                                                        }
                                                    }
                                                } else if (this.f23499b.getAdSpaceT() != 2) {
                                                    this.f23526l.getJSContainerModule().showEndcard(this.f23499b.getVideo_end_type());
                                                } else {
                                                    this.f23526l.getJSContainerModule().showVideoEndCover();
                                                }
                                                this.f23526l.getJSVideoModule().dismissAllAlert();
                                                if (i == 12 && !this.f23530p && this.f23529o == 1) {
                                                    mo63220h();
                                                    mo63219g();
                                                    mo63218f();
                                                    mo63217e();
                                                    break;
                                                }
                                            case 13:
                                                if (!this.f23526l.getJSVideoModule().isH5Canvas()) {
                                                    this.f23526l.getJSVideoModule().closeVideoOperate(0, 2);
                                                }
                                                this.f23526l.getJSNotifyProxy().mo63267a(-1);
                                                break;
                                            case 14:
                                                if (!this.f23528n) {
                                                    this.f23526l.getJSVideoModule().closeVideoOperate(0, 1);
                                                    break;
                                                }
                                                break;
                                            case 15:
                                                if (obj != null && (obj instanceof MBridgeVideoView.C9471a)) {
                                                    this.f23528n = true;
                                                    this.f23526l.getJSNotifyProxy().mo63270a((MBridgeVideoView.C9471a) obj);
                                                    break;
                                                }
                                            default:
                                                switch (i) {
                                                    case 123:
                                                    case 124:
                                                        C9616f jSNotifyProxy = this.f23526l.getJSNotifyProxy();
                                                        if (i == 123) {
                                                            i3 = 7;
                                                        }
                                                        jSNotifyProxy.mo63269a(i3, "");
                                                        break;
                                                    case 125:
                                                        this.f23526l.getJSContainerModule().hideAlertWebview();
                                                        break;
                                                }
                                        }
                                    } else {
                                        C9621i jSVideoModule2 = this.f23526l.getJSVideoModule();
                                        this.f23526l.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                    }
                                } else if (this.f23526l.getJSCommon().mo63258g() == 2) {
                                    C9621i jSVideoModule3 = this.f23526l.getJSVideoModule();
                                    this.f23526l.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                                }
                            } else if (!this.f23526l.getJSContainerModule().showAlertWebView()) {
                                this.f23526l.getJSVideoModule().showAlertView();
                            } else {
                                this.f23526l.getJSVideoModule().alertWebViewShowed();
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.f23526l.getJSVideoModule().soundOperate(num.intValue(), -1);
                        this.f23526l.getJSNotifyProxy().mo63269a(5, num + "");
                    }
                }
                this.f23526l.getJSVideoModule().dismissAllAlert();
                if (i == 2) {
                    this.f23526l.getJSNotifyProxy().mo63269a(2, "");
                }
                this.f23526l.getJSVideoModule().videoOperate(3);
                if (this.f23526l.getJSCommon().mo63258g() != 2) {
                    if (this.f23499b.getVideo_end_type() != 3) {
                        this.f23526l.getJSVideoModule().setVisible(8);
                    } else {
                        this.f23526l.getJSVideoModule().setVisible(0);
                    }
                    if (this.f23527m == 2 && !this.f23526l.getJSContainerModule().endCardShowing() && this.f23499b.getAdSpaceT() != 2) {
                        this.f23526l.getJSContainerModule().showEndcard(this.f23499b.getVideo_end_type());
                        this.f23526l.getJSNotifyProxy().mo63267a(1);
                    }
                }
                i = 16;
                this.f23526l.getJSNotifyProxy().mo63267a(1);
            } else if (!this.f23526l.getJSContainerModule().endCardShowing()) {
                this.f23526l.getJSNotifyProxy().mo63269a(1, "");
            }
        }
        super.mo62631a(i, obj);
    }
}
