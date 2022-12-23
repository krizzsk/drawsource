package com.saygames.saypromo.p378a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* renamed from: com.saygames.saypromo.a.g4 */
final class C10608g4 extends ContinuationImpl {

    /* renamed from: a */
    C10632j4 f26181a;

    /* renamed from: b */
    JSONObject f26182b;

    /* renamed from: c */
    /* synthetic */ Object f26183c;

    /* renamed from: d */
    final /* synthetic */ C10632j4 f26184d;

    /* renamed from: e */
    int f26185e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10608g4(C10632j4 j4Var, Continuation continuation) {
        super(continuation);
        this.f26184d = j4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f26183c = obj;
        this.f26185e |= Integer.MIN_VALUE;
        return this.f26184d.m30470b((JSONObject) null, (Continuation) this);
    }
}
