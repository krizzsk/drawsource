package com.unity3d.services.core.misc;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.services.core.misc.i */
/* compiled from: Observable */
public abstract class C12079i<T> {

    /* renamed from: a */
    private final List<C12074d<T>> f29466a = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo71230a(T t) {
        for (C12074d<T> a : this.f29466a) {
            a.mo70863a(t);
        }
    }

    public synchronized void registerObserver(C12074d<T> dVar) {
        if (!this.f29466a.contains(dVar)) {
            this.f29466a.add(dVar);
        }
    }

    public synchronized void unregisterObserver(C12074d<T> dVar) {
        if (this.f29466a.contains(dVar)) {
            this.f29466a.remove(dVar);
        }
    }
}
