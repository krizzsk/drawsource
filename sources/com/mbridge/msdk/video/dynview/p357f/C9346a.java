package com.mbridge.msdk.video.dynview.p357f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;

/* renamed from: com.mbridge.msdk.video.dynview.f.a */
/* compiled from: MOfferReport */
public class C9346a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f22958a = C9346a.class.getName();

    /* renamed from: a */
    public static void m26646a(CampaignEx campaignEx, Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000091&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    if (!TextUtils.isEmpty(C8469a.f20750k)) {
                        stringBuffer.append("b=" + C8469a.f20750k + "&");
                    }
                    if (!TextUtils.isEmpty(C8469a.f20751l)) {
                        stringBuffer.append("c=" + C8469a.f20751l + "&");
                    }
                    stringBuffer.append("hb=0&");
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str3);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("reason=" + str);
                    if (!(campaignEx == null || campaignEx.getRewardTemplateMode() == null)) {
                        stringBuffer.append("&view=");
                        stringBuffer.append(C8677z.m24955l(campaignEx.getRewardTemplateMode().mo57576e()));
                    }
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                        return;
                    }
                    String stringBuffer2 = stringBuffer.toString();
                    if (context != null && !TextUtils.isEmpty(stringBuffer2)) {
                        new C8596a(context).mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24660a(stringBuffer2, context), new C8597b() {
                            /* renamed from: a */
                            public final void mo37053a(String str) {
                                C8672v.m24878d(C9346a.f22958a, str);
                            }

                            /* renamed from: b */
                            public final void mo37054b(String str) {
                                C8672v.m24878d(C9346a.f22958a, str);
                            }
                        });
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                C8672v.m24878d(f22958a, e.getMessage());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26647a(com.mbridge.msdk.foundation.entity.CampaignUnit r9, int r10, int r11, java.lang.String r12) {
        /*
            if (r9 == 0) goto L_0x009f
            java.util.ArrayList r0 = r9.getAds()
            if (r0 == 0) goto L_0x009f
            java.util.ArrayList r0 = r9.getAds()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x009f
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L_0x009f
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            java.lang.String r0 = r0.getendcard_url()
            java.lang.String r1 = "mof_testuid"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8617ae.m24720a(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x004a
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            java.lang.String r0 = r0.getendcard_url()
            java.lang.String r1 = "mof_uid"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8617ae.m24720a(r0, r1)
        L_0x004a:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0052
            r4 = r12
            goto L_0x0053
        L_0x0052:
            r4 = r0
        L_0x0053:
            r12 = 0
            if (r11 == 0) goto L_0x006f
            r0 = 1
            if (r11 == r0) goto L_0x005e
            java.lang.String r11 = ""
            r5 = r11
            r8 = r12
            goto L_0x0081
        L_0x005e:
            int r11 = com.mbridge.msdk.click.p217a.C6772a.f17857h
            java.util.ArrayList r12 = r9.getAds()
            java.lang.Object r12 = r12.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = (com.mbridge.msdk.foundation.entity.CampaignEx) r12
            java.lang.String r12 = r12.getOnlyImpressionURL()
            goto L_0x007f
        L_0x006f:
            int r11 = com.mbridge.msdk.click.p217a.C6772a.f17856g
            java.util.ArrayList r12 = r9.getAds()
            java.lang.Object r12 = r12.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = (com.mbridge.msdk.foundation.entity.CampaignEx) r12
            java.lang.String r12 = r12.getImpressionURL()
        L_0x007f:
            r8 = r11
            r5 = r12
        L_0x0081:
            r6 = 0
            r7 = 1
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x009f
            com.mbridge.msdk.foundation.controller.a r11 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r2 = r11.mo56913g()
            java.util.ArrayList r9 = r9.getAds()
            java.lang.Object r9 = r9.get(r10)
            r3 = r9
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            com.mbridge.msdk.click.C6765a.m20558a(r2, r3, r4, r5, r6, r7, r8)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.p357f.C9346a.m26647a(com.mbridge.msdk.foundation.entity.CampaignUnit, int, int, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m26645a(Context context, CampaignEx campaignEx, String str) {
        if (context != null && campaignEx != null) {
            if (!(campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().mo57761e() == null)) {
                C6765a.m20559a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57761e(), false, false);
            }
            new C6765a(context, str).mo37041a(campaignEx);
        }
    }
}
