package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.aj */
public final class C11266aj {

    /* renamed from: com.tapjoy.internal.aj$a */
    public static final class C11267a<K, V> implements C11270am<K, V> {

        /* renamed from: a */
        private final C11268ak<K, V> f26930a;

        public C11267a(C11268ak<K, V> akVar) {
            this.f26930a = akVar;
        }

        /* renamed from: a */
        public final V mo69624a(K k) {
            C11265ai<V> a;
            V a2;
            synchronized (this.f26930a) {
                a = this.f26930a.mo69626a(k, false);
            }
            if (a == null) {
                return null;
            }
            synchronized (a) {
                a2 = a.mo69622a();
            }
            return a2;
        }

        /* renamed from: a */
        public final void mo69625a(K k, V v) {
            C11265ai<V> a;
            synchronized (this.f26930a) {
                a = this.f26930a.mo69626a(k, true);
            }
            synchronized (a) {
                a.mo69623a(v);
            }
        }
    }
}
