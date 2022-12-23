package com.saygames.saypromo.p378a;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.saygames.saypromo.a.X4 */
final class C10539X4 extends SuspendLambda implements Function1 {

    /* renamed from: a */
    int f26020a;

    /* renamed from: b */
    final /* synthetic */ C10561a5 f26021b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10539X4(C10561a5 a5Var, Continuation continuation) {
        super(1, continuation);
        this.f26021b = a5Var;
    }

    public final Continuation create(Continuation continuation) {
        return new C10539X4(this.f26021b, continuation);
    }

    public final Object invoke(Object obj) {
        return ((C10539X4) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f26020a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C10637k1 b = this.f26021b.m30338b();
            this.f26020a = 1;
            if (((C10661n1) b).mo65504a() == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
