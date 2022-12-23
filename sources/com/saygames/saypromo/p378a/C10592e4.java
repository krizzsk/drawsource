package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.e4 */
final class C10592e4 extends ContinuationImpl {

    /* renamed from: a */
    C10632j4 f26107a;

    /* renamed from: b */
    Object f26108b;

    /* renamed from: c */
    boolean f26109c;

    /* renamed from: d */
    /* synthetic */ Object f26110d;

    /* renamed from: e */
    final /* synthetic */ C10632j4 f26111e;

    /* renamed from: f */
    int f26112f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10592e4(C10632j4 j4Var, Continuation continuation) {
        super(continuation);
        this.f26111e = j4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26110d = obj;
        this.f26112f |= Integer.MIN_VALUE;
        return this.f26111e.mo65488a((String) null, (Continuation) this);
    }
}
