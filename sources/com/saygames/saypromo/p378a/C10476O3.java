package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Buffer;
import okio.Source;

/* renamed from: com.saygames.saypromo.a.O3 */
final class C10476O3 extends ContinuationImpl {

    /* renamed from: a */
    Buffer f25913a;

    /* renamed from: b */
    Source f25914b;

    /* renamed from: c */
    /* synthetic */ Object f25915c;

    /* renamed from: d */
    final /* synthetic */ C10496R3 f25916d;

    /* renamed from: e */
    int f25917e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10476O3(C10496R3 r3, Continuation continuation) {
        super(continuation);
        this.f25916d = r3;
    }

    public final Object invokeSuspend(Object obj) {
        this.f25915c = obj;
        this.f25917e |= Integer.MIN_VALUE;
        return this.f25916d.m30238a((Buffer) null, (Source) null, (Continuation) this);
    }
}
