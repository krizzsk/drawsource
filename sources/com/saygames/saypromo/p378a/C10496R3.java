package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.R3 */
public final class C10496R3 implements C10469N3 {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f25962c;

    /* renamed from: a */
    private final C10484P4 f25963a;

    /* renamed from: b */
    private final C10484P4 f25964b;

    static {
        Class<C10496R3> cls = C10496R3.class;
        f25962c = new KProperty[]{C10532W4.m30277a(cls, "fileSinkCreator", "getFileSinkCreator()Lcom/saygames/saypromo/common/FileSinkCreator;", 0), C10532W4.m30277a(cls, "freeSpaceChecker", "getFreeSpaceChecker()Lcom/saygames/saypromo/common/FreeSpaceChecker;", 0)};
    }

    C10496R3(C10491Q4 q4, C10491Q4 q42) {
        this.f25963a = q4;
        this.f25964b = q42;
    }

    /* renamed from: a */
    private final C10441J3 m30235a() {
        C10484P4 p4 = this.f25963a;
        KProperty kProperty = f25962c[0];
        return (C10441J3) ((C10491Q4) p4).mo65365a();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m30237a(okio.Buffer r5, long r6, okio.Sink r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.saygames.saypromo.p378a.C10490Q3
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.saygames.saypromo.a.Q3 r0 = (com.saygames.saypromo.p378a.C10490Q3) r0
            int r1 = r0.f25951f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f25951f = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.Q3 r0 = new com.saygames.saypromo.a.Q3
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f25949d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f25951f
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r6 = r0.f25948c
            okio.Sink r8 = r0.f25947b
            okio.Buffer r5 = r0.f25946a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.f25946a = r5
            r0.f25947b = r8
            r0.f25948c = r6
            r0.f25951f = r3
            kotlin.Unit r9 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)
            if (r9 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r8.write(r5, r6)     // Catch:{ all -> 0x004f }
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x004f:
            r5 = move-exception
            com.saygames.saypromo.SayPromoThrowable$Load$IoFile r6 = new com.saygames.saypromo.SayPromoThrowable$Load$IoFile
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10496R3.m30237a(okio.Buffer, long, okio.Sink, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m30238a(okio.Buffer r5, okio.Source r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.saygames.saypromo.p378a.C10476O3
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.saygames.saypromo.a.O3 r0 = (com.saygames.saypromo.p378a.C10476O3) r0
            int r1 = r0.f25917e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f25917e = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.O3 r0 = new com.saygames.saypromo.a.O3
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f25915c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f25917e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            okio.Source r6 = r0.f25914b
            okio.Buffer r5 = r0.f25913a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f25913a = r5
            r0.f25914b = r6
            r0.f25917e = r3
            kotlin.Unit r7 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)
            if (r7 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = 8192(0x2000, double:4.0474E-320)
            long r5 = r6.read(r5, r0)     // Catch:{ all -> 0x0050 }
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)     // Catch:{ all -> 0x0050 }
            return r5
        L_0x0050:
            r5 = move-exception
            com.saygames.saypromo.SayPromoThrowable$Load$IoServer r6 = new com.saygames.saypromo.SayPromoThrowable$Load$IoServer
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10496R3.m30238a(okio.Buffer, okio.Source, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    private final C10531W3 m30239b() {
        C10484P4 p4 = this.f25964b;
        KProperty kProperty = f25962c[1];
        return (C10531W3) ((C10491Q4) p4).mo65365a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:13|14|43|44|(1:46)|47|(3:49|(1:51)(8:52|53|(1:55)|43|44|(0)|47|(1:56)(0))|51)|56|57|58|59|60|61|62|63|65) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:22|23|68|69|70|71) */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x012f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x013c */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd A[Catch:{ all -> 0x0049 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ea A[Catch:{ all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0129 A[Catch:{ all -> 0x0049 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012a A[Catch:{ all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:70:0x013c=Splitter:B:70:0x013c, B:59:0x012f=Splitter:B:59:0x012f} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65371a(java.io.File r24, okio.Source r25, kotlin.coroutines.Continuation r26) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            r3 = r26
            boolean r4 = r3 instanceof com.saygames.saypromo.p378a.C10483P3
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.saygames.saypromo.a.P3 r4 = (com.saygames.saypromo.p378a.C10483P3) r4
            int r5 = r4.f25940k
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f25940k = r5
            goto L_0x0020
        L_0x001b:
            com.saygames.saypromo.a.P3 r4 = new com.saygames.saypromo.a.P3
            r4.<init>(r1, r3)
        L_0x0020:
            java.lang.Object r3 = r4.f25938i
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.f25940k
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L_0x0097
            if (r6 == r10) goto L_0x0085
            if (r6 == r9) goto L_0x0073
            if (r6 == r8) goto L_0x0054
            if (r6 != r7) goto L_0x004c
            okio.Buffer r0 = r4.f25936g
            okio.Sink r2 = r4.f25935f
            java.io.Closeable r6 = r4.f25934e
            java.io.Closeable r10 = r4.f25933d
            okio.Source r11 = r4.f25932c
            java.io.File r12 = r4.f25931b
            com.saygames.saypromo.a.R3 r13 = r4.f25930a
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0049 }
            goto L_0x00c7
        L_0x0049:
            r0 = move-exception
            goto L_0x0139
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0054:
            long r10 = r4.f25937h
            okio.Buffer r0 = r4.f25936g
            okio.Sink r2 = r4.f25935f
            java.io.Closeable r6 = r4.f25934e
            java.io.Closeable r12 = r4.f25933d
            okio.Source r13 = r4.f25932c
            java.io.File r14 = r4.f25931b
            com.saygames.saypromo.a.R3 r15 = r4.f25930a
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x006f }
            r18 = r10
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            goto L_0x010b
        L_0x006f:
            r0 = move-exception
            r10 = r12
            goto L_0x0139
        L_0x0073:
            okio.Buffer r0 = r4.f25936g
            okio.Sink r2 = r4.f25935f
            java.io.Closeable r6 = r4.f25934e
            java.io.Closeable r10 = r4.f25933d
            okio.Source r11 = r4.f25932c
            java.io.File r12 = r4.f25931b
            com.saygames.saypromo.a.R3 r13 = r4.f25930a
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0049 }
            goto L_0x00de
        L_0x0085:
            java.io.Closeable r2 = r4.f25933d
            okio.Source r0 = r4.f25932c
            java.io.File r6 = r4.f25931b
            com.saygames.saypromo.a.R3 r10 = r4.f25930a
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0143 }
            r22 = r3
            r3 = r0
            r0 = r6
            r6 = r22
            goto L_0x00b4
        L_0x0097:
            kotlin.ResultKt.throwOnFailure(r3)
            com.saygames.saypromo.a.J3 r3 = r23.m30235a()     // Catch:{ all -> 0x0143 }
            r4.f25930a = r1     // Catch:{ all -> 0x0143 }
            r4.f25931b = r0     // Catch:{ all -> 0x0143 }
            r4.f25932c = r2     // Catch:{ all -> 0x0143 }
            r4.f25933d = r2     // Catch:{ all -> 0x0143 }
            r4.f25940k = r10     // Catch:{ all -> 0x0143 }
            com.saygames.saypromo.a.L3 r3 = (com.saygames.saypromo.p378a.C10455L3) r3     // Catch:{ all -> 0x0143 }
            java.lang.Object r3 = r3.mo65352a(r0, r4)     // Catch:{ all -> 0x0143 }
            if (r3 != r5) goto L_0x00b1
            return r5
        L_0x00b1:
            r10 = r1
            r6 = r3
            r3 = r2
        L_0x00b4:
            java.io.Closeable r6 = (java.io.Closeable) r6     // Catch:{ all -> 0x013f }
            r11 = r6
            okio.Sink r11 = (okio.Sink) r11     // Catch:{ all -> 0x0137 }
            okio.Buffer r12 = new okio.Buffer     // Catch:{ all -> 0x0137 }
            r12.<init>()     // Catch:{ all -> 0x0137 }
            r13 = r10
            r10 = r2
            r2 = r11
            r11 = r3
            r22 = r12
            r12 = r0
            r0 = r22
        L_0x00c7:
            r4.f25930a = r13     // Catch:{ all -> 0x0049 }
            r4.f25931b = r12     // Catch:{ all -> 0x0049 }
            r4.f25932c = r11     // Catch:{ all -> 0x0049 }
            r4.f25933d = r10     // Catch:{ all -> 0x0049 }
            r4.f25934e = r6     // Catch:{ all -> 0x0049 }
            r4.f25935f = r2     // Catch:{ all -> 0x0049 }
            r4.f25936g = r0     // Catch:{ all -> 0x0049 }
            r4.f25940k = r9     // Catch:{ all -> 0x0049 }
            java.lang.Object r3 = r13.m30238a((okio.Buffer) r0, (okio.Source) r11, (kotlin.coroutines.Continuation) r4)     // Catch:{ all -> 0x0049 }
            if (r3 != r5) goto L_0x00de
            return r5
        L_0x00de:
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ all -> 0x0049 }
            long r14 = r3.longValue()     // Catch:{ all -> 0x0049 }
            r16 = 0
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x012a
            com.saygames.saypromo.a.W3 r3 = r13.m30239b()     // Catch:{ all -> 0x0049 }
            r4.f25930a = r13     // Catch:{ all -> 0x0049 }
            r4.f25931b = r12     // Catch:{ all -> 0x0049 }
            r4.f25932c = r11     // Catch:{ all -> 0x0049 }
            r4.f25933d = r10     // Catch:{ all -> 0x0049 }
            r4.f25934e = r6     // Catch:{ all -> 0x0049 }
            r4.f25935f = r2     // Catch:{ all -> 0x0049 }
            r4.f25936g = r0     // Catch:{ all -> 0x0049 }
            r4.f25937h = r14     // Catch:{ all -> 0x0049 }
            r4.f25940k = r8     // Catch:{ all -> 0x0049 }
            com.saygames.saypromo.a.Y3 r3 = (com.saygames.saypromo.p378a.C10545Y3) r3     // Catch:{ all -> 0x0049 }
            java.lang.Object r3 = r3.mo65400a(r12, r14, r4)     // Catch:{ all -> 0x0049 }
            if (r3 != r5) goto L_0x0109
            return r5
        L_0x0109:
            r18 = r14
        L_0x010b:
            r4.f25930a = r13     // Catch:{ all -> 0x0049 }
            r4.f25931b = r12     // Catch:{ all -> 0x0049 }
            r4.f25932c = r11     // Catch:{ all -> 0x0049 }
            r4.f25933d = r10     // Catch:{ all -> 0x0049 }
            r4.f25934e = r6     // Catch:{ all -> 0x0049 }
            r4.f25935f = r2     // Catch:{ all -> 0x0049 }
            r4.f25936g = r0     // Catch:{ all -> 0x0049 }
            r4.f25940k = r7     // Catch:{ all -> 0x0049 }
            r16 = r13
            r17 = r0
            r20 = r2
            r21 = r4
            java.lang.Object r3 = r16.m30237a(r17, r18, r20, r21)     // Catch:{ all -> 0x0049 }
            if (r3 != r5) goto L_0x00c7
            return r5
        L_0x012a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0049 }
            r6.close()     // Catch:{ all -> 0x012f }
        L_0x012f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x013d }
            r10.close()     // Catch:{ all -> 0x0134 }
        L_0x0134:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0137:
            r0 = move-exception
            r10 = r2
        L_0x0139:
            r6.close()     // Catch:{ all -> 0x013c }
        L_0x013c:
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
            goto L_0x0141
        L_0x013f:
            r0 = move-exception
            r10 = r2
        L_0x0141:
            r2 = r10
            goto L_0x0144
        L_0x0143:
            r0 = move-exception
        L_0x0144:
            r2.close()     // Catch:{ all -> 0x0147 }
        L_0x0147:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10496R3.mo65371a(java.io.File, okio.Source, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
