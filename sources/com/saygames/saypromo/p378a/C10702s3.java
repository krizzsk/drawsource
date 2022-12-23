package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.BufferedSource;

/* renamed from: com.saygames.saypromo.a.s3 */
final class C10702s3 extends ContinuationImpl {

    /* renamed from: a */
    BufferedSource f26334a;

    /* renamed from: b */
    BufferedSource f26335b;

    /* renamed from: c */
    /* synthetic */ Object f26336c;

    /* renamed from: d */
    final /* synthetic */ C10709t3 f26337d;

    /* renamed from: e */
    int f26338e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10702s3(C10709t3 t3Var, Continuation continuation) {
        super(continuation);
        this.f26337d = t3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26336c = obj;
        this.f26338e |= Integer.MIN_VALUE;
        return this.f26337d.mo65542c((C10498R5) null, this);
    }
}
