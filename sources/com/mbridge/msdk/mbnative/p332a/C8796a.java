package com.mbridge.msdk.mbnative.p332a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8410e;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbnative.a.a */
/* compiled from: APICache */
public final class C8796a extends C8798b<String, List<Campaign>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8410e f21613a = C8410e.m23925a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));

    /* renamed from: b */
    private int f21614b;

    /* renamed from: a */
    public final /* synthetic */ Object mo58480a(Object obj, int i) {
        String str = (String) obj;
        List<CampaignEx> a = this.f21613a.mo56981a(str, i, 2, this.f21614b);
        if (a == null) {
            return null;
        }
        if (m25340a(a, 2)) {
            this.f21613a.mo56987a(str, 2, this.f21614b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        return arrayList;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo58481a(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            this.f21613a.mo56988a(str, 1, this.f21614b, false);
            this.f21613a.mo56988a(str, 2, this.f21614b, false);
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) list.get(i);
                campaignEx.setCacheLevel(1);
                this.f21613a.mo56980a(campaignEx, str, 1);
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo58482a(Object obj, Object obj2, String str) {
        final String str2 = (String) obj;
        final List list = (List) obj2;
        boolean z = !TextUtils.isEmpty(str);
        if (!TextUtils.isEmpty(str2) && list != null && list.size() > 0) {
            this.f21613a.mo56988a(str2, 1, this.f21614b, z);
            this.f21613a.mo56988a(str2, 2, this.f21614b, z);
            C8498b.m24359a().execute(new Runnable() {
                public final void run() {
                    for (int i = 0; i < list.size(); i++) {
                        CampaignEx campaignEx = (CampaignEx) list.get(i);
                        campaignEx.setCacheLevel(1);
                        C8796a.this.f21613a.mo56980a(campaignEx, str2, 1);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo58484b(Object obj, int i) {
        String str = (String) obj;
        List<CampaignEx> a = this.f21613a.mo56981a(str, i, 1, this.f21614b);
        if (a == null) {
            return null;
        }
        if (m25340a(a, 1)) {
            for (int i2 = 0; i2 < a.size(); i2++) {
                CampaignEx campaignEx = a.get(i2);
                campaignEx.setCacheLevel(2);
                this.f21613a.mo56980a(campaignEx, str, 1);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        return arrayList;
    }

    public C8796a(int i) {
        this.f21614b = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m25340a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0066
            int r1 = r11.size()
            if (r1 <= 0) goto L_0x0066
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object r11 = r11.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11
            long r3 = r11.getTimestamp()
            r5 = 0
            r7 = 1000(0x3e8, double:4.94E-321)
            r11 = 1
            if (r12 == r11) goto L_0x0041
            r9 = 2
            if (r12 == r9) goto L_0x0022
            goto L_0x0060
        L_0x0022:
            com.mbridge.msdk.c.b r12 = com.mbridge.msdk.p078c.C2445b.m6020a()
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r5 = r5.mo56914h()
            com.mbridge.msdk.c.a r12 = r12.mo16286b(r5)
            if (r12 != 0) goto L_0x003c
            com.mbridge.msdk.c.b r12 = com.mbridge.msdk.p078c.C2445b.m6020a()
            com.mbridge.msdk.c.a r12 = r12.mo16285b()
        L_0x003c:
            long r5 = r12.mo16156K()
            goto L_0x005f
        L_0x0041:
            com.mbridge.msdk.c.b r12 = com.mbridge.msdk.p078c.C2445b.m6020a()
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r5 = r5.mo56914h()
            com.mbridge.msdk.c.a r12 = r12.mo16286b(r5)
            if (r12 != 0) goto L_0x005b
            com.mbridge.msdk.c.b r12 = com.mbridge.msdk.p078c.C2445b.m6020a()
            com.mbridge.msdk.c.a r12 = r12.mo16285b()
        L_0x005b:
            long r5 = r12.mo16162Q()
        L_0x005f:
            long r5 = r5 * r7
        L_0x0060:
            long r1 = r1 - r3
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 <= 0) goto L_0x0066
            return r11
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.p332a.C8796a.m25340a(java.util.List, int):boolean");
    }

    /* renamed from: a */
    public final void mo58483a(String str, Campaign campaign, String str2) {
        boolean z = !TextUtils.isEmpty(str2);
        if (campaign != null && !TextUtils.isEmpty(str)) {
            try {
                CampaignEx campaignEx = (CampaignEx) campaign;
                if (this.f21613a.mo56999a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z)) {
                    this.f21613a.mo56991a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.f21614b, z);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
