package com.mbridge.msdk.video.module.p367a.p368a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.p373b.C9630c;

/* renamed from: com.mbridge.msdk.video.module.a.a.h */
/* compiled from: PlayableStatisticsOnNotifyListener */
public final class C9482h extends C9485k {
    public C9482h(CampaignEx campaignEx, C9641a aVar, C9630c cVar, String str, String str2, C9473a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
    }

    /* renamed from: a */
    public final void mo62631a(int i, Object obj) {
        if (i == 100) {
            mo63219g();
            mo63218f();
            mo63217e();
            mo63207a(2);
        } else if (i == 109) {
            mo63213b(2);
        } else if (i == 122) {
            mo63206a();
        } else if (i != 129) {
            String str = "";
            if (i == 118) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                mo63208a(3, str);
            } else if (i == 119) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                mo63208a(4, str);
            }
        } else if (this.f23499b != null && this.f23499b.getPlayable_ads_without_video() == 2) {
            mo63219g();
            mo63218f();
            mo63217e();
            mo63207a(1);
        }
        super.mo62631a(i, obj);
    }
}
