package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.o0 */
final class C10668o0 extends ContinuationImpl {

    /* renamed from: a */
    C10676p0 f26286a;

    /* renamed from: b */
    C10403E0 f26287b;

    /* renamed from: c */
    String f26288c;

    /* renamed from: d */
    /* synthetic */ Object f26289d;

    /* renamed from: e */
    final /* synthetic */ C10676p0 f26290e;

    /* renamed from: f */
    int f26291f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10668o0(C10676p0 p0Var, Continuation continuation) {
        super(continuation);
        this.f26290e = p0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26289d = obj;
        this.f26291f |= Integer.MIN_VALUE;
        return this.f26290e.mo65523a((C10403E0) null, (String) null, this);
    }
}
