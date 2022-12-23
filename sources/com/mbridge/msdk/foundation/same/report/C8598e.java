package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.messaging.Constants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C8395a;
import com.mbridge.msdk.foundation.entity.C8466k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8420m;
import com.mbridge.msdk.foundation.same.net.C8503Aa;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8614ab;
import com.mbridge.msdk.foundation.tools.C8659q;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.e */
/* compiled from: ReportUtil */
public class C8598e extends C8572a {

    /* renamed from: a */
    public static final String f21109a = C8598e.class.getSimpleName();

    /* renamed from: c */
    private static String m24684c(Context context, String str) {
        if (context == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pf", "1");
            jSONObject.put("ov", C8660r.m24827h());
            jSONObject.put("pn", C8660r.m24835l(context));
            jSONObject.put("vn", C8660r.m24825g(context));
            jSONObject.put("vc", C8660r.m24822f(context));
            jSONObject.put("ot", C8660r.m24819e(context));
            jSONObject.put("dm", C8660r.m24814c());
            jSONObject.put("bd", C8660r.m24820e());
            jSONObject.put(VungleApiClient.GAID, C8660r.m24832k());
            int o = C8660r.m24840o(context);
            jSONObject.put("nt", o);
            jSONObject.put("nts", C8660r.m24806a(context, o));
            jSONObject.put("l", C8660r.m24817d(context));
            jSONObject.put("tz", C8660r.m24824g());
            jSONObject.put("ua", C8660r.m24823f());
            jSONObject.put("app_id", C8388a.m23845e().mo56914h());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sv", MBConfiguration.SDK_VERSION);
            jSONObject.put("ss", C8660r.m24829i(context) + "x" + C8660r.m24831j(context));
            if (C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h()) != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    String m = C8660r.m24836m();
                    if (!TextUtils.isEmpty(m)) {
                        jSONObject2.put("manufacturer", m);
                    }
                    int j = C8660r.m24830j();
                    if (j != -1) {
                        jSONObject2.put("sdkint", j);
                    }
                    String p = C8660r.m24843p(context);
                    if (!TextUtils.isEmpty(p)) {
                        jSONObject2.put("is24H", p);
                    }
                    String n = C8660r.m24838n();
                    if (!TextUtils.isEmpty(n)) {
                        jSONObject2.put("totalram", n);
                    }
                    String q = C8660r.m24845q(context);
                    if (!TextUtils.isEmpty(q)) {
                        jSONObject2.put("totalmemory", q);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!TextUtils.isEmpty(jSONObject2.toString())) {
                    String a = C8659q.m24801a(jSONObject2.toString());
                    if (!TextUtils.isEmpty(a)) {
                        jSONObject.put("dvi", URLEncoder.encode(a, "utf-8"));
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e3) {
            e3.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m24663a(Campaign campaign, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", "adtrack");
            jSONObject.put("action", str);
            jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, i);
            if (campaign != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", campaign.getId());
                jSONObject2.put("title", campaign.getAppName());
                jSONObject.put("value", jSONObject2);
            } else {
                jSONObject.put("value", "");
            }
        } catch (Exception e) {
            C8672v.m24878d(f21109a, e.getMessage());
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static C8550d m24662a(String str, String str2, Context context, String str3) {
        String str4;
        if (context != null) {
            context = context.getApplicationContext();
        }
        C8550d dVar = new C8550d();
        dVar.mo57981a("m_device_info", m24684c(context, str3));
        dVar.mo57981a("m_action", str);
        try {
            if (!TextUtils.isEmpty(str2)) {
                String a = C8503Aa.m24363a();
                String str5 = "";
                if (a == null) {
                    a = str5;
                }
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("channel", a);
                String str6 = C8388a.f20464c.get(str3);
                if (!TextUtils.isEmpty(str6)) {
                    if (str6 != null) {
                        str5 = str6;
                    }
                    jSONObject.put("u_stid", str5);
                }
                str4 = jSONObject.toString();
            } else {
                JSONObject jSONObject2 = new JSONObject();
                String str7 = C8388a.f20464c.get(str3);
                if (!TextUtils.isEmpty(str7)) {
                    jSONObject2.put("u_stid", str7);
                }
                str4 = jSONObject2.toString();
            }
            str2 = str4;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        dVar.mo57981a("m_data", str2);
        dVar.mo57981a("m_sdk", "msdk");
        return dVar;
    }

    /* renamed from: a */
    public static C8550d m24658a(Context context) {
        C8550d dVar = new C8550d();
        try {
            dVar.mo57981a(TapjoyConstants.TJC_PLATFORM, "1");
            dVar.mo57981a(CampaignEx.JSON_KEY_PACKAGE_NAME, URLEncoder.encode(C8660r.m24835l(context)));
            if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                dVar.mo57981a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE);
                dVar.mo57981a("brand", URLEncoder.encode(C8660r.m24820e()));
                dVar.mo57981a(DeviceRequestsHelper.DEVICE_INFO_MODEL, URLEncoder.encode(C8660r.m24814c()));
                dVar.mo57981a(VungleApiClient.GAID, C8660r.m24832k());
                int o = C8660r.m24840o(context);
                dVar.mo57981a("network_type", o + "");
                dVar.mo57981a("network_str", C8660r.m24806a(context, o));
                dVar.mo57981a("language", URLEncoder.encode(C8660r.m24817d(context)));
                dVar.mo57981a(TapjoyConstants.TJC_DEVICE_TIMEZONE, URLEncoder.encode(C8660r.m24824g()));
                dVar.mo57981a("ua", URLEncoder.encode(C8660r.m24823f()));
            }
            dVar.mo57981a("sdk_version", MBConfiguration.SDK_VERSION);
            dVar.mo57981a("app_version_name", URLEncoder.encode(C8660r.m24825g(context)));
            dVar.mo57981a(TJAdUnitConstants.String.ORIENTATION, URLEncoder.encode(C8660r.m24819e(context) + ""));
            dVar.mo57981a("screen_size", C8660r.m24829i(context) + "x" + C8660r.m24831j(context));
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (b == null) {
                b = C2445b.m6020a().mo16285b();
            }
            if (b != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                        String m = C8660r.m24836m();
                        if (!TextUtils.isEmpty(m)) {
                            jSONObject.put("manufacturer", m);
                        }
                        int j = C8660r.m24830j();
                        if (j != -1) {
                            jSONObject.put("sdkint", j);
                        }
                        String p = C8660r.m24843p(context);
                        if (!TextUtils.isEmpty(p)) {
                            jSONObject.put("is24H", p);
                        }
                        String n = C8660r.m24838n();
                        if (!TextUtils.isEmpty(n)) {
                            jSONObject.put("totalram", n);
                        }
                        String q = C8660r.m24845q(context);
                        if (!TextUtils.isEmpty(q)) {
                            jSONObject.put("totalmemory", q);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String a = C8659q.m24801a(jSONObject.toString());
                    if (!TextUtils.isEmpty(a)) {
                        dVar.mo57981a("dvi", a);
                    }
                }
            }
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                e3.printStackTrace();
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public static C8550d m24659a(Context context, String str) {
        C8550d a = m24658a(context);
        a.mo57981a("app_id", C8388a.m23845e().mo56914h() + "");
        if (!TextUtils.isEmpty(str)) {
            try {
                a.mo57981a("data", URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return a;
    }

    /* renamed from: a */
    public static C8550d m24661a(String str, Context context, String str2) {
        C8550d a = m24658a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(C8388a.m23845e().mo56914h());
        String str3 = "";
        sb.append(str3);
        a.mo57981a("app_id", sb.toString());
        a.mo57981a(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
        try {
            if (!TextUtils.isEmpty(str2)) {
                String str4 = C8388a.f20464c.get(str2);
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("&");
                    sb2.append("u_stid");
                    sb2.append("=");
                    if (str4 != null) {
                        str3 = str4;
                    }
                    sb2.append(str3);
                    str = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("u_stid=");
                    if (str4 != null) {
                        str3 = str4;
                    }
                    sb3.append(str3);
                    str = sb3.toString();
                }
            }
            a.mo57981a("data", URLEncoder.encode(str, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        a.mo57981a("m_sdk", "msdk");
        return a;
    }

    /* renamed from: a */
    public static C8550d m24660a(String str, Context context) {
        C8550d a = m24658a(context);
        a.mo57981a("app_id", C8388a.m23845e().mo56914h() + "");
        if (!TextUtils.isEmpty(str)) {
            try {
                a.mo57981a("data", URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        a.mo57981a("m_sdk", "msdk");
        return a;
    }

    /* renamed from: a */
    public static String m24664a(String str, Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("key=" + str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                sb.append("&" + ((String) next.getKey()) + "=" + next.getValue());
            }
        }
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m24679a() {
        try {
            if (System.currentTimeMillis() - 86400000 > ((Long) C8614ab.m24713b(C8388a.m23845e().mo56913g(), "privateAuthorityTimesTamp", 0L)).longValue()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static void m24680b() {
        try {
            C8614ab.m24712a(C8388a.m23845e().mo56913g(), "privateAuthorityTimesTamp", Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m24674a(Context context, String str, String str2, boolean z) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000047&");
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = C8388a.f20464c.get(str2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("u_stid=");
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb.append(str3);
                        sb.append("&");
                        stringBuffer.append(sb.toString());
                    }
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("hb=");
                    stringBuffer.append(z ? 1 : 0);
                    stringBuffer.append("&");
                    stringBuffer.append("reason=" + str);
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m24685d(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24675a(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000104&");
                    if (!TextUtils.isEmpty(str2)) {
                        String str7 = C8388a.f20464c.get(str2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("u_stid=");
                        if (str7 == null) {
                            str7 = "";
                        }
                        sb.append(str7);
                        sb.append("&");
                        stringBuffer.append(sb.toString());
                    }
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid=" + str3 + "&");
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        stringBuffer.append("rid_n=" + str4 + "&");
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        stringBuffer.append("cid=" + str4 + "&");
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        stringBuffer.append("template_id=" + str6 + "&");
                    }
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("hb=");
                    stringBuffer.append(z ? 1 : 0);
                    stringBuffer.append("&");
                    stringBuffer.append("reason=" + str);
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m24685d(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24676a(Context context, List<CampaignEx> list, String str, boolean z) {
        if (context != null && list != null) {
            try {
                if (list.size() > 0 && !TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000048&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    CampaignEx campaignEx = list.get(0);
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    if (z) {
                        stringBuffer.append("hb=");
                        stringBuffer.append(1);
                        stringBuffer.append("&");
                    }
                    String requestId = campaignEx.getRequestId();
                    if (!TextUtils.isEmpty(requestId)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(requestId);
                        stringBuffer.append("&");
                    }
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    if (!TextUtils.isEmpty(requestIdNotice)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(requestIdNotice);
                        stringBuffer.append("&");
                    }
                    StringBuilder sb = new StringBuilder("rtins_type=");
                    for (int i = 0; i < list.size(); i++) {
                        CampaignEx campaignEx2 = list.get(i);
                        if (i < list.size() - 1) {
                            sb.append(campaignEx2.getRtinsType());
                            sb.append(",");
                        } else {
                            sb.append(campaignEx2.getRtinsType());
                        }
                    }
                    stringBuffer.append(sb);
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m24672a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                C8672v.m24878d(f21109a, th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m24666a(Context context, CampaignEx campaignEx, int i, String str, String str2) {
        if (context != null && campaignEx != null) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000114&");
                stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("gh_id=");
                String str3 = "";
                sb.append(TextUtils.isEmpty(campaignEx.getGhId()) ? str3 : URLEncoder.encode(campaignEx.getGhId(), "utf-8"));
                sb.append("&");
                stringBuffer.append(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("gh_path=");
                sb2.append(TextUtils.isEmpty(campaignEx.getGhPath()) ? str3 : URLEncoder.encode(campaignEx.getGhPath(), "utf-8"));
                sb2.append("&");
                stringBuffer.append(sb2.toString());
                stringBuffer.append("unit_id=" + str2 + "&");
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append("&");
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                stringBuffer.append("result=" + i + "&");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("reason=");
                if (!TextUtils.isEmpty(str)) {
                    str3 = URLEncoder.encode(str, "utf-8");
                }
                sb3.append(str3);
                sb3.append("&");
                stringBuffer.append(sb3.toString());
                stringBuffer.append("cid=" + campaignEx.getId());
                if (C8574b.m24577a().mo58054c()) {
                    C8574b.m24577a().mo58052a(stringBuffer.toString());
                } else {
                    m24672a(context, stringBuffer.toString(), str2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24667a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=");
                    stringBuffer.append(C8660r.m24840o(context));
                    stringBuffer.append("&");
                    stringBuffer.append("unit_id=");
                    stringBuffer.append(str);
                    stringBuffer.append("&");
                    stringBuffer.append("cid=");
                    stringBuffer.append(campaignEx.getId());
                    stringBuffer.append("&");
                    stringBuffer.append("reason=&");
                    stringBuffer.append("result=2&");
                    if (!TextUtils.isEmpty(str2)) {
                        stringBuffer.append(str2);
                    }
                    if (campaignEx.getAdType() == 287) {
                        stringBuffer.append("creative=");
                        stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                        stringBuffer.append("&");
                        stringBuffer.append("ad_type=3&");
                    } else if (campaignEx.getAdType() == 94) {
                        stringBuffer.append("creative=");
                        stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                        stringBuffer.append("&");
                        stringBuffer.append("ad_type=1&");
                    } else if (campaignEx.getAdType() == 296) {
                        stringBuffer.append("ad_type=5&");
                        stringBuffer.append("creative=");
                        stringBuffer.append(campaignEx.getCreativeId());
                        stringBuffer.append("&");
                    } else if (campaignEx.getAdType() == 297) {
                        stringBuffer.append("ad_type=6&");
                        stringBuffer.append("creative=");
                        stringBuffer.append(campaignEx.getCreativeId());
                        stringBuffer.append("&");
                    } else if (campaignEx.getAdType() == 298) {
                        stringBuffer.append("ad_type=7&");
                        stringBuffer.append("creative=");
                        stringBuffer.append(campaignEx.getCreativeId());
                        stringBuffer.append("&");
                    } else {
                        stringBuffer.append("creative=");
                        stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                        stringBuffer.append("&");
                        stringBuffer.append("ad_type=1&");
                    }
                    stringBuffer.append("devid=");
                    stringBuffer.append(C8660r.m24832k());
                    stringBuffer.append("&");
                    if (campaignEx != null) {
                        if (campaignEx.isBidCampaign()) {
                            stringBuffer.append("hb=1&");
                        }
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(campaignEx.getRequestIdNotice());
                        stringBuffer.append("&");
                        stringBuffer.append("adspace_t=");
                        stringBuffer.append(campaignEx.getAdSpaceT());
                    }
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m24672a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m24681b(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("reason=" + str2 + "&");
                    stringBuffer.append("result=1&");
                    stringBuffer.append("devid=" + C8660r.m24832k() + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("cid=" + campaignEx.getId() + "&");
                        if (campaignEx.getAdType() == 287) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=3&");
                        } else if (campaignEx.getAdType() == 94) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=1&");
                        } else if (campaignEx.getAdType() == 296) {
                            stringBuffer.append("ad_type=5&");
                            stringBuffer.append("creative=" + campaignEx.getCreativeId() + "&");
                        } else if (campaignEx.getAdType() == 297) {
                            stringBuffer.append("ad_type=6&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + "&");
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + "&");
                        } else if (campaignEx.getAdType() == 298) {
                            stringBuffer.append("ad_type=7&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + "&");
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + "&");
                        } else {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=1&");
                        }
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    }
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m24672a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24671a(Context context, String str, int i, String str2, String str3, CampaignEx campaignEx) {
        if (campaignEx != null && context != null) {
            try {
                String campaignUnitId = campaignEx.getCampaignUnitId();
                boolean isBidCampaign = campaignEx.isBidCampaign();
                String requestId = campaignEx.getRequestId();
                String id = campaignEx.getId();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(campaignUnitId)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000108&");
                    if (!TextUtils.isEmpty(campaignUnitId)) {
                        String str4 = C8388a.f20464c.get(campaignUnitId);
                        StringBuilder sb = new StringBuilder();
                        sb.append("u_stid=");
                        if (str4 == null) {
                            str4 = "";
                        }
                        sb.append(str4);
                        sb.append("&");
                        stringBuffer.append(sb.toString());
                    }
                    if (!TextUtils.isEmpty(requestId)) {
                        stringBuffer.append("rid=" + requestId + "&");
                    }
                    if (!TextUtils.isEmpty(id)) {
                        stringBuffer.append("cid=" + id + "&");
                    }
                    stringBuffer.append("template_id=" + i + "&");
                    if (!TextUtils.isEmpty(str)) {
                        stringBuffer.append("ad_type=" + str + "&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("process=" + str3 + "&");
                    }
                    stringBuffer.append("unit_id=" + campaignUnitId + "&");
                    stringBuffer.append("hb=");
                    stringBuffer.append(isBidCampaign ? 1 : 0);
                    stringBuffer.append("&");
                    stringBuffer.append("reason=" + str2);
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m24685d(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24670a(Context context, CampaignEx campaignEx, String str, String str2, int i, String str3) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000073&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("reason=" + str3 + "&");
                    stringBuffer.append("result=" + i + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m24672a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24668a(Context context, CampaignEx campaignEx, String str, String str2, int i) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000074&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("type=" + i + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m24672a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24669a(Context context, CampaignEx campaignEx, String str, String str2, int i, int i2) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000075&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("type=" + i + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                    stringBuffer.append("statue=" + i2 + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m24672a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24673a(Context context, String str, String str2, int i, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000076&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("reason=" + str3 + "&");
                    stringBuffer.append("result=" + i + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m24672a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m24672a(final Context context, final String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                new C8596a(context).mo57978c(0, C8543d.m24463a().f20952a, m24661a(str, context, str2), new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                        C8672v.m24878d(C8598e.f21109a, str);
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                        C8466k kVar = new C8466k();
                        kVar.mo57800c(str);
                        kVar.mo57795a(System.currentTimeMillis());
                        kVar.mo57794a(0);
                        kVar.mo57798b(ShareTarget.METHOD_POST);
                        kVar.mo57796a(C8543d.m24463a().f20952a);
                        C8420m.m24001a((C8412f) C8414g.m23969a(context)).mo57042a(kVar);
                        C8672v.m24878d(C8598e.f21109a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8672v.m24878d(f21109a, e.getMessage());
            }
        }
    }

    /* renamed from: d */
    private static void m24685d(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new C8596a(context).mo57978c(0, C8543d.m24463a().f20952a, m24660a(str, context), new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                        C8672v.m24878d(C8598e.f21109a, str);
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                        C8466k kVar = new C8466k();
                        kVar.mo57800c(str);
                        kVar.mo57795a(System.currentTimeMillis());
                        kVar.mo57794a(0);
                        kVar.mo57798b(ShareTarget.METHOD_POST);
                        kVar.mo57796a(C8543d.m24463a().f20952a);
                        C8420m.m24001a((C8412f) C8414g.m23969a(context)).mo57042a(kVar);
                        C8672v.m24878d(C8598e.f21109a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8672v.m24878d(f21109a, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m24678a(String str) {
        C8596a aVar = new C8596a(C8388a.m23845e().mo56913g());
        String str2 = "key=2000088&state=" + str;
        C8672v.m24878d(f21109a, str2);
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        if (b == null || m24569a(b, str2)) {
            aVar.mo57978c(0, C8543d.m24463a().f20952a, m24661a(str2, C8388a.m23845e().mo56913g(), ""), (C8532e) null);
        }
    }

    /* renamed from: a */
    public static void m24665a(int i, String str, String str2) {
        try {
            C8596a aVar = new C8596a(C8388a.m23845e().mo56913g());
            aVar.mo57978c(0, C8543d.m24463a().f20952a, m24661a("key=" + "2000080" + "&" + "reason=" + str2 + "&" + "ad_type=" + i + "&" + "url=" + URLEncoder.encode(str, "utf-8"), C8388a.m23845e().mo56913g(), ""), (C8532e) null);
        } catch (Exception e) {
            C8672v.m24878d(f21109a, e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m24683b(String str) {
        try {
            C8596a aVar = new C8596a(C8388a.m23845e().mo56913g());
            StringBuilder sb = new StringBuilder();
            sb.append("key=");
            sb.append("2000090");
            sb.append("&");
            sb.append("reason=");
            sb.append(TextUtils.isEmpty(str) ? "" : str);
            sb.append("&");
            sb.append("result=");
            sb.append(!TextUtils.isEmpty(str));
            aVar.mo57978c(0, C8543d.m24463a().f20952a, m24661a(sb.toString(), C8388a.m23845e().mo56913g(), ""), (C8532e) null);
        } catch (Exception e) {
            C8672v.m24878d(f21109a, e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m24677a(CampaignEx campaignEx, String str, int i, int i2, String str2, int i3, int i4, int i5) {
        try {
            C8596a aVar = new C8596a(C8388a.m23845e().mo56913g());
            StringBuilder sb = new StringBuilder();
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000094", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getId(), "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("video_prg");
            sb.append("=");
            sb.append(i);
            sb.append("&");
            sb.append("phase");
            sb.append("=");
            sb.append(i2);
            sb.append("&");
            sb.append("feedback_content");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append("feedback_close");
            sb.append("=");
            sb.append(i3);
            sb.append("&");
            sb.append("type");
            sb.append("=");
            sb.append(i5);
            sb.append("&");
            sb.append("ad_type");
            sb.append("=");
            sb.append(i4);
            sb.append("&");
            sb.append("network_type");
            sb.append("=");
            sb.append(URLEncoder.encode(String.valueOf(C8660r.m24840o(C8388a.m23845e().mo56913g())), "utf-8"));
            if (i3 == 1) {
                sb.append("&");
                sb.append("campaign");
                sb.append("=");
                sb.append(URLEncoder.encode(CampaignEx.campaignToJsonObject(campaignEx).toString(), "utf-8"));
            }
            if (MBridgeConstans.DEBUG && i3 == 1) {
                String str3 = f21109a;
                C8672v.m24878d(str3, "2000094:" + sb);
            }
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(sb.toString());
                return;
            }
            aVar.mo57978c(0, C8543d.m24463a().f20952a, m24661a(sb.toString(), C8388a.m23845e().mo56913g(), str), new C8597b() {
                /* renamed from: a */
                public final void mo37053a(String str) {
                    C8672v.m24874a("", "FLBClick REPORT SUCCESS");
                }

                /* renamed from: b */
                public final void mo37054b(String str) {
                    C8672v.m24874a("", "FLBClick REPORT FAILED");
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m24682b(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new C8596a(context).mo57978c(0, C8543d.m24463a().f20952a, m24660a(str, context), new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                        C8672v.m24878d(C8598e.f21109a, str);
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                        C8672v.m24878d(C8598e.f21109a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8672v.m24878d(f21109a, e.getMessage());
            }
        }
    }
}
