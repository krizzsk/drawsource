package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* renamed from: com.saygames.saypromo.a.f4 */
final class C10600f4 extends ContinuationImpl {

    /* renamed from: a */
    C10632j4 f26118a;

    /* renamed from: b */
    JSONObject f26119b;

    /* renamed from: c */
    /* synthetic */ Object f26120c;

    /* renamed from: d */
    final /* synthetic */ C10632j4 f26121d;

    /* renamed from: e */
    int f26122e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10600f4(C10632j4 j4Var, Continuation continuation) {
        super(continuation);
        this.f26121d = j4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26120c = obj;
        this.f26122e |= Integer.MIN_VALUE;
        return this.f26121d.m30468a((JSONObject) null, (Continuation) this);
    }
}
