package com.adcolony.sdk;

import com.adcolony.sdk.C0826e0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.api.VideoType;

public class AdColonyZone {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 0;
    @Deprecated
    public static final int NATIVE = 2;

    /* renamed from: a */
    private String f193a;

    /* renamed from: b */
    private String f194b;

    /* renamed from: c */
    private int f195c = 5;

    /* renamed from: d */
    private int f196d;

    /* renamed from: e */
    private int f197e;

    /* renamed from: f */
    private int f198f;

    /* renamed from: g */
    private int f199g;

    /* renamed from: h */
    private int f200h;

    /* renamed from: i */
    private int f201i;

    /* renamed from: j */
    private boolean f202j;

    /* renamed from: k */
    private boolean f203k;

    AdColonyZone(String str) {
        this.f193a = str;
    }

    /* renamed from: a */
    private int m177a(int i) {
        if (C0723a.m196d() && !C0723a.m193b().mo10867E() && !C0723a.m193b().mo10868F()) {
            return i;
        }
        m181b();
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10518b(int i) {
        this.f201i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10519c(int i) {
        this.f195c = i;
    }

    public int getPlayFrequency() {
        return m177a(this.f199g);
    }

    public int getRemainingViewsUntilReward() {
        return m177a(this.f197e);
    }

    public int getRewardAmount() {
        return m177a(this.f200h);
    }

    public String getRewardName() {
        return m178a(this.f194b);
    }

    public int getViewsPerReward() {
        return m177a(this.f198f);
    }

    public String getZoneID() {
        return m178a(this.f193a);
    }

    public int getZoneType() {
        return this.f196d;
    }

    public boolean isRewarded() {
        return this.f203k;
    }

    public boolean isValid() {
        return m180a(this.f202j);
    }

    /* renamed from: b */
    private void m181b() {
        new C0826e0.C0827a().mo10746a("The AdColonyZone API is not available while AdColony is disabled.").mo10747a(C0826e0.f461h);
    }

    /* renamed from: a */
    private boolean m180a(boolean z) {
        if (C0723a.m196d() && !C0723a.m193b().mo10867E() && !C0723a.m193b().mo10868F()) {
            return z;
        }
        m181b();
        return false;
    }

    /* renamed from: a */
    private String m178a(String str) {
        return m179a(str, "");
    }

    /* renamed from: a */
    private String m179a(String str, String str2) {
        if (C0723a.m196d() && !C0723a.m193b().mo10867E() && !C0723a.m193b().mo10868F()) {
            return str;
        }
        m181b();
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10517a(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        C0832f1 f = C0773c0.m391f(a, "reward");
        this.f194b = C0773c0.m393h(f, CampaignEx.JSON_KEY_REWARD_NAME);
        this.f200h = C0773c0.m389d(f, CampaignEx.JSON_KEY_REWARD_AMOUNT);
        this.f198f = C0773c0.m389d(f, "views_per_reward");
        this.f197e = C0773c0.m389d(f, "views_until_reward");
        this.f203k = C0773c0.m382b(a, VideoType.REWARDED);
        this.f195c = C0773c0.m389d(a, "status");
        this.f196d = C0773c0.m389d(a, "type");
        this.f199g = C0773c0.m389d(a, "play_interval");
        this.f193a = C0773c0.m393h(a, "zone_id");
        boolean z = true;
        if (this.f195c == 1) {
            z = false;
        }
        this.f202j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10516a() {
        return this.f201i;
    }
}
