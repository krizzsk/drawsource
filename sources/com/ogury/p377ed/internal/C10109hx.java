package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.hx */
public final class C10109hx {

    /* renamed from: a */
    private final boolean f25384a;

    /* renamed from: b */
    private boolean f25385b;

    /* renamed from: c */
    private final String f25386c;

    /* renamed from: d */
    private boolean f25387d;

    /* renamed from: e */
    private boolean f25388e;

    /* renamed from: f */
    private boolean f25389f;

    private C10109hx(boolean z, boolean z2, String str, boolean z3) {
        C10263mq.m29882b(str, "url");
        this.f25384a = z;
        this.f25385b = z2;
        this.f25386c = str;
        this.f25387d = z3;
        this.f25388e = false;
        this.f25389f = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10109hx(boolean z, boolean z2, String str, boolean z3, int i) {
        this(z, z2, str, (i & 8) != 0 ? false : z3);
    }

    /* renamed from: a */
    public final boolean mo64878a() {
        return this.f25384a;
    }

    /* renamed from: b */
    public final boolean mo64879b() {
        return this.f25385b;
    }

    /* renamed from: c */
    public final String mo64880c() {
        return this.f25386c;
    }

    /* renamed from: d */
    public final boolean mo64881d() {
        return this.f25387d;
    }

    /* renamed from: e */
    public final void mo64882e() {
        this.f25387d = true;
    }

    /* renamed from: f */
    public final boolean mo64883f() {
        return this.f25388e;
    }

    /* renamed from: g */
    public final void mo64884g() {
        this.f25388e = true;
    }

    /* renamed from: h */
    public final boolean mo64885h() {
        return this.f25389f;
    }

    /* renamed from: i */
    public final void mo64886i() {
        this.f25389f = true;
    }
}
