package com.saygames.saypromo.p378a;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.saygames.saypromo.a.C3 */
final class C10392C3 extends SuspendLambda implements Function1 {

    /* renamed from: a */
    int f25760a;

    /* renamed from: b */
    final /* synthetic */ C10399D3 f25761b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10392C3(C10399D3 d3, Continuation continuation) {
        super(1, continuation);
        this.f25761b = d3;
    }

    public final Continuation create(Continuation continuation) {
        return new C10392C3(this.f25761b, continuation);
    }

    public final Object invoke(Object obj) {
        return ((C10392C3) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        C10498R5 r5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f25760a;
        if (i == 0 || i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (true) {
            C10717u4 b = this.f25761b.f25778d;
            C10399D3 d3 = this.f25761b;
            synchronized (b.f26352a) {
                r5 = (C10498R5) CollectionsKt.removeFirstOrNull(d3.f25777c);
            }
            if (r5 == null) {
                long a = C10406E3.f25796a;
                this.f25760a = 1;
                if (DelayKt.m35308delayVtjQ1oo(a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                C10679p3 a2 = this.f25761b.m30103a();
                try {
                    this.f25760a = 2;
                    if (((C10709t3) a2).mo65540a(r5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable unused2) {
                    continue;
                }
            }
        }
    }
}
