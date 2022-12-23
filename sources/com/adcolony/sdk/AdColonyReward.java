package com.adcolony.sdk;

import com.mbridge.msdk.foundation.entity.CampaignEx;

public class AdColonyReward {

    /* renamed from: a */
    private int f186a;

    /* renamed from: b */
    private String f187b;

    /* renamed from: c */
    private String f188c;

    /* renamed from: d */
    private boolean f189d;

    AdColonyReward(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        this.f186a = C0773c0.m389d(a, CampaignEx.JSON_KEY_REWARD_AMOUNT);
        this.f187b = C0773c0.m393h(a, CampaignEx.JSON_KEY_REWARD_NAME);
        this.f189d = C0773c0.m382b(a, "success");
        this.f188c = C0773c0.m393h(a, "zone_id");
    }

    public int getRewardAmount() {
        return this.f186a;
    }

    public String getRewardName() {
        return this.f187b;
    }

    public String getZoneID() {
        return this.f188c;
    }

    public boolean success() {
        return this.f189d;
    }
}
