package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.m */
public final class C4816m {

    /* renamed from: d */
    public static final C4816m f12777d = new C4816m(1.0f, 1.0f);

    /* renamed from: a */
    public final float f12778a;

    /* renamed from: b */
    public final float f12779b;

    /* renamed from: c */
    public final int f12780c;

    public C4816m(float f, float f2) {
        this.f12778a = f;
        this.f12779b = f2;
        this.f12780c = Math.round(f * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4816m.class != obj.getClass()) {
            return false;
        }
        C4816m mVar = (C4816m) obj;
        if (this.f12778a == mVar.f12778a && this.f12779b == mVar.f12779b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.f12778a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.f12779b);
    }
}
