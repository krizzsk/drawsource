package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.lh */
public final class C10225lh {
    /* renamed from: b */
    private static final int m29853b(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: a */
    private static final int m29852a(int i, int i2, int i3) {
        return m29853b(m29853b(i, 1) - m29853b(i2, 1), 1);
    }

    /* renamed from: a */
    public static final int m29851a(int i, int i2) {
        return i >= i2 ? i2 : i2 - m29852a(i2, i, 1);
    }
}
