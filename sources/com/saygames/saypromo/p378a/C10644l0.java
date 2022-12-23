package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.l0 */
public final class C10644l0 implements C10620i0 {

    /* renamed from: e */
    static final /* synthetic */ KProperty[] f26250e;

    /* renamed from: a */
    private final C10484P4 f26251a;

    /* renamed from: b */
    private final C10484P4 f26252b;

    /* renamed from: c */
    private final C10484P4 f26253c;

    /* renamed from: d */
    private final C10484P4 f26254d;

    static {
        Class<C10644l0> cls = C10644l0.class;
        f26250e = new KProperty[]{C10532W4.m30277a(cls, "downloadManager", "getDownloadManager()Lcom/saygames/saypromo/manager/DownloadManager;", 0), C10532W4.m30277a(cls, "eventsManager", "getEventsManager()Lcom/saygames/saypromo/manager/EventsManager;", 0), C10532W4.m30277a(cls, "fileWriter", "getFileWriter()Lcom/saygames/saypromo/common/FileWriter;", 0), C10532W4.m30277a(cls, "timeDiffer", "getTimeDiffer()Lcom/saygames/saypromo/common/TimeDiffer;", 0)};
    }

    C10644l0(C10491Q4 q4, C10491Q4 q42, C10491Q4 q43, C10491Q4 q44) {
        this.f26251a = q4;
        this.f26252b = q42;
        this.f26253c = q43;
        this.f26254d = q44;
    }

