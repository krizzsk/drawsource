package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C4652e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4806h;
import com.fyber.inneractive.sdk.player.exoplayer2.C4855p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4704i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4872i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4884n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4913b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4957x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.l */
public final class C4880l implements C4884n, C4884n.C4885a {

    /* renamed from: a */
    public final Uri f12978a;

    /* renamed from: b */
    public final C4938g.C4939a f12979b;

    /* renamed from: c */
    public final C4704i f12980c;

    /* renamed from: d */
    public final int f12981d;

    /* renamed from: e */
    public final Handler f12982e;

    /* renamed from: f */
    public final C4881a f12983f;

    /* renamed from: g */
    public final C4855p.C4857b f12984g = new C4855p.C4857b();

    /* renamed from: h */
    public C4884n.C4885a f12985h;

    /* renamed from: i */
    public boolean f12986i;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.l$a */
    public interface C4881a {
    }

    public C4880l(Uri uri, C4938g.C4939a aVar, C4704i iVar, int i, Handler handler, C4881a aVar2, String str) {
        this.f12978a = uri;
        this.f12979b = aVar;
        this.f12980c = iVar;
        this.f12981d = i;
        this.f12982e = handler;
        this.f12983f = aVar2;
    }

    /* renamed from: a */
    public void mo25130a() throws IOException {
    }

    /* renamed from: a */
    public void mo25131a(C4652e eVar, boolean z, C4884n.C4885a aVar) {
        this.f12985h = aVar;
        ((C4806h) aVar).f12698f.obtainMessage(7, Pair.create(new C4888q(-9223372036854775807L, false), (Object) null)).sendToTarget();
    }

    /* renamed from: b */
    public void mo25133b() {
        this.f12985h = null;
    }

    /* renamed from: a */
    public C4882m mo25129a(int i, C4913b bVar, long j) {
        C4965a.m15049a(i == 0);
        return new C4872i(this.f12978a, this.f12979b.mo24761a(), this.f12980c.mo25066a(), this.f12981d, this.f12982e, this.f12983f, this, bVar, (String) null);
    }

    /* renamed from: a */
    public void mo25132a(C4882m mVar) {
        C4872i iVar = (C4872i) mVar;
        C4872i.C4876d dVar = iVar.f12940j;
        C4957x xVar = iVar.f12939i;
        C4878j jVar = new C4878j(iVar, dVar);
        C4957x.C4959b<? extends C4957x.C4960c> bVar = xVar.f13189b;
        if (bVar != null) {
            bVar.mo25496a(true);
        }
        xVar.f13188a.execute(jVar);
        xVar.f13188a.shutdown();
        iVar.f12944n.removeCallbacksAndMessages((Object) null);
        iVar.f12930G = true;
    }

    /* renamed from: a */
    public void mo25267a(C4855p pVar, Object obj) {
        boolean z = false;
        if (pVar.mo25384a(0, this.f12984g, false).f12879d != -9223372036854775807L) {
            z = true;
        }
        if (!this.f12986i || z) {
            this.f12986i = z;
            this.f12985h.mo25267a(pVar, (Object) null);
        }
    }
}
