package com.unity3d.player;

/* renamed from: com.unity3d.player.i */
final class C11768i {

    /* renamed from: a */
    private static boolean f28460a = false;

    /* renamed from: b */
    private boolean f28461b = false;

    /* renamed from: c */
    private boolean f28462c = false;

    /* renamed from: d */
    private boolean f28463d = true;

    /* renamed from: e */
    private boolean f28464e = false;

    C11768i() {
    }

    /* renamed from: a */
    static void m32179a() {
        f28460a = true;
    }

    /* renamed from: b */
    static void m32180b() {
        f28460a = false;
    }

    /* renamed from: c */
    static boolean m32181c() {
        return f28460a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70564a(boolean z) {
        this.f28461b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo70565b(boolean z) {
        this.f28463d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo70566c(boolean z) {
        this.f28464e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo70567d(boolean z) {
        this.f28462c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo70568d() {
        return this.f28463d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo70569e() {
        return this.f28464e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo70570f() {
        return f28460a && this.f28461b && !this.f28463d && !this.f28462c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo70571g() {
        return this.f28462c;
    }

    public final String toString() {
        return super.toString();
    }
}
