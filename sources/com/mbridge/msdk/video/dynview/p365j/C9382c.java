package com.mbridge.msdk.video.dynview.p365j;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8639i;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.video.dynview.C9317c;
import com.mbridge.msdk.video.dynview.p361i.C9365b;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.dynview.j.c */
/* compiled from: ViewOptionWrapper */
public final class C9382c {
    /* renamed from: a */
    private String m26746a(int i) {
        return i != 3 ? i != 302 ? i != 802 ? i != 904 ? "mbridge_reward_layer_floor" : "mbridge_reward_layer_floor_904" : "mbridge_reward_layer_floor_802" : "mbridge_reward_layer_floor_302" : "mbridge_reward_layer_floor_bottom";
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mbridge.msdk.video.dynview.C9317c mo62904a(android.content.Context r11, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r12) {
        /*
            r10 = this;
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x00bf }
            android.content.Context r1 = r1.mo56913g()     // Catch:{ Exception -> 0x00bf }
            int r1 = com.mbridge.msdk.foundation.tools.C8677z.m24947h((android.content.Context) r1)     // Catch:{ Exception -> 0x00bf }
            float r1 = (float) r1     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x00bf }
            android.content.Context r2 = r2.mo56913g()     // Catch:{ Exception -> 0x00bf }
            int r2 = com.mbridge.msdk.foundation.tools.C8677z.m24945g((android.content.Context) r2)     // Catch:{ Exception -> 0x00bf }
            float r2 = (float) r2     // Catch:{ Exception -> 0x00bf }
            int r3 = r12.size()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = ""
            r5 = 1
            r6 = 0
            if (r3 <= 0) goto L_0x005b
            java.lang.Object r3 = r12.get(r6)     // Catch:{ Exception -> 0x00bf }
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r12.get(r6)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3     // Catch:{ Exception -> 0x00bf }
            if (r3 == 0) goto L_0x0045
            com.mbridge.msdk.foundation.entity.CampaignEx$c r7 = r3.getRewardTemplateMode()     // Catch:{ Exception -> 0x00bf }
            if (r7 == 0) goto L_0x0045
            com.mbridge.msdk.foundation.entity.CampaignEx$c r3 = r3.getRewardTemplateMode()     // Catch:{ Exception -> 0x00bf }
            int r3 = r3.mo57574c()     // Catch:{ Exception -> 0x00bf }
            goto L_0x0046
        L_0x0045:
            r3 = r5
        L_0x0046:
            java.lang.Object r7 = r12.get(r6)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.foundation.entity.CampaignEx r7 = (com.mbridge.msdk.foundation.entity.CampaignEx) r7     // Catch:{ Exception -> 0x00bf }
            int r7 = r7.getMof_tplid()     // Catch:{ Exception -> 0x00bf }
            java.lang.Object r8 = r12.get(r6)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = (com.mbridge.msdk.foundation.entity.CampaignEx) r8     // Catch:{ Exception -> 0x00bf }
            java.lang.String r8 = r8.getMof_template_url()     // Catch:{ Exception -> 0x00bf }
            goto L_0x005e
        L_0x005b:
            r8 = r4
            r3 = r5
            r7 = r6
        L_0x005e:
            if (r7 == 0) goto L_0x0079
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x00bf }
            if (r9 != 0) goto L_0x0079
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bf }
            r9.<init>()     // Catch:{ Exception -> 0x00bf }
            r9.append(r7)     // Catch:{ Exception -> 0x00bf }
            r9.append(r4)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = com.mbridge.msdk.foundation.tools.C8639i.m24750a(r6, r4, r8)     // Catch:{ Exception -> 0x00bf }
        L_0x0079:
            java.lang.String r7 = "mbridge_same_choice_one_layout_landscape"
            java.lang.String r8 = "mbridge_same_choice_one_layout_portrait"
            r9 = 2
            if (r3 == r5) goto L_0x0094
            if (r3 == r9) goto L_0x0095
            android.content.res.Resources r3 = r11.getResources()     // Catch:{ Exception -> 0x00bf }
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch:{ Exception -> 0x00bf }
            int r3 = r3.orientation     // Catch:{ Exception -> 0x00bf }
            if (r3 != r9) goto L_0x008f
            r6 = r5
        L_0x008f:
            if (r6 == 0) goto L_0x0093
            r3 = r9
            goto L_0x0095
        L_0x0093:
            r3 = r5
        L_0x0094:
            r7 = r8
        L_0x0095:
            com.mbridge.msdk.video.dynview.c$a r6 = new com.mbridge.msdk.video.dynview.c$a     // Catch:{ Exception -> 0x00bf }
            r6.<init>()     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.video.dynview.c$b r11 = r6.mo62759a((android.content.Context) r11)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.video.dynview.c$b r11 = r11.mo62761a((java.lang.String) r7)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.video.dynview.c$b r11 = r11.mo62758a((int) r5)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.video.dynview.c$b r11 = r11.mo62757a((float) r2)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.video.dynview.c$b r11 = r11.mo62765b((float) r1)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.video.dynview.c$b r11 = r11.mo62762a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r12)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.video.dynview.c$b r11 = r11.mo62766b((int) r3)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.video.dynview.c$b r11 = r11.mo62767b((java.lang.String) r4)     // Catch:{ Exception -> 0x00bf }
            com.mbridge.msdk.video.dynview.c r11 = r11.mo62764a()     // Catch:{ Exception -> 0x00bf }
            return r11
        L_0x00bf:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()
            java.lang.String r12 = "ViewOptionWrapper"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.p365j.C9382c.mo62904a(android.content.Context, java.util.List):com.mbridge.msdk.video.dynview.c");
    }

    /* renamed from: a */
    public final C9317c mo62905a(View view, CampaignEx campaignEx) {
        boolean z;
        String str;
        String str2;
        String str3;
        if (campaignEx == null) {
            return null;
        }
        int i = 102;
        int i2 = 0;
        String str4 = "";
        if (campaignEx != null) {
            try {
                str3 = campaignEx.getCampaignUnitId();
                if (campaignEx.getRewardTemplateMode() != null) {
                    i = campaignEx.getRewardTemplateMode().mo57573b();
                    str2 = campaignEx.getRewardTemplateMode().mo57576e();
                } else {
                    str2 = str4;
                }
                str = m26746a(i);
                z = C9365b.m26703a(str2);
            } catch (Exception e) {
                C8672v.m24878d("ViewOptionWrapper", e.getMessage());
                return null;
            }
        } else {
            z = false;
            str3 = str4;
            str2 = str3;
            str = str2;
        }
        C9640c a = C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), str3, false);
        if (a != null) {
            i2 = a.mo63580g();
        }
        if (i != 0 && !TextUtils.isEmpty(str2)) {
            str4 = C8639i.m24750a(1, i + str4, str2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        return new C9317c.C9319a().mo62761a(str).mo62758a(i).mo62762a((List<CampaignEx>) arrayList).mo62759a(view.getContext()).mo62760a(view).mo62768c(i2).mo62766b(C8660r.m24819e(view.getContext())).mo62769d(i).mo62763a(z).mo62767b(str4).mo62770e(campaignEx.getDynamicTempCode()).mo62764a();
    }

    /* renamed from: b */
    public final C9317c mo62907b(View view, CampaignEx campaignEx) {
        String str;
        if (campaignEx == null) {
            return null;
        }
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getCampaignUnitId();
                str = m26746a(3);
            } catch (Exception e) {
                C8672v.m24878d("ViewOptionWrapper", e.getMessage());
                return null;
            }
        } else {
            str = str2;
        }
        int i = 0;
        C9640c a = C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), str2, false);
        if (a != null) {
            i = a.mo63580g();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        return new C9317c.C9319a().mo62761a(str).mo62758a(3).mo62762a((List<CampaignEx>) arrayList).mo62759a(view.getContext()).mo62760a(view).mo62768c(i).mo62766b(C8660r.m24819e(view.getContext())).mo62769d(3).mo62764a();
    }

    /* renamed from: a */
    public final C9317c mo62903a(Context context, CampaignEx campaignEx, int i) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String str = C8660r.m24819e(context) == 1 ? "mbridge_reward_end_card_layout_portrait" : "mbridge_reward_end_card_layout_landscape";
            String str2 = "";
            if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                str2 = C8639i.m24750a(2, i + str2, campaignEx.getendcard_url());
            }
            return new C9317c.C9319a().mo62761a(str).mo62758a(4).mo62759a(context).mo62766b(C8660r.m24819e(context)).mo62767b(str2).mo62770e(campaignEx.getDynamicTempCode()).mo62769d(i).mo62764a();
        } catch (Exception e) {
            C8672v.m24878d("ViewOptionWrapper", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final C9317c mo62906b(Context context, List<CampaignEx> list) {
        String str;
        int i;
        int i2;
        if (list == null || list.size() == 0) {
            return null;
        }
        try {
            float h = (float) C8677z.m24947h(C8388a.m23845e().mo56913g());
            float g = (float) C8677z.m24945g(C8388a.m23845e().mo56913g());
            String str2 = "";
            if (list.get(0) != null) {
                i2 = list.get(0).getDynamicTempCode();
                i = list.get(0).getMof_tplid();
                str = list.get(0).getMof_template_url();
            } else {
                i2 = 0;
                i = 0;
                str = str2;
            }
            if (i != 0 && !TextUtils.isEmpty(str)) {
                str2 = C8639i.m24750a(0, i + str2, str);
            }
            int e = C8660r.m24819e(context);
            return new C9317c.C9319a().mo62761a(e == 1 ? "mbridge_order_layout_list_portrait" : "mbridge_order_layout_list_landscape").mo62758a(5).mo62759a(context).mo62757a(g).mo62765b(h).mo62762a(list).mo62766b(e).mo62767b(str2).mo62770e(i2).mo62769d(i2).mo62764a();
        } catch (Exception e2) {
            C8672v.m24878d("ViewOptionWrapper", e2.getMessage());
            return null;
        }
    }
}
