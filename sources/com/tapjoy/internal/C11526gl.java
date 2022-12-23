package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.gl */
public final class C11526gl {

    /* renamed from: a */
    public static final C11526gl f27686a = new C11526gl(0, 0, 0, 0.0d);

    /* renamed from: b */
    public final long f27687b;

    /* renamed from: c */
    public final long f27688c;

    /* renamed from: d */
    public final double f27689d;

    /* renamed from: e */
    public long f27690e;

    /* renamed from: f */
    private final long f27691f;

    public C11526gl(long j, long j2, long j3, double d) {
        this.f27691f = j;
        this.f27687b = j2;
        this.f27688c = j3;
        this.f27689d = d;
        this.f27690e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C11526gl glVar = (C11526gl) obj;
            return this.f27691f == glVar.f27691f && this.f27687b == glVar.f27687b && this.f27688c == glVar.f27688c && this.f27689d == glVar.f27689d && this.f27690e == glVar.f27690e;
        }
    }
}
