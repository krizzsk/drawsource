package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.w3 */
final class C10730w3 extends ContinuationImpl {

    /* renamed from: a */
    /* synthetic */ Object f26360a;

    /* renamed from: b */
    final /* synthetic */ C10744y3 f26361b;

    /* renamed from: c */
    int f26362c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10730w3(C10744y3 y3Var, Continuation continuation) {
        super(continuation);
        this.f26361b = y3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26360a = obj;
        this.f26362c |= Integer.MIN_VALUE;
        return this.f26361b.mo65549a((C10498R5) null, (Continuation) this);
    }
}
