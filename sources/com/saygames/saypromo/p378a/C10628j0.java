package com.saygames.saypromo.p378a;

import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.j0 */
final class C10628j0 extends ContinuationImpl {

    /* renamed from: a */
    Object f26220a;

    /* renamed from: b */
    File f26221b;

    /* renamed from: c */
    /* synthetic */ Object f26222c;

    /* renamed from: d */
    final /* synthetic */ C10644l0 f26223d;

    /* renamed from: e */
    int f26224e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10628j0(C10644l0 l0Var, Continuation continuation) {
        super(continuation);
        this.f26223d = l0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26222c = obj;
        this.f26224e |= Integer.MIN_VALUE;
        return this.f26223d.m30495a((C10403E0) null, (File) null, (C10498R5) null, this);
    }
}
