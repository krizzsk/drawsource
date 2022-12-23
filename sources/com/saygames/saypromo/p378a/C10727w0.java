package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.w0 */
final class C10727w0 extends ContinuationImpl {

    /* renamed from: a */
    /* synthetic */ Object f26356a;

    /* renamed from: b */
    final /* synthetic */ C10741y0 f26357b;

    /* renamed from: c */
    int f26358c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10727w0(C10741y0 y0Var, Continuation continuation) {
        super(continuation);
        this.f26357b = y0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26356a = obj;
        this.f26358c |= Integer.MIN_VALUE;
        return this.f26357b.m30588a((String) null, (Continuation) this);
    }
}
