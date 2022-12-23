package com.mbridge.msdk.video.p347bt.module.p350b;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8466k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8420m;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.bt.module.b.f */
/* compiled from: RewardReport */
public class C9308f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f22849a = C9308f.class.getName();

    /* renamed from: a */
    private static void m26483a(final Context context, final String str, String str2) {
        if (C8388a.m23845e().mo56913g() != null) {
            context = C8388a.m23845e().mo56913g();
        }
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                C8596a aVar = new C8596a(context);
                C8550d a = C8598e.m24661a(str, context, str2);
                a.mo57981a("r_stid", C9638b.m27377a().mo63556b().mo63532a());
                aVar.mo57978c(0, C8543d.m24463a().f20952a, a, new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                        C8672v.m24878d(C9308f.f22849a, str);
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
                        C8672v.m24878d(C9308f.f22849a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8672v.m24878d(f22849a, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m26481a(Context context, CampaignEx campaignEx, String str, int i) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("reason=&");
                    stringBuffer.append("templateshowtype=" + i + " offer show success&");
                    stringBuffer.append("result=2&");
                    if (campaignEx == null || campaignEx.getAdType() != 287) {
                        if (campaignEx != null) {
                            if (campaignEx.getAdType() == 94) {
                                stringBuffer.append("ad_type=1&");
                            }
                        }
                        stringBuffer.append("ad_type=1&");
                    } else {
                        stringBuffer.append("ad_type=3&");
                    }
                    String str2 = campaignEx.getendcard_url();
                    if (!TextUtils.isEmpty(str2)) {
                        stringBuffer.append("creative=" + URLEncoder.encode(str2) + "&");
                    }
                    stringBuffer.append("devid=" + C8660r.m24832k() + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                        stringBuffer.append("&");
                        stringBuffer.append("adspace_t=");
                        stringBuffer.append(campaignEx.getAdSpaceT());
                    }
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m26483a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m26482a(Context context, CampaignEx campaignEx, String str, String str2, int i) {
        if (context != null && campaignEx != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("reason=" + str2 + "&");
                    stringBuffer.append("templateshowtype=" + i + "&");
                    stringBuffer.append("reason=" + str2 + "&");
                    stringBuffer.append("result=1&");
                    if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                        stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                    }
                    stringBuffer.append("devid=" + C8660r.m24832k() + "&");
                    if (campaignEx == null || campaignEx.getAdType() != 287) {
                        if (campaignEx != null) {
                            if (campaignEx.getAdType() == 94) {
                                stringBuffer.append("ad_type=1&");
                            }
                        }
                        stringBuffer.append("ad_type=1&");
                    } else {
                        stringBuffer.append("ad_type=3&");
                    }
                    if (campaignEx != null) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                        stringBuffer.append("&");
                        stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                    }
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m26483a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m26484a(Context context, List<CampaignEx> list, String str) {
        if (context != null && list != null) {
            try {
                if (list.size() > 0 && !TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < list.size(); i++) {
                        arrayList.add(list.get(i).getId());
                    }
                    stringBuffer.append("cid=" + arrayList.toString() + "&");
                    stringBuffer.append("result=2&");
                    if (list.get(0) != null) {
                        CampaignEx campaignEx = list.get(0);
                        stringBuffer.append("reason=&");
                        stringBuffer.append("templateshowtype=two offer ec show success&");
                        stringBuffer.append("ad_type=" + campaignEx.getAdType() + "&");
                        stringBuffer.append("devid=" + C8660r.m24832k() + "&");
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                        stringBuffer.append("&");
                        stringBuffer.append("&adspace_t=");
                        stringBuffer.append(campaignEx.getAdSpaceT());
                    }
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m26483a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m26485a(Context context, List<CampaignEx> list, String str, String str2) {
        if (context != null && list != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    String[] strArr = new String[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        strArr[i] = list.get(i).getId();
                    }
                    stringBuffer.append("cid=" + strArr + "&");
                    stringBuffer.append("reason=" + str2 + "&");
                    stringBuffer.append("result=1&");
                    stringBuffer.append("devid=" + C8660r.m24832k() + "&");
                    if (list.get(0) != null) {
                        CampaignEx campaignEx = list.get(0);
                        stringBuffer.append("ad_type=" + campaignEx.getAdType() + "&");
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                        stringBuffer.append("&");
                        stringBuffer.append("templateshowtype=" + campaignEx.getMof_tplid());
                        stringBuffer.append("&");
                        stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                    }
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m26483a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m26486a(CampaignEx campaignEx, String str, int i) {
        try {
            Context g = C8388a.m23845e().mo56913g();
            if (g != null && campaignEx != null && !TextUtils.isEmpty(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000115&");
                stringBuffer.append("network_type=" + C8660r.m24840o(g) + "&");
                stringBuffer.append("unit_id=" + str + "&");
                stringBuffer.append("cid=" + campaignEx.getId() + "&");
                stringBuffer.append("play_cur_time=" + i + "&");
                stringBuffer.append("reason=close ad in advance " + campaignEx.getMof_tplid() + "&");
                stringBuffer.append("result=1&");
                stringBuffer.append("devid=" + C8660r.m24832k() + "&");
                stringBuffer.append("ad_type=" + campaignEx.getAdType() + "&");
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append("&");
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                stringBuffer.append("&");
                stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                if (C8574b.m24577a().mo58054c()) {
                    C8574b.m24577a().mo58052a(stringBuffer.toString());
                } else {
                    m26483a(g, stringBuffer.toString(), str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
