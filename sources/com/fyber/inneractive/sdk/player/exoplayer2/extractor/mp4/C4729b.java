package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.google.android.exoplayer2.extractor.p193ts.TsExtractor;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b */
public final class C4729b {

    /* renamed from: a */
    public static final int f12182a = C4991u.m15133a("vide");

    /* renamed from: b */
    public static final int f12183b = C4991u.m15133a("soun");

    /* renamed from: c */
    public static final int f12184c = C4991u.m15133a("text");

    /* renamed from: d */
    public static final int f12185d = C4991u.m15133a("sbtl");

    /* renamed from: e */
    public static final int f12186e = C4991u.m15133a("subt");

    /* renamed from: f */
    public static final int f12187f = C4991u.m15133a("clcp");

    /* renamed from: g */
    public static final int f12188g = C4991u.m15133a("cenc");

    /* renamed from: h */
    public static final int f12189h = C4991u.m15133a("meta");

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$a */
    public interface C4730a {
        /* renamed from: a */
        int mo25188a();

        /* renamed from: b */
        int mo25189b();

        /* renamed from: c */
        boolean mo25190c();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b */
    public static final class C4731b {

        /* renamed from: a */
        public final C4743i[] f12190a;

        /* renamed from: b */
        public C4811i f12191b;

        /* renamed from: c */
        public int f12192c;

        /* renamed from: d */
        public int f12193d = 0;

