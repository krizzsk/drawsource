package com.ogury.core.internal;

import java.util.NoSuchElementException;

/* renamed from: com.ogury.core.internal.ap */
/* compiled from: ProgressionIterators.kt */
public final class C9725ap extends C9791t {

    /* renamed from: a */
    private final int f24604a;

    /* renamed from: b */
    private boolean f24605b;

    /* renamed from: c */
    private int f24606c;

    /* renamed from: d */
    private final int f24607d;

    public C9725ap(int i, int i2, int i3) {
        this.f24607d = i3;
        this.f24604a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f24605b = z;
        this.f24606c = !z ? this.f24604a : i;
    }

    public final boolean hasNext() {
        return this.f24605b;
    }

    /* renamed from: a */
    public final int mo64070a() {
        int i = this.f24606c;
        if (i != this.f24604a) {
            this.f24606c = this.f24607d + i;
        } else if (this.f24605b) {
            this.f24605b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
