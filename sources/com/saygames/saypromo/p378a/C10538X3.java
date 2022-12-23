package com.saygames.saypromo.p378a;

import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.saygames.saypromo.a.X3 */
final class C10538X3 extends ContinuationImpl {

    /* renamed from: a */
    C10545Y3 f26014a;

    /* renamed from: b */
    File f26015b;

    /* renamed from: c */
    long f26016c;

    /* renamed from: d */
    /* synthetic */ Object f26017d;

    /* renamed from: e */
    final /* synthetic */ C10545Y3 f26018e;

    /* renamed from: f */
    int f26019f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10538X3(C10545Y3 y3, Continuation continuation) {
        super(continuation);
        this.f26018e = y3;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26017d = obj;
        this.f26019f |= Integer.MIN_VALUE;
        return this.f26018e.mo65400a((File) null, 0, this);
    }
}
