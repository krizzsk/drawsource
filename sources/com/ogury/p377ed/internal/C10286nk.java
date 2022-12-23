package com.ogury.p377ed.internal;

import com.ogury.p377ed.internal.C10282nh;

/* renamed from: com.ogury.ed.internal.nk */
class C10286nk extends C10285nj {
    /* renamed from: a */
    public static final int m29919a(int i) {
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    public static final int m29921b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: a */
    public static final C10282nh m29920a(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C10282nh(i, i2 - 1);
        }
        C10282nh.C10283a aVar = C10282nh.f25619b;
        return C10282nh.C10283a.m29918a();
    }

    /* renamed from: c */
    public static final int m29922c(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i2 + " is less than minimum 0.");
        } else if (i < 0) {
            return 0;
        } else {
            return i > i2 ? i2 : i;
        }
    }
}
