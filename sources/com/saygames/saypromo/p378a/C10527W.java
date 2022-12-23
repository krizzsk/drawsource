package com.saygames.saypromo.p378a;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.saygames.saypromo.a.W */
final class C10527W extends SuspendLambda implements Function1 {

    /* renamed from: a */
    int f26005a;

    /* renamed from: b */
    final /* synthetic */ C10395D f26006b;

    /* renamed from: c */
    final /* synthetic */ C10548Z f26007c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10527W(C10395D d, C10548Z z, Continuation continuation) {
        super(1, continuation);
        this.f26006b = d;
        this.f26007c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30276a(C10548Z z, View view) {
        z.m30291a();
    }

    public final Continuation create(Continuation continuation) {
        return new C10527W(this.f26006b, this.f26007c, continuation);
    }

    public final Object invoke(Object obj) {
        return ((C10527W) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f26005a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long a = ((C10388C) this.f26006b).mo65250a();
            this.f26005a = 1;
            if (DelayKt.m35308delayVtjQ1oo(a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        View e = this.f26007c.f26036h;
        ViewGroup viewGroup = null;
        if (e == null) {
            e = null;
        }
        e.setVisibility(0);
        View e2 = this.f26007c.f26036h;
        if (e2 == null) {
            e2 = null;
        }
        e2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C10527W.m30276a(C10548Z.this, view);
            }
        });
        ViewGroup d = this.f26007c.f26040l;
        if (d != null) {
            viewGroup = d;
        }
        viewGroup.setVisibility(0);
        this.f26007c.m30311a((Function1) new C10520V(this.f26007c));
        return Unit.INSTANCE;
    }
}
