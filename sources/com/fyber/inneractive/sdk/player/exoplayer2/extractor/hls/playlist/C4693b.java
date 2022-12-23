package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b */
public final class C4693b extends C4695c {

    /* renamed from: b */
    public final int f11852b;

    /* renamed from: c */
    public final long f11853c;

    /* renamed from: d */
    public final long f11854d;

    /* renamed from: e */
    public final boolean f11855e;

    /* renamed from: f */
    public final int f11856f;

    /* renamed from: g */
    public final int f11857g;

    /* renamed from: h */
    public final int f11858h;

    /* renamed from: i */
    public final long f11859i;

    /* renamed from: j */
    public final boolean f11860j;

    /* renamed from: k */
    public final boolean f11861k;

    /* renamed from: l */
    public final C4694a f11862l;

    /* renamed from: m */
    public final List<C4694a> f11863m;

    /* renamed from: n */
    public final List<String> f11864n;

    /* renamed from: o */
    public final long f11865o;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a */
    public static final class C4694a implements Comparable<Long> {

        /* renamed from: a */
        public final String f11866a;

        /* renamed from: b */
        public final long f11867b;

        /* renamed from: c */
        public final int f11868c;

        /* renamed from: d */
        public final long f11869d;

        /* renamed from: e */
        public final boolean f11870e;

        /* renamed from: f */
        public final String f11871f;

        /* renamed from: g */
        public final String f11872g;

        /* renamed from: h */
        public final long f11873h;

        /* renamed from: i */
        public final long f11874i;

        public C4694a(String str, long j, int i, long j2, boolean z, String str2, String str3, long j3, long j4) {
            this.f11866a = str;
            this.f11867b = j;
            this.f11868c = i;
            this.f11869d = j2;
            this.f11870e = z;
            this.f11871f = str2;
            this.f11872g = str3;
            this.f11873h = j3;
            this.f11874i = j4;
        }

        public int compareTo(Object obj) {
            Long l = (Long) obj;
            if (this.f11869d > l.longValue()) {
                return 1;
            }
            return this.f11869d < l.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4693b(int i, String str, long j, long j2, boolean z, int i2, int i3, int i4, long j3, boolean z2, boolean z3, C4694a aVar, List<C4694a> list, List<String> list2) {
        super(str);
        String str2 = str;
        this.f11852b = i;
        this.f11854d = j2;
        this.f11855e = z;
        this.f11856f = i2;
        this.f11857g = i3;
        this.f11858h = i4;
        this.f11859i = j3;
        this.f11860j = z2;
        this.f11861k = z3;
        this.f11862l = aVar;
        this.f11863m = Collections.unmodifiableList(list);
        if (!list.isEmpty()) {
            C4694a aVar2 = list.get(list.size() - 1);
            this.f11865o = aVar2.f11869d + aVar2.f11867b;
        } else {
            this.f11865o = 0;
        }
        this.f11853c = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.f11865o + j;
        this.f11864n = Collections.unmodifiableList(list2);
    }
}
