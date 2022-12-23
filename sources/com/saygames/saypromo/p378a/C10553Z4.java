package com.saygames.saypromo.p378a;

import com.saygames.saypromo.SayPromoAdvertisingIdCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.saygames.saypromo.a.Z4 */
final class C10553Z4 extends SuspendLambda implements Function1 {

    /* renamed from: a */
    int f26054a;

    /* renamed from: b */
    final /* synthetic */ C10561a5 f26055b;

    /* renamed from: c */
    final /* synthetic */ SayPromoAdvertisingIdCallback f26056c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10553Z4(C10561a5 a5Var, SayPromoAdvertisingIdCallback sayPromoAdvertisingIdCallback, Continuation continuation) {
        super(1, continuation);
        this.f26055b = a5Var;
        this.f26056c = sayPromoAdvertisingIdCallback;
    }

    public final Continuation create(Continuation continuation) {
        return new C10553Z4(this.f26055b, this.f26056c, continuation);
    }

    public final Object invoke(Object obj) {
        return ((C10553Z4) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f26054a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C10466N0 a = this.f26055b.m30335a();
            this.f26054a = 1;
            obj = ((C10487Q0) a).mo65363a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C10473O0 o0 = (C10473O0) obj;
        try {
            this.f26056c.onSuccess(o0.mo65360a());
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }
}
