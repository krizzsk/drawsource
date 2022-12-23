package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.P0 */
final class C10480P0 extends ContinuationImpl {

    /* renamed from: a */
    C10487Q0 f25919a;

    /* renamed from: b */
    /* synthetic */ Object f25920b;

    /* renamed from: c */
    final /* synthetic */ C10487Q0 f25921c;

    /* renamed from: d */
    int f25922d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10480P0(C10487Q0 q0, Continuation continuation) {
        super(continuation);
        this.f25921c = q0;
    }

    public final Object invokeSuspend(Object obj) {
        this.f25920b = obj;
        this.f25922d |= Integer.MIN_VALUE;
        return this.f25921c.mo65363a(this);
    }
}
