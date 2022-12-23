package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.i4 */
final class C10624i4 extends ContinuationImpl {

    /* renamed from: a */
    C10422G5 f26205a;

    /* renamed from: b */
    /* synthetic */ Object f26206b;

    /* renamed from: c */
    final /* synthetic */ C10632j4 f26207c;

    /* renamed from: d */
    int f26208d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10624i4(C10632j4 j4Var, Continuation continuation) {
        super(continuation);
        this.f26207c = j4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26206b = obj;
        this.f26208d |= Integer.MIN_VALUE;
        return this.f26207c.mo65487a((C10422G5) null, (Continuation) this);
    }
}
