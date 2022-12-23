package com.fyber.inneractive.sdk.player.cache;

/* renamed from: com.fyber.inneractive.sdk.player.cache.g */
public class C4555g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4556h f11290a;

    public C4555g(C4556h hVar) {
        this.f11290a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f11290a     // Catch:{ IOException -> 0x0042 }
            com.fyber.inneractive.sdk.player.cache.c$f r3 = r2.f11293c     // Catch:{ IOException -> 0x0042 }
            if (r3 != 0) goto L_0x0016
            com.fyber.inneractive.sdk.player.cache.c r3 = r2.f11292b     // Catch:{ IOException -> 0x0042 }
            java.lang.String r2 = r2.mo24764a()     // Catch:{ IOException -> 0x0042 }
            com.fyber.inneractive.sdk.player.cache.c$f r2 = r3.mo24733b(r2)     // Catch:{ IOException -> 0x0042 }
            com.fyber.inneractive.sdk.player.cache.h r3 = r10.f11290a     // Catch:{ IOException -> 0x0042 }
            r3.f11293c = r2     // Catch:{ IOException -> 0x0042 }
        L_0x0016:
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f11290a     // Catch:{ IOException -> 0x0042 }
            com.fyber.inneractive.sdk.player.cache.c$f r3 = r2.f11293c     // Catch:{ IOException -> 0x0042 }
            if (r3 != 0) goto L_0x0040
            com.fyber.inneractive.sdk.player.cache.c r3 = r2.f11292b     // Catch:{ IOException -> 0x0042 }
            java.lang.String r2 = r2.mo24764a()     // Catch:{ IOException -> 0x0042 }
            com.fyber.inneractive.sdk.player.cache.c$c r2 = r3.mo24730a((java.lang.String) r2)     // Catch:{ IOException -> 0x0042 }
            if (r2 != 0) goto L_0x002a
            r3 = r0
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            if (r2 == 0) goto L_0x005e
            r2.mo24746a()     // Catch:{ IOException -> 0x003e }
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f11290a     // Catch:{ IOException -> 0x003e }
            com.fyber.inneractive.sdk.player.cache.c$f r4 = r2.f11293c     // Catch:{ IOException -> 0x003e }
            if (r4 != 0) goto L_0x005e
            com.fyber.inneractive.sdk.player.cache.h$e r2 = r2.f11298h     // Catch:{ IOException -> 0x003e }
            if (r2 == 0) goto L_0x005e
            r2.start()     // Catch:{ IOException -> 0x003e }
            return
        L_0x003e:
            r2 = move-exception
            goto L_0x0044
        L_0x0040:
            r3 = r1
            goto L_0x005e
        L_0x0042:
            r2 = move-exception
            r3 = r1
        L_0x0044:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.fyber.inneractive.sdk.player.cache.h r5 = r10.f11290a
            java.lang.String r6 = r5.f11291a
            r4[r1] = r6
            java.lang.String r5 = r5.mo24764a()
            r4[r0] = r5
            java.lang.String r5 = "%s | Exception raised waiting on availbility for %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.m16445a(r4, r2, r5)
        L_0x005e:
            if (r3 == 0) goto L_0x0066
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f11290a
            com.fyber.inneractive.sdk.player.cache.C4556h.m13868b(r0, r1)
            goto L_0x00d5
        L_0x0066:
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f11290a
            boolean unused = r2.getClass()
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f11290a
            boolean unused = r2.f11305o = r1
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f11290a
            java.lang.String r4 = r2.mo24764a()
            com.fyber.inneractive.sdk.player.cache.h r3 = r10.f11290a
            java.lang.String r5 = r3.f11295e
            com.fyber.inneractive.sdk.player.cache.c r6 = r3.f11292b
            java.lang.String r3 = r3.mo24764a()
            java.io.File r6 = r6.mo24731a(r3, r1)
            com.fyber.inneractive.sdk.player.cache.h r3 = r10.f11290a
            java.lang.String r8 = r3.f11302l
            com.fyber.inneractive.sdk.player.cache.a r9 = new com.fyber.inneractive.sdk.player.cache.a
            r7 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r2.f11296f = r9
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f11290a
            com.fyber.inneractive.sdk.player.cache.a r2 = r2.f11296f
            java.lang.Object r2 = r2.f11232d
            monitor-enter(r2)
            com.fyber.inneractive.sdk.player.cache.h r3 = r10.f11290a     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.a r3 = r3.f11296f     // Catch:{ all -> 0x00d6 }
            java.io.File r3 = r3.f11229a     // Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x00a7
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = r1
        L_0x00a8:
            if (r0 == 0) goto L_0x00cf
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f11290a     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.b r1 = r0.f11294d     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.a r3 = r0.f11296f     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = r0.f11302l     // Catch:{ all -> 0x00d6 }
            r1.mo24729a(r3, r0)     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f11290a     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.a r1 = r0.f11296f     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.b r0 = r0.f11294d     // Catch:{ all -> 0x00d6 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f11235a     // Catch:{ all -> 0x00d6 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f11233e     // Catch:{ all -> 0x00d6 }
            r1.putAll(r0)     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f11290a     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.a r1 = r0.f11296f     // Catch:{ all -> 0x00d6 }
            r0.mo24765a((com.fyber.inneractive.sdk.player.cache.C4538a) r1)     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f11290a     // Catch:{ all -> 0x00d6 }
            r0.mo24768b()     // Catch:{ all -> 0x00d6 }
            goto L_0x00d4
        L_0x00cf:
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f11290a     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.C4556h.m13868b(r0, r1)     // Catch:{ all -> 0x00d6 }
        L_0x00d4:
            monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
        L_0x00d5:
            return
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4555g.run():void");
    }
}
