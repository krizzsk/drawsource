package com.ogury.p376cm.internal;

import java.util.NoSuchElementException;

/* renamed from: com.ogury.cm.internal.bbbab */
public final class bbbab extends bacba {

    /* renamed from: a */
    private final int f24535a;

    /* renamed from: b */
    private boolean f24536b;

    /* renamed from: c */
    private int f24537c;

    /* renamed from: d */
    private final int f24538d;

    public bbbab(int i, int i2, int i3) {
        this.f24538d = i3;
        this.f24535a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f24536b = z;
        this.f24537c = !z ? this.f24535a : i;
    }

    /* renamed from: a */
    public final int mo63995a() {
        int i = this.f24537c;
        if (i != this.f24535a) {
            this.f24537c = this.f24538d + i;
        } else if (this.f24536b) {
            this.f24536b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public final boolean hasNext() {
        return this.f24536b;
    }
}
