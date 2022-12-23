package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h */
public final class C4927h {

    /* renamed from: a */
    public final int f13087a;

    /* renamed from: b */
    public final String f13088b;

    /* renamed from: c */
    public final TreeSet<C4932l> f13089c = new TreeSet<>();

    /* renamed from: d */
    public long f13090d;

    public C4927h(int i, String str, long j) {
        this.f13087a = i;
        this.f13088b = str;
        this.f13090d = j;
    }

    /* renamed from: a */
    public int mo25459a() {
        long j = this.f13090d;
        return (((this.f13087a * 31) + this.f13088b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