        public C4731b(int i) {
            this.f12190a = new C4743i[i];
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$c */
    public static final class C4732c implements C4730a {

        /* renamed from: a */
        public final int f12194a;

        /* renamed from: b */
        public final int f12195b;

        /* renamed from: c */
        public final C4978k f12196c;

        public C4732c(C4726a.C4728b bVar) {
            C4978k kVar = bVar.f12181P0;
            this.f12196c = kVar;
            kVar.mo25525e(12);
            this.f12194a = kVar.mo25536o();
            this.f12195b = kVar.mo25536o();
        }

        /* renamed from: a */
        public int mo25188a() {
            return this.f12195b;
        }

        /* renamed from: b */
        public int mo25189b() {
            int i = this.f12194a;
            return i == 0 ? this.f12196c.mo25536o() : i;
        }

        /* renamed from: c */
        public boolean mo25190c() {
            return this.f12194a != 0;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$d */
    public static final class C4733d implements C4730a {

        /* renamed from: a */
        public final C4978k f12197a;

        /* renamed from: b */
        public final int f12198b;

        /* renamed from: c */
        public final int f12199c;

        /* renamed from: d */
        public int f12200d;

        /* renamed from: e */
        public int f12201e;

        public C4733d(C4726a.C4728b bVar) {
            C4978k kVar = bVar.f12181P0;
            this.f12197a = kVar;
            kVar.mo25525e(12);
            this.f12199c = kVar.mo25536o() & 255;
            this.f12198b = kVar.mo25536o();
        }

        /* renamed from: a */
        public int mo25188a() {
            return this.f12198b;
        }

        /* renamed from: b */
        public int mo25189b() {
            int i = this.f12199c;
            if (i == 8) {
                return this.f12197a.mo25533l();
            }
            if (i == 16) {
                return this.f12197a.mo25538q();
            }
            int i2 = this.f12200d;
            this.f12200d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f12201e & 15;
            }
            int l = this.f12197a.mo25533l();
            this.f12201e = l;
            return (l & 240) >> 4;
        }

        /* renamed from: c */
        public boolean mo25190c() {
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        if (r8 == 0) goto L_0x008d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4742h m14453a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a r45, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b r46, long r47, com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a r49, boolean r50) throws com.fyber.inneractive.sdk.player.exoplayer2.C4815l {
        /*
            r0 = r45
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12095F
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r1 = r0.mo25186c(r1)
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12119T
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r2 = r1.mo25187d(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r2.f12181P0
            r3 = 16
            r2.mo25525e(r3)
            int r2 = r2.mo25520c()
            int r4 = f12183b
            r6 = 4
            r7 = -1
            if (r2 != r4) goto L_0x0021
            r12 = 1
            goto L_0x0041
        L_0x0021:
            int r4 = f12182a
            if (r2 != r4) goto L_0x0027
            r12 = 2
            goto L_0x0041
        L_0x0027:
            int r4 = f12184c
            if (r2 == r4) goto L_0x0040
            int r4 = f12185d
            if (r2 == r4) goto L_0x0040
            int r4 = f12186e
            if (r2 == r4) goto L_0x0040
            int r4 = f12187f
            if (r2 != r4) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            int r4 = f12189h
            if (r2 != r4) goto L_0x003e
            r12 = r6
            goto L_0x0041
        L_0x003e:
            r12 = r7
            goto L_0x0041
        L_0x0040:
            r12 = 3
        L_0x0041:
            r2 = 0
            if (r12 != r7) goto L_0x0045
            return r2
        L_0x0045:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12115P
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r4 = r0.mo25187d(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r4.f12181P0
            r10 = 8
            r4.mo25525e(r10)
            int r11 = r4.mo25520c()
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r11)
            if (r11 != 0) goto L_0x005e
            r13 = r10
            goto L_0x005f
        L_0x005e:
            r13 = r3
        L_0x005f:
            r4.mo25527f(r13)
            int r13 = r4.mo25520c()
            r4.mo25527f(r6)
            int r14 = r4.f13244b
            if (r11 != 0) goto L_0x006f
            r15 = r6
            goto L_0x0070
        L_0x006f:
            r15 = r10
        L_0x0070:
            r8 = 0
        L_0x0071:
            if (r8 >= r15) goto L_0x0080
            byte[] r9 = r4.f13243a
            int r19 = r14 + r8
            byte r9 = r9[r19]
            if (r9 == r7) goto L_0x007d
            r8 = 0
            goto L_0x0081
        L_0x007d:
            int r8 = r8 + 1
            goto L_0x0071
        L_0x0080:
            r8 = 1
        L_0x0081:
            r19 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == 0) goto L_0x0090
            r4.mo25527f(r15)
        L_0x008d:
            r8 = r21
            goto L_0x00a0
        L_0x0090:
            if (r11 != 0) goto L_0x0097
            long r8 = r4.mo25534m()
            goto L_0x009b
        L_0x0097:
            long r8 = r4.mo25537p()
        L_0x009b:
            int r11 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r11 != 0) goto L_0x00a0
            goto L_0x008d
        L_0x00a0:
            r4.mo25527f(r3)
            int r11 = r4.mo25520c()
            int r14 = r4.mo25520c()
            r4.mo25527f(r6)
            int r15 = r4.mo25520c()
            int r4 = r4.mo25520c()
            r6 = 65536(0x10000, float:9.18355E-41)
            r3 = -65536(0xffffffffffff0000, float:NaN)
            if (r11 != 0) goto L_0x00c5
            if (r14 != r6) goto L_0x00c5
            if (r15 != r3) goto L_0x00c5
            if (r4 != 0) goto L_0x00c5
            r3 = 90
            goto L_0x00dc
        L_0x00c5:
            if (r11 != 0) goto L_0x00d0
            if (r14 != r3) goto L_0x00d0
            if (r15 != r6) goto L_0x00d0
            if (r4 != 0) goto L_0x00d0
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x00dc
        L_0x00d0:
            if (r11 != r3) goto L_0x00db
            if (r14 != 0) goto L_0x00db
            if (r15 != 0) goto L_0x00db
            if (r4 != r3) goto L_0x00db
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x00dc
        L_0x00db:
            r3 = 0
        L_0x00dc:
            int r4 = (r47 > r21 ? 1 : (r47 == r21 ? 0 : -1))
            if (r4 != 0) goto L_0x00e5
            r4 = r46
            r25 = r8
            goto L_0x00e9
        L_0x00e5:
            r4 = r46
            r25 = r47
        L_0x00e9:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r4.f12181P0
            r4.mo25525e(r10)
            int r6 = r4.mo25520c()
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r6)
            if (r6 != 0) goto L_0x00fa
            r6 = r10
            goto L_0x00fc
        L_0x00fa:
            r6 = 16
        L_0x00fc:
            r4.mo25527f(r6)
            long r8 = r4.mo25534m()
            int r4 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r4 != 0) goto L_0x0108
            goto L_0x0113
        L_0x0108:
            r27 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r8
            long r14 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r25, (long) r27, (long) r29)
            r21 = r14
        L_0x0113:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12097G
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r4 = r1.mo25186c(r4)
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12099H
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r4 = r4.mo25186c(r6)
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12118S
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r1 = r1.mo25187d(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r1.f12181P0
            r1.mo25525e(r10)
            int r6 = r1.mo25520c()
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r6)
            if (r6 != 0) goto L_0x0136
            r11 = r10
            goto L_0x0138
        L_0x0136:
            r11 = 16
        L_0x0138:
            r1.mo25527f(r11)
            long r14 = r1.mo25534m()
            if (r6 != 0) goto L_0x0143
            r6 = 4
            goto L_0x0144
        L_0x0143:
            r6 = r10
        L_0x0144:
            r1.mo25527f(r6)
            int r1 = r1.mo25538q()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = ""
            r6.append(r11)
            int r11 = r1 >> 10
            r11 = r11 & 31
            int r11 = r11 + 96
            char r11 = (char) r11
            r6.append(r11)
            int r11 = r1 >> 5
            r11 = r11 & 31
            int r11 = r11 + 96
            char r11 = (char) r11
            r6.append(r11)
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            android.util.Pair r1 = android.util.Pair.create(r6, r1)
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12120U
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r4 = r4.mo25187d(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r4.f12181P0
            java.lang.Object r6 = r1.second
            java.lang.String r6 = (java.lang.String) r6
            r11 = 12
            r4.mo25525e(r11)
            int r11 = r4.mo25520c()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b r14 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b
            r14.<init>(r11)
            r15 = 0
        L_0x0198:
            if (r15 >= r11) goto L_0x0707
            int r5 = r4.f13244b
            int r10 = r4.mo25520c()
            if (r10 <= 0) goto L_0x01a4
            r2 = 1
            goto L_0x01a5
        L_0x01a4:
            r2 = 0
        L_0x01a5:
            java.lang.String r7 = "childAtomSize should be positive"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15050a(r2, r7)
            int r2 = r4.mo25520c()
            r46 = r11
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12129c
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12131d
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12126a0
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12148l0
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12133e
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12135f
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12137g
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12106K0
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12108L0
            if (r2 != r11) goto L_0x01d6
            goto L_0x055b
        L_0x01d6:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12143j
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12128b0
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12153o
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12157q
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12161s
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12167v
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12163t
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12165u
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12174y0
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12176z0
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12149m
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12151n
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12145k
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12114O0
            if (r2 != r11) goto L_0x0210
            goto L_0x02c1
        L_0x0210:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12146k0
            if (r2 == r7) goto L_0x0243
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12166u0
            if (r2 == r11) goto L_0x0243
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12168v0
            if (r2 == r11) goto L_0x0243
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12170w0
            if (r2 == r11) goto L_0x0243
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12172x0
            if (r2 != r11) goto L_0x0225
            goto L_0x0243
        L_0x0225:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12112N0
            if (r2 != r7) goto L_0x023d
            java.lang.String r2 = java.lang.Integer.toString(r13)
            java.lang.String r7 = "application/x-camera-motion"
            r11 = r49
            r47 = r8
            r8 = -1
            r9 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14725a(r2, r7, r9, r8, r11)
            r14.f12191b = r2
            goto L_0x0303
        L_0x023d:
            r11 = r49
            r47 = r8
            goto L_0x0303
        L_0x0243:
            r11 = r49
            r47 = r8
            int r8 = r5 + 8
            r9 = 8
            int r8 = r8 + r9
            r4.mo25525e(r8)
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r8 = "application/ttml+xml"
            if (r2 != r7) goto L_0x025f
            r33 = r25
            r35 = 0
            r26 = r8
            goto L_0x02a4
        L_0x025f:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12166u0
            if (r2 != r7) goto L_0x0282
            int r2 = r10 + -8
            int r2 = r2 - r9
            byte[] r7 = new byte[r2]
            byte[] r8 = r4.f13243a
            int r9 = r4.f13244b
            r11 = 0
            java.lang.System.arraycopy(r8, r9, r7, r11, r2)
            int r8 = r4.f13244b
            int r8 = r8 + r2
            r4.f13244b = r8
            java.util.List r2 = java.util.Collections.singletonList(r7)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r35 = r2
            r33 = r25
            r26 = r7
            goto L_0x02a4
        L_0x0282:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12168v0
            if (r2 != r7) goto L_0x028f
            java.lang.String r2 = "application/x-mp4-vtt"
        L_0x0288:
            r33 = r25
            r35 = 0
            r26 = r2
            goto L_0x02a4
        L_0x028f:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12170w0
            if (r2 != r7) goto L_0x029a
            r26 = r8
            r33 = r19
            r35 = 0
            goto L_0x02a4
        L_0x029a:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12172x0
            if (r2 != r7) goto L_0x02bb
            r2 = 1
            r14.f12193d = r2
            java.lang.String r2 = "application/x-mp4-cea-608"
            goto L_0x0288
        L_0x02a4:
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = 0
            r28 = -1
            r29 = 0
            r31 = -1
            r30 = r6
            r32 = r49
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14723a(r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
            r14.f12191b = r2
            goto L_0x0303
        L_0x02bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02c1:
            r47 = r8
            int r8 = r5 + 8
            r9 = 8
            int r8 = r8 + r9
            r4.mo25525e(r8)
            r8 = 6
            if (r50 == 0) goto L_0x02d6
            int r11 = r4.mo25538q()
            r4.mo25527f(r8)
            goto L_0x02da
        L_0x02d6:
            r4.mo25527f(r9)
            r11 = 0
        L_0x02da:
            if (r11 == 0) goto L_0x030e
            r9 = 1
            if (r11 != r9) goto L_0x02e0
            goto L_0x030e
        L_0x02e0:
            r9 = 2
            if (r11 != r9) goto L_0x0303
            r9 = 16
            r4.mo25527f(r9)
            long r25 = r4.mo25530i()
            double r25 = java.lang.Double.longBitsToDouble(r25)
            long r8 = java.lang.Math.round(r25)
            int r8 = (int) r8
            int r9 = r4.mo25536o()
            r11 = 20
            r4.mo25527f(r11)
            r41 = r1
            r40 = r12
            goto L_0x0343
        L_0x0303:
            r41 = r1
            r42 = r3
            r9 = r10
            r40 = r12
            r8 = r15
        L_0x030b:
            r1 = 3
            goto L_0x06ef
        L_0x030e:
            int r9 = r4.mo25538q()
            r8 = 6
            r4.mo25527f(r8)
            byte[] r8 = r4.f13243a
            r25 = r9
            int r9 = r4.f13244b
            r40 = r12
            int r12 = r9 + 1
            r4.f13244b = r12
            byte r9 = r8[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r26 = 8
            int r9 = r9 << 8
            r41 = r1
            int r1 = r12 + 1
            r4.f13244b = r1
            byte r8 = r8[r12]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            r9 = 2
            int r1 = r1 + r9
            r4.f13244b = r1
            r1 = 1
            if (r11 != r1) goto L_0x0341
            r1 = 16
            r4.mo25527f(r1)
        L_0x0341:
            r9 = r25
        L_0x0343:
            int r1 = r4.f13244b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12128b0
            if (r2 != r11) goto L_0x0350
            int r2 = m14451a((com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k) r4, (int) r5, (int) r10, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4729b.C4731b) r14, (int) r15)
            r4.mo25525e(r1)
        L_0x0350:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12153o
            java.lang.String r12 = "audio/raw"
            if (r2 != r11) goto L_0x0359
            java.lang.String r2 = "audio/ac3"
            goto L_0x03a2
        L_0x0359:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12157q
            if (r2 != r11) goto L_0x0360
            java.lang.String r2 = "audio/eac3"
            goto L_0x03a2
        L_0x0360:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12161s
            if (r2 != r11) goto L_0x0367
            java.lang.String r2 = "audio/vnd.dts"
            goto L_0x03a2
        L_0x0367:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12163t
            if (r2 == r11) goto L_0x03a0
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12165u
            if (r2 != r11) goto L_0x0370
            goto L_0x03a0
        L_0x0370:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12167v
            if (r2 != r11) goto L_0x0377
            java.lang.String r2 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03a2
        L_0x0377:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12174y0
            if (r2 != r11) goto L_0x037e
            java.lang.String r2 = "audio/3gpp"
            goto L_0x03a2
        L_0x037e:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12176z0
            if (r2 != r11) goto L_0x0385
            java.lang.String r2 = "audio/amr-wb"
            goto L_0x03a2
        L_0x0385:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12149m
            if (r2 == r11) goto L_0x039e
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12151n
            if (r2 != r11) goto L_0x038e
            goto L_0x039e
        L_0x038e:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12145k
            if (r2 != r11) goto L_0x0395
            java.lang.String r2 = "audio/mpeg"
            goto L_0x03a2
        L_0x0395:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12114O0
            if (r2 != r11) goto L_0x039c
            java.lang.String r2 = "audio/alac"
            goto L_0x03a2
        L_0x039c:
            r2 = 0
            goto L_0x03a2
        L_0x039e:
            r2 = r12
            goto L_0x03a2
        L_0x03a0:
            java.lang.String r2 = "audio/vnd.dts.hd"
        L_0x03a2:
            r11 = r8
            r8 = r1
            r1 = r9
            r9 = 0
        L_0x03a6:
            int r0 = r8 - r5
            if (r0 >= r10) goto L_0x0516
            r4.mo25525e(r8)
            int r0 = r4.mo25520c()
            r42 = r3
            if (r0 <= 0) goto L_0x03b7
            r3 = 1
            goto L_0x03b8
        L_0x03b7:
            r3 = 0
        L_0x03b8:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15050a(r3, r7)
            int r3 = r4.mo25520c()
            r43 = r10
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12105K
            r44 = r15
            if (r3 == r10) goto L_0x04ae
            if (r50 == 0) goto L_0x03cf
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12147l
            if (r3 != r15) goto L_0x03cf
            goto L_0x04ae
        L_0x03cf:
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12155p
            if (r3 != r10) goto L_0x041d
            int r3 = r8 + 8
            r4.mo25525e(r3)
            java.lang.String r25 = java.lang.Integer.toString(r13)
            int r3 = r4.mo25533l()
            r3 = r3 & 192(0xc0, float:2.69E-43)
            r10 = 6
            int r3 = r3 >> r10
            int[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C4620a.f11498b
            r31 = r10[r3]
            int r3 = r4.mo25533l()
            int[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C4620a.f11500d
            r15 = r3 & 56
            r16 = 3
            int r15 = r15 >> 3
            r10 = r10[r15]
            r15 = 4
            r3 = r3 & r15
            if (r3 == 0) goto L_0x03fc
            int r10 = r10 + 1
        L_0x03fc:
            r30 = r10
            r27 = 0
            r28 = -1
            r29 = -1
            r32 = -1
            r33 = 0
            r35 = 0
            java.lang.String r26 = "audio/ac3"
            r34 = r49
            r36 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14722a((java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28, (int) r29, (int) r30, (int) r31, (int) r32, (java.util.List<byte[]>) r33, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r34, (int) r35, (java.lang.String) r36)
            r14.f12191b = r3
            r25 = r7
            r7 = -1
            r23 = 6
            goto L_0x050b
        L_0x041d:
            r15 = 4
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12159r
            if (r3 != r10) goto L_0x046c
            int r3 = r8 + 8
            r4.mo25525e(r3)
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r3 = 2
            r4.mo25527f(r3)
            int r3 = r4.mo25533l()
            r3 = r3 & 192(0xc0, float:2.69E-43)
            r23 = 6
            int r3 = r3 >> 6
            int[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C4620a.f11498b
            r31 = r10[r3]
            int r3 = r4.mo25533l()
            int[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C4620a.f11500d
            r26 = r3 & 14
            r18 = 1
            int r26 = r26 >> 1
            r10 = r10[r26]
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0451
            int r10 = r10 + 1
        L_0x0451:
            r30 = r10
            r27 = 0
            r28 = -1
            r29 = -1
            r32 = -1
            r33 = 0
            r35 = 0
            java.lang.String r26 = "audio/eac3"
            r34 = r49
            r36 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14722a((java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28, (int) r29, (int) r30, (int) r31, (int) r32, (java.util.List<byte[]>) r33, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r34, (int) r35, (java.lang.String) r36)
            r14.f12191b = r3
            goto L_0x04aa
        L_0x046c:
            r23 = 6
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12169w
            if (r3 != r10) goto L_0x0493
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = 0
            r28 = -1
            r29 = -1
            r32 = -1
            r33 = 0
            r35 = 0
            r26 = r2
            r30 = r1
            r31 = r11
            r34 = r49
            r36 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14722a((java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28, (int) r29, (int) r30, (int) r31, (int) r32, (java.util.List<byte[]>) r33, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r34, (int) r35, (java.lang.String) r36)
            r14.f12191b = r3
            goto L_0x04aa
        L_0x0493:
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12114O0
            if (r3 != r10) goto L_0x04aa
            byte[] r3 = new byte[r0]
            r4.mo25525e(r8)
            byte[] r9 = r4.f13243a
            int r10 = r4.f13244b
            r15 = 0
            java.lang.System.arraycopy(r9, r10, r3, r15, r0)
            int r9 = r4.f13244b
            int r9 = r9 + r0
            r4.f13244b = r9
            r9 = r3
        L_0x04aa:
            r25 = r7
            r7 = -1
            goto L_0x050b
        L_0x04ae:
            r15 = 0
            r23 = 6
            if (r3 != r10) goto L_0x04b8
            r25 = r7
            r3 = r8
        L_0x04b6:
            r7 = -1
            goto L_0x04df
        L_0x04b8:
            int r3 = r4.f13244b
        L_0x04ba:
            int r10 = r3 - r8
            if (r10 >= r0) goto L_0x04db
            r4.mo25525e(r3)
            int r10 = r4.mo25520c()
            if (r10 <= 0) goto L_0x04c8
            r15 = 1
        L_0x04c8:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15050a(r15, r7)
            int r15 = r4.mo25520c()
            r25 = r7
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12105K
            if (r15 != r7) goto L_0x04d6
            goto L_0x04b6
        L_0x04d6:
            int r3 = r3 + r10
            r7 = r25
            r15 = 0
            goto L_0x04ba
        L_0x04db:
            r25 = r7
            r3 = -1
            goto L_0x04b6
        L_0x04df:
            if (r3 == r7) goto L_0x050b
            android.util.Pair r2 = m14452a(r4, r3)
            java.lang.Object r3 = r2.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.second
            byte[] r2 = (byte[]) r2
            java.lang.String r9 = "audio/mp4a-latm"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x0509
            android.util.Pair r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4968c.m15056a((byte[]) r2)
            java.lang.Object r9 = r1.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r11 = r9.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L_0x0509:
            r9 = r2
            r2 = r3
        L_0x050b:
            int r8 = r8 + r0
            r7 = r25
            r3 = r42
            r10 = r43
            r15 = r44
            goto L_0x03a6
        L_0x0516:
            r42 = r3
            r43 = r10
            r44 = r15
            r7 = -1
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r14.f12191b
            if (r0 != 0) goto L_0x0555
            if (r2 == 0) goto L_0x0555
            boolean r0 = r12.equals(r2)
            if (r0 == 0) goto L_0x052c
            r32 = 2
            goto L_0x052e
        L_0x052c:
            r32 = r7
        L_0x052e:
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = 0
            r28 = -1
            r29 = -1
            if (r9 != 0) goto L_0x053d
            r33 = 0
            goto L_0x0543
        L_0x053d:
            java.util.List r0 = java.util.Collections.singletonList(r9)
            r33 = r0
        L_0x0543:
            r35 = 0
            r26 = r2
            r30 = r1
            r31 = r11
            r34 = r49
            r36 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14722a((java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28, (int) r29, (int) r30, (int) r31, (int) r32, (java.util.List<byte[]>) r33, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r34, (int) r35, (java.lang.String) r36)
            r14.f12191b = r0
        L_0x0555:
            r9 = r43
            r8 = r44
            goto L_0x030b
        L_0x055b:
            r41 = r1
            r42 = r3
            r25 = r7
            r47 = r8
            r43 = r10
            r40 = r12
            r44 = r15
            r7 = -1
            int r0 = r5 + 8
            r1 = 8
            int r0 = r0 + r1
            r4.mo25525e(r0)
            r0 = 16
            r4.mo25527f(r0)
            int r30 = r4.mo25538q()
            int r31 = r4.mo25538q()
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 50
            r4.mo25527f(r3)
            int r3 = r4.f13244b
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12126a0
            r9 = r43
            if (r2 != r8) goto L_0x0598
            r8 = r44
            int r2 = m14451a((com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k) r4, (int) r5, (int) r9, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4729b.C4731b) r14, (int) r8)
            r4.mo25525e(r3)
            goto L_0x059a
        L_0x0598:
            r8 = r44
        L_0x059a:
            r35 = r1
            r37 = r7
            r1 = 0
            r26 = 0
            r33 = 0
            r36 = 0
        L_0x05a5:
            int r10 = r3 - r5
            if (r10 >= r9) goto L_0x06d3
            r4.mo25525e(r3)
            int r10 = r4.f13244b
            int r11 = r4.mo25520c()
            if (r11 != 0) goto L_0x05bb
            int r12 = r4.f13244b
            int r12 = r12 - r5
            if (r12 != r9) goto L_0x05bb
            goto L_0x06d3
        L_0x05bb:
            r15 = r25
            if (r11 <= 0) goto L_0x05c1
            r12 = 1
            goto L_0x05c2
        L_0x05c1:
            r12 = 0
        L_0x05c2:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15050a(r12, r15)
            int r12 = r4.mo25520c()
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12101I
            if (r12 != r0) goto L_0x05ed
            if (r26 != 0) goto L_0x05d1
            r0 = 1
            goto L_0x05d2
        L_0x05d1:
            r0 = 0
        L_0x05d2:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r0)
            int r10 = r10 + 8
            r4.mo25525e(r10)
            com.fyber.inneractive.sdk.player.exoplayer2.video.a r0 = com.fyber.inneractive.sdk.player.exoplayer2.video.C5002a.m15175b(r4)
            java.util.List<byte[]> r10 = r0.f13331a
            int r12 = r0.f13332b
            r14.f12192c = r12
            if (r1 != 0) goto L_0x05ea
            float r0 = r0.f13335e
            r35 = r0
        L_0x05ea:
            java.lang.String r26 = "video/avc"
            goto L_0x060a
        L_0x05ed:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12103J
            if (r12 != r0) goto L_0x0611
            if (r26 != 0) goto L_0x05f5
            r0 = 1
            goto L_0x05f6
        L_0x05f5:
            r0 = 0
        L_0x05f6:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r0)
            int r10 = r10 + 8
            r4.mo25525e(r10)
            com.fyber.inneractive.sdk.player.exoplayer2.video.c r0 = com.fyber.inneractive.sdk.player.exoplayer2.video.C5005c.m15176a(r4)
            java.util.List<byte[]> r10 = r0.f13341a
            int r0 = r0.f13342b
            r14.f12192c = r0
            java.lang.String r26 = "video/hevc"
        L_0x060a:
            r23 = r1
            r33 = r10
        L_0x060e:
            r1 = 3
            goto L_0x06c9
        L_0x0611:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12110M0
            if (r12 != r0) goto L_0x0627
            if (r26 != 0) goto L_0x0619
            r0 = 1
            goto L_0x061a
        L_0x0619:
            r0 = 0
        L_0x061a:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r0)
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12106K0
            if (r2 != r0) goto L_0x0624
            java.lang.String r26 = "video/x-vnd.on2.vp8"
            goto L_0x0635
        L_0x0624:
            java.lang.String r26 = "video/x-vnd.on2.vp9"
            goto L_0x0635
        L_0x0627:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12139h
            if (r12 != r0) goto L_0x0638
            if (r26 != 0) goto L_0x062f
            r0 = 1
            goto L_0x0630
        L_0x062f:
            r0 = 0
        L_0x0630:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r0)
            java.lang.String r26 = "video/3gpp"
        L_0x0635:
            r23 = r1
            goto L_0x060e
        L_0x0638:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12105K
            if (r12 != r0) goto L_0x0655
            if (r26 != 0) goto L_0x0640
            r0 = 1
            goto L_0x0641
        L_0x0640:
            r0 = 0
        L_0x0641:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r0)
            android.util.Pair r0 = m14452a(r4, r10)
            java.lang.Object r10 = r0.first
            r26 = r10
            java.lang.String r26 = (java.lang.String) r26
            java.lang.Object r0 = r0.second
            java.util.List r33 = java.util.Collections.singletonList(r0)
            goto L_0x0635
        L_0x0655:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12144j0
            if (r12 != r0) goto L_0x066e
            int r10 = r10 + 8
            r4.mo25525e(r10)
            int r0 = r4.mo25536o()
            int r1 = r4.mo25536o()
            float r0 = (float) r0
            float r1 = (float) r1
            float r35 = r0 / r1
            r1 = 3
            r23 = 1
            goto L_0x06c9
        L_0x066e:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12102I0
            if (r12 != r0) goto L_0x069f
            int r0 = r10 + 8
        L_0x0674:
            int r12 = r0 - r10
            if (r12 >= r11) goto L_0x0699
            r4.mo25525e(r0)
            int r12 = r4.mo25520c()
            int r7 = r4.mo25520c()
            r23 = r1
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12104J0
            if (r7 != r1) goto L_0x0694
            byte[] r1 = r4.f13243a
            int r12 = r12 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r0, r12)
            r36 = r0
            goto L_0x060e
        L_0x0694:
            int r0 = r0 + r12
            r1 = r23
            r7 = -1
            goto L_0x0674
        L_0x0699:
            r23 = r1
            r1 = 3
            r36 = 0
            goto L_0x06c9
        L_0x069f:
            r23 = r1
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12100H0
            if (r12 != r0) goto L_0x060e
            int r0 = r4.mo25533l()
            r1 = 3
            r4.mo25527f(r1)
            if (r0 != 0) goto L_0x06c9
            int r0 = r4.mo25533l()
            if (r0 == 0) goto L_0x06c7
            r7 = 1
            if (r0 == r7) goto L_0x06c4
            r7 = 2
            if (r0 == r7) goto L_0x06c1
            if (r0 == r1) goto L_0x06be
            goto L_0x06c9
        L_0x06be:
            r37 = r1
            goto L_0x06c9
        L_0x06c1:
            r37 = 2
            goto L_0x06c9
        L_0x06c4:
            r37 = 1
            goto L_0x06c9
        L_0x06c7:
            r37 = 0
        L_0x06c9:
            int r3 = r3 + r11
            r25 = r15
            r1 = r23
            r0 = 16
            r7 = -1
            goto L_0x05a5
        L_0x06d3:
            r1 = 3
            if (r26 != 0) goto L_0x06d7
            goto L_0x06ef
        L_0x06d7:
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = 0
            r28 = -1
            r29 = -1
            r32 = -1082130432(0xffffffffbf800000, float:-1.0)
            r38 = 0
            r34 = r42
            r39 = r49
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14720a((java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28, (int) r29, (int) r30, (int) r31, (float) r32, (java.util.List<byte[]>) r33, (int) r34, (float) r35, (byte[]) r36, (int) r37, (com.fyber.inneractive.sdk.player.exoplayer2.video.C5003b) r38, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r39)
            r14.f12191b = r0
        L_0x06ef:
            int r5 = r5 + r9
            r4.mo25525e(r5)
            int r15 = r8 + 1
            r0 = r45
            r11 = r46
            r8 = r47
            r12 = r40
            r1 = r41
            r3 = r42
            r2 = 0
            r7 = -1
            r10 = 8
            goto L_0x0198
        L_0x0707:
            r41 = r1
            r47 = r8
            r40 = r12
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12116Q
            r1 = r45
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = r1.mo25186c(r0)
            if (r0 == 0) goto L_0x0788
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12117R
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r0.mo25187d(r1)
            if (r0 != 0) goto L_0x0720
            goto L_0x0788
        L_0x0720:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12181P0
            r1 = 8
            r0.mo25525e(r1)
            int r1 = r0.mo25520c()
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r1)
            int r2 = r0.mo25536o()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r5 = 0
        L_0x0738:
            if (r5 >= r2) goto L_0x0781
            r6 = 1
            if (r1 != r6) goto L_0x0742
            long r7 = r0.mo25537p()
            goto L_0x0746
        L_0x0742:
            long r7 = r0.mo25534m()
        L_0x0746:
            r3[r5] = r7
            if (r1 != r6) goto L_0x074f
            long r6 = r0.mo25530i()
            goto L_0x0754
        L_0x074f:
            int r6 = r0.mo25520c()
            long r6 = (long) r6
        L_0x0754:
            r4[r5] = r6
            byte[] r6 = r0.f13243a
            int r7 = r0.f13244b
            int r8 = r7 + 1
            r0.f13244b = r8
            byte r7 = r6[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r9 = 8
            int r7 = r7 << r9
            int r10 = r8 + 1
            r0.f13244b = r10
            byte r6 = r6[r8]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            short r6 = (short) r6
            r7 = 1
            if (r6 != r7) goto L_0x0779
            r6 = 2
            r0.mo25527f(r6)
            int r5 = r5 + 1
            goto L_0x0738
        L_0x0779:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0781:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = r0
            r0 = 0
            goto L_0x078d
        L_0x0788:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x078d:
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = r14.f12191b
            if (r2 != 0) goto L_0x0793
            r2 = r0
            goto L_0x07c7
        L_0x0793:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h
            r0 = r41
            java.lang.Object r0 = r0.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r14.f12191b
            int r5 = r14.f12193d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r6 = r14.f12190a
            int r7 = r14.f12192c
            java.lang.Object r8 = r1.first
            r23 = r8
            long[] r23 = (long[]) r23
            java.lang.Object r1 = r1.second
            r24 = r1
            long[] r24 = (long[]) r24
            r10 = r2
            r11 = r13
            r12 = r40
            r13 = r3
            r15 = r47
            r17 = r21
            r19 = r0
            r20 = r5
            r21 = r6
            r22 = r7
            r10.<init>(r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24)
        L_0x07c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4729b.m14453a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b, long, com.fyber.inneractive.sdk.player.exoplayer2.drm.a, boolean):com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h");
    }

    /* renamed from: a */
    public static int m14451a(C4978k kVar, int i, int i2, C4731b bVar, int i3) {
        C4978k kVar2 = kVar;
        int i4 = kVar2.f13244b;
        while (true) {
            boolean z = false;
            if (i4 - i >= i2) {
                return 0;
            }
            kVar2.mo25525e(i4);
            int c = kVar.mo25520c();
            boolean z2 = true;
            C4965a.m15050a(c > 0, "childAtomSize should be positive");
            if (kVar.mo25520c() == C4726a.f12122W) {
                int i5 = i4 + 8;
                Pair pair = null;
                boolean z3 = false;
                Integer num = null;
                C4743i iVar = null;
                while (i5 - i4 < c) {
                    kVar2.mo25525e(i5);
                    int c2 = kVar.mo25520c();
                    int c3 = kVar.mo25520c();
                    if (c3 == C4726a.f12130c0) {
                        num = Integer.valueOf(kVar.mo25520c());
                    } else if (c3 == C4726a.f12123X) {
                        kVar2.mo25527f(4);
                        z3 = kVar.mo25520c() == f12188g ? z2 : false;
                    } else if (c3 == C4726a.f12124Y) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= c2) {
                                iVar = null;
                                break;
                            }
                            kVar2.mo25525e(i6);
                            int c4 = kVar.mo25520c();
                            if (kVar.mo25520c() == C4726a.f12125Z) {
                                kVar2.mo25527f(6);
                                boolean z4 = kVar.mo25533l() == z2 ? z2 : false;
                                int l = kVar.mo25533l();
                                byte[] bArr = new byte[16];
                                System.arraycopy(kVar2.f13243a, kVar2.f13244b, bArr, 0, 16);
                                kVar2.f13244b += 16;
                                iVar = new C4743i(z4, l, bArr);
                            } else {
                                i6 += c4;
                                z2 = true;
                            }
                        }
                    }
                    i5 += c2;
                    z2 = true;
                }
                if (z3) {
                    C4965a.m15050a(num != null, "frma atom is mandatory");
                    if (iVar != null) {
                        z = true;
                    }
                    C4965a.m15050a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, iVar);
                }
                if (pair != null) {
                    bVar.f12190a[i3] = (C4743i) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            C4731b bVar2 = bVar;
            i4 += c;
        }
    }

    /* renamed from: a */
    public static Pair<String, byte[]> m14452a(C4978k kVar, int i) {
        kVar.mo25525e(i + 8 + 4);
        kVar.mo25527f(1);
        m14450a(kVar);
        kVar.mo25527f(2);
        int l = kVar.mo25533l();
        if ((l & 128) != 0) {
            kVar.mo25527f(2);
        }
        if ((l & 64) != 0) {
            kVar.mo25527f(kVar.mo25538q());
        }
        if ((l & 32) != 0) {
            kVar.mo25527f(2);
        }
        kVar.mo25527f(1);
        m14450a(kVar);
        int l2 = kVar.mo25533l();
        String str = null;
        if (l2 == 32) {
            str = "video/mp4v-es";
        } else if (l2 == 33) {
            str = "video/avc";
        } else if (l2 != 35) {
            if (l2 != 64) {
                if (l2 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (l2 == 165) {
                    str = "audio/ac3";
                } else if (l2 != 166) {
                    switch (l2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (l2) {
                                case 169:
                                case TsExtractor.TS_STREAM_TYPE_AC4 /*172*/:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        kVar.mo25527f(12);
        kVar.mo25527f(1);
        int a = m14450a(kVar);
        byte[] bArr = new byte[a];
        System.arraycopy(kVar.f13243a, kVar.f13244b, bArr, 0, a);
        kVar.f13244b += a;
        return Pair.create(str, bArr);
    }

    /* renamed from: a */
    public static int m14450a(C4978k kVar) {
        int l = kVar.mo25533l();
        int i = l & 127;
        while ((l & 128) == 128) {
            l = kVar.mo25533l();
            i = (i << 7) | (l & 127);
        }
        return i;
    }
}
