package com.mbridge.msdk.mbbanner.common.p323a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p311f.C8538b;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;

/* renamed from: com.mbridge.msdk.mbbanner.common.a.d */
/* compiled from: BannerV3Params */
public class C8732d {

    /* renamed from: a */
    private static final String f21439a = C8732d.class.getSimpleName();

    /* renamed from: a */
    public static C8550d m25156a(boolean z, Context context, String str, String str2, int i, C8730b bVar) {
        String h = C8388a.m23845e().mo56914h();
        String md5 = SameMD5.getMD5(C8388a.m23845e().mo56914h() + C8388a.m23845e().mo56916j());
        String b = C8677z.m24926b(context, str);
        String a = C8473d.m24277a(str, "banner");
        String closeIds = BannerUtils.getCloseIds(str);
        C8550d dVar = new C8550d();
        C8538b.m24455a(dVar, "app_id", h);
        C8538b.m24455a(dVar, MBridgeConstans.PROPERTIES_UNIT_ID, str);
        if (!TextUtils.isEmpty(bVar.mo58358d())) {
            C8538b.m24455a(dVar, MBridgeConstans.PLACEMENT_ID, bVar.mo58358d());
        }
        C8538b.m24455a(dVar, "sign", md5);
        C8538b.m24455a(dVar, "only_impression", "1");
        C8538b.m24455a(dVar, "ping_mode", "1");
        C8538b.m24455a(dVar, C8550d.f20983c, b);
        C8538b.m24455a(dVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        C8538b.m24455a(dVar, C8550d.f20981a, str2);
        C8538b.m24455a(dVar, "ad_type", "296");
        C8538b.m24455a(dVar, "offset", i + "");
        C8538b.m24455a(dVar, C8550d.f20982b, a);
        C8538b.m24455a(dVar, "close_id", closeIds);
        C8538b.m24455a(dVar, CampaignUnit.JSON_KEY_UNIT_SIZE, bVar.mo58353a() + "");
        C8538b.m24455a(dVar, "refresh_time", bVar.mo58355b() + "");
        if (!TextUtils.isEmpty(bVar.mo58357c())) {
            C8538b.m24455a(dVar, "token", bVar.mo58357c() + "");
        }
        return dVar;
    }
}
