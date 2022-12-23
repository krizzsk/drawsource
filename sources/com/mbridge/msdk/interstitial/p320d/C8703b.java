package com.mbridge.msdk.interstitial.p320d;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.out.Frame;
import java.util.List;

/* renamed from: com.mbridge.msdk.interstitial.d.b */
/* compiled from: InterstitialLoadVideoResponseHandler */
public abstract class C8703b extends C8704c {
    /* renamed from: a */
    public abstract void mo58209a(int i, String str);

    /* renamed from: a */
    public abstract void mo58210a(CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo58230a(List<Frame> list) {
    }

    /* renamed from: a */
    public final void mo58231a(List<C8513b> list, CampaignUnit campaignUnit) {
        mo58210a(campaignUnit);
    }

    /* renamed from: b */
    public final void mo58232b(int i, String str) {
        mo58209a(i, str);
    }
}
