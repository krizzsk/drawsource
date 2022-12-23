package com.mbridge.msdk.video.signal.p371a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8423p;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.tools.C8614ab;
import com.mbridge.msdk.foundation.tools.C8633c;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.videocommon.p375d.C9637a;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.j */
/* compiled from: JSCommon */
public final class C9514j extends C9505c {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Activity f23562n;

    /* renamed from: o */
    private String f23563o;

    /* renamed from: p */
    private String f23564p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public CampaignEx f23565q;

    /* renamed from: r */
    private List<CampaignEx> f23566r;

    /* renamed from: s */
    private int f23567s;

    /* renamed from: t */
    private String f23568t = "";

    /* renamed from: u */
    private String f23569u = "";

    /* renamed from: v */
    private boolean f23570v = false;

    /* renamed from: w */
    private boolean f23571w = false;

    /* renamed from: a */
    public final void mo63276a(CampaignEx campaignEx) {
        this.f23565q = campaignEx;
    }

    /* renamed from: a */
    public final void mo63277a(List<CampaignEx> list) {
        this.f23566r = list;
    }

    /* renamed from: c */
    public final void mo63279c(boolean z) {
        this.f23570v = z;
    }

    public C9514j(Activity activity, CampaignEx campaignEx) {
        this.f23562n = activity;
        this.f23565q = campaignEx;
    }

    public C9514j(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.f23562n = activity;
        this.f23565q = campaignEx;
        this.f23566r = list;
    }

    /* renamed from: n */
    public final void mo63283n() {
        this.f23563o = "";
    }

    /* renamed from: c */
    public final void mo63278c(String str) {
        this.f23568t = str;
    }

    /* renamed from: d */
    public final void mo63280d(String str) {
        this.f23569u = str;
    }

    /* renamed from: o */
    public final int mo63284o() {
        return this.f23567s;
    }

    /* renamed from: i */
    public final void mo63282i(int i) {
        this.f23567s = i;
    }

    /* renamed from: d */
    public final void mo63281d(boolean z) {
        this.f23571w = z;
    }

    /* renamed from: c */
    public final String mo63250c() {
        this.f23554l.mo62632a();
        this.f23543a = true;
        if (TextUtils.isEmpty(this.f23563o)) {
            this.f23563o = m27115p();
        }
        return this.f23563o;
    }

