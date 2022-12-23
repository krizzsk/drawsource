package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.ne */
class C10278ne extends C10277nd {
    /* renamed from: a */
    public static final int m29907a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
