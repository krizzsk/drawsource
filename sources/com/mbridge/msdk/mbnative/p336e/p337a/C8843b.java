package com.mbridge.msdk.mbnative.p336e.p337a;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8536f;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.net.p311f.C8537a;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.out.Frame;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbnative.e.a.b */
/* compiled from: NativeResponseHandler */
public abstract class C8843b extends C8536f<JSONObject> {

    /* renamed from: a */
    private static final String f21806a = C8843b.class.getSimpleName();

    /* renamed from: b */
    private int f21807b;

    /* renamed from: c */
    private String f21808c;

    /* renamed from: a */
    public abstract void mo58505a(int i, String str);

    /* renamed from: a */
    public abstract void mo58508a(List<C8513b> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo58509b(List<Frame> list);

    /* renamed from: a */
    public final void mo58554a(String str) {
        this.f21808c = str;
    }

    /* renamed from: f */
    public final String mo58555f() {
        return this.f21808c;
    }

    /* renamed from: g */
    public final void mo58557g(int i) {
        this.f21807b = i;
    }

    /* renamed from: g */
    public final int mo58556g() {
        return this.f21807b;
    }

    /* renamed from: a */
    public final void mo57951a() {
        super.mo57951a();
    }

    /* renamed from: a */
    public final void mo57895a(C8557k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        super.mo57895a(kVar);
        if (kVar != null && kVar.f21017c != null) {
            int i = this.f21807b;
            if (i == 0) {
                final List<C8513b> list = kVar.f21017c.f20915d;
                final JSONObject jSONObject = (JSONObject) kVar.f21015a;
                final int optInt = jSONObject.optInt("status");
                if (1 == optInt) {
                    mo57961a(System.currentTimeMillis());
                    final String optString = jSONObject.optString("version");
                    C8498b.m24359a().execute(new Runnable() {
                        public final void run() {
                            final CampaignUnit campaignUnit;
                            if ("v5".equals(optString)) {
                                campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
                            } else {
                                campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"));
                            }
                            C8498b.m24362d().post(new Runnable() {
                                public final void run() {
                                    CampaignUnit campaignUnit = campaignUnit;
                                    if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                                        C8843b.this.mo58505a(optInt, jSONObject.optString("msg"));
                                        return;
                                    }
                                    C8843b.this.mo58508a((List<C8513b>) list, campaignUnit);
                                    C8843b.this.mo57960a(campaignUnit.getAds().size());
                                }
                            });
                        }
                    });
                    return;
                }
                mo58505a(optInt, jSONObject.optString("msg"));
            } else if (i == 1) {
                List<C8513b> list2 = kVar.f21017c.f20915d;
                JSONObject jSONObject2 = (JSONObject) kVar.f21015a;
                int optInt2 = jSONObject2.optInt("status");
                if (1 == optInt2) {
                    mo57961a(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject2.optJSONObject("data"));
                    } else {
                        campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject2.optJSONObject("data"));
                    }
                    if (campaignUnit == null || campaignUnit.getListFrames() == null || campaignUnit.getListFrames().size() <= 0) {
                        mo58505a(optInt2, jSONObject2.optString("msg"));
                        return;
                    }
                    mo58509b(campaignUnit.getListFrames());
                    mo57960a(campaignUnit.getListFrames().size());
                    return;
                }
                mo58505a(optInt2, jSONObject2.optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void mo57894a(C8508a aVar) {
        mo58505a(aVar.f20851a, C8537a.m24452a(aVar));
    }
}
