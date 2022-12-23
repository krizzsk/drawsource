package com.mbridge.msdk.video.dynview.p357f.p358a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8536f;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.net.p311f.C8537a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.dynview.f.a.a */
/* compiled from: AbsMoreOfferResponseHandler */
public abstract class C9348a extends C8536f<JSONObject> {

    /* renamed from: a */
    private int f22959a;

    /* renamed from: b */
    private String f22960b;

    /* renamed from: a */
    public abstract void mo62850a(int i, String str);

    /* renamed from: a */
    public abstract void mo62851a(List<C8513b> list, CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo57951a() {
        super.mo57951a();
    }

    /* renamed from: a */
    public final void mo57895a(C8557k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        super.mo57895a(kVar);
        if (kVar != null && kVar.f21017c != null && this.f22959a == 0) {
            List<C8513b> list = kVar.f21017c.f20915d;
            JSONObject jSONObject = (JSONObject) kVar.f21015a;
            int optInt = jSONObject.optInt("status");
            if (1 == optInt) {
                mo57961a(System.currentTimeMillis());
                if ("v5".equals(jSONObject.optString("version"))) {
                    campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f22960b);
                } else {
                    campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f22960b);
                }
                if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                    String str = null;
                    if (campaignUnit != null) {
                        str = campaignUnit.getMsg();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = jSONObject.optString("msg");
                    }
                    mo62850a(optInt, str);
                    return;
                }
                mo62851a(list, campaignUnit);
                mo57960a(campaignUnit.getAds().size());
                return;
            }
            mo62850a(optInt, jSONObject.optString("msg"));
        }
    }

    /* renamed from: a */
    public final void mo57894a(C8508a aVar) {
        mo62850a(aVar.f20851a, C8537a.m24452a(aVar));
    }
}
