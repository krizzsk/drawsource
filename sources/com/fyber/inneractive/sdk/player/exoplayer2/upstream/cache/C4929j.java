package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4916a;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j */
public final class C4929j implements C4925f, Comparator<C4926g> {

    /* renamed from: a */
    public final TreeSet<C4926g> f13098a = new TreeSet<>(this);

    /* renamed from: b */
    public long f13099b;

    public C4929j(long j) {
    }

    /* renamed from: a */
    public void mo25445a(C4916a aVar, C4926g gVar) {
        this.f13098a.remove(gVar);
        this.f13099b -= gVar.f13083c;
    }

    /* renamed from: b */
    public void mo25447b(C4916a aVar, C4926g gVar) {
        this.f13098a.add(gVar);
        this.f13099b += gVar.f13083c;
        mo25467a(aVar, 0);
    }

    public int compare(Object obj, Object obj2) {
        C4926g gVar = (C4926g) obj;
        C4926g gVar2 = (C4926g) obj2;
        long j = gVar.f13086f;
        long j2 = gVar2.f13086f;
        if (j - j2 == 0) {
            return gVar.compareTo(gVar2);
        }
        return j < j2 ? -1 : 1;
    }

    /* renamed from: a */
    public void mo25446a(C4916a aVar, C4926g gVar, C4926g gVar2) {
        this.f13098a.remove(gVar);
        this.f13099b -= gVar.f13083c;
        mo25447b(aVar, gVar2);
    }

    /* renamed from: a */
    public final void mo25467a(C4916a aVar, long j) {
        while (this.f13099b + j > 10485760) {
            try {
                aVar.mo25439a(this.f13098a.first());
            } catch (C4916a.C4917a unused) {
            }
        }
    }
}
