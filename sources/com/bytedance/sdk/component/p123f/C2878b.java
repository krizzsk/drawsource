package com.bytedance.sdk.component.p123f;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.C2905l;

/* renamed from: com.bytedance.sdk.component.f.b */
/* compiled from: DelegateRunnable */
class C2878b implements Comparable, Runnable {

    /* renamed from: a */
    private C2885g f6473a = null;

    /* renamed from: b */
    private C2874a f6474b = null;

    /* renamed from: c */
    private long f6475c = 0;

    /* renamed from: d */
    private Thread f6476d = null;

    public C2878b(C2885g gVar, C2874a aVar) {
        this.f6473a = gVar;
        this.f6474b = aVar;
        this.f6475c = SystemClock.uptimeMillis();
    }

    public void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.f6475c;
        this.f6476d = Thread.currentThread();
        C2885g gVar = this.f6473a;
        if (gVar != null) {
            gVar.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.f6474b != null) {
            C2880d.m8028a();
        }
        if (C2905l.m8108a()) {
            Object[] objArr = new Object[8];
            objArr[0] = "run: pool  = ";
            C2874a aVar = this.f6474b;
            String str = "null";
            objArr[1] = aVar != null ? aVar.mo17770a() : str;
            objArr[2] = " waitTime =";
            objArr[3] = Long.valueOf(j);
            objArr[4] = " taskCost = ";
            objArr[5] = Long.valueOf(uptimeMillis2);
            objArr[6] = " name=";
            C2885g gVar2 = this.f6473a;
            if (gVar2 != null) {
                str = gVar2.mo17801b();
            }
            objArr[7] = str;
            C2905l.m8107a("DelegateRunnable", objArr);
        }
    }

    /* renamed from: a */
    public C2885g mo17785a() {
        return this.f6473a;
    }

    public int compareTo(Object obj) {
        if (obj instanceof C2878b) {
            return this.f6473a.compareTo(((C2878b) obj).mo17785a());
        }
        return 0;
    }

    public int hashCode() {
        return this.f6473a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f6473a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof com.bytedance.sdk.component.p123f.C2878b
            if (r0 == 0) goto L_0x0016
            com.bytedance.sdk.component.f.g r0 = r1.f6473a
            if (r0 == 0) goto L_0x0016
            com.bytedance.sdk.component.f.b r2 = (com.bytedance.sdk.component.p123f.C2878b) r2
            com.bytedance.sdk.component.f.g r2 = r2.mo17785a()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p123f.C2878b.equals(java.lang.Object):boolean");
    }
}
