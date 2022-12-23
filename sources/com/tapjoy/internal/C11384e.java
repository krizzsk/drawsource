package com.tapjoy.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* renamed from: com.tapjoy.internal.e */
public final class C11384e {

    /* renamed from: a */
    public String f27182a;

    /* renamed from: b */
    public String f27183b;

    /* renamed from: c */
    public String f27184c;

    /* renamed from: d */
    public long f27185d;

    /* renamed from: e */
    public int f27186e;

    /* renamed from: f */
    public String f27187f;

    /* renamed from: g */
    public String f27188g;

    public C11384e(String str) {
        C11296bh b = C11296bh.m30911b(str);
        b.mo69722h();
        while (b.mo69724j()) {
            String l = b.mo69726l();
            if ("orderId".equals(l)) {
                this.f27182a = b.mo69727m();
            } else if ("packageName".equals(l)) {
                this.f27183b = b.mo69727m();
            } else if (InAppPurchaseMetaData.KEY_PRODUCT_ID.equals(l)) {
                this.f27184c = b.mo69727m();
            } else if ("purchaseTime".equals(l)) {
                this.f27185d = b.mo69731q();
            } else if ("purchaseState".equals(l)) {
                this.f27186e = b.mo69732r();
            } else if (SDKConstants.PARAM_DEVELOPER_PAYLOAD.equals(l)) {
                this.f27187f = b.mo69727m();
            } else if (SDKConstants.PARAM_PURCHASE_TOKEN.equals(l)) {
                this.f27188g = b.mo69727m();
            } else {
                b.mo69733s();
            }
        }
        b.mo69723i();
    }
}
