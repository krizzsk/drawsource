package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.B0 */
final class C10382B0 extends ContinuationImpl {

    /* renamed from: a */
    Object f25735a;

    /* renamed from: b */
    C10403E0 f25736b;

    /* renamed from: c */
    String f25737c;

    /* renamed from: d */
    /* synthetic */ Object f25738d;

    /* renamed from: e */
    final /* synthetic */ C10389C0 f25739e;

    /* renamed from: f */
    int f25740f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10382B0(C10389C0 c0, Continuation continuation) {
        super(continuation);
        this.f25739e = c0;
    }

    public final Object invokeSuspend(Object obj) {
        this.f25738d = obj;
        this.f25740f |= Integer.MIN_VALUE;
        return this.f25739e.mo65254a((C10403E0) null, (String) null, this);
    }
}
