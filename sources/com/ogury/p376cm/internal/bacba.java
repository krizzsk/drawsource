package com.ogury.p376cm.internal;

import java.util.Iterator;

/* renamed from: com.ogury.cm.internal.bacba */
public abstract class bacba implements Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo63995a();

    public /* synthetic */ Object next() {
        return Integer.valueOf(mo63995a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
