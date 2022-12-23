package com.saygames.saypromo.p378a;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.saygames.saypromo.a.K0 */
public final class C10445K0 {

    /* renamed from: a */
    private final boolean f25869a;

    /* renamed from: b */
    private final String f25870b;

    C10445K0(AdvertisingIdClient.Info info) {
        this.f25869a = info.isLimitAdTrackingEnabled();
        this.f25870b = info.getId();
    }

    /* renamed from: a */
    public final String mo65346a() {
        return this.f25870b;
    }

    /* renamed from: b */
    public final boolean mo65347b() {
        return this.f25869a;
    }
}
