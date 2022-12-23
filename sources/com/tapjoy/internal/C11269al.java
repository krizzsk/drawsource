package com.tapjoy.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.al */
public final class C11269al<K, V> extends C11268ak<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, C11263ag<K, V>> f26931a = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: b */
    private int f26932b = 10;

    /* renamed from: a */
    private void m30862a() {
        int size = this.f26931a.size() - this.f26932b;
        if (size > 0) {
            Iterator<Map.Entry<K, C11263ag<K, V>>> it = this.f26931a.entrySet().iterator();
            while (size > 0 && it.hasNext()) {
                size--;
                it.next();
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final void mo69625a(K k, V v) {
        super.mo69625a(k, v);
        m30862a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C11265ai<V> mo69626a(K k, boolean z) {
        C11263ag agVar = this.f26931a.get(k);
        if (agVar != null || !z) {
            return agVar;
        }
        C11263ag agVar2 = new C11263ag(k);
        this.f26931a.put(k, agVar2);
        m30862a();
        return agVar2;
    }
}
