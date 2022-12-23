package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.gt */
public final class C11535gt {
    /* renamed from: a */
    private static <X extends Throwable> void m31575a(Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            try {
                throw ((Throwable) cls.cast(th));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private static void m31576b(Throwable th) {
        m31575a(th, Error.class);
        m31575a(th, RuntimeException.class);
    }

    /* renamed from: a */
    public static RuntimeException m31574a(Throwable th) {
        m31576b((Throwable) C11533gr.m31570a(th));
        throw new RuntimeException(th);
    }
}
