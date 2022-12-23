package com.tapjoy.internal;

import java.io.File;

/* renamed from: com.tapjoy.internal.hh */
public final class C11555hh implements Runnable {

    /* renamed from: a */
    final C11584hv f27725a;

    /* renamed from: b */
    C11317bx f27726b;

    /* renamed from: c */
    private final Object f27727c;

    /* renamed from: d */
    private final Thread f27728d;

    /* renamed from: e */
    private boolean f27729e;

    public C11555hh(File file) {
        C11584hv hvVar = new C11584hv(file);
        this.f27725a = hvVar;
        this.f27727c = hvVar;
        Object[] objArr = new Object[1];
        Integer.valueOf(hvVar.mo70169a());
        Thread thread = new Thread(this, "5Rocks");
        this.f27728d = thread;
        thread.start();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00e5 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092 A[Catch:{ Exception | InterruptedException -> 0x00fd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            r0 = 1
            r1 = r0
        L_0x0002:
            r2 = 0
            r3 = 0
            r5 = r3
        L_0x0006:
            com.tapjoy.internal.bx r7 = r14.f27726b     // Catch:{ Exception | InterruptedException -> 0x00fd }
            if (r7 == 0) goto L_0x00f3
            com.tapjoy.internal.hv r7 = r14.f27725a     // Catch:{ Exception | InterruptedException -> 0x00fd }
            int r7 = r7.mo70169a()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            if (r7 <= 0) goto L_0x00f3
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x00f3
            com.tapjoy.internal.hv r7 = r14.f27725a     // Catch:{ Exception | InterruptedException -> 0x00fd }
            int r7 = r7.mo70169a()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r7 <= r8) goto L_0x002c
            com.tapjoy.internal.hv r7 = r14.f27725a     // Catch:{ Exception | InterruptedException -> 0x00fd }
            com.tapjoy.internal.hv r9 = r14.f27725a     // Catch:{ Exception | InterruptedException -> 0x00fd }
            int r9 = r9.mo70169a()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            int r9 = r9 - r8
            r7.mo70170a((int) r9)     // Catch:{ Exception | InterruptedException -> 0x00fd }
        L_0x002c:
            com.tapjoy.internal.hv r7 = r14.f27725a     // Catch:{ Exception | InterruptedException -> 0x00fd }
            com.tapjoy.internal.ex r7 = r7.mo70172b(r2)     // Catch:{ Exception | InterruptedException -> 0x00fd }
            if (r7 == 0) goto L_0x00f3
            com.tapjoy.internal.fj r5 = r7.f27320w     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r8 = 3
            if (r5 == 0) goto L_0x0045
            java.lang.String r5 = r5.f27500G     // Catch:{ Exception | InterruptedException -> 0x00fd }
            if (r5 != 0) goto L_0x0045
            java.util.concurrent.CountDownLatch r5 = com.tapjoy.internal.C11589hx.f27870c     // Catch:{ Exception | InterruptedException -> 0x00fd }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r5.await(r8, r6)     // Catch:{ Exception | InterruptedException -> 0x00fd }
        L_0x0045:
            boolean r5 = com.tapjoy.internal.C11685u.m32056c()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            if (r5 != 0) goto L_0x0052
            java.util.concurrent.CountDownLatch r5 = com.tapjoy.internal.C11589hx.f27869b     // Catch:{ Exception | InterruptedException -> 0x00fd }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r5.await(r8, r6)     // Catch:{ Exception | InterruptedException -> 0x00fd }
        L_0x0052:
            boolean r5 = r14.f27729e     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r6 = 100
            if (r5 != 0) goto L_0x008d
            com.tapjoy.internal.fa r5 = r7.f27311n     // Catch:{ Exception | InterruptedException -> 0x00fd }
            com.tapjoy.internal.fa r8 = com.tapjoy.internal.C11445fa.APP     // Catch:{ Exception | InterruptedException -> 0x00fd }
            if (r5 == r8) goto L_0x008d
            com.tapjoy.internal.hv r5 = r14.f27725a     // Catch:{ Exception | InterruptedException -> 0x00fd }
            int r5 = r5.mo70169a()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            if (r5 >= r6) goto L_0x008d
            java.lang.Long r5 = r7.f27313p     // Catch:{ Exception | InterruptedException -> 0x00fd }
            long r8 = r5.longValue()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0075
            goto L_0x008d
        L_0x0075:
            java.lang.Long r5 = r7.f27313p     // Catch:{ Exception | InterruptedException -> 0x00fd }
            long r8 = r5.longValue()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r10 = 60000(0xea60, double:2.9644E-319)
            long r8 = r8 + r10
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            long r8 = r8 - r12
            long r8 = java.lang.Math.max(r8, r3)     // Catch:{ Exception | InterruptedException -> 0x00fd }
            long r8 = java.lang.Math.min(r8, r10)     // Catch:{ Exception | InterruptedException -> 0x00fd }
            goto L_0x008e
        L_0x008d:
            r8 = r3
        L_0x008e:
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x00e1
            com.tapjoy.internal.iu r5 = new com.tapjoy.internal.iu     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r5.<init>()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r5.mo70223a(r7)     // Catch:{ Exception | InterruptedException -> 0x00fd }
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r7 = r0
        L_0x009d:
            if (r7 >= r6) goto L_0x00ba
            com.tapjoy.internal.hv r10 = r14.f27725a     // Catch:{ Exception | InterruptedException -> 0x00fd }
            int r10 = r10.mo70169a()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            if (r7 >= r10) goto L_0x00ba
            com.tapjoy.internal.hv r10 = r14.f27725a     // Catch:{ Exception | InterruptedException -> 0x00fd }
            com.tapjoy.internal.ex r10 = r10.mo70172b(r7)     // Catch:{ Exception | InterruptedException -> 0x00fd }
            if (r10 == 0) goto L_0x00ba
            boolean r10 = r5.mo70223a(r10)     // Catch:{ Exception | InterruptedException -> 0x00fd }
            if (r10 == 0) goto L_0x00ba
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ Exception | InterruptedException -> 0x00fd }
            int r7 = r7 + 1
            goto L_0x009d
        L_0x00ba:
            int r1 = r1 + 1
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00e5 }
            int r7 = r5.mo70224g()     // Catch:{ Exception -> 0x00e5 }
            java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00e5 }
            java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00e5 }
            com.tapjoy.internal.bx r7 = r14.f27726b     // Catch:{ Exception -> 0x00e5 }
            r7.mo69762a(r5)     // Catch:{ Exception -> 0x00e5 }
            com.tapjoy.internal.hv r7 = r14.f27725a     // Catch:{ Exception -> 0x00e5 }
            int r10 = r5.mo70224g()     // Catch:{ Exception -> 0x00e5 }
            r7.mo70170a((int) r10)     // Catch:{ Exception -> 0x00e5 }
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00e4 }
            int r1 = r5.mo70224g()     // Catch:{ Exception -> 0x00e4 }
            java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00e4 }
            r1 = r2
        L_0x00e1:
            r5 = r8
            goto L_0x0006
        L_0x00e4:
            r1 = r2
        L_0x00e5:
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception | InterruptedException -> 0x00fd }
            int r5 = r5.mo70224g()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            java.lang.Integer.valueOf(r5)     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r5 = 300000(0x493e0, double:1.482197E-318)
            goto L_0x0006
        L_0x00f3:
            com.tapjoy.internal.hv r2 = r14.f27725a     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r2.flush()     // Catch:{ Exception | InterruptedException -> 0x00fd }
            r14.m31630a((long) r5)     // Catch:{ Exception | InterruptedException -> 0x00fd }
            goto L_0x0002
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11555hh.run():void");
    }

    /* renamed from: a */
    private void m31630a(long j) {
        if (j > 0) {
            synchronized (this.f27727c) {
                this.f27729e = false;
                Object[] objArr = new Object[1];
                Long.valueOf(j);
                this.f27727c.wait(j);
            }
            return;
        }
        synchronized (this.f27727c) {
            this.f27729e = false;
            if (this.f27726b == null || this.f27725a.mo70173b()) {
                this.f27727c.wait();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70098a(boolean z) {
        synchronized (this.f27727c) {
            this.f27729e = z;
            this.f27727c.notify();
        }
    }

    /* renamed from: a */
    public final void mo70097a() {
        if (this.f27726b != null && !this.f27725a.mo70173b()) {
            mo70098a(true);
        }
    }
}
