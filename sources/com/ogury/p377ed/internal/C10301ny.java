package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.ny */
class C10301ny extends C10300nx {
    /* renamed from: a */
    public static final boolean m29926a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
