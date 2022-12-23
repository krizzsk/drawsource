package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.f */
/* compiled from: Exceptions.kt */
public class C9774f {
    /* renamed from: a */
    public static boolean m28234a(String str) {
        C9717ai.m28145b(str, "className");
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
