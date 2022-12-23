package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.x */
public final class C11690x {
    /* renamed from: a */
    public static <V> V m32062a(C11280av<V> avVar) {
        int i = 1;
        while (true) {
            try {
                return avVar.call();
            } catch (OutOfMemoryError e) {
                if (i < 10) {
                    System.gc();
                    i++;
                } else {
                    throw e;
                }
            }
        }
    }
}
