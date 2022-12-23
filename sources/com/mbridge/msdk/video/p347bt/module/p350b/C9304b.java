package com.mbridge.msdk.video.p347bt.module.p350b;

import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.videocommon.p373b.C9630c;

/* renamed from: com.mbridge.msdk.video.bt.module.b.b */
/* compiled from: DefaultShowRewardListener */
public class C9304b implements C9311h {
    /* renamed from: a */
    public void mo61307a() {
        C8672v.m24874a("ShowRewardListener", "onAdShow");
    }

    /* renamed from: a */
    public void mo61312a(boolean z, C9630c cVar) {
        C8672v.m24874a("ShowRewardListener", "onAdClose:isCompleteView:" + z + ",reward:" + cVar);
    }

    /* renamed from: a */
    public void mo61309a(String str) {
        C8672v.m24874a("ShowRewardListener", "onShowFail:" + str);
    }

    /* renamed from: a */
    public void mo61313a(boolean z, String str, String str2) {
        C8672v.m24874a("ShowRewardListener", "onVideoAdClicked:" + str2);
    }

    /* renamed from: a */
    public void mo61310a(String str, String str2) {
        C8672v.m24874a("ShowRewardListener", "onVideoComplete: " + str2);
    }

    /* renamed from: a */
    public void mo61311a(boolean z, int i) {
        C8672v.m24874a("ShowRewardListener", "onAdCloseWithIVReward: " + z + "  " + i);
    }

    /* renamed from: b */
    public void mo61314b(String str, String str2) {
        C8672v.m24874a("ShowRewardListener", "onEndcardShow: " + str2);
    }

    /* renamed from: a */
    public void mo61308a(int i, String str, String str2) {
        C8672v.m24874a("ShowRewardListener", "onAutoLoad: " + str2);
    }
}
