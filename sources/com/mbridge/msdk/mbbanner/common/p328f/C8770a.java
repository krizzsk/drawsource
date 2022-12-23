package com.mbridge.msdk.mbbanner.common.p328f;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8536f;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.net.p311f.C8537a;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbanner.common.f.a */
/* compiled from: BannerResponseHandler */
public abstract class C8770a extends C8536f<JSONObject> {

    /* renamed from: a */
    private static final String f21551a = C8770a.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f21552b = "";

    /* renamed from: a */
    public abstract void mo58400a(int i, String str);

    /* renamed from: a */
    public abstract void mo58401a(CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo58418a(String str) {
        this.f21552b = str;
    }

    /* renamed from: a */
    public final void mo57895a(C8557k<JSONObject> kVar) {
        super.mo57895a(kVar);
        List<C8513b> list = kVar.f21017c.f20915d;
        final JSONObject jSONObject = (JSONObject) kVar.f21015a;
        final int optInt = jSONObject.optInt("status");
        if (1 == optInt) {
            mo57961a(System.currentTimeMillis());
            final String optString = jSONObject.optString("version");
            C8498b.m24359a().execute(new Runnable() {
                public final void run() {
                    final CampaignUnit campaignUnit;
                    if ("v5".equals(optString)) {
                        campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), C8770a.this.f21552b);
                    } else {
                        campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), C8770a.this.f21552b);
                    }
                    C8498b.m24362d().post(new Runnable() {
                        public final void run() {
                            CampaignUnit campaignUnit = campaignUnit;
                            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                                String str = null;
                                CampaignUnit campaignUnit2 = campaignUnit;
                                if (campaignUnit2 != null) {
                                    str = campaignUnit2.getMsg();
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = jSONObject.optString("msg");
                                }
                                C8770a.this.mo58400a(optInt, str);
                                return;
                            }
                            C8770a.this.mo58401a(campaignUnit);
                            if (!TextUtils.isEmpty(C8770a.this.f21552b)) {
                                C8770a.this.mo57962b(1);
                            }
                            C8770a.this.mo57960a(campaignUnit.getAds().size());
                        }
                    });
                }
            });
            return;
        }
        mo58400a(optInt, jSONObject.optString("msg"));
    }

    /* renamed from: a */
    public final void mo57894a(C8508a aVar) {
        mo58400a(aVar.f20851a, C8537a.m24452a(aVar));
    }
}
