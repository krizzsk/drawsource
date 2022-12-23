package com.ogury.p376cm.internal;

import java.util.Iterator;

/* renamed from: com.ogury.cm.internal.bbbca */
public final class bbbca<T, R> implements bbbba<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final bbbba<T> f24542a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bbaab<T, R> f24543b;

    /* renamed from: com.ogury.cm.internal.bbbca$aaaaa */
    public static final class aaaaa implements Iterator<R> {

        /* renamed from: a */
        final /* synthetic */ bbbca f24544a;

        /* renamed from: b */
        private final Iterator<T> f24545b;

        aaaaa(bbbca bbbca) {
            this.f24544a = bbbca;
            this.f24545b = bbbca.f24542a.mo63994a();
        }

        public final boolean hasNext() {
            return this.f24545b.hasNext();
        }

        public final R next() {
            return this.f24544a.f24543b.mo63791a(this.f24545b.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bbbca(bbbba<? extends T> bbbba, bbaab<? super T, ? extends R> bbaab) {
        bbabc.m28052b(bbbba, "sequence");
        bbabc.m28052b(bbaab, "transformer");
        this.f24542a = bbbba;
        this.f24543b = bbaab;
    }

    /* renamed from: a */
    public final Iterator<R> mo63994a() {
        return new aaaaa(this);
    }
}
