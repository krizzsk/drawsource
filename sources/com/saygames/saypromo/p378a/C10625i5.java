package com.saygames.saypromo.p378a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.saygames.saypromo.a.i5 */
final class C10625i5 extends SuspendLambda implements Function1 {

    /* renamed from: a */
    Object f26209a;

    /* renamed from: b */
    C10697r5 f26210b;

    /* renamed from: c */
    Object f26211c;

    /* renamed from: d */
    int f26212d;

    /* renamed from: e */
    final /* synthetic */ C10633j5 f26213e;

    /* renamed from: f */
    final /* synthetic */ C10619i f26214f;

    /* renamed from: g */
    final /* synthetic */ C10665n5 f26215g;

    /* renamed from: h */
    final /* synthetic */ C10697r5 f26216h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10625i5(C10633j5 j5Var, C10619i iVar, C10665n5 n5Var, C10697r5 r5Var, Continuation continuation) {
        super(1, continuation);
        this.f26213e = j5Var;
        this.f26214f = iVar;
        this.f26215g = n5Var;
        this.f26216h = r5Var;
    }

    public final Continuation create(Continuation continuation) {
        return new C10625i5(this.f26213e, this.f26214f, this.f26215g, this.f26216h, continuation);
    }

    public final Object invoke(Object obj) {
        return ((C10625i5) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f26212d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r4) goto L_0x0030
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            java.lang.Object r0 = r7.f26211c
            com.saygames.saypromo.a.b0 r0 = (com.saygames.saypromo.p378a.C10564b0) r0
            com.saygames.saypromo.a.r5 r1 = r7.f26210b
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00a5
        L_0x001c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0024:
            java.lang.Object r1 = r7.f26211c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.saygames.saypromo.a.r5 r3 = r7.f26210b
            java.lang.Object r4 = r7.f26209a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0082
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x0034 }
            goto L_0x0058
        L_0x0034:
            r8 = move-exception
            goto L_0x005f
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r8)
            com.saygames.saypromo.a.j5 r8 = r7.f26213e
            com.saygames.saypromo.a.A0 r8 = r8.m30474a()
            com.saygames.saypromo.a.i r1 = r7.f26214f
            com.saygames.saypromo.a.n5 r5 = r7.f26215g
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x0034 }
            com.saygames.saypromo.a.E0 r1 = r1.mo65477a()     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r5.mo65513b()     // Catch:{ all -> 0x0034 }
            r7.f26212d = r4     // Catch:{ all -> 0x0034 }
            com.saygames.saypromo.a.C0 r8 = (com.saygames.saypromo.p378a.C10389C0) r8     // Catch:{ all -> 0x0034 }
            java.lang.Object r8 = r8.mo65254a(r1, r5, r7)     // Catch:{ all -> 0x0034 }
            if (r8 != r0) goto L_0x0058
            return r0
        L_0x0058:
            com.saygames.saypromo.a.b0 r8 = (com.saygames.saypromo.p378a.C10564b0) r8     // Catch:{ all -> 0x0034 }
            java.lang.Object r8 = kotlin.Result.m33832constructorimpl(r8)     // Catch:{ all -> 0x0034 }
            goto L_0x0069
        L_0x005f:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m33832constructorimpl(r8)
        L_0x0069:
            r4 = r8
            com.saygames.saypromo.a.r5 r8 = r7.f26216h
            java.lang.Throwable r1 = kotlin.Result.m33835exceptionOrNullimpl(r4)
            if (r1 == 0) goto L_0x008a
            r7.f26209a = r4
            r7.f26210b = r8
            r7.f26211c = r1
            r7.f26212d = r3
            kotlin.Unit r3 = com.saygames.saypromo.p378a.C10439J1.m30179a(r7)
            if (r3 != r0) goto L_0x0081
            return r0
        L_0x0081:
            r3 = r8
        L_0x0082:
            com.saygames.saypromo.a.g r8 = new com.saygames.saypromo.a.g
            r8.<init>(r1)
            com.saygames.saypromo.p378a.C10378A3.m30063a(r3, r8)
        L_0x008a:
            com.saygames.saypromo.a.r5 r1 = r7.f26216h
            boolean r8 = kotlin.Result.m33839isSuccessimpl(r4)
            if (r8 == 0) goto L_0x00ad
            r8 = r4
            com.saygames.saypromo.a.b0 r8 = (com.saygames.saypromo.p378a.C10564b0) r8
            r7.f26209a = r4
            r7.f26210b = r1
            r7.f26211c = r8
            r7.f26212d = r2
            kotlin.Unit r2 = com.saygames.saypromo.p378a.C10439J1.m30179a(r7)
            if (r2 != r0) goto L_0x00a4
            return r0
        L_0x00a4:
            r0 = r8
        L_0x00a5:
            com.saygames.saypromo.a.h r8 = new com.saygames.saypromo.a.h
            r8.<init>(r0)
            com.saygames.saypromo.p378a.C10378A3.m30063a(r1, r8)
        L_0x00ad:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10625i5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
