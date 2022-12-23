package com.mbridge.msdk.video.module.p367a.p368a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.video.signal.C9621i;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.p373b.C9630c;

/* renamed from: com.mbridge.msdk.video.module.a.a.c */
/* compiled from: ContainerViewJSListener */
public final class C9476c extends C9477d {

    /* renamed from: k */
    private IJSFactory f23489k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9476c(IJSFactory iJSFactory, CampaignEx campaignEx, C9630c cVar, C9641a aVar, String str, String str2, C9473a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        IJSFactory iJSFactory2 = iJSFactory;
        this.f23489k = iJSFactory2;
        if (iJSFactory2 == null) {
            this.f23498a = false;
        }
    }

    /* renamed from: a */
    public final void mo62631a(int i, Object obj) {
        if (this.f23498a) {
            if (i != 8) {
                if (i == 105) {
                    this.f23489k.getJSNotifyProxy().mo63269a(3, obj.toString());
                    i = -1;
                } else if (i == 107) {
                    this.f23489k.getJSContainerModule().showVideoClickView(-1);
                    this.f23489k.getJSVideoModule().setCover(false);
                    this.f23489k.getJSVideoModule().setMiniEndCardState(false);
                    this.f23489k.getJSVideoModule().videoOperate(1);
                } else if (i == 112) {
                    this.f23489k.getJSVideoModule().setCover(true);
                    this.f23489k.getJSVideoModule().setMiniEndCardState(true);
                    this.f23489k.getJSVideoModule().videoOperate(2);
                } else if (i == 115) {
                    C9621i jSVideoModule = this.f23489k.getJSVideoModule();
                    this.f23489k.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (!this.f23489k.getJSContainerModule().showAlertWebView()) {
                this.f23489k.getJSVideoModule().showAlertView();
            } else {
                this.f23489k.getJSVideoModule().alertWebViewShowed();
            }
        }
        super.mo62631a(i, obj);
    }
}
