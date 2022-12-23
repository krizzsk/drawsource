package com.tapjoy.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.EOFException;

/* renamed from: com.tapjoy.internal.jh */
final class C11653jh implements C11647jd {

    /* renamed from: a */
    public final C11645jb f28089a = new C11645jb();

    /* renamed from: b */
    public final C11658jm f28090b;

    /* renamed from: c */
    boolean f28091c;

    C11653jh(C11658jm jmVar) {
        if (jmVar != null) {
            this.f28090b = jmVar;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public final long mo70250b(C11645jb jbVar, long j) {
        if (jbVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.f28091c) {
            throw new IllegalStateException("closed");
        } else if (this.f28089a.f28075b == 0 && this.f28090b.mo70250b(this.f28089a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        } else {
            return this.f28089a.mo70250b(jbVar, Math.min(j, this.f28089a.f28075b));
        }
    }

    /* renamed from: b */
    public final boolean mo70255b() {
        if (!this.f28091c) {
            return this.f28089a.mo70255b() && this.f28090b.mo70250b(this.f28089a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: d */
    public final byte mo70261d() {
        mo70248a(1);
        return this.f28089a.mo70261d();
    }

    /* renamed from: b */
    public final C11648je mo70254b(long j) {
        mo70248a(j);
        return this.f28089a.mo70254b(j);
    }

    /* renamed from: c */
    public final String mo70258c(long j) {
        mo70248a(j);
        return this.f28089a.mo70258c(j);
    }

    /* renamed from: f */
    public final int mo70268f() {
        mo70248a(4);
        return C11661jo.m31991a(this.f28089a.mo70264e());
    }

    /* renamed from: g */
    public final long mo70271g() {
        mo70248a(8);
        return this.f28089a.mo70271g();
    }

    /* renamed from: d */
    public final void mo70263d(long j) {
        if (!this.f28091c) {
            while (j > 0) {
                if (this.f28089a.f28075b == 0 && this.f28090b.mo70250b(this.f28089a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f28089a.f28075b);
                this.f28089a.mo70263d(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f28091c) {
            this.f28091c = true;
            this.f28090b.close();
            C11645jb jbVar = this.f28089a;
            try {
                jbVar.mo70263d(jbVar.f28075b);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.f28090b + ")";
    }

    /* renamed from: a */
    public final void mo70248a(long j) {
        boolean z;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (!this.f28091c) {
            while (true) {
                if (this.f28089a.f28075b < j) {
                    if (this.f28090b.mo70250b(this.f28089a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                throw new EOFException();
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }
}