    /* renamed from: p */
    private String m27115p() {
        JSONObject jSONObject = new JSONObject();
        C8633c cVar = new C8633c(C8388a.m23845e().mo56913g());
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23551i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, this.f23568t);
            jSONObject2.put("rootViewInstanceId", this.f23569u);
            jSONObject2.put("isRootTemplateWebView", this.f23570v);
            jSONObject.put("sdk_info", "MAL_16.2.21,3.0.1");
            jSONObject2.put("playVideoMute", this.f23555m);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.mo58124a());
            JSONArray jSONArray = new JSONArray();
            if (this.f23566r == null || this.f23566r.size() <= 0) {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.f23565q));
            } else {
                for (CampaignEx next : this.f23566r) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(next, next.isReady(), m27114b(next)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", m27124y());
            String c = C2445b.m6020a().mo16289c(C8388a.m23845e().mo56914h());
            if (!TextUtils.isEmpty(c)) {
                JSONObject jSONObject3 = new JSONObject(c);
                m27111a(jSONObject3);
                String d = C2445b.m6020a().mo16291d(this.f23551i);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject3.put("ivreward", new JSONObject(d));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", m27125z());
            if (!TextUtils.isEmpty(this.f23551i)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23551i);
            }
            jSONObject.put("rw_plus", this.f23571w ? "1" : "0");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private void m27111a(JSONObject jSONObject) {
        try {
            Context g = C8388a.m23845e().mo56913g();
            String obj = C8614ab.m24713b(g, "MBridge_ConfirmTitle" + this.f23551i, "").toString();
            String obj2 = C8614ab.m24713b(g, "MBridge_ConfirmContent" + this.f23551i, "").toString();
            String obj3 = C8614ab.m24713b(g, "MBridge_CancelText" + this.f23551i, "").toString();
            String obj4 = C8614ab.m24713b(g, "MBridge_ConfirmText" + this.f23551i, "").toString();
            if (!TextUtils.isEmpty(obj)) {
                jSONObject.put("confirm_title", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                jSONObject.put("confirm_description", obj2);
            }
            if (!TextUtils.isEmpty(obj3)) {
                jSONObject.put("confirm_t", obj3);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put("confirm_c_play", obj4);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put("confirm_c_rv", obj4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:38|39|40|41|(1:43)|44|45|(2:48|46)|56|49|50|61) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0104 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010e A[Catch:{ JSONException -> 0x0125 }, LOOP:1: B:46:0x0108->B:48:0x010e, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.mbridge.msdk.foundation.entity.CampaignEx m27110a(java.lang.String r8, com.mbridge.msdk.foundation.entity.CampaignEx r9) {
        /*
            r7 = this;
            java.lang.String r0 = "deep_link"
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L_0x0009
            return r9
        L_0x0009:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L_0x0015
            if (r9 == 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            r9 = 0
            goto L_0x0129
        L_0x0015:
            java.lang.String r1 = "notice"
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L_0x00f0
            org.json.JSONObject r0 = com.mbridge.msdk.foundation.entity.CampaignEx.campaignToJsonObject(r9)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r1 != 0) goto L_0x0028
            r1 = r9
        L_0x0028:
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r2 != 0) goto L_0x00e4
            r7.m27112a((org.json.JSONObject) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r1)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r8 = com.mbridge.msdk.foundation.same.C8469a.f20746g     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            org.json.JSONObject r8 = r0.optJSONObject(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = "-999"
            if (r8 == 0) goto L_0x0073
            android.app.Activity r0 = r7.f23562n     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8469a.f20744e     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r2 = r8.getString(r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            float r2 = (float) r2     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r0 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r0, (float) r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            android.app.Activity r2 = r7.f23562n     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8469a.f20745f     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r3 = r8.getString(r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r3 = r3.intValue()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            float r3 = (float) r3     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r2 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r2, (float) r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            goto L_0x0074
        L_0x0073:
            r2 = r0
        L_0x0074:
            java.lang.String r3 = r1.getClickURL()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = com.mbridge.msdk.click.C6779b.m20642a((java.lang.String) r3, (java.lang.String) r0, (java.lang.String) r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r1.setClickURL(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = r1.getNoticeUrl()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r8 == 0) goto L_0x00e4
            java.util.Iterator r2 = r8.keys()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r3.<init>()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
        L_0x008e:
            boolean r4 = r2.hasNext()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r4 == 0) goto L_0x00d2
            java.lang.String r4 = "&"
            r3.append(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Object r4 = r2.next()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r5 = r8.optString(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C8469a.f20744e     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            boolean r6 = r6.equals(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r6 != 0) goto L_0x00b3
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C8469a.f20745f     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            boolean r6 = r6.equals(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r6 == 0) goto L_0x00c6
        L_0x00b3:
            android.app.Activity r6 = r7.f23562n     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r5 = r5.intValue()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            float r5 = (float) r5     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r5 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r6, (float) r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
        L_0x00c6:
            r3.append(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r4 = "="
            r3.append(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r3.append(r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            goto L_0x008e
        L_0x00d2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r8.<init>()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r8.append(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r8.append(r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r1.setNoticeUrl(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
        L_0x00e4:
            r9 = r1
            goto L_0x0129
        L_0x00e6:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x0129
        L_0x00eb:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x0129
        L_0x00f0:
            org.json.JSONObject r1 = com.mbridge.msdk.foundation.entity.CampaignEx.campaignToJsonObject(r9)     // Catch:{ JSONException -> 0x0125 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0125 }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x0125 }
            boolean r8 = r2.has(r0)     // Catch:{ Exception -> 0x0104 }
            if (r8 != 0) goto L_0x0104
            java.lang.String r8 = ""
            r1.put(r0, r8)     // Catch:{ Exception -> 0x0104 }
        L_0x0104:
            java.util.Iterator r8 = r2.keys()     // Catch:{ JSONException -> 0x0125 }
        L_0x0108:
            boolean r0 = r8.hasNext()     // Catch:{ JSONException -> 0x0125 }
            if (r0 == 0) goto L_0x011c
            java.lang.Object r0 = r8.next()     // Catch:{ JSONException -> 0x0125 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0125 }
            java.lang.String r3 = r2.getString(r0)     // Catch:{ JSONException -> 0x0125 }
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x0125 }
            goto L_0x0108
        L_0x011c:
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r1)     // Catch:{ JSONException -> 0x0125 }
            r7.m27112a((org.json.JSONObject) r1, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ JSONException -> 0x0125 }
            r9 = r8
            goto L_0x0129
        L_0x0125:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0129:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.p371a.C9514j.m27110a(java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx):com.mbridge.msdk.foundation.entity.CampaignEx");
    }

    /* renamed from: a */
    private void m27112a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String optString = jSONObject.optString("unitId");
            if (!TextUtils.isEmpty(optString)) {
                campaignEx.setCampaignUnitId(optString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ba, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        com.mbridge.msdk.foundation.tools.C8672v.m24875a("DefaultJSCommon", "INSTALL", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e7, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e8, code lost:
        com.mbridge.msdk.foundation.tools.C8672v.m24875a("DefaultJSCommon", r6.getMessage(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:20:0x0049, B:45:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6 A[Catch:{ all -> 0x00ba, all -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c7 A[Catch:{ all -> 0x00ba, all -> 0x00e7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void click(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "camp_position"
            super.click(r6, r7)
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f23565q
            if (r1 == 0) goto L_0x003f
            int r1 = r1.getDynamicTempCode()
            r2 = 5
            if (r1 != r2) goto L_0x003f
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f23565q
            if (r1 != 0) goto L_0x0015
            goto L_0x003f
        L_0x0015:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r5.f23566r
            if (r1 != 0) goto L_0x001a
            goto L_0x003f
        L_0x001a:
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0021
            goto L_0x003f
        L_0x0021:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003b }
            r1.<init>(r7)     // Catch:{ JSONException -> 0x003b }
            boolean r2 = r1.has(r0)     // Catch:{ JSONException -> 0x003b }
            if (r2 == 0) goto L_0x003f
            int r0 = r1.getInt(r0)     // Catch:{ JSONException -> 0x003b }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r5.f23566r     // Catch:{ JSONException -> 0x003b }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x003b }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch:{ JSONException -> 0x003b }
            r5.f23565q = r0     // Catch:{ JSONException -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003f:
            java.lang.String r0 = "DefaultJSCommon"
            r1 = 1
            if (r6 == r1) goto L_0x007b
            r2 = 3
            if (r6 == r2) goto L_0x0049
            goto L_0x00ef
        L_0x0049:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23565q     // Catch:{ all -> 0x00e7 }
            if (r6 == 0) goto L_0x005d
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23565q     // Catch:{ all -> 0x00e7 }
            int r6 = r6.getCbd()     // Catch:{ all -> 0x00e7 }
            r2 = -2
            if (r6 <= r2) goto L_0x005d
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23565q     // Catch:{ all -> 0x00e7 }
            int r6 = r6.getCbd()     // Catch:{ all -> 0x00e7 }
            goto L_0x0069
        L_0x005d:
            com.mbridge.msdk.videocommon.d.c r6 = r5.f23552j     // Catch:{ all -> 0x00e7 }
            if (r6 == 0) goto L_0x0068
            com.mbridge.msdk.videocommon.d.c r6 = r5.f23552j     // Catch:{ all -> 0x00e7 }
            int r6 = r6.mo63594n()     // Catch:{ all -> 0x00e7 }
            goto L_0x0069
        L_0x0068:
            r6 = r1
        L_0x0069:
            r2 = -1
            if (r6 != r2) goto L_0x0076
            com.mbridge.msdk.video.signal.a.c$b r6 = new com.mbridge.msdk.video.signal.a.c$b     // Catch:{ all -> 0x00e7 }
            com.mbridge.msdk.video.signal.c$a r2 = r5.f23554l     // Catch:{ all -> 0x00e7 }
            r6.<init>(r5, r2)     // Catch:{ all -> 0x00e7 }
            r5.mo63242a((com.mbridge.msdk.video.signal.C9521c.C9522a) r6)     // Catch:{ all -> 0x00e7 }
        L_0x0076:
            r5.click(r1, r7)     // Catch:{ all -> 0x00e7 }
            goto L_0x00ef
        L_0x007b:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23565q     // Catch:{ all -> 0x00e7 }
            r2 = 0
            if (r6 != 0) goto L_0x0096
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r5.f23566r     // Catch:{ all -> 0x00e7 }
            if (r6 == 0) goto L_0x0096
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r5.f23566r     // Catch:{ all -> 0x00e7 }
            int r6 = r6.size()     // Catch:{ all -> 0x00e7 }
            if (r6 <= 0) goto L_0x0096
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r5.f23566r     // Catch:{ all -> 0x00e7 }
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x00e7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ all -> 0x00e7 }
            r5.f23565q = r6     // Catch:{ all -> 0x00e7 }
        L_0x0096:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23565q     // Catch:{ all -> 0x00e7 }
            if (r6 != 0) goto L_0x009b
            return
        L_0x009b:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23565q     // Catch:{ all -> 0x00e7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.m27110a((java.lang.String) r7, (com.mbridge.msdk.foundation.entity.CampaignEx) r6)     // Catch:{ all -> 0x00e7 }
            java.lang.String r7 = r6.getNoticeUrl()     // Catch:{ all -> 0x00e7 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8469a.f20747h     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r7.getQueryParameter(r3)     // Catch:{ all -> 0x00ba }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00ba }
            if (r3 != 0) goto L_0x00c0
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x00ba }
            goto L_0x00c1
        L_0x00ba:
            r7 = move-exception
            java.lang.String r3 = "INSTALL"
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r0, r3, r7)     // Catch:{ all -> 0x00e7 }
        L_0x00c0:
            r7 = r2
        L_0x00c1:
            com.mbridge.msdk.video.signal.c$a r3 = r5.f23554l     // Catch:{ all -> 0x00e7 }
            r4 = 2
            if (r7 != r4) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r1 = r2
        L_0x00c8:
            r3.mo62634a(r1)     // Catch:{ all -> 0x00e7 }
            com.mbridge.msdk.click.a r7 = r5.m27116q()     // Catch:{ all -> 0x00e7 }
            com.mbridge.msdk.video.signal.c$a r1 = r5.f23554l     // Catch:{ all -> 0x00e7 }
            r7.mo37044a((com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r1)     // Catch:{ all -> 0x00e7 }
            com.mbridge.msdk.click.a r7 = r5.m27116q()     // Catch:{ all -> 0x00e7 }
            r7.mo37041a((com.mbridge.msdk.foundation.entity.CampaignEx) r6)     // Catch:{ all -> 0x00e7 }
            com.mbridge.msdk.foundation.controller.a r7 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x00e7 }
            android.content.Context r7 = r7.mo56913g()     // Catch:{ all -> 0x00e7 }
            com.mbridge.msdk.video.module.p369b.C9499b.m27030d(r7, r6)     // Catch:{ all -> 0x00e7 }
            goto L_0x00ef
        L_0x00e7:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r0, r7, r6)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.p371a.C9514j.click(int, java.lang.String):void");
    }

    public final void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        try {
            this.f23554l.mo62633a(i, str);
        } catch (Throwable th) {
            C8672v.m24875a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public final void mo63240a(int i, String str) {
        super.mo63240a(i, str);
        if (i == 2) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final String optString = jSONObject.optString("event", "event");
                final String optString2 = jSONObject.optString("template", "-1");
                final String optString3 = jSONObject.optString("layout", "-1");
                final String optString4 = jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23551i);
                final int o = C8660r.m24840o(this.f23562n.getApplication());
                C95151 r2 = new Runnable() {
                    public final void run() {
                        C8423p.m24023a((C8412f) C8414g.m23969a((Context) C9514j.this.f23562n.getApplication())).mo57056a(new C8468m("2000039", optString, optString2, optString3, optString4, C9514j.this.f23565q.getId(), o, C8660r.m24806a((Context) C9514j.this.f23562n.getApplication(), o)));
                    }
                };
                if (C8396b.m23890a().mo56951d()) {
                    C8498b.m24359a().execute(r2);
                } else {
                    r2.run();
                }
            } catch (Throwable th) {
                C8672v.m24875a("DefaultJSCommon", th.getMessage(), th);
            }
        }
    }

    /* renamed from: f */
    public final void mo63256f() {
        super.mo63256f();
        if (this.f23554l != null) {
            this.f23554l.mo62635b();
        }
    }

    /* renamed from: d */
    public final void mo63252d() {
        super.mo63252d();
        try {
            if (this.f23562n != null) {
                this.f23562n.finish();
            }
        } catch (Throwable th) {
            C8672v.m24875a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    /* renamed from: q */
    private C6765a m27116q() {
        if (this.f23553k == null) {
            this.f23553k = new C6765a(C8388a.m23845e().mo56913g(), this.f23551i);
        }
        return this.f23553k;
    }

    /* renamed from: g */
    public final String mo63259g(int i) {
        switch (i) {
            case 1:
                return m27118s().toString();
            case 2:
                return m27119t().toString();
            case 3:
                return m27120u().toString();
            case 4:
                return m27121v().toString();
            case 5:
                return m27122w().toString();
            case 6:
                return m27123x().toString();
            default:
                return m27117r().toString();
        }
    }

    /* renamed from: r */
    private JSONObject m27117r() {
        JSONObject jSONObject = new JSONObject();
        C8633c cVar = new C8633c(C8388a.m23845e().mo56913g());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f23555m);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.mo58124a());
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.f23565q));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", m27124y());
            String c = C2445b.m6020a().mo16289c(C8388a.m23845e().mo56914h());
            if (!TextUtils.isEmpty(c)) {
                JSONObject jSONObject3 = new JSONObject(c);
                m27111a(jSONObject3);
                String d = C2445b.m6020a().mo16291d(this.f23551i);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject3.put("ivreward", d);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", m27125z());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: s */
    private JSONObject m27118s() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_16.2.21,3.0.1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: t */
    private JSONObject m27119t() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f23551i)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23551i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: u */
    private JSONObject m27120u() {
        JSONObject jSONObject = new JSONObject();
        try {
            String c = C2445b.m6020a().mo16289c(C8388a.m23845e().mo56914h());
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("appSetting", new JSONObject(c));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: v */
    private JSONObject m27121v() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f23552j != null) {
                jSONObject.put("unitSetting", this.f23552j.mo63562D());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: w */
    private JSONObject m27122w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", new C8633c(C8388a.m23845e().mo56913g()).mo58124a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: x */
    private JSONObject m27123x() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f23555m);
            jSONObject2.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, this.f23568t);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: y */
    private JSONObject m27124y() {
        return this.f23552j != null ? this.f23552j.mo63562D() : new JSONObject();
    }

    /* renamed from: z */
    private JSONObject m27125z() {
        JSONObject jSONObject = new JSONObject();
        C9637a b = C9638b.m27377a().mo63556b();
        return b != null ? b.mo63549j() : jSONObject;
    }

    /* renamed from: a */
    public final void mo63241a(Activity activity) {
        this.f23562n = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r0 = com.mbridge.msdk.p078c.C2445b.m6020a().mo16286b(r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m27114b(com.mbridge.msdk.foundation.entity.CampaignEx r7) {
        /*
            r6 = this;
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r0 = r0.mo56914h()     // Catch:{ Exception -> 0x0038 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0038 }
            r2 = 0
            if (r1 != 0) goto L_0x0022
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0038 }
            com.mbridge.msdk.c.a r0 = r1.mo16286b(r0)     // Catch:{ Exception -> 0x0038 }
            if (r0 == 0) goto L_0x0022
            long r0 = r0.mo16156K()     // Catch:{ Exception -> 0x0038 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            com.mbridge.msdk.videocommon.d.b r4 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x0038 }
            com.mbridge.msdk.videocommon.d.a r4 = r4.mo63556b()     // Catch:{ Exception -> 0x0038 }
            if (r4 == 0) goto L_0x0031
            long r2 = r4.mo63541d()     // Catch:{ Exception -> 0x0038 }
        L_0x0031:
            if (r7 == 0) goto L_0x0038
            boolean r7 = r7.isSpareOffer(r2, r0)     // Catch:{ Exception -> 0x0038 }
            return r7
        L_0x0038:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.p371a.C9514j.m27114b(com.mbridge.msdk.foundation.entity.CampaignEx):boolean");
    }

    /* renamed from: b */
    public final void mo63247b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f23564p = str;
        }
    }

    /* renamed from: i */
    public final String mo63262i() {
        C8672v.m24874a("DefaultJSCommon", "getNotchArea");
        return this.f23564p;
    }
}
