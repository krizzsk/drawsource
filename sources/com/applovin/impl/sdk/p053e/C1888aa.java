package com.applovin.impl.sdk.p053e;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p050b.C1864c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.aa */
public class C1888aa extends C1889ab {

    /* renamed from: a */
    private final C1839e f3500a;

    /* renamed from: c */
    private final AppLovinAdRewardListener f3501c;

    public C1888aa(C1839e eVar, AppLovinAdRewardListener appLovinAdRewardListener, C1969m mVar) {
        super("TaskValidateAppLovinReward", mVar);
        this.f3500a = eVar;
        this.f3501c = appLovinAdRewardListener;
    }

    /* renamed from: a */
    public String mo13596a() {
        return "2.0/vr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13597a(int i) {
        String str;
        super.mo13597a(i);
        if (i < 400 || i >= 500) {
            this.f3501c.validationRequestFailed(this.f3500a, i);
            str = "network_timeout";
        } else {
            this.f3501c.userRewardRejected(this.f3500a, Collections.emptyMap());
            str = "rejected";
        }
        this.f3500a.mo14190a(C1864c.m4068a(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13602a(C1864c cVar) {
        this.f3500a.mo14190a(cVar);
        String b = cVar.mo14273b();
        Map<String, String> a = cVar.mo14272a();
        if (b.equals("accepted")) {
            this.f3501c.userRewardVerified(this.f3500a, a);
        } else if (b.equals("quota_exceeded")) {
            this.f3501c.userOverQuota(this.f3500a, a);
        } else if (b.equals("rejected")) {
            this.f3501c.userRewardRejected(this.f3500a, a);
        } else {
            this.f3501c.validationRequestFailed(this.f3500a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13598a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f3500a.getAdZone().mo14154a());
        String clCode = this.f3500a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo13603b() {
        return this.f3500a.mo14196aE();
    }
}
