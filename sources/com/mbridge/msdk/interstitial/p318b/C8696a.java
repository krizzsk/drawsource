package com.mbridge.msdk.interstitial.p318b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8410e;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.interstitial.b.a */
/* compiled from: InterstitialCamapignCache */
public class C8696a {

    /* renamed from: a */
    private static final String f21328a = C8696a.class.getName();

    /* renamed from: c */
    private static C8696a f21329c = null;

    /* renamed from: b */
    private C8410e f21330b;

    private C8696a() {
        try {
            Context g = C8388a.m23845e().mo56913g();
            if (g != null) {
                this.f21330b = C8410e.m23925a((C8412f) C8414g.m23969a(g));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C8696a m25003a() {
        C8696a aVar;
        synchronized (C8696a.class) {
            if (f21329c == null) {
                f21329c = new C8696a();
            }
            aVar = f21329c;
        }
        return aVar;
    }

    /* renamed from: a */
    public final List<CampaignEx> mo58212a(String str, int i) {
        List<CampaignEx> a;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (a = this.f21330b.mo56981a(str, i, 0, 1)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx add : a) {
                    arrayList2.add(add);
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo58214a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    this.f21330b.mo56990a(campaignEx.getId(), str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo58215a(List<CampaignEx> list, String str) {
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx a : list) {
                mo58214a(a, str);
            }
        }
    }

    /* renamed from: b */
    public final void mo58216b(CampaignEx campaignEx, String str) {
        try {
            if (this.f21330b != null && campaignEx != null && !TextUtils.isEmpty(str)) {
                this.f21330b.mo56980a(campaignEx, str, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void mo58213a(long j, String str) {
        try {
            if (!(this.f21330b == null || j == 0 || TextUtils.isEmpty(str))) {
                this.f21330b.mo57003b(j, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C8672v.m24878d(f21328a, e.getMessage());
        }
        return;
    }
}
