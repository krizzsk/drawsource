package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;

/* renamed from: com.saygames.saypromo.a.h4 */
final class C10616h4 extends ContinuationImpl {

    /* renamed from: a */
    Object f26193a;

    /* renamed from: b */
    Object f26194b;

    /* renamed from: c */
    /* synthetic */ Object f26195c;

    /* renamed from: d */
    final /* synthetic */ C10632j4 f26196d;

    /* renamed from: e */
    int f26197e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10616h4(C10632j4 j4Var, Continuation continuation) {
        super(continuation);
        this.f26196d = j4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26195c = obj;
        this.f26197e |= Integer.MIN_VALUE;
        return this.f26196d.m30467a((JSONArray) null, (Continuation) this);
    }
}
