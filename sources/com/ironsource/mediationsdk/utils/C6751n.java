package com.ironsource.mediationsdk.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.utils.n */
public final class C6751n {

    /* renamed from: a */
    private Map<String, Integer> f17780a = new HashMap();

    /* renamed from: b */
    private Map<String, Integer> f17781b = new HashMap();

    /* renamed from: com.ironsource.mediationsdk.utils.n$a */
    public interface C6752a {
        /* renamed from: j */
        int mo36387j();

        /* renamed from: k */
        String mo36388k();
    }

    public C6751n(List<C6752a> list) {
        for (C6752a next : list) {
            this.f17780a.put(next.mo36388k(), 0);
            this.f17781b.put(next.mo36388k(), Integer.valueOf(next.mo36387j()));
        }
    }

    /* renamed from: a */
    public final void mo36985a(C6752a aVar) {
        synchronized (this) {
            String k = aVar.mo36388k();
            if (this.f17780a.containsKey(k)) {
                this.f17780a.put(k, Integer.valueOf(this.f17780a.get(k).intValue() + 1));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo36986a() {
        for (String next : this.f17781b.keySet()) {
            if (this.f17780a.get(next).intValue() < this.f17781b.get(next).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36987b(com.ironsource.mediationsdk.utils.C6751n.C6752a r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r4.mo36388k()     // Catch:{ all -> 0x0025 }
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f17780a     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0025 }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f17780a     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0025 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0025 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0025 }
            int r4 = r4.mo36387j()     // Catch:{ all -> 0x0025 }
            if (r0 < r4) goto L_0x0021
            r2 = 1
        L_0x0021:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6751n.mo36987b(com.ironsource.mediationsdk.utils.n$a):boolean");
    }
}
