package com.fyber.inneractive.sdk.config;

/* renamed from: com.fyber.inneractive.sdk.config.u */
public class C4283u {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        com.fyber.inneractive.sdk.util.IAlog.m16449d("Handled Exception:", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.util.IAlog.m16449d(com.fyber.inneractive.sdk.util.C5312s.m16534a((java.lang.Throwable) r5), new java.lang.Object[0]);
        com.fyber.inneractive.sdk.util.IAlog.m16448c("Advertising ID is not available. Please add Google Play Services library (v 4.0+) to improve your ad targeting. (relevant for devices running Android API 2.3 and above)", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13313a(android.content.Context r5, com.fyber.inneractive.sdk.config.C4282t r6) {
        /*
            r0 = 0
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r5 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r5)     // Catch:{ Exception -> 0x0034 }
            java.lang.String r1 = r5.getId()     // Catch:{ Exception -> 0x0034 }
            java.lang.String r2 = "advertising id: %s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0034 }
            r4[r0] = r1     // Catch:{ Exception -> 0x0034 }
            com.fyber.inneractive.sdk.util.IAlog.m16449d(r2, r4)     // Catch:{ Exception -> 0x0034 }
            boolean r5 = r5.isLimitAdTrackingEnabled()     // Catch:{ Exception -> 0x0034 }
            java.lang.String r2 = "limit ad tracking: %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0034 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x0034 }
            r3[r0] = r4     // Catch:{ Exception -> 0x0034 }
            com.fyber.inneractive.sdk.util.IAlog.m16449d(r2, r3)     // Catch:{ Exception -> 0x0034 }
            com.fyber.inneractive.sdk.config.k r6 = (com.fyber.inneractive.sdk.config.C4257k) r6     // Catch:{ Exception -> 0x0034 }
            monitor-enter(r6)     // Catch:{ Exception -> 0x0034 }
            com.fyber.inneractive.sdk.config.k$c r2 = r6.f10466b     // Catch:{ all -> 0x0031 }
            r2.f10468a = r1     // Catch:{ all -> 0x0031 }
            r2.f10469b = r5     // Catch:{ all -> 0x0031 }
            r2.f10470c = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r6)     // Catch:{ Exception -> 0x0034 }
            goto L_0x004c
        L_0x0031:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ Exception -> 0x0034 }
            throw r5     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r1 = "Handled Exception:"
            com.fyber.inneractive.sdk.util.IAlog.m16449d(r1, r6)
            java.lang.String r5 = com.fyber.inneractive.sdk.util.C5312s.m16534a((java.lang.Throwable) r5)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.fyber.inneractive.sdk.util.IAlog.m16449d(r5, r6)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r6 = "Advertising ID is not available. Please add Google Play Services library (v 4.0+) to improve your ad targeting. (relevant for devices running Android API 2.3 and above)"
            com.fyber.inneractive.sdk.util.IAlog.m16448c(r6, r5)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.C4283u.m13313a(android.content.Context, com.fyber.inneractive.sdk.config.t):void");
    }
}
