package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.t3 */
public final class C10709t3 implements C10679p3 {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f26348b = {C10532W4.m30277a(C10709t3.class, "downloader", "getDownloader()Lcom/saygames/saypromo/common/Downloader;", 0)};

    /* renamed from: a */
    private final C10484P4 f26349a;

    C10709t3(C10491Q4 q4) {
        this.f26349a = q4;
    }

    /* renamed from: a */
    private final C10723v3 m30571a() {
        C10484P4 p4 = this.f26349a;
        KProperty kProperty = f26348b[0];
        return (C10723v3) ((C10491Q4) p4).mo65365a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65540a(com.saygames.saypromo.p378a.C10498R5 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.saygames.saypromo.p378a.C10687q3
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.saygames.saypromo.a.q3 r0 = (com.saygames.saypromo.p378a.C10687q3) r0
            int r1 = r0.f26316c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26316c = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.q3 r0 = new com.saygames.saypromo.a.q3
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f26314a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f26316c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            com.saygames.saypromo.a.v3 r6 = r4.m30571a()
            r0.f26316c = r3
            com.saygames.saypromo.a.y3 r6 = (com.saygames.saypromo.p378a.C10744y3) r6
            java.lang.Object r6 = r6.mo65549a((com.saygames.saypromo.p378a.C10498R5) r5, (kotlin.coroutines.Continuation) r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            okio.Source r6 = (okio.Source) r6
            r6.close()
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10709t3.mo65540a(com.saygames.saypromo.a.R5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65541b(com.saygames.saypromo.p378a.C10498R5 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.saygames.saypromo.p378a.C10695r3
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.saygames.saypromo.a.r3 r0 = (com.saygames.saypromo.p378a.C10695r3) r0
            int r1 = r0.f26325d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26325d = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.r3 r0 = new com.saygames.saypromo.a.r3
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f26323b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f26325d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            com.saygames.saypromo.a.R5 r5 = r0.f26322a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            com.saygames.saypromo.a.v3 r6 = r4.m30571a()
            r0.f26322a = r5
            r0.f26325d = r3
            com.saygames.saypromo.a.y3 r6 = (com.saygames.saypromo.p378a.C10744y3) r6
            java.lang.Object r6 = r6.mo65549a((com.saygames.saypromo.p378a.C10498R5) r5, (kotlin.coroutines.Continuation) r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            okio.Source r6 = (okio.Source) r6
            java.lang.String r5 = r5.toString()
            r0 = 0
            r1 = 2
            r2 = 0
            java.lang.String r3 = ".gz"
            boolean r5 = kotlin.text.StringsKt.endsWith$default(r5, r3, r0, r1, r2)
            if (r5 == 0) goto L_0x005e
            okio.GzipSource r5 = new okio.GzipSource
            r5.<init>(r6)
            return r5
        L_0x005e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10709t3.mo65541b(com.saygames.saypromo.a.R5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65542c(com.saygames.saypromo.p378a.C10498R5 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.saygames.saypromo.p378a.C10702s3
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.saygames.saypromo.a.s3 r0 = (com.saygames.saypromo.p378a.C10702s3) r0
            int r1 = r0.f26338e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26338e = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.s3 r0 = new com.saygames.saypromo.a.s3
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f26336c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f26338e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            okio.BufferedSource r6 = r0.f26335b
            okio.BufferedSource r0 = r0.f26334a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0030 }
            goto L_0x0064
        L_0x0030:
            r6 = move-exception
            goto L_0x0071
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0050
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r7)
            com.saygames.saypromo.a.v3 r7 = r5.m30571a()
            r0.f26338e = r4
            com.saygames.saypromo.a.y3 r7 = (com.saygames.saypromo.p378a.C10744y3) r7
            java.lang.Object r7 = r7.mo65549a((com.saygames.saypromo.p378a.C10498R5) r6, (kotlin.coroutines.Continuation) r0)
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            okio.Source r7 = (okio.Source) r7
            okio.BufferedSource r6 = okio.Okio.buffer((okio.Source) r7)
            r0.f26334a = r6     // Catch:{ all -> 0x006e }
            r0.f26335b = r6     // Catch:{ all -> 0x006e }
            r0.f26338e = r3     // Catch:{ all -> 0x006e }
            kotlin.Unit r7 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)     // Catch:{ all -> 0x006e }
            if (r7 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r6
        L_0x0064:
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x0030 }
            java.lang.String r6 = r6.readString(r7)     // Catch:{ all -> 0x0030 }
            r0.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            return r6
        L_0x006e:
            r7 = move-exception
            r0 = r6
            r6 = r7
        L_0x0071:
            r0.close()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10709t3.mo65542c(com.saygames.saypromo.a.R5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
