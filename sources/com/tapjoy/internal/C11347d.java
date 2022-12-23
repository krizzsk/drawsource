package com.tapjoy.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* renamed from: com.tapjoy.internal.d */
public final class C11347d {

    /* renamed from: a */
    public String f27092a;

    /* renamed from: b */
    public String f27093b;

    /* renamed from: c */
    public String f27094c;

    /* renamed from: d */
    public String f27095d;

    /* renamed from: e */
    public String f27096e;

    /* renamed from: f */
    public String f27097f;

    /* renamed from: g */
    public long f27098g;

    public C11347d(String str) {
        C11296bh b = C11296bh.m30911b(str);
        b.mo69722h();
        while (b.mo69724j()) {
            String l = b.mo69726l();
            if (InAppPurchaseMetaData.KEY_PRODUCT_ID.equals(l)) {
                this.f27092a = b.mo69727m();
            } else if ("type".equals(l)) {
                this.f27093b = b.mo69727m();
            } else if ("price".equals(l)) {
                this.f27094c = b.mo69727m();
            } else if ("title".equals(l)) {
                this.f27095d = b.mo69727m();
            } else if ("description".equals(l)) {
                this.f27096e = b.mo69727m();
            } else if ("price_currency_code".equals(l)) {
                this.f27097f = b.mo69727m();
            } else if ("price_amount_micros".equals(l)) {
                this.f27098g = b.mo69731q();
            } else {
                b.mo69733s();
            }
        }
        b.mo69723i();
    }
}
