package com.tapjoy.internal;

import android.os.SystemClock;

/* renamed from: com.tapjoy.internal.fk */
public final class C11474fk {

    /* renamed from: a */
    public static final C11474fk f27546a = new C11474fk(-1);

    /* renamed from: b */
    public final long f27547b;

    /* renamed from: c */
    public long f27548c;

    public C11474fk(long j) {
        this.f27547b = j;
        this.f27548c = SystemClock.elapsedRealtime();
    }

    public C11474fk() {
        this.f27547b = 3600000;
        try {
            this.f27548c = SystemClock.elapsedRealtime() - 3600000;
        } catch (NullPointerException unused) {
            this.f27548c = -1;
        }
    }

    /* renamed from: a */
    public final boolean mo69991a() {
        try {
            return SystemClock.elapsedRealtime() - this.f27548c > this.f27547b;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo69992a(long j) {
        try {
            return (SystemClock.elapsedRealtime() - this.f27548c) + j > this.f27547b;
        } catch (NullPointerException unused) {
            return true;
        }
    }
}
