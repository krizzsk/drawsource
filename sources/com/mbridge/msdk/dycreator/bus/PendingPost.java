package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

final class PendingPost {

    /* renamed from: d */
    private static final List<PendingPost> f20413d = new ArrayList();

    /* renamed from: a */
    Object f20414a;

    /* renamed from: b */
    Subscription f20415b;

    /* renamed from: c */
    PendingPost f20416c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f20414a = obj;
        this.f20415b = subscription;
    }

    /* renamed from: a */
    static PendingPost m23806a(Subscription subscription, Object obj) {
        synchronized (f20413d) {
            int size = f20413d.size();
            if (size <= 0) {
                return new PendingPost(obj, subscription);
            }
            PendingPost remove = f20413d.remove(size - 1);
            remove.f20414a = obj;
            remove.f20415b = subscription;
            remove.f20416c = null;
            return remove;
        }
    }

    /* renamed from: a */
    static void m23807a(PendingPost pendingPost) {
        pendingPost.f20414a = null;
        pendingPost.f20415b = null;
        pendingPost.f20416c = null;
        synchronized (f20413d) {
            if (f20413d.size() < 10000) {
                f20413d.add(pendingPost);
            }
        }
    }
}
