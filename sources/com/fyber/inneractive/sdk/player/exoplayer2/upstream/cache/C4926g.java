package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g */
public class C4926g implements Comparable<C4926g> {

    /* renamed from: a */
    public final String f13081a;

    /* renamed from: b */
    public final long f13082b;

    /* renamed from: c */
    public final long f13083c;

    /* renamed from: d */
    public final boolean f13084d;

    /* renamed from: e */
    public final File f13085e;

    /* renamed from: f */
    public final long f13086f;

    public C4926g(String str, long j, long j2, long j3, File file) {
        this.f13081a = str;
        this.f13082b = j;
        this.f13083c = j2;
        this.f13084d = file != null;
        this.f13085e = file;
        this.f13086f = j3;
    }

    /* renamed from: a */
    public int compareTo(C4926g gVar) {
        if (!this.f13081a.equals(gVar.f13081a)) {
            return this.f13081a.compareTo(gVar.f13081a);
        }
        int i = ((this.f13082b - gVar.f13082b) > 0 ? 1 : ((this.f13082b - gVar.f13082b) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }
}
