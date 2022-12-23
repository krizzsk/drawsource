package com.ogury.p377ed.internal;

import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.ng */
public final class C10281ng extends C10219lb {

    /* renamed from: a */
    private final int f25615a;

    /* renamed from: b */
    private boolean f25616b;

    /* renamed from: c */
    private int f25617c;

    /* renamed from: d */
    private final int f25618d;

    public C10281ng(int i, int i2, int i3) {
        this.f25618d = i3;
        this.f25615a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f25616b = z;
        this.f25617c = !z ? this.f25615a : i;
    }

    public final boolean hasNext() {
        return this.f25616b;
    }

    /* renamed from: a */
    public final int mo65121a() {
        int i = this.f25617c;
        if (i != this.f25615a) {
            this.f25617c = this.f25618d + i;
        } else if (this.f25616b) {
            this.f25616b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
