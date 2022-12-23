package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.mt */
public final class C10266mt {

    /* renamed from: a */
    private static final C10267mu f25608a;

    /* renamed from: b */
    private static final C10288nm[] f25609b = new C10288nm[0];

    static {
        C10267mu muVar = null;
        try {
            muVar = (C10267mu) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (muVar == null) {
            muVar = new C10267mu();
        }
        f25608a = muVar;
    }

    /* renamed from: a */
    public static C10289nn m29887a(Class cls) {
        return C10267mu.m29892a(cls, "");
    }

    /* renamed from: b */
    public static C10288nm m29890b(Class cls) {
        return C10267mu.m29891a(cls);
    }

    /* renamed from: a */
    public static String m29889a(C10264mr mrVar) {
        return C10267mu.m29895a(mrVar);
    }

    /* renamed from: a */
    public static C10290no m29888a(C10261mo moVar) {
        return C10267mu.m29893a(moVar);
    }
}
