package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* renamed from: com.inmobi.media.jx */
/* compiled from: UnifiedIdNetworkRequest */
public final class C6277jx extends C6158hc {
    protected C6277jx(String str, String str2, C6236ja jaVar, String str3, int i, int i2, int i3) {
        super(str, str2, jaVar, str3, i, i2, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        this.f15531l = i3;
    }

    /* renamed from: a */
    public final void mo34869a() {
        super.mo34869a();
        HashMap<String, String> d = C6221ip.m18481d();
        this.f15527h.put("mk-version", C6184hx.m18342a());
        this.f15527h.put("bundle-id", C6205ii.m18418a().f15654a);
        this.f15527h.put("ua", C6183hw.m18337i());
        this.f15527h.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(System.currentTimeMillis()));
        this.f15527h.put("account_id", this.f15538s);
        Boolean g = C6232iz.m18518a().mo35447g();
        if (g == null) {
            this.f15527h.put("lat", "true");
        } else {
            this.f15527h.put("lat", g.toString());
        }
        if (d.get("u-age") != null) {
            this.f15527h.put("age", d.get("u-age"));
        }
        if (C6271js.m18648b() != null) {
            this.f15527h.put("email", new C6225is().mo35435a(C6271js.m18648b()).toString());
        }
        if (C6271js.m18645a() != null) {
            this.f15527h.put("phone", new C6225is().mo35435a(C6271js.m18645a()).toString());
        }
        this.f15527h.put("ufids", C6273ju.m18666d().toString());
        if (C6271js.m18650c() != null) {
            this.f15527h.putAll(C6271js.m18650c());
        }
    }
}
