package com.mbridge.msdk.mbnative.p335d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.click.p217a.C6772a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.p334c.C8801a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.mbridge.msdk.mbnative.d.b */
/* compiled from: NativeReportUtils */
public final class C8838b {
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0097, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m25512a(com.mbridge.msdk.foundation.entity.CampaignEx r17, android.content.Context r18, java.lang.String r19, com.mbridge.msdk.mbnative.p334c.C8801a r20) {
        /*
            r7 = r17
            r0 = r20
            java.lang.Class<com.mbridge.msdk.mbnative.d.b> r8 = com.mbridge.msdk.mbnative.p335d.C8838b.class
            monitor-enter(r8)
            if (r7 != 0) goto L_0x000b
            monitor-exit(r8)
            return
        L_0x000b:
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ all -> 0x0098 }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = r2.mo56914h()     // Catch:{ all -> 0x0098 }
            com.mbridge.msdk.c.a r1 = r1.mo16294f(r2)     // Catch:{ all -> 0x0098 }
            r2 = 0
            r9 = 1
            if (r1 == 0) goto L_0x002a
            int r1 = r1.mo16199aq()     // Catch:{ all -> 0x0098 }
            if (r1 != r9) goto L_0x0027
            r1 = r9
            goto L_0x0028
        L_0x0027:
            r1 = r2
        L_0x0028:
            r10 = r1
            goto L_0x002b
        L_0x002a:
            r10 = r9
        L_0x002b:
            boolean r1 = r17.isReport()     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x0077
            r7.setReport(r9)     // Catch:{ all -> 0x0098 }
            m25511a(r17, r18, r19)     // Catch:{ all -> 0x0098 }
            r11 = r18
            r12 = r19
            m25513a(r7, r11, r12, r0, r10)     // Catch:{ all -> 0x0098 }
            java.util.List r13 = m25510a(r17)     // Catch:{ all -> 0x0098 }
            if (r13 == 0) goto L_0x0074
            int r1 = r13.size()     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x004b
            goto L_0x0074
        L_0x004b:
            r14 = 0
            r15 = 0
            r6 = r2
        L_0x004e:
            int r1 = r13.size()     // Catch:{ all -> 0x0098 }
            if (r6 >= r1) goto L_0x0074
            java.lang.Object r1 = r13.get(r6)     // Catch:{ all -> 0x0098 }
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0098 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x006f
            r1 = r18
            r2 = r17
            r3 = r19
            r5 = r14
            r16 = r6
            r6 = r15
            com.mbridge.msdk.click.C6765a.m20557a((android.content.Context) r1, (com.mbridge.msdk.foundation.entity.CampaignEx) r2, (java.lang.String) r3, (java.lang.String) r4, (boolean) r5, (boolean) r6)     // Catch:{ all -> 0x0098 }
            goto L_0x0071
        L_0x006f:
            r16 = r6
        L_0x0071:
            int r6 = r16 + 1
            goto L_0x004e
        L_0x0074:
            m25514b(r17, r18, r19)     // Catch:{ all -> 0x0098 }
        L_0x0077:
            if (r0 == 0) goto L_0x0096
            boolean r1 = r17.isCallBackImpression()     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x0096
            if (r10 != 0) goto L_0x0093
            int r1 = r17.getType()     // Catch:{ Exception -> 0x0089 }
            r0.onLoggingImpression(r1)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0093
        L_0x0089:
            r0 = move-exception
            java.lang.String r1 = "NativeReportUtils"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0098 }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0098 }
        L_0x0093:
            r7.setCallBackImpression(r9)     // Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r8)
            return
        L_0x0098:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.p335d.C8838b.m25512a(com.mbridge.msdk.foundation.entity.CampaignEx, android.content.Context, java.lang.String, com.mbridge.msdk.mbnative.c.a):void");
    }

    /* renamed from: a */
    private static synchronized void m25511a(final CampaignEx campaignEx, final Context context, String str) {
        synchronized (C8838b.class) {
            C8388a.m23845e().mo56898a(context);
            if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
                C8498b.m24359a().execute(new Runnable() {
                    public final void run() {
                        try {
                            C8417j.m23986a((C8412f) C8414g.m23969a(context)).mo57032b(campaignEx.getId());
                        } catch (Exception unused) {
                            C8672v.m24878d("NativeReportUtils", "campain can't insert db");
                        }
                    }
                });
                C6765a.m20558a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, C6772a.f17856g);
            }
            if (!(TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().mo57769i() == null)) {
                C6765a.m20559a(context, campaignEx, str, campaignEx.getNativeVideoTracking().mo57769i(), false, false);
            }
        }
    }

    /* renamed from: b */
    private static synchronized void m25514b(CampaignEx campaignEx, Context context, String str) {
        synchronized (C8838b.class) {
            if (campaignEx != null) {
                try {
                    List<String> pv_urls = campaignEx.getPv_urls();
                    if (pv_urls != null && pv_urls.size() > 0) {
                        for (String a : pv_urls) {
                            C6765a.m20557a(context, campaignEx, str, a, false, true);
                        }
                    }
                } catch (Throwable th) {
                    C8672v.m24874a("NativeReportUtils", th.getMessage());
                }
            }
        }
        return;
    }

    /* renamed from: a */
    private static synchronized void m25513a(CampaignEx campaignEx, Context context, String str, C8801a aVar, boolean z) {
        synchronized (C8838b.class) {
            if (!TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && NativeController.f21626c != null && !NativeController.f21626c.containsKey(campaignEx.getOnlyImpressionURL())) {
                if (!(!z || aVar == null || campaignEx == null)) {
                    try {
                        aVar.onLoggingImpression(campaignEx.getAdType());
                    } catch (Exception e) {
                        Log.e("NativeReportUtils", e.getMessage());
                    }
                }
                NativeController.f21626c.put(campaignEx.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                C6765a.m20558a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, C6772a.f17857h);
            }
        }
    }

    /* renamed from: a */
    private static List<String> m25510a(CampaignEx campaignEx) {
        ArrayList arrayList = new ArrayList();
        if (campaignEx == null) {
            return arrayList;
        }
        String ad_url_list = campaignEx.getAd_url_list();
        if (TextUtils.isEmpty(ad_url_list)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(ad_url_list);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add((String) jSONArray.get(i));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
