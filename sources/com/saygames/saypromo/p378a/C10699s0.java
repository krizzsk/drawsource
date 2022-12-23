package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.s0 */
final class C10699s0 extends ContinuationImpl {

    /* renamed from: a */
    C10706t0 f26327a;

    /* renamed from: b */
    C10580d0 f26328b;

    /* renamed from: c */
    String f26329c;

    /* renamed from: d */
    /* synthetic */ Object f26330d;

    /* renamed from: e */
    final /* synthetic */ C10706t0 f26331e;

    /* renamed from: f */
    int f26332f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10699s0(C10706t0 t0Var, Continuation continuation) {
        super(continuation);
        this.f26331e = t0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26330d = obj;
        this.f26332f |= Integer.MIN_VALUE;
        return this.f26331e.mo65539a((C10580d0) null, (String) null, this);
    }
}
