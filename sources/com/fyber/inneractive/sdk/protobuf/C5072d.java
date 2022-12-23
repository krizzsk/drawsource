package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.d */
public final class C5072d {

    /* renamed from: a */
    public static final Class<?> f13533a;

    /* renamed from: b */
    public static final boolean f13534b;

    /* renamed from: a */
    public static boolean m15287a() {
        return f13533a != null && !f13534b;
    }

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f13533a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f13534b = cls2 != null;
    }
}
