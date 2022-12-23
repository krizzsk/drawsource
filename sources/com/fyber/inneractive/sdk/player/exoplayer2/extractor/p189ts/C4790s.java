package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s */
public final class C4790s {

    /* renamed from: a */
    public final List<C4811i> f12613a;

    /* renamed from: b */
    public final C4746n[] f12614b;

    public C4790s(List<C4811i> list) {
        this.f12613a = list;
        this.f12614b = new C4746n[list.size()];
    }

    /* renamed from: a */
    public void mo25245a(C4673h hVar, C4795v.C4799d dVar) {
        for (int i = 0; i < this.f12614b.length; i++) {
            dVar.mo25247a();
            C4746n a = hVar.mo25098a(dVar.mo25249c(), 3);
            C4811i iVar = this.f12613a.get(i);
            String str = iVar.f12755f;
            C4965a.m15050a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = iVar.f12750a;
            if (str2 == null) {
                str2 = dVar.mo25248b();
            }
            a.mo25074a(C4811i.m14723a(str2, str, (String) null, -1, iVar.f12773x, iVar.f12774y, iVar.f12775z, (C4644a) null, Long.MAX_VALUE, Collections.emptyList()));
            this.f12614b[i] = a;
        }
    }
}
