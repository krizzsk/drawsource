package com.ironsource.mediationsdk.adunit.p209c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p209c.p211b.C6555a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.C6736c;
import java.util.List;

/* renamed from: com.ironsource.mediationsdk.adunit.c.a */
public final class C6550a {

    /* renamed from: a */
    IronSource.AD_UNIT f16942a;

    /* renamed from: b */
    String f16943b;

    /* renamed from: c */
    List<NetworkSettings> f16944c;

    /* renamed from: d */
    C6736c f16945d;

    /* renamed from: e */
    int f16946e;

    /* renamed from: f */
    int f16947f;

    /* renamed from: g */
    int f16948g;

    /* renamed from: h */
    C6555a f16949h;

    /* renamed from: i */
    int f16950i;

    public C6550a(IronSource.AD_UNIT ad_unit, String str, List<NetworkSettings> list, C6736c cVar, int i, int i2, int i3, int i4, C6555a aVar) {
        this.f16942a = ad_unit;
        this.f16943b = str;
        this.f16944c = list;
        this.f16945d = cVar;
        this.f16946e = i;
        this.f16948g = i2;
        this.f16947f = i3;
        this.f16949h = aVar;
        this.f16950i = i4;
    }

    /* renamed from: a */
    public final NetworkSettings mo36491a(String str) {
        for (NetworkSettings next : this.f16944c) {
            if (next.getProviderInstanceName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo36492a() {
        return this.f16945d.f17573f > 0;
    }
}
