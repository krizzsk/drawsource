package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.y0 */
public final class C10741y0 implements C10720v0 {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f26373b = {C10532W4.m30277a(C10741y0.class, "jsonManager", "getJsonManager()Lcom/saygames/saypromo/manager/JsonManager;", 0)};

    /* renamed from: a */
    private final C10484P4 f26374a;

    C10741y0(C10491Q4 q4) {
        this.f26374a = q4;
    }

    /* renamed from: a */
    private final C10584d4 m30586a() {
        C10484P4 p4 = this.f26374a;
        KProperty kProperty = f26373b[0];
        return (C10584d4) ((C10491Q4) p4).mo65365a();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m30588a(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.saygames.saypromo.p378a.C10727w0
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.saygames.saypromo.a.w0 r0 = (com.saygames.saypromo.p378a.C10727w0) r0
            int r1 = r0.f26358c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26358c = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.w0 r0 = new com.saygames.saypromo.a.w0
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f26356a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f26358c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x0044 }
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            com.saygames.saypromo.a.d4 r6 = r4.m30586a()     // Catch:{ all -> 0x0044 }
            r0.f26358c = r3     // Catch:{ all -> 0x0044 }
            com.saygames.saypromo.a.j4 r6 = (com.saygames.saypromo.p378a.C10632j4) r6     // Catch:{ all -> 0x0044 }
            java.lang.Object r6 = r6.mo65488a((java.lang.String) r5, (kotlin.coroutines.Continuation) r0)     // Catch:{ all -> 0x0044 }
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            return r6
        L_0x0044:
            r5 = move-exception
            com.saygames.saypromo.p378a.C10387B5.m30073b(r5)
            com.saygames.saypromo.SayPromoThrowable$Load$Format r6 = new com.saygames.saypromo.SayPromoThrowable$Load$Format
            java.lang.String r0 = "Failed to deserialize json"
            r6.<init>(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10741y0.m30588a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65548b(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.saygames.saypromo.p378a.C10734x0
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.saygames.saypromo.a.x0 r0 = (com.saygames.saypromo.p378a.C10734x0) r0
            int r1 = r0.f26366c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26366c = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.x0 r0 = new com.saygames.saypromo.a.x0
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f26364a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f26366c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f26366c = r3
            java.lang.Object r6 = r4.m30588a((java.lang.String) r5, (kotlin.coroutines.Continuation) r0)
            if (r6 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.saygames.saypromo.a.e0 r6 = (com.saygames.saypromo.p378a.C10588e0) r6
            boolean r5 = r6 instanceof com.saygames.saypromo.p378a.C10580d0
            if (r5 == 0) goto L_0x0044
            return r6
        L_0x0044:
            com.saygames.saypromo.SayPromoThrowable$Load$NoFill r5 = new com.saygames.saypromo.SayPromoThrowable$Load$NoFill
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10741y0.mo65548b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
