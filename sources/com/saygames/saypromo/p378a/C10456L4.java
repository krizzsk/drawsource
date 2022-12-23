package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.L4 */
final class C10456L4 extends ContinuationImpl {

    /* renamed from: a */
    Object f25884a;

    /* renamed from: b */
    /* synthetic */ Object f25885b;

    /* renamed from: c */
    final /* synthetic */ C10470N4 f25886c;

    /* renamed from: d */
    int f25887d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10456L4(C10470N4 n4, Continuation continuation) {
        super(continuation);
        this.f25886c = n4;
    }

    public final Object invokeSuspend(Object obj) {
        this.f25885b = obj;
        this.f25887d |= Integer.MIN_VALUE;
        return this.f25886c.mo65358a((String) null, this);
    }
}
