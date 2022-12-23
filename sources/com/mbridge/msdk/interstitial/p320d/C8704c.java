package com.mbridge.msdk.interstitial.p320d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8536f;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.net.p311f.C8537a;
import com.mbridge.msdk.out.Frame;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.interstitial.d.c */
/* compiled from: InterstitialResponseHandler */
public abstract class C8704c extends C8536f<JSONObject> {

    /* renamed from: a */
    private static final String f21355a = C8704c.class.getSimpleName();

    /* renamed from: b */
    private int f21356b;

    /* renamed from: a */
    public abstract void mo58230a(List<Frame> list);

    /* renamed from: a */
    public abstract void mo58231a(List<C8513b> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo58232b(int i, String str);

    /* renamed from: a */
    public final void mo57951a() {
        super.mo57951a();
    }

    /* renamed from: a */
    public final void mo57895a(C8557k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        CampaignUnit campaignUnit2;
        super.mo57895a(kVar);
        if (kVar != null && kVar.f21017c != null) {
            int i = this.f21356b;
            String str = null;
            if (i == 0) {
                List<C8513b> list = kVar.f21017c.f20915d;
                JSONObject jSONObject = (JSONObject) kVar.f21015a;
                int optInt = jSONObject.optInt("status");
                if (1 == optInt) {
                    mo57961a(System.currentTimeMillis());
                    if ("v5".equals(jSONObject.optString("version"))) {
                        campaignUnit2 = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
                    } else {
                        campaignUnit2 = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"));
                    }
                    if (campaignUnit2 == null || campaignUnit2.getAds() == null || campaignUnit2.getAds().size() <= 0) {
                        if (campaignUnit2 != null) {
                            str = campaignUnit2.getMsg();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject.optString("msg");
                        }
                        mo58232b(optInt, str);
                        return;
                    }
                    mo58231a(list, campaignUnit2);
                    mo57960a(campaignUnit2.getAds().size());
                    return;
                }
                mo58232b(optInt, jSONObject.optString("msg"));
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
                        if (campaignUnit != null) {
                            str = campaignUnit.getMsg();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject2.optString("msg");
                        }
                        mo58232b(optInt2, str);
                        return;
                    }
                    List<Frame> listFrames = campaignUnit.getListFrames();
                    mo58230a(listFrames);
                    mo57960a(listFrames.size());
                    return;
                }
                mo58232b(optInt2, jSONObject2.optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void mo57894a(C8508a aVar) {
        mo58232b(aVar.f20851a, C8537a.m24452a(aVar));
    }
}
