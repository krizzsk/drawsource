package com.saygames.saypromo.p378a;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.saygames.saypromo.a.z5 */
final class C10753z5 extends SuspendLambda implements Function2 {

    /* renamed from: a */
    int f26381a;

    /* renamed from: b */
    final /* synthetic */ Function1 f26382b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10753z5(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f26382b = function1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new C10753z5(this.f26382b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C10753z5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f26381a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f26382b;
            this.f26381a = 1;
            if (function1.invoke(this) == coroutine_suspended) {
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
