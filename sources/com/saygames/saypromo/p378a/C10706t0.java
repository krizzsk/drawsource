package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.t0 */
public final class C10706t0 implements C10692r0 {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f26344c;

    /* renamed from: a */
    private final C10484P4 f26345a;

    /* renamed from: b */
    private final C10484P4 f26346b;

    static {
        Class<C10706t0> cls = C10706t0.class;
        f26344c = new KProperty[]{C10532W4.m30277a(cls, "creativeDataMapper", "getCreativeDataMapper()Lcom/saygames/saypromo/common/CreativeDataMapper;", 0), C10532W4.m30277a(cls, "linkMapper", "getLinkMapper()Lcom/saygames/saypromo/common/LinkMapper;", 0)};
    }

    C10706t0(C10491Q4 q4, C10491Q4 q42) {
        this.f26345a = q4;
        this.f26346b = q42;
    }

    /* renamed from: a */
    private final C10474O1 m30568a() {
        C10484P4 p4 = this.f26345a;
        KProperty kProperty = f26344c[0];
        return (C10474O1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: b */
    private final C10696r4 m30569b() {
        C10484P4 p4 = this.f26346b;
        KProperty kProperty = f26344c[1];
        return (C10696r4) ((C10491Q4) p4).mo65365a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65539a(com.saygames.saypromo.p378a.C10580d0 r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.saygames.saypromo.p378a.C10699s0
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.saygames.saypromo.a.s0 r0 = (com.saygames.saypromo.p378a.C10699s0) r0
            int r1 = r0.f26332f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26332f = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.s0 r0 = new com.saygames.saypromo.a.s0
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f26330d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f26332f
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.String r12 = r0.f26329c
            com.saygames.saypromo.a.d0 r11 = r0.f26328b
            com.saygames.saypromo.a.t0 r0 = r0.f26327a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r13)
            r0.f26327a = r10
            r0.f26328b = r11
            r0.f26329c = r12
            r0.f26332f = r3
            kotlin.Unit r13 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)
            if (r13 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r0 = r10
        L_0x004a:
            com.saygames.saypromo.a.b0 r13 = new com.saygames.saypromo.a.b0
            com.saygames.saypromo.a.O1 r1 = r0.m30568a()
            com.saygames.saypromo.a.V1 r2 = r11.mo65427b()
            com.saygames.saypromo.a.P1 r1 = (com.saygames.saypromo.p378a.C10481P1) r1
            com.saygames.saypromo.a.N1 r2 = r1.mo65362a((com.saygames.saypromo.p378a.C10522V1) r2, (java.lang.String) r12)
            com.saygames.saypromo.a.r4 r12 = r0.m30569b()
            com.saygames.saypromo.a.o4 r0 = new com.saygames.saypromo.a.o4
            java.lang.String r1 = r11.mo65429d()
            java.lang.String r3 = r11.mo65428c()
            java.lang.String r4 = r11.mo65426a()
            r0.<init>(r1, r3, r4)
            com.saygames.saypromo.a.s4 r12 = (com.saygames.saypromo.p378a.C10703s4) r12
            com.saygames.saypromo.a.n4 r3 = r12.mo65537a(r0)
            java.lang.String r12 = r11.mo65430e()
            r0 = 0
            if (r12 == 0) goto L_0x0082
            com.saygames.saypromo.a.R5 r12 = com.saygames.saypromo.p378a.C10485P5.m30221a(r12)
            r4 = r12
            goto L_0x0083
        L_0x0082:
            r4 = r0
        L_0x0083:
            java.lang.String r12 = r11.mo65431f()
            if (r12 == 0) goto L_0x008f
            com.saygames.saypromo.a.R5 r12 = com.saygames.saypromo.p378a.C10485P5.m30221a(r12)
            r5 = r12
            goto L_0x0090
        L_0x008f:
            r5 = r0
        L_0x0090:
            java.lang.String r12 = r11.mo65432g()
            if (r12 == 0) goto L_0x009c
            com.saygames.saypromo.a.R5 r12 = com.saygames.saypromo.p378a.C10485P5.m30221a(r12)
            r6 = r12
            goto L_0x009d
        L_0x009c:
            r6 = r0
        L_0x009d:
            java.lang.String r12 = r11.mo65433h()
            if (r12 == 0) goto L_0x00a9
            com.saygames.saypromo.a.R5 r12 = com.saygames.saypromo.p378a.C10485P5.m30221a(r12)
            r7 = r12
            goto L_0x00aa
        L_0x00a9:
            r7 = r0
        L_0x00aa:
            java.lang.String r12 = r11.mo65434i()
            if (r12 == 0) goto L_0x00b6
            com.saygames.saypromo.a.R5 r12 = com.saygames.saypromo.p378a.C10485P5.m30221a(r12)
            r8 = r12
            goto L_0x00b7
        L_0x00b6:
            r8 = r0
        L_0x00b7:
            java.lang.String r11 = r11.mo65435j()
            if (r11 == 0) goto L_0x00c3
            com.saygames.saypromo.a.R5 r11 = com.saygames.saypromo.p378a.C10485P5.m30221a(r11)
            r9 = r11
            goto L_0x00c4
        L_0x00c3:
            r9 = r0
        L_0x00c4:
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10706t0.mo65539a(com.saygames.saypromo.a.d0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
