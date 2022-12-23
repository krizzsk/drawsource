package com.mbridge.msdk.foundation.same.net.p312g;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.inmobi.sdk.InMobiSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C8395a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.p083a.p084a.C2461a;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.tools.C8659q;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8674x;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.e */
/* compiled from: CommonRequestParamsForAdd */
public final class C8551e {

    /* renamed from: a */
    private static String f20991a = "";

    /* renamed from: b */
    private static String f20992b = "";

    /* renamed from: a */
    public static void m24497a(C8550d dVar, Context context) {
        if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            dVar.mo57981a("withGP", C8660r.m24848s() + "");
            dVar.mo57981a("has_wx", C8660r.m24813c(context) + "");
            dVar.mo57981a("integrated_wx", C8660r.m24803a() + "");
            dVar.mo57981a("opensdk_ver", C8660r.m24808b() + "");
            dVar.mo57981a("wx_api_ver", C8660r.m24809b(C8388a.m23845e().mo56915i()) + "");
            C8395a.m23879a();
            if (C2461a.m6124a().mo16389b(MBridgeConstans.AUTHORITY_DNT, 0) == 1) {
                dVar.mo57981a("dnt", "1");
            }
        }
        if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_OTHER)) {
            String str = C8550d.f20986f;
            dVar.mo57981a(str, C8674x.m24887b() + "");
            String str2 = C8550d.f20987g;
            dVar.mo57981a(str2, C8674x.m24884a() + "");
            dVar.mo57981a(C8550d.f20984d, C8660r.m24841o());
        }
        dVar.mo57981a("pkg_source", C8660r.m24807a(C8660r.m24835l(context), context));
        if (C8388a.m23845e().mo56918l() != null) {
            dVar.mo57981a("web_env", C8388a.m23845e().mo56918l().toString());
        }
        if (Build.VERSION.SDK_INT > 18) {
            dVar.mo57981a("http_req", "2");
        }
        m24498a(dVar, true);
        m24502e(dVar);
        m24501d(dVar);
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        if (b == null) {
            b = C2445b.m6020a().mo16285b();
        }
        if (b.mo16205aw()) {
            dVar.mo57981a(InMobiSdk.IM_GDPR_CONSENT_IAB, C8395a.m23879a().mo56946e() + "");
        }
    }

    /* renamed from: a */
    public static void m24496a(C8550d dVar) {
        dVar.mo57981a("api_version", C8469a.f20740a);
    }

    /* renamed from: b */
    public static void m24499b(C8550d dVar) {
        if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            dVar.mo57981a("withGP", C8660r.m24848s() + "");
            dVar.mo57981a("has_wx", C8660r.m24813c(C8388a.m23845e().mo56913g()) + "");
            dVar.mo57981a("integrated_wx", C8660r.m24803a() + "");
            dVar.mo57981a("opensdk_ver", C8660r.m24808b() + "");
            dVar.mo57981a("wx_api_ver", C8660r.m24809b(C8388a.m23845e().mo56915i()) + "");
        }
        m24498a(dVar, false);
        m24502e(dVar);
        m24501d(dVar);
    }

    /* renamed from: d */
    private static void m24501d(C8550d dVar) {
        try {
            if (TextUtils.isEmpty(C8469a.f20750k)) {
                C8469a.f20750k = C2461a.m6124a().mo16390b(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(C8469a.f20750k)) {
                dVar.mo57981a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C8469a.f20750k);
            }
            if (TextUtils.isEmpty(C8469a.f20751l)) {
                C8469a.f20751l = C2461a.m6124a().mo16390b("c");
            }
            if (!TextUtils.isEmpty(C8469a.f20751l)) {
                dVar.mo57981a("c", C8469a.f20751l);
            }
        } catch (Exception e) {
            C8672v.m24878d("CommonRequestParamsForAdd", e.getMessage());
        }
    }

    /* renamed from: e */
    private static void m24502e(C8550d dVar) {
        int r = C8660r.m24846r();
        if (r != -1) {
            dVar.mo57981a("unknown_source", r + "");
        }
    }

    /* renamed from: a */
    private static void m24498a(C8550d dVar, boolean z) {
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        if (b != null) {
            if (!TextUtils.isEmpty(b.mo16214c()) && z) {
                dVar.mo57981a("a_stid", b.mo16214c());
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("dmt", C8660r.m24844q() + "");
                    jSONObject.put("dmf", C8660r.m24842p());
                }
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    if (!jSONObject.equals(f20991a)) {
                        f20992b = C8659q.m24801a(jSONObject.toString());
                    }
                    if (!TextUtils.isEmpty(f20992b)) {
                        dVar.mo57981a("dvi", f20992b);
                    }
                }
            } catch (Exception e) {
                C8672v.m24878d("CommonRequestParamsForAdd", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static void m24500c(C8550d dVar) {
        if (dVar != null) {
            if (!C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                dVar.mo57980a(DeviceRequestsHelper.DEVICE_INFO_MODEL);
                dVar.mo57980a("brand");
                dVar.mo57980a("screen_size");
                dVar.mo57980a("sub_ip");
                dVar.mo57980a("network_type");
                dVar.mo57980a("useragent");
                dVar.mo57980a("ua");
                dVar.mo57980a("language");
                dVar.mo57980a("network_str");
                dVar.mo57980a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME);
                dVar.mo57980a(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE);
            }
            if (!C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_OTHER)) {
                dVar.mo57980a(C8550d.f20986f);
                dVar.mo57980a(C8550d.f20987g);
                dVar.mo57980a("power_rate");
                dVar.mo57980a("charging");
                dVar.mo57980a(TapjoyConstants.TJC_DEVICE_TIMEZONE);
            }
            if (!C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                dVar.mo57980a(VungleApiClient.GAID);
                dVar.mo57980a("gaid2");
            }
        }
    }
}
