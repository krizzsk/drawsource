package com.mbridge.msdk.video.module.p370c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p312g.C8548b;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.tools.C8659q;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.p078c.C2445b;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.module.c.a */
/* compiled from: VideoViewRequest */
public final class C9501a extends C8548b {
    public C9501a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo16280a(String str, C8550d dVar) {
        super.mo16280a(str, dVar);
        dVar.mo57981a(TapjoyConstants.TJC_PLATFORM, "1");
        dVar.mo57981a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE);
        dVar.mo57981a(CampaignEx.JSON_KEY_PACKAGE_NAME, C8660r.m24835l(this.f20980a));
        dVar.mo57981a("app_version_name", C8660r.m24825g(this.f20980a));
        dVar.mo57981a("app_version_code", C8660r.m24822f(this.f20980a) + "");
        dVar.mo57981a(TJAdUnitConstants.String.ORIENTATION, C8660r.m24819e(this.f20980a) + "");
        dVar.mo57981a(DeviceRequestsHelper.DEVICE_INFO_MODEL, C8660r.m24814c());
        dVar.mo57981a("brand", C8660r.m24820e());
        dVar.mo57981a(VungleApiClient.GAID, "");
        dVar.mo57981a("gaid2", C8660r.m24834l());
        int o = C8660r.m24840o(this.f20980a);
        dVar.mo57981a("network_type", o + "");
        dVar.mo57981a("network_str", C8660r.m24806a(this.f20980a, o) + "");
        dVar.mo57981a("language", C8660r.m24817d(this.f20980a));
        dVar.mo57981a(TapjoyConstants.TJC_DEVICE_TIMEZONE, C8660r.m24824g());
        dVar.mo57981a("useragent", C8660r.m24823f());
        dVar.mo57981a("sdk_version", MBConfiguration.SDK_VERSION);
        dVar.mo57981a("screen_size", C8660r.m24829i(this.f20980a) + "x" + C8660r.m24831j(this.f20980a));
        if (C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String a = C8659q.m24801a(jSONObject.toString());
                    if (!TextUtils.isEmpty(a)) {
                        dVar.mo57981a("dvi", a);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
