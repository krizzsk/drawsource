package com.fyber.inneractive.sdk.player.exoplayer2;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p */
public abstract class C4855p {

    /* renamed from: a */
    public static final C4855p f12875a = new C4856a();

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p$a */
    public class C4856a extends C4855p {
        /* renamed from: a */
        public int mo25382a() {
            return 0;
        }

        /* renamed from: a */
        public int mo25383a(Object obj) {
            return -1;
        }

        /* renamed from: a */
        public C4858c mo25386a(int i, C4858c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: b */
        public int mo25387b() {
            return 0;
        }

        /* renamed from: a */
        public C4857b mo25384a(int i, C4857b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p$b */
    public static final class C4857b {

        /* renamed from: a */
        public Object f12876a;

        /* renamed from: b */
        public Object f12877b;

        /* renamed from: c */
        public int f12878c;

        /* renamed from: d */
        public long f12879d;

        /* renamed from: e */
        public long f12880e;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p$c */
    public static final class C4858c {

        /* renamed from: a */
        public Object f12881a;

        /* renamed from: b */
        public boolean f12882b;

        /* renamed from: c */
        public int f12883c;

        /* renamed from: d */
        public int f12884d;

        /* renamed from: e */
        public long f12885e;

        /* renamed from: f */
        public long f12886f;

        /* renamed from: g */
        public long f12887g;
    }

    /* renamed from: a */
    public abstract int mo25382a();

    /* renamed from: a */
    public abstract int mo25383a(Object obj);

    /* renamed from: a */
    public abstract C4857b mo25384a(int i, C4857b bVar, boolean z);

    /* renamed from: a */
    public final C4858c mo25385a(int i, C4858c cVar) {
        return mo25386a(i, cVar, false, 0);
    }

    /* renamed from: a */
    public abstract C4858c mo25386a(int i, C4858c cVar, boolean z, long j);

    /* renamed from: b */
    public abstract int mo25387b();

    /* renamed from: c */
    public final boolean mo25388c() {
        return mo25387b() == 0;
    }
}
