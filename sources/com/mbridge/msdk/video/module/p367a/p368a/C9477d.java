package com.mbridge.msdk.video.module.p367a.p368a;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.click.p217a.C6772a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.video.module.p369b.C9499b;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.p373b.C9630c;

/* renamed from: com.mbridge.msdk.video.module.a.a.d */
/* compiled from: ContainerViewStatisticsListener */
public class C9477d extends C9485k {
    public C9477d(CampaignEx campaignEx, C9641a aVar, C9630c cVar, String str, String str2, C9473a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
    }

    /* renamed from: a */
    public void mo62631a(int i, Object obj) {
        super.mo62631a(i, obj);
        if (!this.f23498a) {
            return;
        }
        if (i == 105 || i == 106 || i == 113) {
            C9499b.m27030d(C8388a.m23845e().mo56913g(), this.f23499b);
            if (i != 105) {
                String noticeUrl = this.f23499b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (!noticeUrl.contains(C8469a.f20747h)) {
                        noticeUrl = noticeUrl + "&" + C8469a.f20747h + "=2";
                    } else {
                        noticeUrl = noticeUrl.replace(C8469a.f20747h + "=" + Uri.parse(noticeUrl).getQueryParameter(C8469a.f20747h), C8469a.f20747h + "=2");
                    }
                }
                C6765a.m20558a(C8388a.m23845e().mo56913g(), this.f23499b, this.f23504g, noticeUrl, true, false, C6772a.f17858i);
            }
        } else if (i != 122) {
            switch (i) {
                case 109:
                    mo63213b(2);
                    mo63207a(2);
                    return;
                case 110:
                    if (this.f23499b != null && this.f23499b.getDynamicTempCode() == 5) {
                        mo63214b(obj.toString());
                    }
                    mo63213b(1);
                    mo63207a(1);
                    return;
                case 111:
                    mo63207a(1);
                    return;
                default:
                    return;
            }
        } else {
            mo63206a();
        }
    }
}
