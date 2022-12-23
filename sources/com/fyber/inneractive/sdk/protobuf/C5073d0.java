package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.d0 */
public class C5073d0 {

    /* renamed from: a */
    public volatile C5149q0 f13535a;

    /* renamed from: b */
    public volatile C5093i f13536b;

    static {
        C5147q.m15950a();
    }

    /* renamed from: a */
    public C5093i mo25792a() {
        if (this.f13536b != null) {
            return this.f13536b;
        }
        synchronized (this) {
            if (this.f13536b != null) {
                C5093i iVar = this.f13536b;
                return iVar;
            }
            if (this.f13535a == null) {
                this.f13536b = C5093i.f13565b;
            } else {
                this.f13536b = this.f13535a.toByteString();
            }
            C5093i iVar2 = this.f13536b;
            return iVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5073d0)) {
            return false;
        }
        C5073d0 d0Var = (C5073d0) obj;
        C5149q0 q0Var = this.f13535a;
        C5149q0 q0Var2 = d0Var.f13535a;
        if (q0Var == null && q0Var2 == null) {
            return mo25792a().equals(d0Var.mo25792a());
        }
        if (q0Var != null && q0Var2 != null) {
            return q0Var.equals(q0Var2);
        }
        if (q0Var != null) {
            return q0Var.equals(d0Var.mo25793a(q0Var.getDefaultInstanceForType()));
        }
        return mo25793a(q0Var2.getDefaultInstanceForType()).equals(q0Var2);
    }

    public int hashCode() {
        return 1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.protobuf.C5149q0 mo25793a(com.fyber.inneractive.sdk.protobuf.C5149q0 r2) {
        /*
            r1 = this;
            com.fyber.inneractive.sdk.protobuf.q0 r0 = r1.f13535a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            com.fyber.inneractive.sdk.protobuf.q0 r0 = r1.f13535a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f13535a = r2     // Catch:{ a0 -> 0x0013 }
            com.fyber.inneractive.sdk.protobuf.i r0 = com.fyber.inneractive.sdk.protobuf.C5093i.f13565b     // Catch:{ a0 -> 0x0013 }
            r1.f13536b = r0     // Catch:{ a0 -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f13535a = r2     // Catch:{ all -> 0x001d }
            com.fyber.inneractive.sdk.protobuf.i r2 = com.fyber.inneractive.sdk.protobuf.C5093i.f13565b     // Catch:{ all -> 0x001d }
            r1.f13536b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            com.fyber.inneractive.sdk.protobuf.q0 r2 = r1.f13535a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5073d0.mo25793a(com.fyber.inneractive.sdk.protobuf.q0):com.fyber.inneractive.sdk.protobuf.q0");
    }
}
