package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.r3 */
final class C10695r3 extends ContinuationImpl {

    /* renamed from: a */
    C10498R5 f26322a;

    /* renamed from: b */
    /* synthetic */ Object f26323b;

    /* renamed from: c */
    final /* synthetic */ C10709t3 f26324c;

    /* renamed from: d */
    int f26325d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10695r3(C10709t3 t3Var, Continuation continuation) {
        super(continuation);
        this.f26324c = t3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26323b = obj;
        this.f26325d |= Integer.MIN_VALUE;
        return this.f26324c.mo65541b((C10498R5) null, this);
    }
}
