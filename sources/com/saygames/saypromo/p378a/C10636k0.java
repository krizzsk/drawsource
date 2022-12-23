package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.k0 */
final class C10636k0 extends ContinuationImpl {

    /* renamed from: a */
    C10644l0 f26239a;

    /* renamed from: b */
    C10403E0 f26240b;

    /* renamed from: c */
    C10467N1 f26241c;

    /* renamed from: d */
    /* synthetic */ Object f26242d;

    /* renamed from: e */
    final /* synthetic */ C10644l0 f26243e;

    /* renamed from: f */
    int f26244f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10636k0(C10644l0 l0Var, Continuation continuation) {
        super(continuation);
        this.f26243e = l0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26242d = obj;
        this.f26244f |= Integer.MIN_VALUE;
        return this.f26243e.mo65492a((C10403E0) null, (C10467N1) null, this);
    }
}
