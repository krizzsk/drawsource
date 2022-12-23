package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.en */
public final class C11417en {

    /* renamed from: a */
    final C11646jc f27242a;

    /* renamed from: a */
    static int m31215a(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: a */
    static int m31217a(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: b */
    static int m31218b(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: b */
    static long m31219b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: a */
    static int m31216a(int i, C11395ei eiVar) {
        return (i << 3) | eiVar.f27206e;
    }

    public C11417en(C11646jc jcVar) {
        this.f27242a = jcVar;
    }

    /* renamed from: a */
    public final void mo69866a(C11648je jeVar) {
        this.f27242a.mo70252b(jeVar);
    }

    /* renamed from: c */
    public final void mo69867c(int i) {
        while ((i & -128) != 0) {
            this.f27242a.mo70266e((i & 127) | 128);
            i >>>= 7;
        }
        this.f27242a.mo70266e(i);
    }

    /* renamed from: c */
    public final void mo69868c(long j) {
        while ((-128 & j) != 0) {
            this.f27242a.mo70266e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f27242a.mo70266e((int) j);
    }

    /* renamed from: d */
    public final void mo69869d(int i) {
        this.f27242a.mo70262d(i);
    }

    /* renamed from: d */
    public final void mo69870d(long j) {
        this.f27242a.mo70269f(j);
    }
}
