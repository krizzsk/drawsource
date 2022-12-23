package com.mbridge.msdk.mbnative.p335d;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8466k;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8420m;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;

/* renamed from: com.mbridge.msdk.mbnative.d.a */
/* compiled from: NativeReport */
public final class C8835a {
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0148 A[Catch:{ Exception -> 0x017e, all -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0154 A[Catch:{ Exception -> 0x017e, all -> 0x018c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m25505a(final android.content.Context r9, java.util.List<com.mbridge.msdk.out.Campaign> r10, java.lang.String r11) {
        /*
            if (r9 == 0) goto L_0x0190
            if (r10 == 0) goto L_0x0190
            int r0 = r10.size()     // Catch:{ all -> 0x018c }
            if (r0 <= 0) goto L_0x0190
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x0190
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ all -> 0x018c }
            r0.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r1 = "key=2000048&"
            r0.append(r1)     // Catch:{ all -> 0x018c }
            r1 = 0
            java.lang.String r2 = "&"
            if (r10 == 0) goto L_0x0046
            int r3 = r10.size()     // Catch:{ all -> 0x018c }
            if (r3 <= 0) goto L_0x0046
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r3.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r4 = "cid="
            r3.append(r4)     // Catch:{ all -> 0x018c }
            java.lang.Object r4 = r10.get(r1)     // Catch:{ all -> 0x018c }
            com.mbridge.msdk.out.Campaign r4 = (com.mbridge.msdk.out.Campaign) r4     // Catch:{ all -> 0x018c }
            java.lang.String r4 = r4.getId()     // Catch:{ all -> 0x018c }
            r3.append(r4)     // Catch:{ all -> 0x018c }
            r3.append(r2)     // Catch:{ all -> 0x018c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x018c }
            r0.append(r3)     // Catch:{ all -> 0x018c }
        L_0x0046:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r3.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r4 = "network_type="
            r3.append(r4)     // Catch:{ all -> 0x018c }
            int r4 = com.mbridge.msdk.foundation.tools.C8660r.m24840o(r9)     // Catch:{ all -> 0x018c }
            r3.append(r4)     // Catch:{ all -> 0x018c }
            r3.append(r2)     // Catch:{ all -> 0x018c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x018c }
            r0.append(r3)     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r3.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r4 = "unit_id="
            r3.append(r4)     // Catch:{ all -> 0x018c }
            r3.append(r11)     // Catch:{ all -> 0x018c }
            r3.append(r2)     // Catch:{ all -> 0x018c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x018c }
            r0.append(r3)     // Catch:{ all -> 0x018c }
            java.lang.String r3 = "rid_n="
            java.lang.String r4 = "rid="
            java.lang.String r5 = "rtins_type="
            java.lang.String r6 = "hb="
            r7 = 1
            if (r10 == 0) goto L_0x00e1
            int r8 = r10.size()     // Catch:{ all -> 0x018c }
            if (r8 <= r7) goto L_0x00e1
            java.lang.Object r10 = r10.get(r1)     // Catch:{ all -> 0x018c }
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10     // Catch:{ all -> 0x018c }
            boolean r8 = r10.isBidCampaign()     // Catch:{ all -> 0x018c }
            if (r8 == 0) goto L_0x009e
            r0.append(r6)     // Catch:{ all -> 0x018c }
            r0.append(r7)     // Catch:{ all -> 0x018c }
            r0.append(r2)     // Catch:{ all -> 0x018c }
        L_0x009e:
            boolean r6 = com.mbridge.msdk.foundation.tools.C8677z.m24930b((com.mbridge.msdk.foundation.entity.CampaignEx) r10)     // Catch:{ all -> 0x018c }
            if (r6 == 0) goto L_0x00b1
            r0.append(r5)     // Catch:{ all -> 0x018c }
            int r5 = r10.getRtinsType()     // Catch:{ all -> 0x018c }
            r0.append(r5)     // Catch:{ all -> 0x018c }
            r0.append(r2)     // Catch:{ all -> 0x018c }
        L_0x00b1:
            java.lang.String r5 = r10.getRequestId()     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r6.<init>()     // Catch:{ all -> 0x018c }
            r6.append(r4)     // Catch:{ all -> 0x018c }
            r6.append(r5)     // Catch:{ all -> 0x018c }
            r6.append(r2)     // Catch:{ all -> 0x018c }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x018c }
            r0.append(r2)     // Catch:{ all -> 0x018c }
            java.lang.String r10 = r10.getRequestIdNotice()     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r2.<init>()     // Catch:{ all -> 0x018c }
            r2.append(r3)     // Catch:{ all -> 0x018c }
            r2.append(r10)     // Catch:{ all -> 0x018c }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x018c }
            r0.append(r10)     // Catch:{ all -> 0x018c }
            goto L_0x013e
        L_0x00e1:
            int r8 = r10.size()     // Catch:{ all -> 0x018c }
            if (r8 != r7) goto L_0x013e
            java.lang.Object r10 = r10.get(r1)     // Catch:{ all -> 0x018c }
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10     // Catch:{ all -> 0x018c }
            boolean r8 = r10.isBidCampaign()     // Catch:{ all -> 0x018c }
            if (r8 == 0) goto L_0x00fc
            r0.append(r6)     // Catch:{ all -> 0x018c }
            r0.append(r7)     // Catch:{ all -> 0x018c }
            r0.append(r2)     // Catch:{ all -> 0x018c }
        L_0x00fc:
            boolean r6 = com.mbridge.msdk.foundation.tools.C8677z.m24930b((com.mbridge.msdk.foundation.entity.CampaignEx) r10)     // Catch:{ all -> 0x018c }
            if (r6 == 0) goto L_0x010f
            r0.append(r5)     // Catch:{ all -> 0x018c }
            int r5 = r10.getRtinsType()     // Catch:{ all -> 0x018c }
            r0.append(r5)     // Catch:{ all -> 0x018c }
            r0.append(r2)     // Catch:{ all -> 0x018c }
        L_0x010f:
            java.lang.String r5 = r10.getRequestId()     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r6.<init>()     // Catch:{ all -> 0x018c }
            r6.append(r4)     // Catch:{ all -> 0x018c }
            r6.append(r5)     // Catch:{ all -> 0x018c }
            r6.append(r2)     // Catch:{ all -> 0x018c }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x018c }
            r0.append(r2)     // Catch:{ all -> 0x018c }
            java.lang.String r10 = r10.getRequestIdNotice()     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r2.<init>()     // Catch:{ all -> 0x018c }
            r2.append(r3)     // Catch:{ all -> 0x018c }
            r2.append(r10)     // Catch:{ all -> 0x018c }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x018c }
            r0.append(r10)     // Catch:{ all -> 0x018c }
        L_0x013e:
            com.mbridge.msdk.foundation.same.report.b r10 = com.mbridge.msdk.foundation.same.report.C8574b.m24577a()     // Catch:{ all -> 0x018c }
            boolean r10 = r10.mo58054c()     // Catch:{ all -> 0x018c }
            if (r10 == 0) goto L_0x0154
            com.mbridge.msdk.foundation.same.report.b r9 = com.mbridge.msdk.foundation.same.report.C8574b.m24577a()     // Catch:{ all -> 0x018c }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x018c }
            r9.mo58052a((java.lang.String) r10)     // Catch:{ all -> 0x018c }
            goto L_0x0190
        L_0x0154:
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x018c }
            if (r9 == 0) goto L_0x0190
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x0190
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x0190
            com.mbridge.msdk.foundation.same.report.d.a r0 = new com.mbridge.msdk.foundation.same.report.d.a     // Catch:{ Exception -> 0x017e }
            r0.<init>(r9)     // Catch:{ Exception -> 0x017e }
            com.mbridge.msdk.foundation.same.net.g.d r11 = com.mbridge.msdk.foundation.same.report.C8598e.m24661a((java.lang.String) r10, (android.content.Context) r9, (java.lang.String) r11)     // Catch:{ Exception -> 0x017e }
            com.mbridge.msdk.foundation.same.net.f.d r2 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x017e }
            java.lang.String r2 = r2.f20952a     // Catch:{ Exception -> 0x017e }
            com.mbridge.msdk.mbnative.d.a$1 r3 = new com.mbridge.msdk.mbnative.d.a$1     // Catch:{ Exception -> 0x017e }
            r3.<init>(r10, r9)     // Catch:{ Exception -> 0x017e }
            r0.mo57978c(r1, r2, r11, r3)     // Catch:{ Exception -> 0x017e }
            goto L_0x0190
        L_0x017e:
            r9 = move-exception
            r9.printStackTrace()     // Catch:{ all -> 0x018c }
            java.lang.String r10 = "NativeReport"
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x018c }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r10, r9)     // Catch:{ all -> 0x018c }
            goto L_0x0190
        L_0x018c:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.p335d.C8835a.m25505a(android.content.Context, java.util.List, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m25504a(final Context context, String str, String str2, boolean z) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000047&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
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
                    if (!TextUtils.isEmpty(C8469a.f20750k)) {
                        stringBuffer.append("b=" + C8469a.f20750k + "&");
                    }
                    if (!TextUtils.isEmpty(C8469a.f20751l)) {
                        stringBuffer.append("c=" + C8469a.f20751l + "&");
                    }
                    if (z) {
                        stringBuffer.append("hb=1&");
                    }
                    stringBuffer.append("reason=" + str);
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                        return;
                    }
                    final String stringBuffer2 = stringBuffer.toString();
                    if (context != null && !TextUtils.isEmpty(stringBuffer2)) {
                        new C8596a(context).mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24660a(stringBuffer2, context), new C8597b() {
                            /* renamed from: a */
                            public final void mo37053a(String str) {
                                C8672v.m24878d("NativeReport", str);
                            }

                            /* renamed from: b */
                            public final void mo37054b(String str) {
                                C8466k kVar = new C8466k();
                                kVar.mo57800c(stringBuffer2);
                                kVar.mo57795a(System.currentTimeMillis());
                                kVar.mo57794a(0);
                                kVar.mo57798b(ShareTarget.METHOD_POST);
                                kVar.mo57796a(C8543d.m24463a().f20952a);
                                C8420m.m24001a((C8412f) C8414g.m23969a(context)).mo57042a(kVar);
                                C8672v.m24878d("NativeReport", str);
                            }
                        });
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                C8672v.m24878d("NativeReport", e.getMessage());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
