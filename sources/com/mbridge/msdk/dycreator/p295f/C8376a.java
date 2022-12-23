package com.mbridge.msdk.dycreator.p295f;

import com.mbridge.msdk.dycreator.p295f.p296a.C8377a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.mbridge.msdk.dycreator.f.a */
/* compiled from: MBRewardData */
public final class C8376a implements C8377a {

    /* renamed from: a */
    private DyOption f20439a;

    /* renamed from: b */
    private CampaignEx f20440b;

    public C8376a(DyOption dyOption) {
        this.f20439a = dyOption;
        this.f20440b = dyOption.getCampaignEx();
    }

    public final CampaignEx getBindData() {
        return this.f20440b;
    }

    public final DyOption getEffectData() {
        return this.f20439a;
    }
}
