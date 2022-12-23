package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.C4652e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4882m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4884n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4913b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4962y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h */
public final class C4684h implements C4884n, C4698e.C4703e {

    /* renamed from: a */
    public final Uri f11803a;

    /* renamed from: b */
    public final C4680d f11804b;

    /* renamed from: c */
    public final C4868f.C4869a f11805c;

    /* renamed from: d */
    public C4698e f11806d;

    /* renamed from: e */
    public C4884n.C4885a f11807e;

    public C4684h(Uri uri, C4938g.C4939a aVar, int i, Handler handler, C4868f fVar) {
        this(uri, (C4680d) new C4675b(aVar), i, handler, fVar);
    }

    /* renamed from: a */
    public void mo25131a(C4652e eVar, boolean z, C4884n.C4885a aVar) {
        C4965a.m15051b(this.f11806d == null);
        Uri uri = this.f11803a;
        C4680d dVar = this.f11804b;
        C4698e eVar2 = new C4698e(uri, dVar, this.f11805c, 3, this);
        this.f11806d = eVar2;
        this.f11807e = aVar;
        eVar2.f11909i.mo25490a(new C4962y(((C4675b) dVar).f11740a.mo24761a(), uri, 4, eVar2.f11903c), eVar2, 3);
    }

    /* renamed from: b */
    public void mo25133b() {
        C4698e eVar = this.f11806d;
        if (eVar != null) {
            eVar.f11909i.mo25494d();
            for (C4698e.C4699a aVar : eVar.f11905e.values()) {
                aVar.f11916b.mo25494d();
            }
            eVar.f11906f.removeCallbacksAndMessages((Object) null);
            eVar.f11905e.clear();
            this.f11806d = null;
        }
        this.f11807e = null;
    }

    public C4684h(Uri uri, C4680d dVar, int i, Handler handler, C4868f fVar) {
        this.f11803a = uri;
        this.f11804b = dVar;
        this.f11805c = new C4868f.C4869a(handler, fVar);
    }

    /* renamed from: a */
    public void mo25130a() throws IOException {
        C4698e eVar = this.f11806d;
        eVar.f11909i.mo25493c();
        C4691a.C4692a aVar = eVar.f11912l;
        if (aVar != null) {
            C4698e.C4699a aVar2 = eVar.f11905e.get(aVar);
            aVar2.f11916b.mo25493c();
            IOException iOException = aVar2.f11924j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: a */
    public C4882m mo25129a(int i, C4913b bVar, long j) {
        C4965a.m15049a(i == 0);
        return new C4683g(this.f11806d, this.f11804b, 3, this.f11805c, bVar, j);
    }

    /* renamed from: a */
    public void mo25132a(C4882m mVar) {
        C4683g gVar = (C4683g) mVar;
        gVar.f11787a.f11908h.remove(gVar);
        gVar.f11794h.removeCallbacksAndMessages((Object) null);
        C4686j[] jVarArr = gVar.f11800n;
        if (jVarArr != null) {
            for (C4686j jVar : jVarArr) {
                int size = jVar.f11819j.size();
                for (int i = 0; i < size; i++) {
                    jVar.f11819j.valueAt(i).mo25078b();
                }
                jVar.f11816g.mo25494d();
                jVar.f11822m.removeCallbacksAndMessages((Object) null);
                jVar.f11828s = true;
            }
        }
    }
}
