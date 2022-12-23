package com.saygames.saypromo.p378a;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.saygames.saypromo.a.U */
final class C10513U extends SuspendLambda implements Function1 {

    /* renamed from: a */
    int f25989a;

    /* renamed from: b */
    int f25990b;

    /* renamed from: c */
    int f25991c;

    /* renamed from: d */
    int f25992d;

    /* renamed from: e */
    C10548Z f25993e;

    /* renamed from: f */
    int f25994f;

    /* renamed from: g */
    final /* synthetic */ long f25995g;

    /* renamed from: h */
    final /* synthetic */ int f25996h;

    /* renamed from: i */
    final /* synthetic */ C10548Z f25997i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10513U(long j, int i, C10548Z z, Continuation continuation) {
        super(1, continuation);
        this.f25995g = j;
        this.f25996h = i;
        this.f25997i = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30266a(C10548Z z, View view) {
        z.m30291a();
    }

    public final Continuation create(Continuation continuation) {
        return new C10513U(this.f25995g, this.f25996h, this.f25997i, continuation);
    }

    public final Object invoke(Object obj) {
        return ((C10513U) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f25994f
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 == r7) goto L_0x0024
            if (r1 == r5) goto L_0x001f
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            goto L_0x001f
        L_0x0017:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00dc
        L_0x0024:
            int r1 = r12.f25992d
            int r3 = r12.f25991c
            int r4 = r12.f25990b
            int r8 = r12.f25989a
            com.saygames.saypromo.a.Z r9 = r12.f25993e
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L_0x006b
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r13)
            long r8 = r12.f25995g
            kotlin.time.Duration$Companion r13 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r13 = kotlin.time.DurationUnit.SECONDS
            long r10 = kotlin.time.DurationKt.toDuration((int) r5, (kotlin.time.DurationUnit) r13)
            int r13 = kotlin.time.Duration.m35143compareToLRDsOJo(r8, r10)
            if (r13 < 0) goto L_0x009d
            int r13 = r12.f25996h
            int r1 = r13 + -1
            com.saygames.saypromo.a.Z r3 = r12.f25997i
            r4 = r13
            r8 = r1
            r1 = r2
            r9 = r3
            r13 = r12
        L_0x0051:
            if (r1 >= r8) goto L_0x008e
            long r10 = com.saygames.saypromo.p378a.C10556a0.f26057a
            r13.f25993e = r9
            r13.f25989a = r8
            r13.f25990b = r4
            r13.f25991c = r1
            r13.f25992d = r1
            r13.f25994f = r7
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.m35308delayVtjQ1oo(r10, r13)
            if (r3 != r0) goto L_0x006a
            return r0
        L_0x006a:
            r3 = r1
        L_0x006b:
            int r1 = r4 - r1
            int r1 = r1 - r7
            android.widget.TextView r10 = r9.f26034f
            if (r10 != 0) goto L_0x0075
            r10 = r6
        L_0x0075:
            java.lang.String r11 = java.lang.String.valueOf(r1)
            r10.setText(r11)
            kotlin.time.Duration$Companion r10 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r10 = kotlin.time.DurationUnit.SECONDS
            long r10 = kotlin.time.DurationKt.toDuration((int) r1, (kotlin.time.DurationUnit) r10)
            int r1 = com.saygames.saypromo.p378a.C10548Z.m30290a((com.saygames.saypromo.p378a.C10548Z) r9, (long) r10)
            r9.m30292a((int) r1)
            int r1 = r3 + 1
            goto L_0x0051
        L_0x008e:
            long r3 = com.saygames.saypromo.p378a.C10556a0.f26057a
            r13.f25993e = r6
            r13.f25994f = r5
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.m35308delayVtjQ1oo(r3, r13)
            if (r1 != r0) goto L_0x00dd
            return r0
        L_0x009d:
            long r7 = r12.f25995g
            long r9 = com.saygames.saypromo.p378a.C10556a0.f26057a
            int r13 = kotlin.time.Duration.m35143compareToLRDsOJo(r7, r9)
            if (r13 < 0) goto L_0x00d1
            com.saygames.saypromo.a.Z r13 = r12.f25997i
            android.widget.TextView r13 = r13.f26034f
            if (r13 != 0) goto L_0x00b2
            r13 = r6
        L_0x00b2:
            java.lang.String r1 = "1"
            r13.setText(r1)
            com.saygames.saypromo.a.Z r13 = r12.f25997i
            long r7 = com.saygames.saypromo.p378a.C10556a0.f26057a
            int r13 = com.saygames.saypromo.p378a.C10548Z.m30290a((com.saygames.saypromo.p378a.C10548Z) r13, (long) r7)
            com.saygames.saypromo.a.Z r1 = r12.f25997i
            r1.m30292a((int) r13)
            long r7 = r12.f25995g
            r12.f25994f = r4
            java.lang.Object r13 = kotlinx.coroutines.DelayKt.m35308delayVtjQ1oo(r7, r12)
            if (r13 != r0) goto L_0x00dc
            return r0
        L_0x00d1:
            long r4 = r12.f25995g
            r12.f25994f = r3
            java.lang.Object r13 = kotlinx.coroutines.DelayKt.m35308delayVtjQ1oo(r4, r12)
            if (r13 != r0) goto L_0x00dc
            return r0
        L_0x00dc:
            r13 = r12
        L_0x00dd:
            com.saygames.saypromo.a.Z r0 = r13.f25997i
            android.view.View r0 = r0.f26036h
            if (r0 != 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r6 = r0
        L_0x00e7:
            com.saygames.saypromo.a.Z r0 = r13.f25997i
            com.saygames.saypromo.a.-$$Lambda$U$QfvQxier7USLyterDOkE0QevBSg r1 = new com.saygames.saypromo.a.-$$Lambda$U$QfvQxier7USLyterDOkE0QevBSg
            r1.<init>()
            r6.setOnClickListener(r1)
            com.saygames.saypromo.a.Z r0 = r13.f25997i
            com.saygames.saypromo.a.T r1 = new com.saygames.saypromo.a.T
            com.saygames.saypromo.a.Z r3 = r13.f25997i
            r1.<init>(r3)
            r0.m30311a((kotlin.jvm.functions.Function1) r1)
            com.saygames.saypromo.a.Z r13 = r13.f25997i
            r13.m30292a((int) r2)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10513U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
