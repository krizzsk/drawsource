package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.x3 */
final class C10737x3 extends ContinuationImpl {

    /* renamed from: a */
    /* synthetic */ Object f26368a;

    /* renamed from: b */
    final /* synthetic */ C10744y3 f26369b;

    /* renamed from: c */
    int f26370c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10737x3(C10744y3 y3Var, Continuation continuation) {
        super(continuation);
        this.f26369b = y3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26368a = obj;
        this.f26370c |= Integer.MIN_VALUE;
        return this.f26369b.m30592b((C10498R5) null, this);
    }
}
