package com.apm.insight.p026l;

/* renamed from: com.apm.insight.l.x */
public final class C1329x {
    /* renamed from: a */
    public static Thread m1994a(Runnable runnable, String str) {
        if (runnable == null) {
            return null;
        }
        Thread thread = str == null ? new Thread(runnable) : new Thread(runnable, str);
        thread.start();
        return thread;
    }
}
