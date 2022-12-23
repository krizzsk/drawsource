package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.e */
public final class C4970e {

    /* renamed from: a */
    public final int f13216a;

    /* renamed from: b */
    public final int f13217b;

    /* renamed from: c */
    public final int f13218c;

    /* renamed from: d */
    public final long f13219d;

    public C4970e(byte[] bArr, int i) {
        C4977j jVar = new C4977j(bArr);
        jVar.mo25510b(i * 8);
        jVar.mo25508a(16);
        jVar.mo25508a(16);
        jVar.mo25508a(24);
        jVar.mo25508a(24);
        this.f13216a = jVar.mo25508a(20);
        this.f13217b = jVar.mo25508a(3) + 1;
        this.f13218c = jVar.mo25508a(5) + 1;
        this.f13219d = ((((long) jVar.mo25508a(4)) & 15) << 32) | (((long) jVar.mo25508a(32)) & 4294967295L);
    }
}
