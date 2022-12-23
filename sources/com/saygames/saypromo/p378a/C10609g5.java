package com.saygames.saypromo.p378a;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.saygames.saypromo.a.g5 */
final class C10609g5 extends SuspendLambda implements Function1 {

    /* renamed from: a */
    int f26186a;

    /* renamed from: b */
    final /* synthetic */ C10633j5 f26187b;

    /* renamed from: c */
    final /* synthetic */ String f26188c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10609g5(C10633j5 j5Var, String str, Continuation continuation) {
        super(1, continuation);
        this.f26187b = j5Var;
        this.f26188c = str;
    }

    public final Continuation create(Continuation continuation) {
        return new C10609g5(this.f26187b, this.f26188c, continuation);
    }

    public final Object invoke(Object obj) {
        return ((C10609g5) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f26186a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C10510T3 b = this.f26187b.m30482e();
            String str = this.f26188c;
            this.f26186a = 1;
            if (((C10517U3) b).mo65390a(str) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f26187b.f26238h.mo65245a();
        return Unit.INSTANCE;
    }
}
