package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;

/* renamed from: com.ironsource.mediationsdk.utils.a */
public final class C6734a {

    /* renamed from: a */
    private boolean f17561a = false;

    /* renamed from: b */
    private boolean f17562b = false;

    /* renamed from: c */
    private boolean f17563c = false;

    /* renamed from: a */
    public final void mo36957a(IronSource.AD_UNIT ad_unit, boolean z) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f17561a = z;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f17562b = z;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f17563c = z;
        }
    }

    /* renamed from: a */
    public final boolean mo36958a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f17561a;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f17562b;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f17563c;
        }
        return false;
    }
}
