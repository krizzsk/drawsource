package com.ogury.p377ed.internal;

import com.smaato.sdk.video.vast.model.Creative;
import p401io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.hi */
public final class C10086hi extends C10083hf {

    /* renamed from: a */
    private final RewardItem f25320a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10086hi(String str, RewardItem rewardItem) {
        super(str, rewardItem.getName());
        C10263mq.m29882b(str, Creative.AD_ID);
        C10263mq.m29882b(rewardItem, "rewardItem");
        this.f25320a = rewardItem;
    }

    /* renamed from: a */
    public final RewardItem mo64821a() {
        return this.f25320a;
    }
}
