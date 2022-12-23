package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C4855p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.q */
public final class C4888q extends C4855p {

    /* renamed from: g */
    public static final Object f12987g = new Object();

    /* renamed from: b */
    public final long f12988b;

    /* renamed from: c */
    public final long f12989c;

    /* renamed from: d */
    public final long f12990d;

    /* renamed from: e */
    public final long f12991e;

    /* renamed from: f */
    public final boolean f12992f;

    public C4888q(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    /* renamed from: a */
    public int mo25382a() {
        return 1;
    }

    /* renamed from: a */
    public C4855p.C4858c mo25386a(int i, C4855p.C4858c cVar, boolean z, long j) {
        C4965a.m15046a(i, 0, 1);
        Object obj = z ? f12987g : null;
        long j2 = this.f12991e;
        boolean z2 = this.f12992f;
        if (z2) {
            j2 += j;
            if (j2 > this.f12989c) {
                j2 = -9223372036854775807L;
            }
        }
        long j3 = this.f12989c;
        long j4 = this.f12990d;
        cVar.f12881a = obj;
        cVar.f12882b = z2;
        cVar.f12885e = j2;
        cVar.f12886f = j3;
        cVar.f12883c = 0;
        cVar.f12884d = 0;
        cVar.f12887g = j4;
        return cVar;
    }

    /* renamed from: b */
    public int mo25387b() {
        return 1;
    }

    public C4888q(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f12988b = j;
        this.f12989c = j2;
        this.f12990d = j3;
        this.f12991e = j4;
        this.f12992f = z2;
    }

    /* renamed from: a */
    public C4855p.C4857b mo25384a(int i, C4855p.C4857b bVar, boolean z) {
        C4965a.m15046a(i, 0, 1);
        Object obj = z ? f12987g : null;
        long j = this.f12988b;
        bVar.f12876a = obj;
        bVar.f12877b = obj;
        bVar.f12878c = 0;
        bVar.f12879d = j;
        bVar.f12880e = -this.f12990d;
        return bVar;
    }

    /* renamed from: a */
    public int mo25383a(Object obj) {
        return f12987g.equals(obj) ? 0 : -1;
    }
}
