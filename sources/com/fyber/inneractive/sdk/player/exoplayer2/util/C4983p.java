package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p */
public class C4983p {

    /* renamed from: h */
    public static final Comparator<C4986c> f13251h = new C4984a();

    /* renamed from: i */
    public static final Comparator<C4986c> f13252i = new C4985b();

    /* renamed from: a */
    public final int f13253a;

    /* renamed from: b */
    public final ArrayList<C4986c> f13254b = new ArrayList<>();

    /* renamed from: c */
    public final C4986c[] f13255c = new C4986c[5];

    /* renamed from: d */
    public int f13256d = -1;

    /* renamed from: e */
    public int f13257e;

    /* renamed from: f */
    public int f13258f;

    /* renamed from: g */
    public int f13259g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p$a */
    public class C4984a implements Comparator<C4986c> {
        public int compare(Object obj, Object obj2) {
            return ((C4986c) obj).f13260a - ((C4986c) obj2).f13260a;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p$b */
    public class C4985b implements Comparator<C4986c> {
        public int compare(Object obj, Object obj2) {
            float f = ((C4986c) obj).f13262c;
            float f2 = ((C4986c) obj2).f13262c;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p$c */
    public static class C4986c {

        /* renamed from: a */
        public int f13260a;

        /* renamed from: b */
        public int f13261b;

        /* renamed from: c */
        public float f13262c;
    }

    public C4983p(int i) {
        this.f13253a = i;
    }
}
