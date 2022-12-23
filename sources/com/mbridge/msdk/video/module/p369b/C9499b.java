package com.mbridge.msdk.video.module.p369b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8659q;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.module.p370c.C9501a;
import com.mbridge.msdk.videocommon.p373b.C9630c;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.module.b.b */
/* compiled from: VideoViewReport */
public final class C9499b {

    /* renamed from: a */
    public static HashMap<String, ArrayList<String>> f23541a = new HashMap<>();

    /* renamed from: a */
    public static void m27026a(String str) {
        f23541a.remove(str);
    }

    /* renamed from: a */
    public static void m27027a(String str, String str2) {
        try {
            if (C8388a.m23845e().mo56913g() != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C8596a aVar = new C8596a(C8388a.m23845e().mo56913g());
                C8550d a = C8598e.m24661a(str, C8388a.m23845e().mo56913g(), str2);
                a.mo57981a("r_stid", C9638b.m27377a().mo63556b().mo63532a());
                aVar.mo57978c(0, C8543d.m24463a().f20952a, a, new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                        C8672v.m24878d("VideoViewReport", str);
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                        C8672v.m24878d("VideoViewReport", str);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            C8672v.m24878d("VideoViewReport", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m27020a(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57769i() != null) {
            C6765a.m20559a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57769i(), false, false);
        }
    }

    /* renamed from: b */
    public static void m27028b(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57757c() != null) {
            C6765a.m20559a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57757c(), false, false);
        }
    }

    /* renamed from: c */
    public static void m27029c(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57759d() != null) {
            C6765a.m20559a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57759d(), false, false);
        }
    }

    /* renamed from: d */
    public static void m27030d(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57761e() != null) {
            String campaignUnitId = campaignEx.getCampaignUnitId();
            ArrayList arrayList = f23541a.get(campaignUnitId);
            if (arrayList == null) {
                arrayList = new ArrayList();
                f23541a.put(campaignUnitId, arrayList);
            }
            if (!arrayList.contains(campaignEx.getId())) {
                C6765a.m20559a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57761e(), false, false);
                arrayList.add(campaignEx.getId());
            }
        }
    }

    /* renamed from: a */
    public static void m27021a(Context context, CampaignEx campaignEx, int i, int i2) {
        String str;
        try {
            String[] j = campaignEx.getNativeVideoTracking().mo57771j();
            if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && j != null) {
                String[] strArr = new String[j.length];
                for (int i3 = 0; i3 < j.length; i3++) {
                    String str2 = j[i3];
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("endscreen_type", i);
                    String jSONObject2 = jSONObject.toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        jSONObject2 = C8659q.m24801a(jSONObject2);
                    }
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        str2 = str2 + "&value=" + URLEncoder.encode(jSONObject2);
                    }
                    if (campaignEx.getSpareOfferFlag() == 1) {
                        str = str2 + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i2;
                    } else {
                        str = str2 + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i2;
                    }
                    strArr[i3] = str;
                }
                C6765a.m20559a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
            }
        } catch (Throwable unused) {
            C8672v.m24878d("VideoViewReport", "reportEndcardshowData error");
        }
    }

    /* renamed from: e */
    public static void m27031e(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57773k() != null) {
            C6765a.m20559a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57773k(), false, false);
        }
    }

    /* renamed from: f */
    public static void m27032f(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57763f() != null) {
            C6765a.m20559a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57763f(), false, false);
        }
    }

    /* renamed from: a */
    public static void m27022a(Context context, CampaignEx campaignEx, int i, int i2, int i3) {
        String str;
        int i4 = i3;
        if (i2 != 0 && context != null && campaignEx != null) {
            try {
                List<Map<Integer, String>> b = campaignEx.getNativeVideoTracking().mo57754b();
                int i5 = ((i + 1) * 100) / i2;
                if (b != null) {
                    int i6 = 0;
                    while (i6 < b.size()) {
                        Map map = b.get(i6);
                        if (map != null && map.size() > 0) {
                            Iterator it = map.entrySet().iterator();
                            int i7 = i6;
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                int intValue = ((Integer) entry.getKey()).intValue();
                                String str2 = (String) entry.getValue();
                                if (campaignEx.getSpareOfferFlag() == 1) {
                                    str = str2 + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i4;
                                } else {
                                    str = str2 + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i4;
                                }
                                if (intValue <= i5 && !TextUtils.isEmpty(str)) {
                                    C6765a.m20559a(context, campaignEx, campaignEx.getCampaignUnitId(), new String[]{str}, false, true);
                                    it.remove();
                                    b.remove(i7);
                                    i7--;
                                }
                            }
                            i6 = i7;
                        }
                        i6++;
                    }
                }
            } catch (Throwable unused) {
                C8672v.m24878d("VideoViewReport", "reportPlayPercentageData error");
            }
        }
    }

    /* renamed from: a */
    public static void m27025a(CampaignEx campaignEx, Map<Integer, String> map, String str, int i) {
        if (campaignEx != null && map != null) {
            try {
                if (map.size() > 0) {
                    Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        String str2 = (String) next.getValue();
                        if (i == ((Integer) next.getKey()).intValue() && !TextUtils.isEmpty(str2)) {
                            C6765a.m20557a(C8388a.m23845e().mo56913g(), campaignEx, str, str2, false, false);
                            it.remove();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m27024a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAdUrlList() != null && campaignEx.getAdUrlList().size() > 0) {
                    for (String next : campaignEx.getAdUrlList()) {
                        if (!TextUtils.isEmpty(next)) {
                            C6765a.m20557a(C8388a.m23845e().mo56913g(), campaignEx, str, next, false, false);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m27023a(CampaignEx campaignEx, C9630c cVar, String str, String str2, String str3) {
        String str4 = "&";
        String str5 = "";
        if (campaignEx != null && cVar != null) {
            try {
                C9501a aVar = new C9501a(C8388a.m23845e().mo56913g());
                C8550d dVar = new C8550d();
                dVar.mo57981a("user_id", C8659q.m24801a(str2));
                dVar.mo57981a("cb_type", "1");
                dVar.mo57981a(CampaignEx.JSON_KEY_REWARD_NAME, cVar.mo63524a());
                dVar.mo57981a(CampaignEx.JSON_KEY_REWARD_AMOUNT, cVar.mo63527b() + str5);
                dVar.mo57981a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                dVar.mo57981a("click_id", campaignEx.getRequestIdNotice());
                if (!TextUtils.isEmpty(str3)) {
                    dVar.mo57981a("extra", str3);
                }
                aVar.mo16280a(str5, dVar);
                String str6 = campaignEx.getHost() + "/addReward?";
                String trim = dVar.mo57979a().trim();
                if (!TextUtils.isEmpty(trim)) {
                    if (!str6.endsWith("?") && !str6.endsWith(str4)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str6);
                        if (!str6.contains("?")) {
                            str4 = "?";
                        }
                        sb.append(str4);
                        str6 = sb.toString();
                    }
                    str5 = str6 + trim;
                }
                String str7 = str5;
                C8672v.m24878d("VideoViewReport", "rewardUrl:" + str7);
                C6765a.m20557a(C8388a.m23845e().mo56913g(), campaignEx, campaignEx.getCampaignUnitId(), str7, false, false);
            } catch (Throwable th) {
                C8672v.m24875a("VideoViewReport", th.getMessage(), th);
            }
        }
    }
}
