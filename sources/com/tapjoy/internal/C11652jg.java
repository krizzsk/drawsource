package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.jg */
final class C11652jg implements C11646jc {

    /* renamed from: a */
    public final C11645jb f28086a = new C11645jb();

    /* renamed from: b */
    public final C11657jl f28087b;

    /* renamed from: c */
    boolean f28088c;

    C11652jg(C11657jl jlVar) {
        if (jlVar != null) {
            this.f28087b = jlVar;
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: a */
    public final void mo70249a(C11645jb jbVar, long j) {
        if (!this.f28088c) {
            this.f28086a.mo70249a(jbVar, j);
            m31955b();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public final C11646jc mo70252b(C11648je jeVar) {
        if (!this.f28088c) {
            this.f28086a.mo70252b(jeVar);
            return m31955b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public final C11646jc mo70253b(String str) {
        if (!this.f28088c) {
            this.f28086a.mo70253b(str);
            return m31955b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: e */
    public final C11646jc mo70266e(int i) {
        if (!this.f28088c) {
            this.f28086a.mo70266e(i);
            return m31955b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: d */
    public final C11646jc mo70262d(int i) {
        if (!this.f28088c) {
            this.f28086a.mo70262d(i);
            return m31955b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: f */
    public final C11646jc mo70269f(long j) {
        if (!this.f28088c) {
            this.f28086a.mo70269f(j);
            return m31955b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    private C11646jc m31955b() {
        if (!this.f28088c) {
            long c = this.f28086a.mo70256c();
            if (c > 0) {
                this.f28087b.mo70249a(this.f28086a, c);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: a */
    public final C11646jc mo70247a() {
        if (!this.f28088c) {
            long j = this.f28086a.f28075b;
            if (j > 0) {
                this.f28087b.mo70249a(this.f28086a, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.f28088c) {
            if (this.f28086a.f28075b > 0) {
                C11657jl jlVar = this.f28087b;
                C11645jb jbVar = this.f28086a;
                jlVar.mo70249a(jbVar, jbVar.f28075b);
            }
            this.f28087b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f28088c) {
            Throwable th = null;
            try {
                if (this.f28086a.f28075b > 0) {
                    this.f28087b.mo70249a(this.f28086a, this.f28086a.f28075b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f28087b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f28088c = true;
            if (th != null) {
                C11661jo.m31994a(th);
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.f28087b + ")";
    }
}
