package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.ms */
public final class C10265ms implements C10255mj {

    /* renamed from: a */
    private final Class<?> f25606a;

    /* renamed from: b */
    private final String f25607b;

    public C10265ms(Class<?> cls, String str) {
        C10263mq.m29882b(cls, "jClass");
        C10263mq.m29882b(str, "moduleName");
        this.f25606a = cls;
        this.f25607b = str;
    }

    /* renamed from: a */
    public final Class<?> mo65136a() {
        return this.f25606a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10265ms) && C10263mq.m29881a((Object) mo65136a(), (Object) ((C10265ms) obj).mo65136a());
    }

    public final int hashCode() {
        return mo65136a().hashCode();
    }

    public final String toString() {
        return mo65136a().toString() + " (Kotlin reflection is not available)";
    }
}
