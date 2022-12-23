package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.Y3 */
public final class C10545Y3 implements C10531W3 {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f26025b = {C10532W4.m30277a(C10545Y3.class, "availableStorageMemory", "getAvailableStorageMemory()Lcom/saygames/saypromo/platform/AvailableStorageMemory;", 0)};

    /* renamed from: a */
    private final C10484P4 f26026a;

    C10545Y3(C10491Q4 q4) {
        this.f26026a = q4;
    }

    /* renamed from: a */
    private final C10565b1 m30288a() {
        C10484P4 p4 = this.f26026a;
        KProperty kProperty = f26025b[0];
        return (C10565b1) ((C10491Q4) p4).mo65365a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65400a(java.io.File r5, long r6, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.saygames.saypromo.p378a.C10538X3
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.saygames.saypromo.a.X3 r0 = (com.saygames.saypromo.p378a.C10538X3) r0
            int r1 = r0.f26019f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26019f = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.X3 r0 = new com.saygames.saypromo.a.X3
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f26017d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f26019f
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r6 = r0.f26016c
            java.io.File r5 = r0.f26015b
            com.saygames.saypromo.a.Y3 r0 = r0.f26014a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f26014a = r4
            r0.f26015b = r5
            r0.f26016c = r6
            r0.f26019f = r3
            kotlin.Unit r8 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)
            if (r8 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r0 = r4
        L_0x004a:
            java.io.File r5 = r5.getParentFile()
            if (r5 == 0) goto L_0x0078
            com.saygames.saypromo.a.b1 r8 = r0.m30288a()
            java.lang.String r5 = r5.getPath()
            com.saygames.saypromo.a.c1 r8 = (com.saygames.saypromo.p378a.C10573c1) r8
            java.lang.Long r5 = r8.mo65425a(r5)
            if (r5 == 0) goto L_0x0075
            long r0 = r5.longValue()
            r2 = 1048576(0x100000, double:5.180654E-318)
            long r6 = r6 + r2
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x006f
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x006f:
            com.saygames.saypromo.SayPromoThrowable$Load$NoSpace r5 = new com.saygames.saypromo.SayPromoThrowable$Load$NoSpace
            r5.<init>()
            throw r5
        L_0x0075:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x0078:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10545Y3.mo65400a(java.io.File, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
