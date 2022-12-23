package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d */
public abstract class C4669d {

    /* renamed from: a */
    public final C4746n f11730a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d$a */
    public static final class C4670a extends C4815l {
        public C4670a(String str) {
            super(str);
        }
    }

    public C4669d(C4746n nVar) {
        this.f11730a = nVar;
    }

    /* renamed from: a */
    public final void mo25097a(C4978k kVar, long j) throws C4815l {
        if (mo25093a(kVar)) {
            mo25094b(kVar, j);
        }
    }

    /* renamed from: a */
    public abstract boolean mo25093a(C4978k kVar) throws C4815l;

    /* renamed from: b */
    public abstract void mo25094b(C4978k kVar, long j) throws C4815l;
}
