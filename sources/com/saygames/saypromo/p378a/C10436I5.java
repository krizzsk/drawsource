package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.I5 */
final class C10436I5 extends ContinuationImpl {

    /* renamed from: a */
    C10443J5 f25851a;

    /* renamed from: b */
    String f25852b;

    /* renamed from: c */
    String f25853c;

    /* renamed from: d */
    C10473O0 f25854d;

    /* renamed from: e */
    /* synthetic */ Object f25855e;

    /* renamed from: f */
    final /* synthetic */ C10443J5 f25856f;

    /* renamed from: g */
    int f25857g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10436I5(C10443J5 j5, Continuation continuation) {
        super(continuation);
        this.f25856f = j5;
    }

    public final Object invokeSuspend(Object obj) {
        this.f25855e = obj;
        this.f25857g |= Integer.MIN_VALUE;
        return this.f25856f.mo65345a((String) null, (String) null, this);
    }
}
