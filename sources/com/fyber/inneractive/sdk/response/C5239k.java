package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.network.C4498l;
import com.fyber.inneractive.sdk.network.C4500m;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.response.k */
public class C5239k implements C5238j {

    /* renamed from: a */
    public final C4500m f13900a;

    public C5239k(C4500m mVar) {
        this.f13900a = mVar;
    }

    /* renamed from: a */
    public final String mo26320a(Map<String, String> map, C4498l lVar) {
        String lowerCase = lVar.f11082a.toLowerCase();
        String str = map.get(lowerCase);
        IAlog.m16449d("%s%s extracted from response header: %s", IAlog.m16443a((Object) this), lowerCase, str);
        int i = IAlog.f13936a;
        IAlog.m16444a(1, (Exception) null, "%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }

    /* renamed from: a */
    public String mo24157a() {
        return this.f13900a.mo24661d().toString();
    }

    /* renamed from: a */
    public void mo24158a(C5230b bVar) {
        long j;
        C5230b bVar2 = bVar;
        bVar2.f13854a.f13864A = false;
        IAConfigManager.f10324J.f10358x.f10404e = false;
        ImpressionData impressionData = new ImpressionData();
        Map<String, String> o = this.f13900a.mo24662o();
        String a = mo26320a(o, C4498l.RETURNED_AD_TYPE);
        mo26320a(o, C4498l.ERROR_CODE);
        String a2 = mo26320a(o, C4498l.SESSION_ID);
        String a3 = mo26320a(o, C4498l.CONTENT_ID);
        mo26320a(o, C4498l.PUBLISHER_ID);
        String a4 = mo26320a(o, C4498l.WIDTH);
        String a5 = mo26320a(o, C4498l.HEIGHT);
        String a6 = mo26320a(o, C4498l.SDK_IMPRESSION_URL);
        String a7 = mo26320a(o, C4498l.SDK_CLICK_URL);
        String a8 = mo26320a(o, C4498l.AD_TIMEOUT);
        String a9 = mo26320a(o, C4498l.AD_COMPLETION_URL);
        bVar2.f13855b = mo26320a(o, C4498l.AD_UNIT_ID);
        mo26320a(o, C4498l.AD_UNIT_TYPE);
        String a10 = mo26320a(o, C4498l.AD_UNIT_DISPLAY_TYPE);
        String a11 = mo26320a(o, C4498l.AD_NETWORK);
        String a12 = mo26320a(o, C4498l.AD_NETWORK_ID);
        String str = a10;
        String a13 = mo26320a(o, C4498l.CREATIVE_ID);
        String a14 = mo26320a(o, C4498l.AD_DOMAIN);
        String a15 = mo26320a(o, C4498l.APP_BUNDLE);
        String str2 = a9;
        String a16 = mo26320a(o, C4498l.CAMPAIGN_ID);
        String a17 = mo26320a(o, C4498l.CPM_VALUE);
        String str3 = a7;
        String a18 = mo26320a(o, C4498l.CPM_CURRENCY);
        impressionData.setCpmValue(a17);
        impressionData.setCurrency(a18);
        String a19 = mo26320a(o, C4498l.BANNER_MRC_PERCENT);
        String a20 = mo26320a(o, C4498l.BANNER_MRC_DURATION);
        String a21 = mo26320a(o, C4498l.BANNER_MRC_IMPRESSION_URL);
        String a22 = mo26320a(o, C4498l.INTERSTITIAL_SKIP_MODE);
        if (bVar.mo24321b()) {
            bVar2.f13854a.f13880p = o;
        }
        C5233e eVar = bVar2.f13854a;
        eVar.getClass();
        try {
            j = Long.parseLong(a8);
        } catch (NumberFormatException unused) {
            j = 20;
        }
        String str4 = a22;
        long j2 = j;
        eVar.f13866b = j2;
        String str5 = a6;
        String str6 = a19;
        String str7 = str4;
        eVar.f13865a = eVar.f13867c + TimeUnit.MINUTES.toMillis(j2);
        impressionData.setImpressionId(a2);
        impressionData.setDemandSource(a11);
        C5233e eVar2 = bVar2.f13854a;
        eVar2.f13868d = a3;
        eVar2.getClass();
        bVar2.f13854a.f13889y = a15;
        if (!TextUtils.isEmpty(a12)) {
            impressionData.setDemandId(Long.valueOf(a12));
        }
        if (!TextUtils.isEmpty(a)) {
            bVar2.f13854a.f13871g = Integer.valueOf(a).intValue();
        }
        if (!TextUtils.isEmpty(a4)) {
            bVar2.f13854a.f13869e = Integer.valueOf(a4).intValue();
        }
        if (!TextUtils.isEmpty(a5)) {
            bVar2.f13854a.f13870f = Integer.valueOf(a5).intValue();
        }
        C5233e eVar3 = bVar2.f13854a;
        eVar3.f13875k = str5;
        eVar3.f13876l = str3;
        eVar3.f13879o = str2;
        eVar3.f13877m = bVar2.f13855b;
        try {
            eVar3.f13878n = UnitDisplayType.fromValue(str);
        } catch (IllegalArgumentException unused2) {
            bVar2.f13854a.f13878n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(a13)) {
            impressionData.setCreativeId(a13);
        }
        if (!TextUtils.isEmpty(a14)) {
            impressionData.setAdvertiserDomain(a14);
        }
        if (!TextUtils.isEmpty(a16)) {
            impressionData.setCampaignId(a16);
        }
        impressionData.setCountry(C5290k.m16489g());
        C5233e eVar4 = bVar2.f13854a;
        eVar4.f13882r = impressionData;
        eVar4.f13884t = C5312s.m16530a(str6, 0);
        C5233e eVar5 = bVar2.f13854a;
        float f = -1.0f;
        if (!TextUtils.isEmpty(a20)) {
            try {
                f = Float.parseFloat(a20);
            } catch (NumberFormatException unused3) {
            }
        }
        eVar5.f13885u = f;
        C5233e eVar6 = bVar2.f13854a;
        eVar6.f13886v = a21;
        eVar6.f13887w = C5312s.m16530a(str7, -1);
    }
}
