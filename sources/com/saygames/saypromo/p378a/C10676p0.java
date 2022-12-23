package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.p0 */
public final class C10676p0 implements C10660n0 {

    /* renamed from: f */
    static final /* synthetic */ KProperty[] f26299f;

    /* renamed from: a */
    private final C10484P4 f26300a;

    /* renamed from: b */
    private final C10484P4 f26301b;

    /* renamed from: c */
    private final C10484P4 f26302c;

    /* renamed from: d */
    private final C10484P4 f26303d;

    /* renamed from: e */
    private final C10484P4 f26304e;

    static {
        Class<C10676p0> cls = C10676p0.class;
        f26299f = new KProperty[]{C10532W4.m30277a(cls, "base64Manager", "getBase64Manager()Lcom/saygames/saypromo/manager/Base64Manager;", 0), C10532W4.m30277a(cls, "downloadManager", "getDownloadManager()Lcom/saygames/saypromo/manager/DownloadManager;", 0), C10532W4.m30277a(cls, "eventsManager", "getEventsManager()Lcom/saygames/saypromo/manager/EventsManager;", 0), C10532W4.m30277a(cls, "timeDiffer", "getTimeDiffer()Lcom/saygames/saypromo/common/TimeDiffer;", 0), C10532W4.m30277a(cls, "urlManager", "getUrlManager()Lcom/saygames/saypromo/manager/UrlManager;", 0)};
    }

    C10676p0(C10491Q4 q4, C10491Q4 q42, C10491Q4 q43, C10491Q4 q44, C10491Q4 q45) {
        this.f26300a = q4;
        this.f26301b = q42;
        this.f26302c = q43;
        this.f26303d = q44;
        this.f26304e = q45;
    }

    /* renamed from: a */
    private final C10589e1 m30543a() {
        C10484P4 p4 = this.f26300a;
        KProperty kProperty = f26299f[0];
        return (C10589e1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: b */
    private final C10679p3 m30544b() {
        C10484P4 p4 = this.f26301b;
        KProperty kProperty = f26299f[1];
        return (C10679p3) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: c */
    private final C10413F3 m30545c() {
        C10484P4 p4 = this.f26302c;
        KProperty kProperty = f26299f[2];
        return (C10413F3) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: d */
    private final C10401D5 m30546d() {
        C10484P4 p4 = this.f26303d;
        KProperty kProperty = f26299f[3];
        return (C10401D5) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: e */
    private final C10505S5 m30547e() {
        C10484P4 p4 = this.f26304e;
        KProperty kProperty = f26299f[4];
        return (C10505S5) ((C10491Q4) p4).mo65365a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65523a(com.saygames.saypromo.p378a.C10403E0 r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.saygames.saypromo.p378a.C10668o0
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.saygames.saypromo.a.o0 r0 = (com.saygames.saypromo.p378a.C10668o0) r0
            int r1 = r0.f26291f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26291f = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.o0 r0 = new com.saygames.saypromo.a.o0
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f26289d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f26291f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00a6
        L_0x002d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0035:
            java.lang.String r14 = r0.f26288c
            com.saygames.saypromo.a.E0 r13 = r0.f26287b
            com.saygames.saypromo.a.p0 r2 = r0.f26286a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0052
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r15)
            r0.f26286a = r12
            r0.f26287b = r13
            r0.f26288c = r14
            r0.f26291f = r4
            kotlin.Unit r15 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)
            if (r15 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r2 = r12
        L_0x0052:
            if (r14 != 0) goto L_0x00a7
            com.saygames.saypromo.a.S5 r14 = r2.m30547e()
            java.lang.String r15 = r13.mo65277a()
            java.lang.String r4 = r13.mo65280d()
            com.saygames.saypromo.a.T5 r14 = (com.saygames.saypromo.p378a.C10512T5) r14
            com.saygames.saypromo.a.R5 r14 = r14.mo65387a(r15, r4)
            java.lang.String r11 = r14.toString()
            com.saygames.saypromo.a.F3 r15 = r2.m30545c()
            java.lang.String r6 = r13.mo65277a()
            java.lang.String r7 = r13.mo65280d()
            java.lang.String r8 = r13.mo65278b()
            com.saygames.saypromo.a.D5 r4 = r2.m30546d()
            long r9 = r13.mo65281e()
            com.saygames.saypromo.a.E5 r4 = (com.saygames.saypromo.p378a.C10408E5) r4
            long r9 = r4.mo65292a(r9)
            r4 = r15
            com.saygames.saypromo.a.G3 r4 = (com.saygames.saypromo.p378a.C10420G3) r4
            java.lang.String r5 = "request_load_json"
            r4.mo65306a(r5, r6, r7, r8, r9, r11)
            com.saygames.saypromo.a.p3 r13 = r2.m30544b()
            r15 = 0
            r0.f26286a = r15
            r0.f26287b = r15
            r0.f26288c = r15
            r0.f26291f = r3
            com.saygames.saypromo.a.t3 r13 = (com.saygames.saypromo.p378a.C10709t3) r13
            java.lang.Object r15 = r13.mo65542c(r14, r0)
            if (r15 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            return r15
        L_0x00a7:
            r10 = 0
            com.saygames.saypromo.a.F3 r15 = r2.m30545c()
            java.lang.String r5 = r13.mo65277a()
            java.lang.String r6 = r13.mo65280d()
            java.lang.String r7 = r13.mo65278b()
            com.saygames.saypromo.a.D5 r0 = r2.m30546d()
            long r3 = r13.mo65281e()
            com.saygames.saypromo.a.E5 r0 = (com.saygames.saypromo.p378a.C10408E5) r0
            long r8 = r0.mo65292a(r3)
            r3 = r15
            com.saygames.saypromo.a.G3 r3 = (com.saygames.saypromo.p378a.C10420G3) r3
            java.lang.String r4 = "request_decode_json"
            r3.mo65306a(r4, r5, r6, r7, r8, r10)
            com.saygames.saypromo.a.e1 r13 = r2.m30543a()
            com.saygames.saypromo.a.f1 r13 = (com.saygames.saypromo.p378a.C10597f1) r13
            java.lang.String r13 = r13.mo65452a(r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10676p0.mo65523a(com.saygames.saypromo.a.E0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
