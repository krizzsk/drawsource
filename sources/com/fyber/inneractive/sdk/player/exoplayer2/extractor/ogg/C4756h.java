package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h */
public abstract class C4756h {

    /* renamed from: a */
    public C4752d f12371a;

    /* renamed from: b */
    public C4746n f12372b;

    /* renamed from: c */
    public C4673h f12373c;

    /* renamed from: d */
    public C4754f f12374d;

    /* renamed from: e */
    public long f12375e;

    /* renamed from: f */
    public long f12376f;

    /* renamed from: g */
    public long f12377g;

    /* renamed from: h */
    public int f12378h;

    /* renamed from: i */
    public int f12379i;

    /* renamed from: j */
    public C4757a f12380j;

    /* renamed from: k */
    public long f12381k;

    /* renamed from: l */
    public boolean f12382l;

    /* renamed from: m */
    public boolean f12383m;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h$a */
    public static class C4757a {

        /* renamed from: a */
        public C4811i f12384a;

        /* renamed from: b */
        public C4754f f12385b;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h$b */
    public static final class C4758b implements C4754f {
        /* renamed from: a */
        public long mo25201a(C4672g gVar) throws IOException, InterruptedException {
            return -1;
        }

        /* renamed from: b */
        public C4709m mo25203b() {
            return new C4709m.C4710a(-9223372036854775807L);
        }

        /* renamed from: c */
        public long mo25204c(long j) {
            return 0;
        }
    }

    /* renamed from: a */
    public abstract long mo25205a(C4978k kVar);

    /* renamed from: a */
    public void mo25206a(boolean z) {
        if (z) {
            this.f12380j = new C4757a();
            this.f12376f = 0;
            this.f12378h = 0;
        } else {
            this.f12378h = 1;
        }
        this.f12375e = -1;
        this.f12377g = 0;
    }

    /* renamed from: a */
    public abstract boolean mo25207a(C4978k kVar, long j, C4757a aVar) throws IOException, InterruptedException;

    /* renamed from: b */
    public void mo25214b(long j) {
        this.f12377g = j;
    }

    /* renamed from: a */
    public long mo25213a(long j) {
        return (((long) this.f12379i) * j) / 1000000;
    }
}
