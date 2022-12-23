package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.G4 */
final class C10421G4 extends ContinuationImpl {

    /* renamed from: a */
    C10435I4 f25818a;

    /* renamed from: b */
    /* synthetic */ Object f25819b;

    /* renamed from: c */
    final /* synthetic */ C10435I4 f25820c;

    /* renamed from: d */
    int f25821d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10421G4(C10435I4 i4, Continuation continuation) {
        super(continuation);
        this.f25820c = i4;
    }

    public final Object invokeSuspend(Object obj) {
        this.f25819b = obj;
        this.f25821d |= Integer.MIN_VALUE;
        return this.f25820c.mo65339a((C10498R5) null, (Continuation) this);
    }
}
