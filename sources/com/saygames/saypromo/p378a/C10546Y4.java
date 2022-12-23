package com.saygames.saypromo.p378a;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.saygames.saypromo.a.Y4 */
final class C10546Y4 extends SuspendLambda implements Function1 {

    /* renamed from: a */
    int f26027a;

    /* renamed from: b */
    final /* synthetic */ C10561a5 f26028b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10546Y4(C10561a5 a5Var, Continuation continuation) {
        super(1, continuation);
        this.f26028b = a5Var;
    }

    public final Continuation create(Continuation continuation) {
        return new C10546Y4(this.f26028b, continuation);
    }

    public final Object invoke(Object obj) {
        return ((C10546Y4) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f26027a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C10466N0 a = this.f26028b.m30335a();
            this.f26027a = 1;
            if (((C10487Q0) a).mo65363a(this) == coroutine_suspended) {
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
