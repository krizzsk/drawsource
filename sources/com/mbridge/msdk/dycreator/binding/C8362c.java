package com.mbridge.msdk.dycreator.binding;

/* renamed from: com.mbridge.msdk.dycreator.binding.c */
/* compiled from: ViewDataFactory */
public final class C8362c {

    /* renamed from: a */
    private static volatile C8362c f20370a;

    private C8362c() {
    }

    /* renamed from: a */
    public static C8362c m23795a() {
        if (f20370a == null) {
            synchronized (C8362c.class) {
                if (f20370a == null) {
                    f20370a = new C8362c();
                }
            }
        }
        return f20370a;
    }
}
