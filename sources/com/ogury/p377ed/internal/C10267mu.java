package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.mu */
public final class C10267mu {
    /* renamed from: a */
    public static C10290no m29893a(C10261mo moVar) {
        return moVar;
    }

    /* renamed from: a */
    public static C10289nn m29892a(Class cls, String str) {
        return new C10265ms(cls, str);
    }

    /* renamed from: a */
    public static C10288nm m29891a(Class cls) {
        return new C10256mk(cls);
    }

    /* renamed from: a */
    public static String m29895a(C10264mr mrVar) {
        return m29894a((C10260mn) mrVar);
    }

    /* renamed from: a */
    private static String m29894a(C10260mn mnVar) {
        String obj = mnVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
