package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.Q0 */
public final class C10487Q0 implements C10466N0 {

    /* renamed from: d */
    static final /* synthetic */ KProperty[] f25941d = {C10532W4.m30277a(C10487Q0.class, "advertisingClient", "getAdvertisingClient()Lcom/saygames/saypromo/common/AdvertisingClient;", 0)};

    /* renamed from: a */
    private final C10484P4 f25942a;

    /* renamed from: b */
    private final C10717u4 f25943b = new C10717u4();

    /* renamed from: c */
    private C10473O0 f25944c;

    C10487Q0(C10491Q4 q4) {
        this.f25942a = q4;
    }

    /* renamed from: a */
    private final C10438J0 m30224a() {
        C10484P4 p4 = this.f25942a;
        KProperty kProperty = f25941d[0];
        return (C10438J0) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: b */
    public final C10473O0 mo65364b() {
        C10473O0 o0 = this.f25944c;
        return o0 == null ? new C10473O0(false, "00000000-0000-0000-0000-000000000000") : o0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65363a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.saygames.saypromo.p378a.C10480P0
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.saygames.saypromo.a.P0 r0 = (com.saygames.saypromo.p378a.C10480P0) r0
            int r1 = r0.f25922d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f25922d = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.P0 r0 = new com.saygames.saypromo.a.P0
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f25920b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f25922d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            com.saygames.saypromo.a.Q0 r0 = r0.f25919a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0042
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f25919a = r4
            r0.f25922d = r3
            kotlin.Unit r5 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            r0 = r4
        L_0x0042:
            com.saygames.saypromo.a.O0 r5 = r0.f25944c
            if (r5 != 0) goto L_0x0082
            com.saygames.saypromo.a.u4 r5 = r0.f25943b
            java.lang.Object r5 = r5.f26352a
            monitor-enter(r5)
            com.saygames.saypromo.a.O0 r1 = r0.f25944c     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x007c
            com.saygames.saypromo.a.J0 r1 = r0.m30224a()     // Catch:{ all -> 0x007f }
            r2 = 0
            com.saygames.saypromo.a.L0 r1 = (com.saygames.saypromo.p378a.C10452L0) r1     // Catch:{ all -> 0x005d }
            com.saygames.saypromo.a.K0 r1 = r1.mo65350a()     // Catch:{ all -> 0x005d }
            goto L_0x005e
        L_0x005d:
            r1 = r2
        L_0x005e:
            if (r1 == 0) goto L_0x0065
            boolean r3 = r1.mo65347b()     // Catch:{ all -> 0x007f }
            goto L_0x0066
        L_0x0065:
            r3 = 0
        L_0x0066:
            if (r1 == 0) goto L_0x006c
            java.lang.String r2 = r1.mo65346a()     // Catch:{ all -> 0x007f }
        L_0x006c:
            java.lang.String r1 = com.saygames.saypromo.p378a.C10485P5.m30223b(r2)     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x0074
            java.lang.String r1 = "00000000-0000-0000-0000-000000000000"
        L_0x0074:
            com.saygames.saypromo.a.O0 r2 = new com.saygames.saypromo.a.O0     // Catch:{ all -> 0x007f }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x007f }
            r0.f25944c = r2     // Catch:{ all -> 0x007f }
            r1 = r2
        L_0x007c:
            monitor-exit(r5)
            r5 = r1
            goto L_0x0082
        L_0x007f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0082:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10487Q0.mo65363a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
