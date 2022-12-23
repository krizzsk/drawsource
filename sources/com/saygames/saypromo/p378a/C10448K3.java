package com.saygames.saypromo.p378a;

import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.K3 */
final class C10448K3 extends ContinuationImpl {

    /* renamed from: a */
    File f25874a;

    /* renamed from: b */
    /* synthetic */ Object f25875b;

    /* renamed from: c */
    final /* synthetic */ C10455L3 f25876c;

    /* renamed from: d */
    int f25877d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10448K3(C10455L3 l3, Continuation continuation) {
        super(continuation);
        this.f25876c = l3;
    }

    public final Object invokeSuspend(Object obj) {
        this.f25875b = obj;
        this.f25877d |= Integer.MIN_VALUE;
        return this.f25876c.mo65352a((File) null, this);
    }
}
