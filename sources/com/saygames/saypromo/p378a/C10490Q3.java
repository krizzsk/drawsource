package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Buffer;
import okio.Sink;

/* renamed from: com.saygames.saypromo.a.Q3 */
final class C10490Q3 extends ContinuationImpl {

    /* renamed from: a */
    Buffer f25946a;

    /* renamed from: b */
    Sink f25947b;

    /* renamed from: c */
    long f25948c;

    /* renamed from: d */
    /* synthetic */ Object f25949d;

    /* renamed from: e */
    final /* synthetic */ C10496R3 f25950e;

    /* renamed from: f */
    int f25951f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10490Q3(C10496R3 r3, Continuation continuation) {
        super(continuation);
        this.f25950e = r3;
    }

    public final Object invokeSuspend(Object obj) {
        this.f25949d = obj;
        this.f25951f |= Integer.MIN_VALUE;
        return this.f25950e.m30237a((Buffer) null, 0, (Sink) null, this);
    }
}
