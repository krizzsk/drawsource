package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.e0 */
class C0826e0 {

    /* renamed from: c */
    static C0826e0 f456c = new C0826e0(3, true);

    /* renamed from: d */
    static C0826e0 f457d = new C0826e0(2, false);

    /* renamed from: e */
    static C0826e0 f458e = new C0826e0(2, true);

    /* renamed from: f */
    static C0826e0 f459f = new C0826e0(1, false);

    /* renamed from: g */
    static C0826e0 f460g = new C0826e0(1, true);

    /* renamed from: h */
    static C0826e0 f461h = new C0826e0(0, false);

    /* renamed from: i */
    static C0826e0 f462i = new C0826e0(0, true);

    /* renamed from: a */
    private final int f463a;

    /* renamed from: b */
    private final boolean f464b;

    /* renamed from: com.adcolony.sdk.e0$a */
    static class C0827a {

        /* renamed from: a */
        StringBuilder f465a = new StringBuilder();

        C0827a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0827a mo10746a(String str) {
            this.f465a.append(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0827a mo10745a(Object obj) {
            if (obj != null) {
                this.f465a.append(obj.toString());
            } else {
                this.f465a.append("null");
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0827a mo10744a(int i) {
            this.f465a.append(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10747a(C0826e0 e0Var) {
            e0Var.m505a(this.f465a.toString());
        }
    }

    static {
        new C0826e0(3, false);
    }

    C0826e0(int i, boolean z) {
        this.f463a = i;
        this.f464b = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m505a(String str) {
        C0723a.m193b().mo10908q().mo10823a(this.f463a, str, this.f464b);
    }
}
