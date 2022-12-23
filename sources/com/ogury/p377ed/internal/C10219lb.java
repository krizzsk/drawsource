package com.ogury.p377ed.internal;

import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.lb */
public abstract class C10219lb implements C10270mx, Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo65121a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Integer next() {
        return Integer.valueOf(mo65121a());
    }
}
