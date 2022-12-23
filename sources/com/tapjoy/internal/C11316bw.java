package com.tapjoy.internal;

import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.bw */
public final class C11316bw<Result> implements Runnable {

    /* renamed from: a */
    private final C11314bu<Result> f27007a;
    @Nullable

    /* renamed from: b */
    private final C11319bz<Result> f27008b;

    protected C11316bw(C11314bu<Result> buVar, @Nullable C11319bz<Result> bzVar) {
        this.f27007a = buVar;
        this.f27008b = bzVar;
    }

    public final void run() {
        try {
            Result f = this.f27007a.mo69760f();
            C11319bz<Result> bzVar = this.f27008b;
            if (bzVar != null && !(bzVar instanceof C11321ca)) {
                bzVar.mo69764a(this.f27007a, f);
            }
        } catch (Throwable unused) {
            C11319bz<Result> bzVar2 = this.f27008b;
            if (bzVar2 != null && !(bzVar2 instanceof C11321ca)) {
                bzVar2.mo69763a(this.f27007a);
            }
        }
    }
}
