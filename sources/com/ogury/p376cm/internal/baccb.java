package com.ogury.p376cm.internal;

/* renamed from: com.ogury.cm.internal.baccb */
public class baccb extends bacbc {
    /* renamed from: a */
    public final void mo63999a(Throwable th, Throwable th2) {
        bbabc.m28052b(th, "cause");
        bbabc.m28052b(th2, "exception");
        th.addSuppressed(th2);
    }
}
