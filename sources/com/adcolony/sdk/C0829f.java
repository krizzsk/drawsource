package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.f */
class C0829f {

    /* renamed from: a */
    private boolean f467a;

    C0829f() {
    }

    /* renamed from: a */
    public synchronized void mo10762a(long j) {
        if (!this.f467a) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo10763a(boolean z) {
        this.f467a = z;
        if (z) {
            notifyAll();
        }
    }

    /* renamed from: a */
    public boolean mo10764a() {
        return this.f467a;
    }
}
