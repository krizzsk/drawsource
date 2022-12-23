package com.saygames.saypromo.p378a;

import com.saygames.saypromo.SayPromoTokenCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.saygames.saypromo.a.M5 */
final class C10464M5 extends SuspendLambda implements Function1 {

    /* renamed from: a */
    Object f25895a;

    /* renamed from: b */
    SayPromoTokenCallback f25896b;

    /* renamed from: c */
    String f25897c;

    /* renamed from: d */
    int f25898d;

    /* renamed from: e */
    final /* synthetic */ C10471N5 f25899e;

    /* renamed from: f */
    final /* synthetic */ String f25900f;

    /* renamed from: g */
    final /* synthetic */ String f25901g;

    /* renamed from: h */
    final /* synthetic */ SayPromoTokenCallback f25902h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10464M5(C10471N5 n5, String str, String str2, SayPromoTokenCallback sayPromoTokenCallback, Continuation continuation) {
        super(1, continuation);
        this.f25899e = n5;
        this.f25900f = str;
        this.f25901g = str2;
        this.f25902h = sayPromoTokenCallback;
    }

    public final Continuation create(Continuation continuation) {
        return new C10464M5(this.f25899e, this.f25900f, this.f25901g, this.f25902h, continuation);
    }

    public final Object invoke(Object obj) {
        return ((C10464M5) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f25898d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.String r0 = r7.f25897c
            com.saygames.saypromo.SayPromoTokenCallback r1 = r7.f25896b
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0092
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0022:
            com.saygames.saypromo.SayPromoTokenCallback r1 = r7.f25896b
            java.lang.Object r3 = r7.f25895a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0071
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x002e }
            goto L_0x004a
        L_0x002e:
            r8 = move-exception
            goto L_0x0051
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r8)
            com.saygames.saypromo.a.N5 r8 = r7.f25899e
            com.saygames.saypromo.a.H5 r8 = r8.m30208b()
            java.lang.String r1 = r7.f25900f
            java.lang.String r5 = r7.f25901g
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x002e }
            r7.f25898d = r4     // Catch:{ all -> 0x002e }
            com.saygames.saypromo.a.J5 r8 = (com.saygames.saypromo.p378a.C10443J5) r8     // Catch:{ all -> 0x002e }
            java.lang.Object r8 = r8.mo65345a(r1, r5, r7)     // Catch:{ all -> 0x002e }
            if (r8 != r0) goto L_0x004a
            return r0
        L_0x004a:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x002e }
            java.lang.Object r8 = kotlin.Result.m33832constructorimpl(r8)     // Catch:{ all -> 0x002e }
            goto L_0x005b
        L_0x0051:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m33832constructorimpl(r8)
        L_0x005b:
            com.saygames.saypromo.SayPromoTokenCallback r1 = r7.f25902h
            java.lang.Throwable r4 = kotlin.Result.m33835exceptionOrNullimpl(r8)
            if (r4 == 0) goto L_0x0077
            r7.f25895a = r8
            r7.f25896b = r1
            r7.f25898d = r3
            kotlin.Unit r3 = com.saygames.saypromo.p378a.C10439J1.m30179a(r7)
            if (r3 != r0) goto L_0x0070
            return r0
        L_0x0070:
            r3 = r8
        L_0x0071:
            java.lang.String r8 = "Failed to generate token"
            r1.onError(r8)     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r8 = r3
        L_0x0077:
            com.saygames.saypromo.SayPromoTokenCallback r1 = r7.f25902h
            boolean r3 = kotlin.Result.m33839isSuccessimpl(r8)
            if (r3 == 0) goto L_0x0095
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            r7.f25895a = r8
            r7.f25896b = r1
            r7.f25897c = r3
            r7.f25898d = r2
            kotlin.Unit r8 = com.saygames.saypromo.p378a.C10439J1.m30179a(r7)
            if (r8 != r0) goto L_0x0091
            return r0
        L_0x0091:
            r0 = r3
        L_0x0092:
            r1.onSuccess(r0)     // Catch:{ all -> 0x0095 }
        L_0x0095:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10464M5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
