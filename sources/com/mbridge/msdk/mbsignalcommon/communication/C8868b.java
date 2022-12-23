package com.mbridge.msdk.mbsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8461f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.communication.b */
/* compiled from: CommonSignalCommunicatioImpUtils */
public class C8868b {

    /* renamed from: a */
    public static final String f21849a = C8868b.class.getSimpleName();

    /* renamed from: b */
    public static int f21850b = 0;

    /* renamed from: c */
    public static int f21851c = 1;

    /* renamed from: a */
    public static void m25604a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m25603a(obj, "data is empty");
                return;
            }
            final CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                m25603a(obj, "data camapign is empty");
                return;
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        C8417j a = C8417j.m23986a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                        if (a != null) {
                            if (!a.mo57029a(CampaignEx.this.getId())) {
                                C8461f fVar = new C8461f();
                                fVar.mo57724a(CampaignEx.this.getId());
                                fVar.mo57722a(CampaignEx.this.getFca());
                                fVar.mo57726b(CampaignEx.this.getFcb());
                                fVar.mo57730d(0);
                                fVar.mo57728c(1);
                                fVar.mo57723a(System.currentTimeMillis());
                                a.mo57028a(fVar);
                            } else {
                                a.mo57032b(CampaignEx.this.getId());
                            }
                        }
                        C8868b.m25605a(CampaignEx.this.getCampaignUnitId(), CampaignEx.this);
                    } catch (Throwable th) {
                        C8672v.m24875a(C8868b.f21849a, th.getMessage(), th);
                    }
                }
            }).start();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f21850b);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", "");
            jSONObject2.put("data", jSONObject3);
            C8887g.m25669a().mo58688a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e) {
            m25603a(obj, e.getMessage());
            C8672v.m24874a(f21849a, e.getMessage());
        } catch (Throwable th) {
            m25603a(obj, th.getMessage());
        }
    }

    /* renamed from: a */
    public static String m25601a(float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C8469a.f20744e, C8677z.m24906a(C8388a.m23845e().mo56913g(), f));
            jSONObject2.put(C8469a.f20745f, C8677z.m24906a(C8388a.m23845e().mo56913g(), f2));
            jSONObject2.put(C8469a.f20747h, 0);
            jSONObject2.put(C8469a.f20748i, C8388a.m23845e().mo56913g().getResources().getConfiguration().orientation);
            jSONObject2.put(C8469a.f20749j, (double) C8677z.m24936d(C8388a.m23845e().mo56913g()));
            jSONObject.put(C8469a.f20746g, jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static String m25602a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8672v.m24878d(f21849a, "code to string is error");
            return "";
        }
    }

    /* renamed from: a */
    public static void m25603a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21851c);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C8887g.m25669a().mo58688a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C8672v.m24874a(f21849a, e.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25605a(String str, CampaignEx campaignEx) {
        if (C8473d.f20778g != null && !TextUtils.isEmpty(campaignEx.getId())) {
            C8473d.m24279a(str, campaignEx, "banner");
        }
    }
}
