package com.mbridge.msdk.reward.p344c;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.out.Frame;
import java.util.List;

/* renamed from: com.mbridge.msdk.reward.c.a */
/* compiled from: RewarLoadVideoResponseHandler */
public abstract class C9180a extends C9182c {
    /* renamed from: a */
    public abstract void mo61356a(int i, String str);

    /* renamed from: a */
    public abstract void mo61357a(CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo61369a(List<Frame> list) {
    }

    /* renamed from: a */
    public final void mo61370a(List<C8513b> list, CampaignUnit campaignUnit) {
        mo61357a(campaignUnit);
    }

    /* renamed from: b */
    public final void mo61371b(int i, String str) {
        mo61356a(i, str);
    }
}
