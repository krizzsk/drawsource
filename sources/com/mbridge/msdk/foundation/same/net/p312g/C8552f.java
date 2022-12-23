package com.mbridge.msdk.foundation.same.net.p312g;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.f */
/* compiled from: HeaderBiddingRequest */
public class C8552f extends C8548b {
    public C8552f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo16280a(String str, C8550d dVar) {
        try {
            int e = C8677z.m24939e();
            String f = C8677z.m24943f();
            if (dVar != null) {
                dVar.mo57981a("misk_spt", String.valueOf(e));
                if (!TextUtils.isEmpty(f)) {
                    dVar.mo57981a("misk_spt_det", f);
                }
            }
        } catch (Exception e2) {
            C8672v.m24874a("CampaignRequest", e2.getMessage());
        } catch (Throwable th) {
            super.mo16280a(str, dVar);
            throw th;
        }
        super.mo16280a(str, dVar);
    }
}
