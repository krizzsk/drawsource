package com.saygames.saypromo.p378a;

/* renamed from: com.saygames.saypromo.a.N4 */
public final class C10470N4 implements C10449K4 {
    C10470N4() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093 A[Catch:{ all -> 0x009a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo65358a(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.saygames.saypromo.p378a.C10456L4
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.saygames.saypromo.a.L4 r0 = (com.saygames.saypromo.p378a.C10456L4) r0
            int r1 = r0.f25887d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f25887d = r1
            goto L_0x0018
        L_0x0013:
            com.saygames.saypromo.a.L4 r0 = new com.saygames.saypromo.a.L4
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f25885b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f25887d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r7 = r0.f25884a
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x009a }
            goto L_0x0094
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            java.lang.Object r7 = r0.f25884a
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x006f
        L_0x0043:
            java.lang.Object r7 = r0.f25884a
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0059
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f25884a = r7
            r0.f25887d = r5
            kotlin.Unit r8 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            java.net.URL r8 = new java.net.URL
            r8.<init>(r7)
            java.net.URLConnection r7 = r8.openConnection()
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7
            r0.f25884a = r7
            r0.f25887d = r4
            kotlin.Unit r8 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r8 = 30000(0x7530, float:4.2039E-41)
            r7.setConnectTimeout(r8)     // Catch:{ all -> 0x009a }
            r7.setReadTimeout(r8)     // Catch:{ all -> 0x009a }
            r7.setDoInput(r5)     // Catch:{ all -> 0x009a }
            r8 = 0
            r7.setDoOutput(r8)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "GET"
            r7.setRequestMethod(r2)     // Catch:{ all -> 0x009a }
            r7.setUseCaches(r8)     // Catch:{ all -> 0x009a }
            r7.connect()     // Catch:{ all -> 0x009a }
            r0.f25884a = r7     // Catch:{ all -> 0x009a }
            r0.f25887d = r3     // Catch:{ all -> 0x009a }
            kotlin.Unit r8 = com.saygames.saypromo.p378a.C10439J1.m30179a(r0)     // Catch:{ all -> 0x009a }
            if (r8 != r1) goto L_0x0094
            return r1
        L_0x0094:
            com.saygames.saypromo.a.M4 r8 = new com.saygames.saypromo.a.M4     // Catch:{ all -> 0x009a }
            r8.<init>(r7)     // Catch:{ all -> 0x009a }
            return r8
        L_0x009a:
            r8 = move-exception
            r7.disconnect()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10470N4.mo65358a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
