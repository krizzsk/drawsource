package com.ogury.p376cm.internal;

import com.ogury.p376cm.internal.aaaca;

/* renamed from: com.ogury.cm.internal.bbacc */
public final class bbacc {

    /* renamed from: a */
    private static final bbabb f24529a;

    /* renamed from: b */
    private static final aaaca.aaaaa[] f24530b = new aaaca.aaaaa[0];

    static {
        bbabb bbabb = null;
        try {
            bbabb = (bbabb) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (bbabb == null) {
            bbabb = new bbabb();
        }
        f24529a = bbabb;
    }

    /* renamed from: a */
    public static String m28054a(bbaca bbaca) {
        String obj = bbaca.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
