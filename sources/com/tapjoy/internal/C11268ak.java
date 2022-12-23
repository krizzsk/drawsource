package com.tapjoy.internal;

import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.ak */
public abstract class C11268ak<K, V> implements C11264ah<K, V> {
    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public abstract C11265ai<V> mo69626a(K k, boolean z);

    /* renamed from: a */
    public final V mo69624a(K k) {
        C11265ai a = mo69626a(k, false);
        if (a != null) {
            return a.mo69622a();
        }
        return null;
    }

    /* renamed from: a */
    public void mo69625a(K k, V v) {
        mo69626a(k, true).mo69623a(v);
    }
}
