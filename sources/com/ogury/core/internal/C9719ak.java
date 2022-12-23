package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.ak */
/* compiled from: Reflection */
public final class C9719ak {

    /* renamed from: a */
    private static final C9716ah f24599a;

    static {
        C9716ah ahVar = null;
        try {
            ahVar = (C9716ah) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ahVar == null) {
            ahVar = new C9716ah();
        }
        f24599a = ahVar;
    }

    /* renamed from: a */
    public static String m28146a(C9718aj ajVar) {
        return f24599a.mo64060a(ajVar);
    }
}
