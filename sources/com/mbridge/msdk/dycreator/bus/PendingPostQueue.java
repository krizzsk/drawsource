package com.mbridge.msdk.dycreator.bus;

final class PendingPostQueue {

    /* renamed from: a */
    private PendingPost f20417a;

    /* renamed from: b */
    private PendingPost f20418b;

    PendingPostQueue() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo56871a(PendingPost pendingPost) {
        if (pendingPost != null) {
            try {
                if (this.f20418b != null) {
                    this.f20418b.f20416c = pendingPost;
                    this.f20418b = pendingPost;
                } else if (this.f20417a == null) {
                    this.f20418b = pendingPost;
                    this.f20417a = pendingPost;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized PendingPost mo56869a() {
        PendingPost pendingPost;
        pendingPost = this.f20417a;
        if (this.f20417a != null) {
            PendingPost pendingPost2 = this.f20417a.f20416c;
            this.f20417a = pendingPost2;
            if (pendingPost2 == null) {
                this.f20418b = null;
            }
        }
        return pendingPost;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized PendingPost mo56870a(int i) throws InterruptedException {
        if (this.f20417a == null) {
            wait((long) i);
        }
        return mo56869a();
    }
}
