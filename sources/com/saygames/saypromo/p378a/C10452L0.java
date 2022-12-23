package com.saygames.saypromo.p378a;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.saygames.saypromo.a.L0 */
public final class C10452L0 implements C10438J0 {

    /* renamed from: a */
    final /* synthetic */ Context f25879a;

    C10452L0(Context context) {
        this.f25879a = context;
    }

    /* renamed from: a */
    public final C10445K0 mo65350a() {
        return new C10445K0(AdvertisingIdClient.getAdvertisingIdInfo(this.f25879a));
    }
}
