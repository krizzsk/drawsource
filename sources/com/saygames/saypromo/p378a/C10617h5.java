package com.saygames.saypromo.p378a;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.saygames.saypromo.a.h5 */
final class C10617h5 extends SuspendLambda implements Function1 {

    /* renamed from: a */
    int f26198a;

    /* renamed from: b */
    final /* synthetic */ C10697r5 f26199b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10617h5(C10697r5 r5Var, Continuation continuation) {
        super(1, continuation);
        this.f26199b = r5Var;
    }

    public final Continuation create(Continuation continuation) {
        return new C10617h5(this.f26199b, continuation);
    }

    public final Object invoke(Object obj) {
        return ((C10617h5) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f26198a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long a = C10641k5.f26246a;
            this.f26198a = 1;
            if (DelayKt.m35308delayVtjQ1oo(a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            C10378A3.m30063a(this.f26199b, new C10579d());
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f26198a = 2;
        if (C10439J1.m30179a(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        C10378A3.m30063a(this.f26199b, new C10579d());
        return Unit.INSTANCE;
    }
}
