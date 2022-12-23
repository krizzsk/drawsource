package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a */
public final class C4691a extends C4695c {

    /* renamed from: b */
    public final List<C4692a> f11845b;

    /* renamed from: c */
    public final List<C4692a> f11846c;

    /* renamed from: d */
    public final List<C4692a> f11847d;

    /* renamed from: e */
    public final C4811i f11848e;

    /* renamed from: f */
    public final List<C4811i> f11849f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a */
    public static final class C4692a {

        /* renamed from: a */
        public final String f11850a;

        /* renamed from: b */
        public final C4811i f11851b;

        public C4692a(String str, C4811i iVar) {
            this.f11850a = str;
            this.f11851b = iVar;
        }
    }

    public C4691a(String str, List<C4692a> list, List<C4692a> list2, List<C4692a> list3, C4811i iVar, List<C4811i> list4) {
        super(str);
        this.f11845b = Collections.unmodifiableList(list);
        this.f11846c = Collections.unmodifiableList(list2);
        this.f11847d = Collections.unmodifiableList(list3);
        this.f11848e = iVar;
        this.f11849f = list4 != null ? Collections.unmodifiableList(list4) : null;
    }
}
