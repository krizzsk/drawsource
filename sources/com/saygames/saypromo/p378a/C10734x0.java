package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.x0 */
final class C10734x0 extends ContinuationImpl {

    /* renamed from: a */
    /* synthetic */ Object f26364a;

    /* renamed from: b */
    final /* synthetic */ C10741y0 f26365b;

    /* renamed from: c */
    int f26366c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10734x0(C10741y0 y0Var, Continuation continuation) {
        super(continuation);
        this.f26365b = y0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26364a = obj;
        this.f26366c |= Integer.MIN_VALUE;
        return this.f26365b.mo65548b((String) null, this);
    }
}