    /* renamed from: a */
    private final C10679p3 m30494a() {
        C10484P4 p4 = this.f26251a;
        KProperty kProperty = f26250e[0];
        return (C10679p3) ((C10491Q4) p4).mo65365a();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m30495a(com.saygames.saypromo.p378a.C10403E0 r16, java.io.File r17, com.saygames.saypromo.p378a.C10498R5 r18, kotlin.coroutines.Continuation r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r19
            boolean r2 = r1 instanceof com.saygames.saypromo.p378a.C10628j0
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.saygames.saypromo.a.j0 r2 = (com.saygames.saypromo.p378a.C10628j0) r2
            int r3 = r2.f26224e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f26224e = r3
            goto L_0x001b
        L_0x0016:
            com.saygames.saypromo.a.j0 r2 = new com.saygames.saypromo.a.j0
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.f26222c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f26224e
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0041
            if (r4 == r6) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x009d
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            java.io.File r4 = r2.f26221b
            java.lang.Object r6 = r2.f26220a
            com.saygames.saypromo.a.l0 r6 = (com.saygames.saypromo.p378a.C10644l0) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0086
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r1)
            com.saygames.saypromo.a.F3 r1 = r15.m30497b()
            java.lang.String r9 = r16.mo65277a()
            java.lang.String r10 = r16.mo65280d()
            java.lang.String r11 = r16.mo65278b()
            com.saygames.saypromo.a.D5 r4 = r15.m30499d()
            long r7 = r16.mo65281e()
            com.saygames.saypromo.a.E5 r4 = (com.saygames.saypromo.p378a.C10408E5) r4
            long r12 = r4.mo65292a(r7)
            java.lang.String r14 = r18.toString()
            r7 = r1
            com.saygames.saypromo.a.G3 r7 = (com.saygames.saypromo.p378a.C10420G3) r7
            java.lang.String r8 = "request_load_file"
            r7.mo65306a(r8, r9, r10, r11, r12, r14)
            com.saygames.saypromo.a.p3 r1 = r15.m30494a()
            r2.f26220a = r0
            r4 = r17
            r2.f26221b = r4
            r2.f26224e = r6
            com.saygames.saypromo.a.t3 r1 = (com.saygames.saypromo.p378a.C10709t3) r1
            r6 = r18
            java.lang.Object r1 = r1.mo65541b(r6, r2)
            if (r1 != r3) goto L_0x0085
            return r3
        L_0x0085:
            r6 = r0
        L_0x0086:
            r7 = r1
            okio.Source r7 = (okio.Source) r7
            com.saygames.saypromo.a.N3 r6 = r6.m30498c()
            r2.f26220a = r1
            r1 = 0
            r2.f26221b = r1
            r2.f26224e = r5
            com.saygames.saypromo.a.R3 r6 = (com.saygames.saypromo.p378a.C10496R3) r6
            java.lang.Object r1 = r6.mo65371a((java.io.File) r4, (okio.Source) r7, (kotlin.coroutines.Continuation) r2)
            if (r1 != r3) goto L_0x009d
            return r3
        L_0x009d:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10644l0.m30495a(com.saygames.saypromo.a.E0, java.io.File, com.saygames.saypromo.a.R5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    private final C10413F3 m30497b() {
        C10484P4 p4 = this.f26252b;
        KProperty kProperty = f26250e[1];
        return (C10413F3) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: c */
    private final C10469N3 m30498c() {
        C10484P4 p4 = this.f26253c;
        KProperty kProperty = f26250e[2];
        return (C10469N3) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: d */
    private final C10401D5 m30499d() {
        C10484P4 p4 = this.f26254d;
        KProperty kProperty = f26250e[3];
        return (C10401D5) ((C10491Q4) p4).mo65365a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65492a(com.saygames.saypromo.p378a.C10403E0 r11, com.saygames.saypromo.p378a.C10467N1 r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.saygames.saypromo.p378a.C10636k0
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.saygames.saypromo.a.k0 r0 = (com.saygames.saypromo.p378a.C10636k0) r0
            int r1 = r0.f26244f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26244f = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.k0 r0 = new com.saygames.saypromo.a.k0
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f26242d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f26244f
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x005d
            if (r2 == r7) goto L_0x0053
            if (r2 == r6) goto L_0x0049
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x010a
        L_0x0037:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00e2
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00ba
        L_0x0049:
            com.saygames.saypromo.a.N1 r11 = r0.f26241c
            com.saygames.saypromo.a.E0 r12 = r0.f26240b
            com.saygames.saypromo.a.l0 r2 = r0.f26239a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0099
        L_0x0053:
            com.saygames.saypromo.a.N1 r12 = r0.f26241c
            com.saygames.saypromo.a.E0 r11 = r0.f26240b
            com.saygames.saypromo.a.l0 r2 = r0.f26239a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0070
        L_0x005d:
            kotlin.ResultKt.throwOnFailure(r13)
            r0.f26239a = r10
            r0.f26240b = r11
            r0.f26241c = r12
            r0.f26244f = r7
            kotlin.Unit r13 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)
            if (r13 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r2 = r10
        L_0x0070:
            boolean r13 = r12 instanceof com.saygames.saypromo.p378a.C10446K1
            if (r13 == 0) goto L_0x00bd
            r13 = r12
            com.saygames.saypromo.a.K1 r13 = (com.saygames.saypromo.p378a.C10446K1) r13
            com.saygames.saypromo.a.C1 r3 = r13.mo65348a()
            java.io.File r3 = r3.mo65258d()
            com.saygames.saypromo.a.C1 r13 = r13.mo65348a()
            com.saygames.saypromo.a.R5 r13 = r13.mo65261g()
            r0.f26239a = r2
            r0.f26240b = r11
            r0.f26241c = r12
            r0.f26244f = r6
            java.lang.Object r13 = r2.m30495a(r11, r3, r13, r0)
            if (r13 != r1) goto L_0x0096
            return r1
        L_0x0096:
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x0099:
            com.saygames.saypromo.a.K1 r11 = (com.saygames.saypromo.p378a.C10446K1) r11
            com.saygames.saypromo.a.D1 r13 = r11.mo65349b()
            java.io.File r13 = r13.mo65272c()
            com.saygames.saypromo.a.D1 r11 = r11.mo65349b()
            com.saygames.saypromo.a.R5 r11 = r11.mo65274e()
            r0.f26239a = r8
            r0.f26240b = r8
            r0.f26241c = r8
            r0.f26244f = r5
            java.lang.Object r11 = r2.m30495a(r12, r13, r11, r0)
            if (r11 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x00bd:
            boolean r13 = r12 instanceof com.saygames.saypromo.p378a.C10453L1
            if (r13 == 0) goto L_0x00e5
            com.saygames.saypromo.a.L1 r12 = (com.saygames.saypromo.p378a.C10453L1) r12
            com.saygames.saypromo.a.C1 r13 = r12.mo65351a()
            java.io.File r13 = r13.mo65258d()
            com.saygames.saypromo.a.C1 r12 = r12.mo65351a()
            com.saygames.saypromo.a.R5 r12 = r12.mo65261g()
            r0.f26239a = r8
            r0.f26240b = r8
            r0.f26241c = r8
            r0.f26244f = r4
            java.lang.Object r11 = r2.m30495a(r11, r13, r12, r0)
            if (r11 != r1) goto L_0x00e2
            return r1
        L_0x00e2:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x00e5:
            boolean r13 = r12 instanceof com.saygames.saypromo.p378a.C10460M1
            if (r13 == 0) goto L_0x010d
            com.saygames.saypromo.a.M1 r12 = (com.saygames.saypromo.p378a.C10460M1) r12
            com.saygames.saypromo.a.D1 r13 = r12.mo65353a()
            java.io.File r13 = r13.mo65272c()
            com.saygames.saypromo.a.D1 r12 = r12.mo65353a()
            com.saygames.saypromo.a.R5 r12 = r12.mo65274e()
            r0.f26239a = r8
            r0.f26240b = r8
            r0.f26241c = r8
            r0.f26244f = r3
            java.lang.Object r11 = r2.m30495a(r11, r13, r12, r0)
            if (r11 != r1) goto L_0x010a
            return r1
        L_0x010a:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x010d:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10644l0.mo65492a(com.saygames.saypromo.a.E0, com.saygames.saypromo.a.N1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
