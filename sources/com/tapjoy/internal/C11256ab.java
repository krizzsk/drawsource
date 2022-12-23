package com.tapjoy.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.ab */
public final class C11256ab {
    /* renamed from: a */
    public static Iterable<View> m30848a(ViewGroup viewGroup) {
        final C11258a aVar = new C11258a(viewGroup);
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return aVar;
            }
        };
    }

    /* renamed from: com.tapjoy.internal.ab$a */
    static class C11258a implements Iterator<View> {

        /* renamed from: a */
        private final ViewGroup f26916a;

        /* renamed from: b */
        private int f26917b;

        /* renamed from: c */
        private int f26918c = 0;

        public C11258a(ViewGroup viewGroup) {
            this.f26916a = viewGroup;
            this.f26917b = viewGroup.getChildCount();
        }

        public final boolean hasNext() {
            return this.f26918c < this.f26917b;
        }

        public final void remove() {
            this.f26916a.removeViewAt(this.f26918c - 1);
        }

        public final /* synthetic */ Object next() {
            ViewGroup viewGroup = this.f26916a;
            int i = this.f26918c;
            this.f26918c = i + 1;
            return viewGroup.getChildAt(i);
        }
    }
}
