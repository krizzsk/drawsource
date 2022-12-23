package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f */
public final class C4739f implements C4665f, C4709m {

    /* renamed from: p */
    public static final int f12276p = C4991u.m15133a("qt  ");

    /* renamed from: a */
    public final C4978k f12277a = new C4978k(C4974i.f13222a);

    /* renamed from: b */
    public final C4978k f12278b = new C4978k(4);

    /* renamed from: c */
    public final C4978k f12279c = new C4978k(16);

    /* renamed from: d */
    public final Stack<C4726a.C4727a> f12280d = new Stack<>();

    /* renamed from: e */
    public int f12281e;

    /* renamed from: f */
    public int f12282f;

    /* renamed from: g */
    public long f12283g;

    /* renamed from: h */
    public int f12284h;

    /* renamed from: i */
    public C4978k f12285i;

    /* renamed from: j */
    public int f12286j;

    /* renamed from: k */
    public int f12287k;

    /* renamed from: l */
    public C4673h f12288l;

    /* renamed from: m */
    public C4740a[] f12289m;

    /* renamed from: n */
    public long f12290n;

    /* renamed from: o */
    public boolean f12291o;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a */
    public static final class C4740a {

        /* renamed from: a */
        public final C4742h f12292a;

        /* renamed from: b */
        public final C4745k f12293b;

        /* renamed from: c */
        public final C4746n f12294c;

        /* renamed from: d */
        public int f12295d;

        public C4740a(C4742h hVar, C4745k kVar, C4746n nVar) {
            this.f12292a = hVar;
            this.f12293b = kVar;
            this.f12294c = nVar;
        }
    }

