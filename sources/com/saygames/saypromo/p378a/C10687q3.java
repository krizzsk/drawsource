package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.q3 */
final class C10687q3 extends ContinuationImpl {

    /* renamed from: a */
    /* synthetic */ Object f26314a;

    /* renamed from: b */
    final /* synthetic */ C10709t3 f26315b;

    /* renamed from: c */
    int f26316c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10687q3(C10709t3 t3Var, Continuation continuation) {
        super(continuation);
        this.f26315b = t3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26314a = obj;
        this.f26316c |= Integer.MIN_VALUE;
        return this.f26315b.mo65540a((C10498R5) null, this);
    }
}
