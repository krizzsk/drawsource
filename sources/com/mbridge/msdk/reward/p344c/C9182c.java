package com.mbridge.msdk.reward.p344c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8536f;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.net.p311f.C8537a;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.out.Frame;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.c.c */
/* compiled from: RewardResponseHandler */
public abstract class C9182c extends C8536f<JSONObject> {

    /* renamed from: a */
    private static final String f22514a = C9182c.class.getSimpleName();

    /* renamed from: b */
    private int f22515b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f22516c;

    /* renamed from: a */
    public abstract void mo61369a(List<Frame> list);

    /* renamed from: a */
    public abstract void mo61370a(List<C8513b> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo61371b(int i, String str);

    /* renamed from: a */
    public final void mo61372a(String str) {
        this.f22516c = str;
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
            int i = this.f22515b;
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
                                campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), C9182c.this.f22516c);
                            } else {
                                campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), C9182c.this.f22516c);
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
                                        C9182c.this.mo61371b(optInt, str);
                                        return;
                                    }
                                    C9182c.this.mo61370a(list, campaignUnit);
                                    C9182c.this.mo57960a(campaignUnit.getAds().size());
                                }
                            });
                        }
                    });
                    return;
                }
                mo61371b(optInt, jSONObject.optString("msg"));
            } else if (i == 1) {
                List<C8513b> list2 = kVar.f21017c.f20915d;
                JSONObject jSONObject2 = (JSONObject) kVar.f21015a;
                int optInt2 = jSONObject2.optInt("status");
                if (1 == optInt2) {
                    mo57961a(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject2.optJSONObject("data"), this.f22516c);
                    } else {
                        campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject2.optJSONObject("data"), this.f22516c);
                    }
                    if (campaignUnit == null || campaignUnit.getListFrames() == null || campaignUnit.getListFrames().size() <= 0) {
                        String str = null;
                        if (campaignUnit != null) {
                            str = campaignUnit.getMsg();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject2.optString("msg");
                        }
                        mo61371b(optInt2, str);
                        return;
                    }
                    List<Frame> listFrames = campaignUnit.getListFrames();
                    mo61369a(listFrames);
                    mo57960a(listFrames.size());
                    return;
                }
                mo61371b(optInt2, jSONObject2.optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void mo57894a(C8508a aVar) {
        String str = f22514a;
        C8672v.m24878d(str, "errorCode = " + aVar.f20851a);
        mo61371b(aVar.f20851a, C8537a.m24452a(aVar));
    }
}