    /* renamed from: a */
    public boolean mo25055a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo25091a(C4672g gVar) throws IOException, InterruptedException {
        return C4741g.m14492a(gVar, false);
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: c */
    public long mo25056c() {
        return this.f12290n;
    }

    /* renamed from: d */
    public final void mo25197d() {
        this.f12281e = 0;
        this.f12284h = 0;
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        this.f12288l = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0613  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd A[Catch:{ all -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x083e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4 A[Catch:{ all -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0226 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25196c(long r88) throws com.fyber.inneractive.sdk.player.exoplayer2.C4815l {
        /*
            r87 = this;
            r1 = r87
        L_0x0002:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12280d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0a48
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12280d
            java.lang.Object r0 = r0.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r0
            long r3 = r0.f12178P0
            int r0 = (r3 > r88 ? 1 : (r3 == r88 ? 0 : -1))
            if (r0 != 0) goto L_0x0a48
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12280d
            java.lang.Object r0 = r0.pop()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r0
            int r3 = r0.f12177a
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12089C
            if (r3 != r4) goto L_0x0a2d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
            r8.<init>()
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12086A0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r9 = r0.mo25187d(r9)
            r10 = 12
            r11 = 0
            r12 = 1
            r13 = 0
            if (r9 == 0) goto L_0x0255
            boolean r14 = r1.f12291o
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4729b.f12182a
            if (r14 == 0) goto L_0x0045
            goto L_0x024e
        L_0x0045:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r9 = r9.f12181P0
            r14 = 8
            r9.mo25525e(r14)
        L_0x004c:
            int r15 = r9.mo25513a()
            if (r15 < r14) goto L_0x024e
            int r15 = r9.f13244b
            int r16 = r9.mo25520c()
            int r3 = r9.mo25520c()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12088B0
            if (r3 != r4) goto L_0x0245
            r9.mo25525e(r15)
            int r15 = r15 + r16
            r9.mo25527f(r10)
        L_0x0068:
            int r3 = r9.f13244b
            if (r3 >= r15) goto L_0x024e
            int r4 = r9.mo25520c()
            int r6 = r9.mo25520c()
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12090C0
            if (r6 != r7) goto L_0x023c
            r9.mo25525e(r3)
            int r3 = r3 + r4
            r9.mo25527f(r14)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0084:
            int r6 = r9.f13244b
            if (r6 >= r3) goto L_0x022f
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12250a
            int r7 = r9.mo25520c()
            int r6 = r6 + r7
            int r7 = r9.mo25520c()
            int r14 = r7 >> 24
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 169(0xa9, float:2.37E-43)
            java.lang.String r2 = "TCON"
            java.lang.String r10 = "MetadataUtil"
            if (r14 == r15) goto L_0x0182
            r15 = 65533(0xfffd, float:9.1831E-41)
            if (r14 != r15) goto L_0x00a6
            goto L_0x0182
        L_0x00a6:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12262m     // Catch:{ all -> 0x022a }
            if (r7 != r14) goto L_0x00cc
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14480b(r9)     // Catch:{ all -> 0x022a }
            if (r7 <= 0) goto L_0x00ba
            java.lang.String[] r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12249D     // Catch:{ all -> 0x022a }
            int r15 = r14.length     // Catch:{ all -> 0x022a }
            if (r7 > r15) goto L_0x00ba
            int r7 = r7 + -1
            r7 = r14[r7]     // Catch:{ all -> 0x022a }
            goto L_0x00bb
        L_0x00ba:
            r7 = r11
        L_0x00bb:
            if (r7 == 0) goto L_0x00c4
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r10 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j     // Catch:{ all -> 0x022a }
            r10.<init>(r2, r11, r7)     // Catch:{ all -> 0x022a }
            goto L_0x021d
        L_0x00c4:
            java.lang.String r2 = "Failed to parse standard genre code"
            android.util.Log.w(r10, r2)     // Catch:{ all -> 0x022a }
            r2 = r11
            goto L_0x021e
        L_0x00cc:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12264o     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x00d8
            java.lang.String r2 = "TPOS"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14479a(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x00d8:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12265p     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x00e4
            java.lang.String r2 = "TRCK"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14479a(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x00e4:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12266q     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x00f0
            java.lang.String r2 = "TBPM"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14477a(r7, r2, r9, r12, r13)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x00f0:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12267r     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x00fc
            java.lang.String r2 = "TCMP"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14477a(r7, r2, r9, r12, r12)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x00fc:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12261l     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0109
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14475a(r9)     // Catch:{ all -> 0x022a }
            r9.mo25525e(r6)
            goto L_0x0221
        L_0x0109:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12268s     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0115
            java.lang.String r2 = "TPE2"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0115:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12269t     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0121
            java.lang.String r2 = "TSOT"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0121:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12270u     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x012c
            java.lang.String r2 = "TSO2"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x012c:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12271v     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0137
            java.lang.String r2 = "TSOA"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0137:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12272w     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0142
            java.lang.String r2 = "TSOP"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0142:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12273x     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x014d
            java.lang.String r2 = "TSOC"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x014d:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12274y     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0158
            java.lang.String r2 = "ITUNESADVISORY"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14477a(r7, r2, r9, r13, r13)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0158:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12275z     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0163
            java.lang.String r2 = "ITUNESGAPLESS"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14477a(r7, r2, r9, r13, r12)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0163:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12246A     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x016e
            java.lang.String r2 = "TVSHOWSORT"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x016e:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12247B     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0179
            java.lang.String r2 = "TVSHOW"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0179:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12248C     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x01f0
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14478a((com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k) r9, (int) r6)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0182:
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            r14 = r14 & r7
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12252c     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x0191
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14476a((int) r7, (com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k) r9)     // Catch:{ all -> 0x022a }
        L_0x018e:
            r10 = r2
            goto L_0x021d
        L_0x0191:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12250a     // Catch:{ all -> 0x022a }
            if (r14 == r15) goto L_0x0215
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12251b     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x019b
            goto L_0x0215
        L_0x019b:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12257h     // Catch:{ all -> 0x022a }
            if (r14 == r15) goto L_0x020d
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12258i     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01a5
            goto L_0x020d
        L_0x01a5:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12253d     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01b0
            java.lang.String r2 = "TDRC"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01b0:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12254e     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01bb
            java.lang.String r2 = "TPE1"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01bb:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12255f     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01c6
            java.lang.String r2 = "TSSE"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01c6:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12256g     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01d1
            java.lang.String r2 = "TALB"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01d1:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12259j     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01dc
            java.lang.String r2 = "USLT"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01dc:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12260k     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01e5
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01e5:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.f12263n     // Catch:{ all -> 0x022a }
            if (r14 != r2) goto L_0x01f0
            java.lang.String r2 = "TIT1"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01f0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x022a }
            r2.<init>()     // Catch:{ all -> 0x022a }
            java.lang.String r14 = "Skipped unknown metadata entry: "
            r2.append(r14)     // Catch:{ all -> 0x022a }
            java.lang.String r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14446a(r7)     // Catch:{ all -> 0x022a }
            r2.append(r7)     // Catch:{ all -> 0x022a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x022a }
            android.util.Log.d(r10, r2)     // Catch:{ all -> 0x022a }
            r9.mo25525e(r6)
            r2 = r11
            goto L_0x0221
        L_0x020d:
            java.lang.String r2 = "TCOM"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0215:
            java.lang.String r2 = "TIT2"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4738e.m14481b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x021d:
            r2 = r10
        L_0x021e:
            r9.mo25525e(r6)
        L_0x0221:
            if (r2 == 0) goto L_0x0226
            r4.add(r2)
        L_0x0226:
            r10 = 12
            goto L_0x0084
        L_0x022a:
            r0 = move-exception
            r9.mo25525e(r6)
            throw r0
        L_0x022f:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0236
            goto L_0x024e
        L_0x0236:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.a
            r2.<init>((java.util.List<? extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4828a.C4830b>) r4)
            goto L_0x024f
        L_0x023c:
            int r4 = r4 + -8
            r9.mo25527f(r4)
            r10 = 12
            goto L_0x0068
        L_0x0245:
            int r2 = r16 + -8
            r9.mo25527f(r2)
            r10 = 12
            goto L_0x004c
        L_0x024e:
            r2 = r11
        L_0x024f:
            if (r2 == 0) goto L_0x0256
            r8.mo25162a(r2)
            goto L_0x0256
        L_0x0255:
            r2 = r11
        L_0x0256:
            r9 = r13
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0261:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r10 = r0.f12180R0
            int r10 = r10.size()
            if (r9 >= r10) goto L_0x0a09
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r10 = r0.f12180R0
            java.lang.Object r10 = r10.get(r9)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r10 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r10
            int r14 = r10.f12177a
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12093E
            if (r14 == r15) goto L_0x0287
        L_0x0277:
            r18 = r0
            r54 = r2
            r52 = r3
            r20 = r5
            r50 = r6
            r38 = r8
            r55 = r9
            goto L_0x085a
        L_0x0287:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12091D
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r15 = r0.mo25187d(r14)
            boolean r14 = r1.f12291o
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = 0
            r19 = r14
            r14 = r10
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4729b.m14453a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r14, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b) r15, (long) r16, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r18, (boolean) r19)
            if (r14 != 0) goto L_0x02a0
            goto L_0x0277
        L_0x02a0:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12095F
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r10 = r10.mo25186c(r15)
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12097G
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r10 = r10.mo25186c(r15)
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12099H
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r10 = r10.mo25186c(r15)
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12158q0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r15 = r10.mo25187d(r15)
            if (r15 == 0) goto L_0x02c0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$c r11 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$c
            r11.<init>(r15)
            goto L_0x02ce
        L_0x02c0:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12160r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r11 = r10.mo25187d(r11)
            if (r11 == 0) goto L_0x0a01
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$d r15 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$d
            r15.<init>(r11)
            r11 = r15
        L_0x02ce:
            int r15 = r11.mo25188a()
            if (r15 != 0) goto L_0x02fe
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            long[] r11 = new long[r13]
            int[] r15 = new int[r13]
            long[] r12 = new long[r13]
            r18 = r0
            int[] r0 = new int[r13]
            r25 = 0
            r22 = r10
            r23 = r11
            r24 = r15
            r26 = r12
            r27 = r0
            r22.<init>(r23, r24, r25, r26, r27)
            r54 = r2
            r52 = r3
            r20 = r5
            r50 = r6
            r38 = r8
            r55 = r9
            r5 = r14
            goto L_0x0856
        L_0x02fe:
            r18 = r0
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12162s0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r10.mo25187d(r0)
            if (r0 != 0) goto L_0x0310
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12164t0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r10.mo25187d(r0)
            r12 = 1
            goto L_0x0311
        L_0x0310:
            r12 = r13
        L_0x0311:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12181P0
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12156p0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r13 = r10.mo25187d(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r13 = r13.f12181P0
            r50 = r6
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12150m0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r6 = r10.mo25187d(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r6.f12181P0
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12152n0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r7 = r10.mo25187d(r7)
            if (r7 == 0) goto L_0x0332
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r7.f12181P0
            r20 = r5
            goto L_0x0335
        L_0x0332:
            r20 = r5
            r7 = 0
        L_0x0335:
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12154o0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r5 = r10.mo25187d(r5)
            if (r5 == 0) goto L_0x0340
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r5.f12181P0
            goto L_0x0341
        L_0x0340:
            r5 = 0
        L_0x0341:
            r10 = 12
            r0.mo25525e(r10)
            r52 = r3
            int r3 = r0.mo25536o()
            r13.mo25525e(r10)
            int r4 = r13.mo25536o()
            int r10 = r13.mo25520c()
            r22 = r4
            r4 = 1
            if (r10 != r4) goto L_0x035e
            r10 = r4
            goto L_0x035f
        L_0x035e:
            r10 = 0
        L_0x035f:
            java.lang.String r4 = "first_chunk must be 1"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15052b(r10, r4)
            r4 = 12
            r6.mo25525e(r4)
            int r10 = r6.mo25536o()
            r17 = 1
            int r10 = r10 + -1
            int r21 = r6.mo25536o()
            r54 = r2
            int r2 = r6.mo25536o()
            if (r5 == 0) goto L_0x0385
            r5.mo25525e(r4)
            int r23 = r5.mo25536o()
            goto L_0x0387
        L_0x0385:
            r23 = 0
        L_0x0387:
            r24 = -1
            if (r7 == 0) goto L_0x03a1
            r7.mo25525e(r4)
            int r25 = r7.mo25536o()
            if (r25 <= 0) goto L_0x039d
            int r26 = r7.mo25536o()
            r17 = 1
            int r26 = r26 + -1
            goto L_0x03a5
        L_0x039d:
            r26 = r24
            r7 = 0
            goto L_0x03a5
        L_0x03a1:
            r26 = r24
            r25 = 0
        L_0x03a5:
            boolean r27 = r11.mo25190c()
            if (r27 == 0) goto L_0x03c1
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r14.f12302f
            java.lang.String r4 = r4.f12755f
            r55 = r9
            java.lang.String r9 = "audio/raw"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x03c3
            if (r10 != 0) goto L_0x03c3
            if (r23 != 0) goto L_0x03c3
            if (r25 != 0) goto L_0x03c3
            r4 = 1
            goto L_0x03c4
        L_0x03c1:
            r55 = r9
        L_0x03c3:
            r4 = 0
        L_0x03c4:
            r27 = 0
            if (r4 != 0) goto L_0x0552
            long[] r4 = new long[r15]
            int[] r9 = new int[r15]
            r30 = r10
            long[] r10 = new long[r15]
            int[] r1 = new int[r15]
            r35 = r2
            r56 = r14
            r34 = r21
            r33 = r23
            r42 = r24
            r2 = r26
            r36 = r27
            r38 = r36
            r40 = r38
            r32 = r30
            r14 = 0
            r23 = 0
            r30 = 0
            r31 = 0
            r57 = 0
            r26 = r6
            r21 = r8
            r8 = r25
            r6 = 0
            r25 = 0
        L_0x03f8:
            if (r14 >= r15) goto L_0x04d4
            r86 = r31
            r31 = r15
            r15 = r86
        L_0x0400:
            if (r57 != 0) goto L_0x0449
            r43 = r8
            int r8 = r42 + 1
            if (r8 != r3) goto L_0x040f
            r57 = r30
            r30 = r22
            r22 = 0
            goto L_0x043b
        L_0x040f:
            if (r12 == 0) goto L_0x0416
            long r38 = r0.mo25537p()
            goto L_0x041a
        L_0x0416:
            long r38 = r0.mo25534m()
        L_0x041a:
            if (r8 != r15) goto L_0x0433
            int r30 = r13.mo25536o()
            r15 = 4
            r13.mo25527f(r15)
            int r22 = r22 + -1
            if (r22 <= 0) goto L_0x0431
            int r15 = r13.mo25536o()
            r17 = 1
            int r15 = r15 + -1
            goto L_0x0433
        L_0x0431:
            r15 = r24
        L_0x0433:
            r57 = r30
            r40 = r38
            r30 = r22
            r22 = 1
        L_0x043b:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r22)
            r42 = r8
            r22 = r30
            r38 = r40
            r8 = r43
            r30 = r57
            goto L_0x0400
        L_0x0449:
            r43 = r8
            if (r5 == 0) goto L_0x045e
        L_0x044d:
            if (r23 != 0) goto L_0x045c
            if (r33 <= 0) goto L_0x045c
            int r23 = r5.mo25536o()
            int r25 = r5.mo25520c()
            int r33 = r33 + -1
            goto L_0x044d
        L_0x045c:
            int r23 = r23 + -1
        L_0x045e:
            r8 = r25
            r4[r14] = r38
            int r25 = r11.mo25189b()
            r9[r14] = r25
            r25 = r4
            r4 = r9[r14]
            if (r4 <= r6) goto L_0x0471
            r4 = r9[r14]
            r6 = r4
        L_0x0471:
            r4 = r11
            r44 = r12
            long r11 = (long) r8
            long r11 = r36 + r11
            r10[r14] = r11
            if (r7 != 0) goto L_0x047d
            r11 = 1
            goto L_0x047e
        L_0x047d:
            r11 = 0
        L_0x047e:
            r1[r14] = r11
            if (r14 != r2) goto L_0x0495
            r11 = 1
            r1[r14] = r11
            int r12 = r43 + -1
            if (r12 <= 0) goto L_0x048e
            int r2 = r7.mo25536o()
            int r2 = r2 - r11
        L_0x048e:
            r43 = r2
            r11 = r35
            r35 = r1
            goto L_0x049d
        L_0x0495:
            r11 = r35
            r12 = r43
            r35 = r1
            r43 = r2
        L_0x049d:
            long r1 = (long) r11
            long r36 = r36 + r1
            int r34 = r34 + -1
            if (r34 != 0) goto L_0x04b3
            if (r32 <= 0) goto L_0x04b3
            int r1 = r26.mo25536o()
            int r2 = r26.mo25536o()
            int r32 = r32 + -1
            r34 = r1
            goto L_0x04b4
        L_0x04b3:
            r2 = r11
        L_0x04b4:
            r1 = r9[r14]
            r11 = r2
            long r1 = (long) r1
            long r38 = r38 + r1
            int r57 = r57 + -1
            int r14 = r14 + 1
            r1 = r35
            r2 = r43
            r35 = r11
            r11 = r4
            r4 = r25
            r25 = r8
            r8 = r12
            r12 = r44
            r86 = r31
            r31 = r15
            r15 = r86
            goto L_0x03f8
        L_0x04d4:
            r35 = r1
            r25 = r4
            r43 = r8
            r31 = r15
            if (r23 != 0) goto L_0x04e0
            r0 = 1
            goto L_0x04e1
        L_0x04e0:
            r0 = 0
        L_0x04e1:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15049a((boolean) r0)
        L_0x04e4:
            if (r33 <= 0) goto L_0x04f8
            int r0 = r5.mo25536o()
            if (r0 != 0) goto L_0x04ee
            r0 = 1
            goto L_0x04ef
        L_0x04ee:
            r0 = 0
        L_0x04ef:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15049a((boolean) r0)
            r5.mo25520c()
            int r33 = r33 + -1
            goto L_0x04e4
        L_0x04f8:
            if (r43 != 0) goto L_0x0506
            if (r34 != 0) goto L_0x0506
            r0 = r57
            if (r0 != 0) goto L_0x0508
            if (r32 == 0) goto L_0x0503
            goto L_0x0508
        L_0x0503:
            r5 = r56
            goto L_0x0548
        L_0x0506:
            r0 = r57
        L_0x0508:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inconsistent stbl box for track "
            r1.append(r2)
            r5 = r56
            int r2 = r5.f12297a
            r1.append(r2)
            java.lang.String r2 = ": remainingSynchronizationSamples "
            r1.append(r2)
            r12 = r43
            r1.append(r12)
            java.lang.String r2 = ", remainingSamplesAtTimestampDelta "
            r1.append(r2)
            r2 = r34
            r1.append(r2)
            java.lang.String r2 = ", remainingSamplesInChunk "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r1.append(r0)
            r0 = r32
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "AtomParsers"
            android.util.Log.w(r1, r0)
        L_0x0548:
            r11 = r10
            r4 = r25
            r10 = r9
            r9 = r35
            r35 = r6
            goto L_0x0604
        L_0x0552:
            r21 = r8
            r4 = r11
            r44 = r12
            r5 = r14
            r31 = r15
            long[] r1 = new long[r3]
            int[] r6 = new int[r3]
            r9 = r24
            r10 = r27
            r7 = 0
            r8 = 0
        L_0x0564:
            r12 = 1
            int r9 = r9 + r12
            if (r9 != r3) goto L_0x056b
            r12 = 4
            r14 = 0
            goto L_0x0590
        L_0x056b:
            if (r44 == 0) goto L_0x0572
            long r10 = r0.mo25537p()
            goto L_0x0576
        L_0x0572:
            long r10 = r0.mo25534m()
        L_0x0576:
            if (r9 != r7) goto L_0x058e
            int r8 = r13.mo25536o()
            r12 = 4
            r13.mo25527f(r12)
            int r22 = r22 + -1
            if (r22 <= 0) goto L_0x058b
            int r7 = r13.mo25536o()
            r14 = 1
            int r7 = r7 - r14
            goto L_0x058f
        L_0x058b:
            r7 = r24
            goto L_0x058f
        L_0x058e:
            r12 = 4
        L_0x058f:
            r14 = 1
        L_0x0590:
            if (r14 == 0) goto L_0x0597
            r1[r9] = r10
            r6[r9] = r8
            goto L_0x0564
        L_0x0597:
            int r0 = r4.mo25189b()
            long r7 = (long) r2
            r2 = 8192(0x2000, float:1.14794E-41)
            int r2 = r2 / r0
            r4 = 0
            r9 = 0
        L_0x05a1:
            if (r4 >= r3) goto L_0x05ad
            r10 = r6[r4]
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15132a((int) r10, (int) r2)
            int r9 = r9 + r10
            int r4 = r4 + 1
            goto L_0x05a1
        L_0x05ad:
            long[] r4 = new long[r9]
            int[] r10 = new int[r9]
            long[] r11 = new long[r9]
            int[] r9 = new int[r9]
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x05b9:
            if (r12 >= r3) goto L_0x0600
            r22 = r6[r12]
            r23 = r1[r12]
            r86 = r22
            r22 = r1
            r1 = r86
        L_0x05c5:
            if (r1 <= 0) goto L_0x05f4
            int r25 = java.lang.Math.min(r2, r1)
            r4[r15] = r23
            int r26 = r0 * r25
            r10[r15] = r26
            r26 = r0
            r0 = r10[r15]
            int r13 = java.lang.Math.max(r13, r0)
            r29 = r2
            r0 = r3
            long r2 = (long) r14
            long r2 = r2 * r7
            r11[r15] = r2
            r2 = 1
            r9[r15] = r2
            r2 = r10[r15]
            long r2 = (long) r2
            long r23 = r23 + r2
            int r14 = r14 + r25
            int r1 = r1 - r25
            int r15 = r15 + 1
            r3 = r0
            r0 = r26
            r2 = r29
            goto L_0x05c5
        L_0x05f4:
            r26 = r0
            r29 = r2
            r0 = r3
            int r12 = r12 + 1
            r1 = r22
            r0 = r26
            goto L_0x05b9
        L_0x0600:
            r35 = r13
            r36 = r27
        L_0x0604:
            long[] r0 = r5.f12305i
            r1 = 1000000(0xf4240, double:4.940656E-318)
            if (r0 == 0) goto L_0x083e
            boolean r0 = r21.mo25161a()
            if (r0 == 0) goto L_0x0613
            goto L_0x083e
        L_0x0613:
            long[] r0 = r5.f12305i
            int r3 = r0.length
            r6 = 1
            if (r3 != r6) goto L_0x06a3
            int r3 = r5.f12298b
            if (r3 != r6) goto L_0x06a3
            int r3 = r11.length
            r6 = 2
            if (r3 < r6) goto L_0x06a3
            long[] r3 = r5.f12306j
            r6 = 0
            r7 = r3[r6]
            r38 = r0[r6]
            long r12 = r5.f12299c
            long r14 = r5.f12300d
            r40 = r12
            r42 = r14
            long r12 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r38, (long) r40, (long) r42)
            long r12 = r12 + r7
            r14 = r11[r6]
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x06a3
            r0 = 1
            r14 = r11[r0]
            int r3 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x06a3
            int r3 = r11.length
            int r3 = r3 - r0
            r14 = r11[r3]
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x06a3
            int r0 = (r12 > r36 ? 1 : (r12 == r36 ? 0 : -1))
            if (r0 > 0) goto L_0x06a3
            long r38 = r36 - r12
            r0 = 0
            r12 = r11[r0]
            long r40 = r7 - r12
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r5.f12302f
            int r0 = r0.f12768s
            long r6 = (long) r0
            long r12 = r5.f12299c
            r42 = r6
            r44 = r12
            long r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r40, (long) r42, (long) r44)
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r5.f12302f
            int r0 = r0.f12768s
            long r12 = (long) r0
            long r14 = r5.f12299c
            r40 = r12
            r42 = r14
            long r12 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r38, (long) r40, (long) r42)
            int r0 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            if (r0 != 0) goto L_0x067b
            int r0 = (r12 > r27 ? 1 : (r12 == r27 ? 0 : -1))
            if (r0 == 0) goto L_0x06a3
        L_0x067b:
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x06a3
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x06a3
            int r0 = (int) r6
            r3 = r21
            r3.f11928a = r0
            int r0 = (int) r12
            r3.f11929b = r0
            long r6 = r5.f12299c
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15139a((long[]) r11, (long) r1, (long) r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r32 = r0
            r33 = r4
            r34 = r10
            r36 = r11
            r37 = r9
            r32.<init>(r33, r34, r35, r36, r37)
            goto L_0x06e1
        L_0x06a3:
            r3 = r21
            long[] r0 = r5.f12305i
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x06e6
            r19 = 0
            r1 = r0[r19]
            int r0 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r0 != 0) goto L_0x06e6
            r0 = r19
        L_0x06b5:
            int r1 = r11.length
            if (r0 >= r1) goto L_0x06d2
            r1 = r11[r0]
            long[] r6 = r5.f12306j
            r7 = r6[r19]
            long r21 = r1 - r7
            long r1 = r5.f12299c
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r25 = r1
            long r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r21, (long) r23, (long) r25)
            r11[r0] = r1
            int r0 = r0 + 1
            r19 = 0
            goto L_0x06b5
        L_0x06d2:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r32 = r0
            r33 = r4
            r34 = r10
            r36 = r11
            r37 = r9
            r32.<init>(r33, r34, r35, r36, r37)
        L_0x06e1:
            r10 = r0
            r38 = r3
            goto L_0x0856
        L_0x06e6:
            int r0 = r5.f12298b
            r1 = 1
            if (r0 != r1) goto L_0x06ed
            r0 = 1
            goto L_0x06ee
        L_0x06ed:
            r0 = 0
        L_0x06ee:
            r1 = 0
            r2 = 0
            r6 = 0
            r7 = 0
        L_0x06f2:
            long[] r8 = r5.f12305i
            int r12 = r8.length
            r13 = -1
            if (r1 >= r12) goto L_0x0731
            long[] r12 = r5.f12306j
            r15 = r9
            r21 = r10
            r9 = r12[r1]
            int r12 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x072a
            r36 = r8[r1]
            long r12 = r5.f12299c
            r8 = r15
            long r14 = r5.f12300d
            r38 = r12
            r40 = r14
            long r12 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r36, (long) r38, (long) r40)
            r14 = 1
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15134a(r11, r9, r14, r14)
            long r9 = r9 + r12
            r12 = 0
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15134a(r11, r9, r0, r12)
            int r10 = r9 - r15
            int r2 = r2 + r10
            if (r6 == r15) goto L_0x0725
            r6 = 1
            goto L_0x0726
        L_0x0725:
            r6 = 0
        L_0x0726:
            r6 = r6 | r7
            r7 = r6
            r6 = r9
            goto L_0x072b
        L_0x072a:
            r8 = r15
        L_0x072b:
            int r1 = r1 + 1
            r9 = r8
            r10 = r21
            goto L_0x06f2
        L_0x0731:
            r8 = r9
            r21 = r10
            r1 = r31
            if (r2 == r1) goto L_0x073a
            r1 = 1
            goto L_0x073b
        L_0x073a:
            r1 = 0
        L_0x073b:
            r1 = r1 | r7
            if (r1 == 0) goto L_0x0741
            long[] r6 = new long[r2]
            goto L_0x0742
        L_0x0741:
            r6 = r4
        L_0x0742:
            if (r1 == 0) goto L_0x0747
            int[] r7 = new int[r2]
            goto L_0x0749
        L_0x0747:
            r7 = r21
        L_0x0749:
            if (r1 == 0) goto L_0x074d
            r35 = 0
        L_0x074d:
            if (r1 == 0) goto L_0x0752
            int[] r9 = new int[r2]
            goto L_0x0753
        L_0x0752:
            r9 = r8
        L_0x0753:
            long[] r2 = new long[r2]
            r28 = r27
            r32 = r35
            r10 = 0
            r12 = 0
        L_0x075b:
            long[] r15 = r5.f12305i
            int r13 = r15.length
            if (r10 >= r13) goto L_0x080d
            long[] r13 = r5.f12306j
            r33 = r2
            r14 = r3
            r2 = r13[r10]
            r34 = r15[r10]
            r30 = -1
            int r13 = (r2 > r30 ? 1 : (r2 == r30 ? 0 : -1))
            if (r13 == 0) goto L_0x07f3
            r15 = r14
            long r13 = r5.f12299c
            r36 = r8
            r37 = r9
            long r8 = r5.f12300d
            r22 = r34
            r24 = r13
            r26 = r8
            long r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r22, (long) r24, (long) r26)
            long r8 = r8 + r2
            r13 = 1
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15134a(r11, r2, r13, r13)
            r13 = 0
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15134a(r11, r8, r0, r13)
            if (r1 == 0) goto L_0x07a5
            int r9 = r8 - r14
            java.lang.System.arraycopy(r4, r14, r6, r12, r9)
            r13 = r21
            java.lang.System.arraycopy(r13, r14, r7, r12, r9)
            r21 = r0
            r38 = r15
            r0 = r36
            r15 = r37
            java.lang.System.arraycopy(r0, r14, r15, r12, r9)
            goto L_0x07af
        L_0x07a5:
            r38 = r15
            r13 = r21
            r15 = r37
            r21 = r0
            r0 = r36
        L_0x07af:
            r9 = r32
        L_0x07b1:
            if (r14 >= r8) goto L_0x07ef
            r36 = r8
            r32 = r9
            long r8 = r5.f12300d
            r24 = 1000000(0xf4240, double:4.940656E-318)
            r22 = r28
            r26 = r8
            long r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r22, (long) r24, (long) r26)
            r22 = r11[r14]
            long r39 = r22 - r2
            r22 = r2
            long r2 = r5.f12299c
            r41 = 1000000(0xf4240, double:4.940656E-318)
            r43 = r2
            long r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r39, (long) r41, (long) r43)
            long r8 = r8 + r2
            r33[r12] = r8
            if (r1 == 0) goto L_0x07e3
            r2 = r7[r12]
            r3 = r32
            if (r2 <= r3) goto L_0x07e5
            r9 = r13[r14]
            goto L_0x07e6
        L_0x07e3:
            r3 = r32
        L_0x07e5:
            r9 = r3
        L_0x07e6:
            int r12 = r12 + 1
            int r14 = r14 + 1
            r2 = r22
            r8 = r36
            goto L_0x07b1
        L_0x07ef:
            r3 = r9
            r32 = r3
            goto L_0x07fb
        L_0x07f3:
            r15 = r9
            r38 = r14
            r13 = r21
            r21 = r0
            r0 = r8
        L_0x07fb:
            long r28 = r28 + r34
            int r10 = r10 + 1
            r8 = r0
            r9 = r15
            r0 = r21
            r2 = r33
            r3 = r38
            r21 = r13
            r13 = r30
            goto L_0x075b
        L_0x080d:
            r33 = r2
            r38 = r3
            r15 = r9
            r0 = 0
            r1 = 0
        L_0x0814:
            int r2 = r15.length
            if (r0 >= r2) goto L_0x0826
            if (r1 != 0) goto L_0x0826
            r2 = r15[r0]
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0821
            r4 = 1
            goto L_0x0822
        L_0x0821:
            r4 = 0
        L_0x0822:
            r1 = r1 | r4
            int r0 = r0 + 1
            goto L_0x0814
        L_0x0826:
            if (r1 == 0) goto L_0x0836
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r29 = r10
            r30 = r6
            r31 = r7
            r34 = r15
            r29.<init>(r30, r31, r32, r33, r34)
            goto L_0x0856
        L_0x0836:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x083e:
            r0 = r9
            r13 = r10
            r38 = r21
            long r6 = r5.f12299c
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15139a((long[]) r11, (long) r1, (long) r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r32 = r10
            r33 = r4
            r34 = r13
            r36 = r11
            r37 = r0
            r32.<init>(r33, r34, r35, r36, r37)
        L_0x0856:
            int r0 = r10.f12328a
            if (r0 != 0) goto L_0x0867
        L_0x085a:
            r5 = r20
            r0 = r38
            r6 = r50
            r1 = r52
            r21 = r55
            r4 = 0
            goto L_0x09f2
        L_0x0867:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a
            r1 = r87
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r2 = r1.f12288l
            int r3 = r5.f12298b
            r13 = r55
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r2.mo25098a(r13, r3)
            r0.<init>(r5, r10, r2)
            int r3 = r10.f12331d
            int r3 = r3 + 30
            r61 = r3
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r5.f12302f
            com.fyber.inneractive.sdk.player.exoplayer2.i r6 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r55 = r6
            java.lang.String r7 = r4.f12750a
            r56 = r7
            java.lang.String r8 = r4.f12754e
            r57 = r8
            java.lang.String r9 = r4.f12755f
            r58 = r9
            java.lang.String r11 = r4.f12752c
            r59 = r11
            int r12 = r4.f12751b
            r60 = r12
            int r14 = r4.f12759j
            r62 = r14
            int r15 = r4.f12760k
            r63 = r15
            float r1 = r4.f12761l
            r64 = r1
            r21 = r13
            int r13 = r4.f12762m
            r65 = r13
            r83 = r10
            float r10 = r4.f12763n
            r66 = r10
            r84 = r0
            byte[] r0 = r4.f12765p
            r67 = r0
            r85 = r2
            int r2 = r4.f12764o
            r68 = r2
            r22 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r2 = r4.f12766q
            r69 = r2
            r23 = r2
            int r2 = r4.f12767r
            r70 = r2
            r24 = r2
            int r2 = r4.f12768s
            r71 = r2
            r25 = r2
            int r2 = r4.f12769t
            r72 = r2
            r26 = r2
            int r2 = r4.f12770u
            r73 = r2
            int r2 = r4.f12771v
            r74 = r2
            int r2 = r4.f12773x
            r75 = r2
            r27 = r2
            java.lang.String r2 = r4.f12774y
            r76 = r2
            r28 = r2
            int r2 = r4.f12775z
            r77 = r2
            r30 = r0
            r29 = r1
            long r0 = r4.f12772w
            r78 = r0
            r31 = r0
            java.util.List<byte[]> r0 = r4.f12757h
            r80 = r0
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r0 = r4.f12758i
            r81 = r0
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r0 = r4.f12753d
            r82 = r0
            r55.<init>(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r80, r81, r82)
            int r0 = r5.f12298b
            r1 = 1
            if (r0 != r1) goto L_0x09ce
            boolean r0 = r38.mo25161a()
            if (r0 == 0) goto L_0x095b
            r0 = r38
            int r4 = r0.f11928a
            r73 = r4
            int r4 = r0.f11929b
            r74 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r55 = r4
            java.util.List<byte[]> r1 = r6.f12757h
            r80 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r1 = r6.f12758i
            r81 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r1 = r6.f12753d
            r82 = r1
            r56 = r7
            r57 = r8
            r58 = r9
            r59 = r11
            r60 = r12
            r61 = r3
            r62 = r14
            r63 = r15
            r64 = r29
            r65 = r13
            r66 = r10
            r67 = r30
            r68 = r22
            r69 = r23
            r70 = r24
            r71 = r25
            r72 = r26
            r75 = r27
            r76 = r28
            r77 = r2
            r78 = r31
            r55.<init>(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r80, r81, r82)
            r6 = r4
            goto L_0x095d
        L_0x095b:
            r0 = r38
        L_0x095d:
            if (r54 == 0) goto L_0x09d0
            com.fyber.inneractive.sdk.player.exoplayer2.i r1 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r22 = r1
            java.lang.String r2 = r6.f12750a
            r23 = r2
            java.lang.String r2 = r6.f12754e
            r24 = r2
            java.lang.String r2 = r6.f12755f
            r25 = r2
            java.lang.String r2 = r6.f12752c
            r26 = r2
            int r2 = r6.f12751b
            r27 = r2
            int r2 = r6.f12756g
            r28 = r2
            int r2 = r6.f12759j
            r29 = r2
            int r2 = r6.f12760k
            r30 = r2
            float r2 = r6.f12761l
            r31 = r2
            int r2 = r6.f12762m
            r32 = r2
            float r2 = r6.f12763n
            r33 = r2
            byte[] r2 = r6.f12765p
            r34 = r2
            int r2 = r6.f12764o
            r35 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r2 = r6.f12766q
            r36 = r2
            int r2 = r6.f12767r
            r37 = r2
            int r2 = r6.f12768s
            r38 = r2
            int r2 = r6.f12769t
            r39 = r2
            int r2 = r6.f12770u
            r40 = r2
            int r2 = r6.f12771v
            r41 = r2
            int r2 = r6.f12773x
            r42 = r2
            java.lang.String r2 = r6.f12774y
            r43 = r2
            int r2 = r6.f12775z
            r44 = r2
            long r2 = r6.f12772w
            r45 = r2
            java.util.List<byte[]> r2 = r6.f12757h
            r47 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = r6.f12758i
            r48 = r2
            r49 = r54
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r47, r48, r49)
            r6 = r1
            goto L_0x09d0
        L_0x09ce:
            r0 = r38
        L_0x09d0:
            r1 = r85
            r1.mo25074a(r6)
            long r1 = r5.f12301e
            r3 = r52
            long r1 = java.lang.Math.max(r3, r1)
            r5 = r20
            r3 = r84
            r5.add(r3)
            r10 = r83
            long[] r3 = r10.f12329b
            r4 = 0
            r6 = r3[r4]
            int r3 = (r6 > r50 ? 1 : (r6 == r50 ? 0 : -1))
            if (r3 >= 0) goto L_0x09f0
            goto L_0x09f2
        L_0x09f0:
            r6 = r50
        L_0x09f2:
            int r9 = r21 + 1
            r8 = r0
            r13 = r4
            r0 = r18
            r11 = 0
            r12 = 1
            r3 = r1
            r2 = r54
            r1 = r87
            goto L_0x0261
        L_0x0a01:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0a09:
            r1.f12290n = r3
            int r0 = r5.size()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a[] r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4739f.C4740a[r0]
            java.lang.Object[] r0 = r5.toArray(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a[] r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4739f.C4740a[]) r0
            r1.f12289m = r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r0 = r1.f12288l
            r0.mo25100c()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r0 = r1.f12288l
            r0.mo25099a(r1)
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12280d
            r0.clear()
            r0 = 2
            r1.f12281e = r0
            goto L_0x0002
        L_0x0a2d:
            r18 = r0
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12280d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0002
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12280d
            java.lang.Object r0 = r0.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r0
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r0.f12180R0
            r2 = r18
            r0.add(r2)
            goto L_0x0002
        L_0x0a48:
            int r0 = r1.f12281e
            r2 = 2
            if (r0 == r2) goto L_0x0a50
            r87.mo25197d()
        L_0x0a50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4739f.mo25196c(long):void");
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        this.f12280d.clear();
        this.f12284h = 0;
        this.f12286j = 0;
        this.f12287k = 0;
        if (j == 0) {
            mo25197d();
            return;
        }
        C4740a[] aVarArr = this.f12289m;
        if (aVarArr != null) {
            for (C4740a aVar : aVarArr) {
                C4745k kVar = aVar.f12293b;
                int a = kVar.mo25199a(j2);
                if (a == -1) {
                    a = kVar.mo25200b(j2);
                }
                aVar.f12295d = a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x0190 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25088a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g r24, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.f12281e
            r4 = -1
            r5 = 8
            r6 = 1
            if (r3 == 0) goto L_0x0192
            r8 = 262144(0x40000, double:1.295163E-318)
            r10 = 2
            if (r3 == r6) goto L_0x0112
            if (r3 != r10) goto L_0x010c
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = r4
            r3 = 0
        L_0x001d:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a[] r14 = r0.f12289m
            int r15 = r14.length
            if (r3 >= r15) goto L_0x003a
            r14 = r14[r3]
            int r15 = r14.f12295d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r14 = r14.f12293b
            int r11 = r14.f12328a
            if (r15 != r11) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            long[] r11 = r14.f12329b
            r14 = r11[r15]
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0037
            r5 = r3
            r12 = r14
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x003a:
            if (r5 != r4) goto L_0x003e
            goto L_0x010b
        L_0x003e:
            r3 = r14[r5]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r4 = r3.f12294c
            int r5 = r3.f12295d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r11 = r3.f12293b
            long[] r12 = r11.f12329b
            r13 = r12[r5]
            int[] r11 = r11.f12330c
            r11 = r11[r5]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r12 = r3.f12292a
            int r12 = r12.f12303g
            if (r12 != r6) goto L_0x005a
            r16 = 8
            long r13 = r13 + r16
            int r11 = r11 + -8
        L_0x005a:
            r12 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r12 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r12
            r16 = r11
            long r10 = r12.f11670c
            long r10 = r13 - r10
            int r15 = r0.f12286j
            long r6 = (long) r15
            long r10 = r10 + r6
            r6 = 0
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0108
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0073
            goto L_0x0108
        L_0x0073:
            int r2 = (int) r10
            r12.mo25064c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = r3.f12292a
            int r2 = r2.f12307k
            if (r2 == 0) goto L_0x00cc
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f12278b
            byte[] r6 = r6.f13243a
            r7 = 0
            r6[r7] = r7
            r8 = 1
            r6[r8] = r7
            r8 = 2
            r6[r8] = r7
            int r6 = 4 - r2
            r11 = r16
        L_0x008e:
            int r8 = r0.f12286j
            if (r8 >= r11) goto L_0x00e6
            int r8 = r0.f12287k
            if (r8 != 0) goto L_0x00bc
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12278b
            byte[] r8 = r8.f13243a
            r12.mo25063b(r8, r6, r2, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12278b
            r8.mo25525e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12278b
            int r8 = r8.mo25536o()
            r0.f12287k = r8
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12277a
            r8.mo25525e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12277a
            r9 = 4
            r4.mo25075a(r8, r9)
            int r8 = r0.f12286j
            int r8 = r8 + r9
            r0.f12286j = r8
            int r11 = r11 + r6
            goto L_0x008e
        L_0x00bc:
            int r8 = r4.mo25068a(r1, r8, r7)
            int r7 = r0.f12286j
            int r7 = r7 + r8
            r0.f12286j = r7
            int r7 = r0.f12287k
            int r7 = r7 - r8
            r0.f12287k = r7
            r7 = 0
            goto L_0x008e
        L_0x00cc:
            int r2 = r0.f12286j
            r11 = r16
            if (r2 >= r11) goto L_0x00e6
            int r2 = r11 - r2
            r6 = 0
            int r2 = r4.mo25068a(r1, r2, r6)
            int r6 = r0.f12286j
            int r6 = r6 + r2
            r0.f12286j = r6
            int r6 = r0.f12287k
            int r6 = r6 - r2
            r0.f12287k = r6
            r16 = r11
            goto L_0x00cc
        L_0x00e6:
            r20 = r11
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r1 = r3.f12293b
            long[] r2 = r1.f12332e
            r17 = r2[r5]
            int[] r1 = r1.f12333f
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.mo25072a(r17, r19, r20, r21, r22)
            int r1 = r3.f12295d
            r2 = 1
            int r1 = r1 + r2
            r3.f12295d = r1
            r1 = 0
            r0.f12286j = r1
            r0.f12287k = r1
            r4 = 0
            goto L_0x010b
        L_0x0108:
            r2.f11944a = r13
            r4 = 1
        L_0x010b:
            return r4
        L_0x010c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0112:
            long r3 = r0.f12283g
            int r6 = r0.f12284h
            long r10 = (long) r6
            long r3 = r3 - r10
            r7 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r7
            long r10 = r7.f11670c
            long r10 = r10 + r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r12 = r0.f12285i
            if (r12 == 0) goto L_0x0174
            byte[] r8 = r12.f13243a
            int r3 = (int) r3
            r4 = 0
            r7.mo25063b(r8, r6, r3, r4)
            int r3 = r0.f12282f
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12127b
            if (r3 != r4) goto L_0x0155
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12285i
            r3.mo25525e(r5)
            int r4 = r3.mo25520c()
            int r5 = f12276p
            if (r4 != r5) goto L_0x013d
            goto L_0x014f
        L_0x013d:
            r4 = 4
            r3.mo25527f(r4)
        L_0x0141:
            int r4 = r3.mo25513a()
            if (r4 <= 0) goto L_0x0151
            int r4 = r3.mo25520c()
            int r5 = f12276p
            if (r4 != r5) goto L_0x0141
        L_0x014f:
            r3 = 1
            goto L_0x0152
        L_0x0151:
            r3 = 0
        L_0x0152:
            r0.f12291o = r3
            goto L_0x017c
        L_0x0155:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f12280d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x017c
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f12280d
            java.lang.Object r3 = r3.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b
            int r5 = r0.f12282f
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f12285i
            r4.<init>(r5, r6)
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r3 = r3.f12179Q0
            r3.add(r4)
            goto L_0x017c
        L_0x0174:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x017e
            int r3 = (int) r3
            r7.mo25064c(r3)
        L_0x017c:
            r3 = 0
            goto L_0x0181
        L_0x017e:
            r2.f11944a = r10
            r3 = 1
        L_0x0181:
            r0.mo25196c(r10)
            if (r3 == 0) goto L_0x018d
            int r3 = r0.f12281e
            r4 = 2
            if (r3 == r4) goto L_0x018d
            r7 = 1
            goto L_0x018e
        L_0x018d:
            r7 = 0
        L_0x018e:
            if (r7 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x0192:
            r3 = r6
            int r6 = r0.f12284h
            if (r6 != 0) goto L_0x01bf
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f12279c
            byte[] r6 = r6.f13243a
            r7 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r7
            r8 = 0
            boolean r6 = r7.mo25063b(r6, r8, r5, r3)
            if (r6 != 0) goto L_0x01a8
            r6 = r8
            goto L_0x02a8
        L_0x01a8:
            r0.f12284h = r5
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12279c
            r3.mo25525e(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12279c
            long r6 = r3.mo25534m()
            r0.f12283g = r6
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12279c
            int r3 = r3.mo25520c()
            r0.f12282f = r3
        L_0x01bf:
            long r6 = r0.f12283g
            r8 = 1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01df
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12279c
            byte[] r3 = r3.f13243a
            r6 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r6
            r7 = 0
            r6.mo25063b(r3, r5, r5, r7)
            int r3 = r0.f12284h
            int r3 = r3 + r5
            r0.f12284h = r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12279c
            long r6 = r3.mo25537p()
            r0.f12283g = r6
        L_0x01df:
            int r3 = r0.f12282f
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12089C
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12093E
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12095F
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12097G
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12099H
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12116Q
            if (r3 != r6) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            r7 = 0
            goto L_0x01fd
        L_0x01fc:
            r7 = 1
        L_0x01fd:
            if (r7 == 0) goto L_0x022a
            r3 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r3
            long r5 = r3.f11670c
            long r7 = r0.f12283g
            long r5 = r5 + r7
            int r3 = r0.f12284h
            long r7 = (long) r3
            long r5 = r5 - r7
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f12280d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a
            int r8 = r0.f12282f
            r7.<init>(r8, r5)
            r3.add(r7)
            long r7 = r0.f12283g
            int r3 = r0.f12284h
            long r9 = (long) r3
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0224
            r0.mo25196c(r5)
            goto L_0x0227
        L_0x0224:
            r23.mo25197d()
        L_0x0227:
            r3 = 1
            goto L_0x02a7
        L_0x022a:
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12118S
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12091D
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12119T
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12120U
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12150m0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12152n0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12154o0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12117R
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12156p0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12158q0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12160r0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12162s0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12164t0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12115P
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12127b
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12086A0
            if (r3 != r6) goto L_0x026b
            goto L_0x026d
        L_0x026b:
            r7 = 0
            goto L_0x026e
        L_0x026d:
            r7 = 1
        L_0x026e:
            if (r7 == 0) goto L_0x02a1
            int r3 = r0.f12284h
            if (r3 != r5) goto L_0x0276
            r7 = 1
            goto L_0x0277
        L_0x0276:
            r7 = 0
        L_0x0277:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r7)
            long r6 = r0.f12283g
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0285
            r7 = 1
            goto L_0x0286
        L_0x0285:
            r7 = 0
        L_0x0286:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            long r6 = r0.f12283g
            int r6 = (int) r6
            r3.<init>((int) r6)
            r0.f12285i = r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f12279c
            byte[] r6 = r6.f13243a
            byte[] r3 = r3.f13243a
            r7 = 0
            java.lang.System.arraycopy(r6, r7, r3, r7, r5)
            r3 = 1
            r0.f12281e = r3
            goto L_0x02a7
        L_0x02a1:
            r3 = 1
            r5 = 0
            r0.f12285i = r5
            r0.f12281e = r3
        L_0x02a7:
            r6 = r3
        L_0x02a8:
            if (r6 != 0) goto L_0x0006
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4739f.mo25088a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public long mo25054a(long j) {
        long j2 = Long.MAX_VALUE;
        for (C4740a aVar : this.f12289m) {
            C4745k kVar = aVar.f12293b;
            int a = kVar.mo25199a(j);
            if (a == -1) {
                a = kVar.mo25200b(j);
            }
            long j3 = kVar.f12329b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }
}
