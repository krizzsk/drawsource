package com.ogury.core.internal;

import java.util.Iterator;

/* renamed from: com.ogury.core.internal.ao */
/* compiled from: Progressions.kt */
public class C9723ao implements C9721am, Iterable<Integer> {

    /* renamed from: a */
    public static final C9724a f24600a = new C9724a((byte) 0);

    /* renamed from: b */
    private final int f24601b;

    /* renamed from: c */
    private final int f24602c;

    /* renamed from: d */
    private final int f24603d;

    public C9723ao(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f24601b = i;
            this.f24602c = C9702a.m28111a(i, i2, i3);
            this.f24603d = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: a */
    public final int mo64062a() {
        return this.f24601b;
    }

    /* renamed from: b */
    public final int mo64063b() {
        return this.f24602c;
    }

    /* renamed from: c */
    public final int mo64064c() {
        return this.f24603d;
    }

    /* renamed from: d */
    public boolean mo64065d() {
        return this.f24603d > 0 ? this.f24601b > this.f24602c : this.f24601b < this.f24602c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9723ao)) {
            return false;
        }
        if (mo64065d() && ((C9723ao) obj).mo64065d()) {
            return true;
        }
        C9723ao aoVar = (C9723ao) obj;
        return this.f24601b == aoVar.f24601b && this.f24602c == aoVar.f24602c && this.f24603d == aoVar.f24603d;
    }

    public int hashCode() {
        if (mo64065d()) {
            return -1;
        }
        return (((this.f24601b * 31) + this.f24602c) * 31) + this.f24603d;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f24603d > 0) {
            sb = new StringBuilder();
            sb.append(this.f24601b);
            sb.append("..");
            sb.append(this.f24602c);
            sb.append(" step ");
            i = this.f24603d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f24601b);
            sb.append(" downTo ");
            sb.append(this.f24602c);
            sb.append(" step ");
            i = -this.f24603d;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: com.ogury.core.internal.ao$a */
    /* compiled from: Progressions.kt */
    public static final class C9724a {
        /* renamed from: a */
        public static int m28154a(int i, int i2) {
            if (i < 0) {
                return 0;
            }
            return i;
        }

        /* renamed from: b */
        public static int m28155b(int i, int i2) {
            return i > i2 ? i2 : i;
        }

        private C9724a() {
        }

        public /* synthetic */ C9724a(byte b) {
            this();
        }
    }

    public /* synthetic */ Iterator iterator() {
        return new C9725ap(this.f24601b, this.f24602c, this.f24603d);
    }
}
