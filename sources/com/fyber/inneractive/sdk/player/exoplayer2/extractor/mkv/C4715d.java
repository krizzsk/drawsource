package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4704i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4971f;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d */
public final class C4715d implements C4665f {

    /* renamed from: Z */
    public static final byte[] f11955Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0 */
    public static final byte[] f11956a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: b0 */
    public static final UUID f11957b0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    public long f11958A = -9223372036854775807L;

    /* renamed from: B */
    public C4971f f11959B;

    /* renamed from: C */
    public C4971f f11960C;

    /* renamed from: D */
    public boolean f11961D;

    /* renamed from: E */
    public int f11962E;

    /* renamed from: F */
    public long f11963F;

    /* renamed from: G */
    public long f11964G;

    /* renamed from: H */
    public int f11965H;

    /* renamed from: I */
    public int f11966I;

    /* renamed from: J */
    public int[] f11967J;

    /* renamed from: K */
    public int f11968K;

    /* renamed from: L */
    public int f11969L;

    /* renamed from: M */
    public int f11970M;

    /* renamed from: N */
    public int f11971N;

    /* renamed from: O */
    public boolean f11972O;

    /* renamed from: P */
    public boolean f11973P;

    /* renamed from: Q */
    public boolean f11974Q;

    /* renamed from: R */
    public boolean f11975R;

    /* renamed from: S */
    public byte f11976S;

    /* renamed from: T */
    public int f11977T;

    /* renamed from: U */
    public int f11978U;

    /* renamed from: V */
    public int f11979V;

    /* renamed from: W */
    public boolean f11980W;

    /* renamed from: X */
    public boolean f11981X;

    /* renamed from: Y */
    public C4673h f11982Y;

    /* renamed from: a */
    public final C4713b f11983a;

    /* renamed from: b */
    public final C4720f f11984b;

    /* renamed from: c */
    public final SparseArray<C4718c> f11985c;

    /* renamed from: d */
    public final boolean f11986d;

    /* renamed from: e */
    public final C4978k f11987e;

    /* renamed from: f */
    public final C4978k f11988f;

    /* renamed from: g */
    public final C4978k f11989g;

    /* renamed from: h */
    public final C4978k f11990h;

    /* renamed from: i */
    public final C4978k f11991i;

    /* renamed from: j */
    public final C4978k f11992j;

    /* renamed from: k */
    public final C4978k f11993k;

    /* renamed from: l */
    public final C4978k f11994l;

    /* renamed from: m */
    public final C4978k f11995m;

    /* renamed from: n */
    public ByteBuffer f11996n;

    /* renamed from: o */
    public long f11997o;

    /* renamed from: p */
    public long f11998p = -1;

    /* renamed from: q */
    public long f11999q = -9223372036854775807L;

    /* renamed from: r */
    public long f12000r = -9223372036854775807L;

    /* renamed from: s */
    public long f12001s = -9223372036854775807L;

    /* renamed from: t */
    public C4718c f12002t;

    /* renamed from: u */
    public boolean f12003u;

    /* renamed from: v */
    public int f12004v;

    /* renamed from: w */
    public long f12005w;

    /* renamed from: x */
    public boolean f12006x;

    /* renamed from: y */
    public long f12007y = -1;

    /* renamed from: z */
    public long f12008z = -1;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$a */
    public class C4716a implements C4704i {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b */
    public final class C4717b implements C4714c {
        public C4717b() {
        }

        /* renamed from: a */
        public boolean mo25179a(int i) {
            C4715d.this.getClass();
            return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
        }

        public /* synthetic */ C4717b(C4715d dVar, C4716a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo25177a(int i, long j, long j2) throws C4815l {
            C4715d dVar = C4715d.this;
            dVar.getClass();
            if (i == 160) {
                dVar.f11981X = false;
            } else if (i == 174) {
                dVar.f12002t = new C4718c();
            } else if (i == 187) {
                dVar.f11961D = false;
            } else if (i == 19899) {
                dVar.f12004v = -1;
                dVar.f12005w = -1;
            } else if (i == 20533) {
                dVar.f12002t.f12030e = true;
            } else if (i == 21968) {
                dVar.f12002t.f12042q = true;
            } else if (i == 408125543) {
                long j3 = dVar.f11998p;
                if (j3 == -1 || j3 == j) {
                    dVar.f11998p = j;
                    dVar.f11997o = j2;
                    return;
                }
                throw new C4815l("Multiple Segment elements not supported");
            } else if (i == 475249515) {
                dVar.f11959B = new C4971f(32);
                dVar.f11960C = new C4971f(32);
            } else if (i != 524531317 || dVar.f12003u) {
            } else {
                if (!dVar.f11986d || dVar.f12007y == -1) {
                    dVar.f11982Y.mo25099a(new C4709m.C4710a(dVar.f12001s));
                    dVar.f12003u = true;
                    return;
                }
                dVar.f12006x = true;
            }
        }

        /* renamed from: a */
        public void mo25176a(int i, long j) throws C4815l {
            C4715d dVar = C4715d.this;
            dVar.getClass();
            if (i != 20529) {
                if (i != 20530) {
                    boolean z = false;
                    switch (i) {
                        case 131:
                            dVar.f12002t.f12028c = (int) j;
                            return;
                        case 136:
                            C4718c cVar = dVar.f12002t;
                            if (j == 1) {
                                z = true;
                            }
                            cVar.f12021L = z;
                            return;
                        case 155:
                            dVar.f11964G = dVar.mo25169a(j);
                            return;
                        case 159:
                            dVar.f12002t.f12016G = (int) j;
                            return;
                        case 176:
                            dVar.f12002t.f12035j = (int) j;
                            return;
                        case 179:
                            dVar.f11959B.mo25507a(dVar.mo25169a(j));
                            return;
                        case 186:
                            dVar.f12002t.f12036k = (int) j;
                            return;
                        case 215:
                            dVar.f12002t.f12027b = (int) j;
                            return;
                        case 231:
                            dVar.f11958A = dVar.mo25169a(j);
                            return;
                        case 241:
                            if (!dVar.f11961D) {
                                dVar.f11960C.mo25507a(j);
                                dVar.f11961D = true;
                                return;
                            }
                            return;
                        case 251:
                            dVar.f11981X = true;
                            return;
                        case 16980:
                            if (j != 3) {
                                throw new C4815l("ContentCompAlgo " + j + " not supported");
                            }
                            return;
                        case 17029:
                            if (j < 1 || j > 2) {
                                throw new C4815l("DocTypeReadVersion " + j + " not supported");
                            }
                            return;
                        case 17143:
                            if (j != 1) {
                                throw new C4815l("EBMLReadVersion " + j + " not supported");
                            }
                            return;
                        case 18401:
                            if (j != 5) {
                                throw new C4815l("ContentEncAlgo " + j + " not supported");
                            }
                            return;
                        case 18408:
                            if (j != 1) {
                                throw new C4815l("AESSettingsCipherMode " + j + " not supported");
                            }
                            return;
                        case 21420:
                            dVar.f12005w = j + dVar.f11998p;
                            return;
                        case 21432:
                            int i2 = (int) j;
                            if (i2 == 0) {
                                dVar.f12002t.f12041p = 0;
                                return;
                            } else if (i2 == 1) {
                                dVar.f12002t.f12041p = 2;
                                return;
                            } else if (i2 == 3) {
                                dVar.f12002t.f12041p = 1;
                                return;
                            } else if (i2 == 15) {
                                dVar.f12002t.f12041p = 3;
                                return;
                            } else {
                                return;
                            }
                        case 21680:
                            dVar.f12002t.f12037l = (int) j;
                            return;
                        case 21682:
                            dVar.f12002t.f12039n = (int) j;
                            return;
                        case 21690:
                            dVar.f12002t.f12038m = (int) j;
                            return;
                        case 21930:
                            C4718c cVar2 = dVar.f12002t;
                            if (j == 1) {
                                z = true;
                            }
                            cVar2.f12022M = z;
                            return;
                        case 22186:
                            dVar.f12002t.f12019J = j;
                            return;
                        case 22203:
                            dVar.f12002t.f12020K = j;
                            return;
                        case 25188:
                            dVar.f12002t.f12017H = (int) j;
                            return;
                        case 2352003:
                            dVar.f12002t.f12029d = (int) j;
                            return;
                        case 2807729:
                            dVar.f11999q = j;
                            return;
                        default:
                            switch (i) {
                                case 21945:
                                    int i3 = (int) j;
                                    if (i3 == 1) {
                                        dVar.f12002t.f12045t = 2;
                                        return;
                                    } else if (i3 == 2) {
                                        dVar.f12002t.f12045t = 1;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21946:
                                    int i4 = (int) j;
                                    if (i4 != 1) {
                                        if (i4 == 16) {
                                            dVar.f12002t.f12044s = 6;
                                            return;
                                        } else if (i4 == 18) {
                                            dVar.f12002t.f12044s = 7;
                                            return;
                                        } else if (!(i4 == 6 || i4 == 7)) {
                                            return;
                                        }
                                    }
                                    dVar.f12002t.f12044s = 3;
                                    return;
                                case 21947:
                                    C4718c cVar3 = dVar.f12002t;
                                    cVar3.f12042q = true;
                                    int i5 = (int) j;
                                    if (i5 == 1) {
                                        cVar3.f12043r = 1;
                                        return;
                                    } else if (i5 == 9) {
                                        cVar3.f12043r = 6;
                                        return;
                                    } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                        cVar3.f12043r = 2;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21948:
                                    dVar.f12002t.f12046u = (int) j;
                                    return;
                                case 21949:
                                    dVar.f12002t.f12047v = (int) j;
                                    return;
                                default:
                                    return;
                            }
                    }
                } else if (j != 1) {
                    throw new C4815l("ContentEncodingScope " + j + " not supported");
                }
            } else if (j != 0) {
                throw new C4815l("ContentEncodingOrder " + j + " not supported");
            }
        }

        /* renamed from: a */
        public void mo25174a(int i, double d) throws C4815l {
            C4715d dVar = C4715d.this;
            dVar.getClass();
            if (i == 181) {
                dVar.f12002t.f12018I = (int) d;
            } else if (i != 17545) {
                switch (i) {
                    case 21969:
                        dVar.f12002t.f12048w = (float) d;
                        return;
                    case 21970:
                        dVar.f12002t.f12049x = (float) d;
                        return;
                    case 21971:
                        dVar.f12002t.f12050y = (float) d;
                        return;
                    case 21972:
                        dVar.f12002t.f12051z = (float) d;
                        return;
                    case 21973:
                        dVar.f12002t.f12010A = (float) d;
                        return;
                    case 21974:
                        dVar.f12002t.f12011B = (float) d;
                        return;
                    case 21975:
                        dVar.f12002t.f12012C = (float) d;
                        return;
                    case 21976:
                        dVar.f12002t.f12013D = (float) d;
                        return;
                    case 21977:
                        dVar.f12002t.f12014E = (float) d;
                        return;
                    case 21978:
                        dVar.f12002t.f12015F = (float) d;
                        return;
                    default:
                        return;
                }
            } else {
                dVar.f12000r = (long) d;
            }
        }

        /* renamed from: a */
        public void mo25178a(int i, String str) throws C4815l {
            C4715d dVar = C4715d.this;
            dVar.getClass();
            if (i == 134) {
                dVar.f12002t.f12026a = str;
            } else if (i != 17026) {
                if (i == 2274716) {
                    dVar.f12002t.f12023N = str;
                }
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw new C4815l("DocType " + str + " not supported");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fb, code lost:
            throw new com.fyber.inneractive.sdk.player.exoplayer2.C4815l("EBML lacing sample size out of range.");
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo25175a(int r24, int r25, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g r26) throws java.io.IOException, java.lang.InterruptedException {
            /*
                r23 = this;
                r0 = r24
                r1 = r25
                r2 = r23
                r3 = r26
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.this
                r4.getClass()
                r5 = 161(0xa1, float:2.26E-43)
                r6 = 163(0xa3, float:2.28E-43)
                r7 = 0
                if (r0 == r5) goto L_0x009b
                if (r0 == r6) goto L_0x009b
                r5 = 16981(0x4255, float:2.3795E-41)
                if (r0 == r5) goto L_0x008d
                r5 = 18402(0x47e2, float:2.5787E-41)
                if (r0 == r5) goto L_0x007f
                r5 = 21419(0x53ab, float:3.0014E-41)
                if (r0 == r5) goto L_0x005d
                r5 = 25506(0x63a2, float:3.5742E-41)
                if (r0 == r5) goto L_0x004f
                r5 = 30322(0x7672, float:4.249E-41)
                if (r0 != r5) goto L_0x0038
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r0 = r4.f12002t
                byte[] r4 = new byte[r1]
                r0.f12040o = r4
                r0 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r0
                r0.mo25063b(r4, r7, r1, r7)
                goto L_0x02aa
            L_0x0038:
                com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unexpected id: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.<init>((java.lang.String) r0)
                throw r1
            L_0x004f:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r0 = r4.f12002t
                byte[] r4 = new byte[r1]
                r0.f12033h = r4
                r0 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r0
                r0.mo25063b(r4, r7, r1, r7)
                goto L_0x02aa
            L_0x005d:
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r4.f11991i
                byte[] r0 = r0.f13243a
                java.util.Arrays.fill(r0, r7)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r4.f11991i
                byte[] r0 = r0.f13243a
                int r5 = 4 - r1
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r3
                r3.mo25063b(r0, r5, r1, r7)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r4.f11991i
                r0.mo25525e(r7)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r4.f11991i
                long r0 = r0.mo25534m()
                int r0 = (int) r0
                r4.f12004v = r0
                goto L_0x02aa
            L_0x007f:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r0 = r4.f12002t
                byte[] r4 = new byte[r1]
                r0.f12032g = r4
                r0 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r0
                r0.mo25063b(r4, r7, r1, r7)
                goto L_0x02aa
            L_0x008d:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r0 = r4.f12002t
                byte[] r4 = new byte[r1]
                r0.f12031f = r4
                r0 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r0
                r0.mo25063b(r4, r7, r1, r7)
                goto L_0x02aa
            L_0x009b:
                int r5 = r4.f11962E
                r8 = 8
                r9 = 1
                if (r5 != 0) goto L_0x00bf
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f r5 = r4.f11984b
                long r10 = r5.mo25181a(r3, r7, r9, r8)
                int r5 = (int) r10
                r4.f11968K = r5
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f r5 = r4.f11984b
                int r5 = r5.f12057c
                r4.f11969L = r5
                r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r4.f11964G = r10
                r4.f11962E = r9
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r4.f11989g
                r5.mo25539r()
            L_0x00bf:
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c> r5 = r4.f11985c
                int r10 = r4.f11968K
                java.lang.Object r5 = r5.get(r10)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4718c) r5
                if (r5 != 0) goto L_0x00d9
                int r0 = r4.f11969L
                int r0 = r1 - r0
                r1 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r1
                r1.mo25064c(r0)
                r4.f11962E = r7
                goto L_0x02aa
            L_0x00d9:
                int r10 = r4.f11962E
                if (r10 != r9) goto L_0x0279
                r10 = 3
                r4.mo25171a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r3, (int) r10)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r4.f11989g
                byte[] r11 = r11.f13243a
                r12 = 2
                byte r11 = r11[r12]
                r11 = r11 & 6
                int r11 = r11 >> r9
                r13 = 255(0xff, float:3.57E-43)
                if (r11 != 0) goto L_0x0101
                r4.f11966I = r9
                int[] r11 = r4.f11967J
                int[] r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.m14403a((int[]) r11, (int) r9)
                r4.f11967J = r11
                int r14 = r4.f11969L
                int r1 = r1 - r14
                int r1 = r1 - r10
                r11[r7] = r1
                goto L_0x020d
            L_0x0101:
                if (r0 != r6) goto L_0x0271
                r14 = 4
                r4.mo25171a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r3, (int) r14)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r4.f11989g
                byte[] r15 = r15.f13243a
                byte r15 = r15[r10]
                r15 = r15 & r13
                int r15 = r15 + r9
                r4.f11966I = r15
                int[] r6 = r4.f11967J
                int[] r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.m14403a((int[]) r6, (int) r15)
                r4.f11967J = r6
                if (r11 != r12) goto L_0x0127
                int r10 = r4.f11969L
                int r1 = r1 - r10
                int r1 = r1 - r14
                int r10 = r4.f11966I
                int r1 = r1 / r10
                java.util.Arrays.fill(r6, r7, r10, r1)
                goto L_0x020d
            L_0x0127:
                if (r11 != r9) goto L_0x015c
                r6 = r7
                r10 = r6
            L_0x012b:
                int r11 = r4.f11966I
                int r11 = r11 - r9
                if (r6 >= r11) goto L_0x0151
                int[] r11 = r4.f11967J
                r11[r6] = r7
            L_0x0134:
                int r14 = r14 + r9
                r4.mo25171a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r3, (int) r14)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r4.f11989g
                byte[] r11 = r11.f13243a
                int r15 = r14 + -1
                byte r11 = r11[r15]
                r11 = r11 & r13
                int[] r15 = r4.f11967J
                r16 = r15[r6]
                int r16 = r16 + r11
                r15[r6] = r16
                if (r11 == r13) goto L_0x0134
                r11 = r15[r6]
                int r10 = r10 + r11
                int r6 = r6 + 1
                goto L_0x012b
            L_0x0151:
                int[] r6 = r4.f11967J
                int r15 = r4.f11969L
                int r1 = r1 - r15
                int r1 = r1 - r14
                int r1 = r1 - r10
                r6[r11] = r1
                goto L_0x020d
            L_0x015c:
                if (r11 != r10) goto L_0x025a
                r6 = r7
                r10 = r6
            L_0x0160:
                int r11 = r4.f11966I
                int r11 = r11 - r9
                if (r6 >= r11) goto L_0x0204
                int[] r11 = r4.f11967J
                r11[r6] = r7
                int r14 = r14 + 1
                r4.mo25171a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r3, (int) r14)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r4.f11989g
                byte[] r11 = r11.f13243a
                int r15 = r14 + -1
                byte r11 = r11[r15]
                if (r11 == 0) goto L_0x01fc
                r16 = 0
                r11 = r7
            L_0x017b:
                if (r11 >= r8) goto L_0x01cb
                int r18 = 7 - r11
                int r12 = r9 << r18
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r9 = r4.f11989g
                byte[] r9 = r9.f13243a
                byte r9 = r9[r15]
                r9 = r9 & r12
                if (r9 == 0) goto L_0x01c3
                int r14 = r14 + r11
                r4.mo25171a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r3, (int) r14)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r9 = r4.f11989g
                byte[] r9 = r9.f13243a
                int r16 = r15 + 1
                byte r9 = r9[r15]
                r9 = r9 & r13
                int r12 = ~r12
                r9 = r9 & r12
                long r7 = (long) r9
                r21 = r7
                r7 = r16
                r16 = r21
            L_0x01a0:
                if (r7 >= r14) goto L_0x01b4
                r8 = 8
                long r16 = r16 << r8
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r4.f11989g
                byte[] r8 = r8.f13243a
                int r9 = r7 + 1
                byte r7 = r8[r7]
                r7 = r7 & r13
                long r7 = (long) r7
                long r16 = r16 | r7
                r7 = r9
                goto L_0x01a0
            L_0x01b4:
                if (r6 <= 0) goto L_0x01cb
                int r11 = r11 * 7
                int r11 = r11 + 6
                r7 = 1
                long r19 = r7 << r11
                long r19 = r19 - r7
                long r16 = r16 - r19
                goto L_0x01cb
            L_0x01c3:
                int r11 = r11 + 1
                r7 = 0
                r8 = 8
                r9 = 1
                r12 = 2
                goto L_0x017b
            L_0x01cb:
                r7 = r16
                r16 = -2147483648(0xffffffff80000000, double:NaN)
                int r9 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r9 < 0) goto L_0x01f4
                r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r9 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r9 > 0) goto L_0x01f4
                int r7 = (int) r7
                int[] r8 = r4.f11967J
                if (r6 != 0) goto L_0x01e1
                goto L_0x01e6
            L_0x01e1:
                int r9 = r6 + -1
                r9 = r8[r9]
                int r7 = r7 + r9
            L_0x01e6:
                r8[r6] = r7
                r7 = r8[r6]
                int r10 = r10 + r7
                int r6 = r6 + 1
                r7 = 0
                r8 = 8
                r9 = 1
                r12 = 2
                goto L_0x0160
            L_0x01f4:
                com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
                java.lang.String r1 = "EBML lacing sample size out of range."
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x01fc:
                com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
                java.lang.String r1 = "No valid varint length mask found"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0204:
                int[] r6 = r4.f11967J
                int r7 = r4.f11969L
                int r1 = r1 - r7
                int r1 = r1 - r14
                int r1 = r1 - r10
                r6[r11] = r1
            L_0x020d:
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r4.f11989g
                byte[] r1 = r1.f13243a
                r6 = 0
                byte r7 = r1[r6]
                r6 = 8
                int r7 = r7 << r6
                r6 = 1
                byte r1 = r1[r6]
                r1 = r1 & r13
                r1 = r1 | r7
                long r6 = r4.f11958A
                long r8 = (long) r1
                long r8 = r4.mo25169a((long) r8)
                long r6 = r6 + r8
                r4.f11963F = r6
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r4.f11989g
                byte[] r1 = r1.f13243a
                r6 = 2
                byte r7 = r1[r6]
                r8 = 8
                r7 = r7 & r8
                if (r7 != r8) goto L_0x0234
                r7 = 1
                goto L_0x0235
            L_0x0234:
                r7 = 0
            L_0x0235:
                int r8 = r5.f12028c
                if (r8 == r6) goto L_0x0247
                r8 = 163(0xa3, float:2.28E-43)
                if (r0 != r8) goto L_0x0245
                byte r1 = r1[r6]
                r6 = 128(0x80, float:1.794E-43)
                r1 = r1 & r6
                if (r1 != r6) goto L_0x0245
                goto L_0x0247
            L_0x0245:
                r1 = 0
                goto L_0x0248
            L_0x0247:
                r1 = 1
            L_0x0248:
                if (r7 == 0) goto L_0x024d
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x024e
            L_0x024d:
                r6 = 0
            L_0x024e:
                r1 = r1 | r6
                r4.f11970M = r1
                r1 = 2
                r4.f11962E = r1
                r1 = 0
                r4.f11965H = r1
                r1 = 163(0xa3, float:2.28E-43)
                goto L_0x027a
            L_0x025a:
                com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unexpected lacing value: "
                r1.append(r3)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0271:
                com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
                java.lang.String r1 = "Lacing only supported in SimpleBlocks."
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0279:
                r1 = r6
            L_0x027a:
                if (r0 != r1) goto L_0x02a2
            L_0x027c:
                int r0 = r4.f11965H
                int r1 = r4.f11966I
                if (r0 >= r1) goto L_0x029e
                int[] r1 = r4.f11967J
                r0 = r1[r0]
                r4.mo25172a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r3, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4718c) r5, (int) r0)
                long r0 = r4.f11963F
                int r6 = r4.f11965H
                int r7 = r5.f12029d
                int r6 = r6 * r7
                int r6 = r6 / 1000
                long r6 = (long) r6
                long r0 = r0 + r6
                r4.mo25173a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4718c) r5, (long) r0)
                int r0 = r4.f11965H
                r1 = 1
                int r0 = r0 + r1
                r4.f11965H = r0
                goto L_0x027c
            L_0x029e:
                r0 = 0
                r4.f11962E = r0
                goto L_0x02aa
            L_0x02a2:
                r0 = 0
                int[] r1 = r4.f11967J
                r0 = r1[r0]
                r4.mo25172a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r3, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4718c) r5, (int) r0)
            L_0x02aa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4717b.mo25175a(int, int, com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c */
    public static final class C4718c {

        /* renamed from: A */
        public float f12010A = -1.0f;

        /* renamed from: B */
        public float f12011B = -1.0f;

        /* renamed from: C */
        public float f12012C = -1.0f;

        /* renamed from: D */
        public float f12013D = -1.0f;

        /* renamed from: E */
        public float f12014E = -1.0f;

        /* renamed from: F */
        public float f12015F = -1.0f;

        /* renamed from: G */
        public int f12016G = 1;

        /* renamed from: H */
        public int f12017H = -1;

        /* renamed from: I */
        public int f12018I = 8000;

        /* renamed from: J */
        public long f12019J = 0;

        /* renamed from: K */
        public long f12020K = 0;

        /* renamed from: L */
        public boolean f12021L;

        /* renamed from: M */
        public boolean f12022M = true;

        /* renamed from: N */
        public String f12023N = "eng";

        /* renamed from: O */
        public C4746n f12024O;

        /* renamed from: P */
        public int f12025P;

        /* renamed from: a */
        public String f12026a;

        /* renamed from: b */
        public int f12027b;

        /* renamed from: c */
        public int f12028c;

        /* renamed from: d */
        public int f12029d;

        /* renamed from: e */
        public boolean f12030e;

        /* renamed from: f */
        public byte[] f12031f;

        /* renamed from: g */
        public byte[] f12032g;

        /* renamed from: h */
        public byte[] f12033h;

        /* renamed from: i */
        public C4644a f12034i;

        /* renamed from: j */
        public int f12035j = -1;

        /* renamed from: k */
        public int f12036k = -1;

        /* renamed from: l */
        public int f12037l = -1;

        /* renamed from: m */
        public int f12038m = -1;

        /* renamed from: n */
        public int f12039n = 0;

        /* renamed from: o */
        public byte[] f12040o = null;

        /* renamed from: p */
        public int f12041p = -1;

        /* renamed from: q */
        public boolean f12042q = false;

        /* renamed from: r */
        public int f12043r = -1;

        /* renamed from: s */
        public int f12044s = -1;

        /* renamed from: t */
        public int f12045t = -1;

        /* renamed from: u */
        public int f12046u = 1000;

        /* renamed from: v */
        public int f12047v = 200;

        /* renamed from: w */
        public float f12048w = -1.0f;

        /* renamed from: x */
        public float f12049x = -1.0f;

        /* renamed from: y */
        public float f12050y = -1.0f;

        /* renamed from: z */
        public float f12051z = -1.0f;
    }

    public C4715d(C4713b bVar, int i) {
        this.f11983a = bVar;
        ((C4711a) bVar).mo25164a((C4714c) new C4717b(this, (C4716a) null));
        this.f11986d = (i & 1) != 0 ? false : true;
        this.f11984b = new C4720f();
        this.f11985c = new SparseArray<>();
        this.f11989g = new C4978k(4);
        this.f11990h = new C4978k(ByteBuffer.allocate(4).putInt(-1).array());
        this.f11991i = new C4978k(4);
        this.f11987e = new C4978k(C4974i.f13222a);
        this.f11988f = new C4978k(4);
        this.f11992j = new C4978k();
        this.f11993k = new C4978k();
        this.f11994l = new C4978k(8);
        this.f11995m = new C4978k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        r3 = r1.mo25180a(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25091a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r16 = this;
            r0 = r17
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e
            r1.<init>()
            r2 = r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r2
            long r3 = r2.f11669b
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r6 = 1024(0x400, double:5.06E-321)
            if (r5 == 0) goto L_0x001a
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r6 = r3
        L_0x001a:
            int r6 = (int) r6
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r1.f12052a
            byte[] r7 = r7.f13243a
            r8 = 0
            r9 = 4
            r2.mo25061a(r7, r8, r9, r8)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r1.f12052a
            long r10 = r7.mo25534m()
            r1.f12053b = r9
        L_0x002c:
            r12 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r9 = 1
            if (r7 == 0) goto L_0x0056
            int r7 = r1.f12053b
            int r7 = r7 + r9
            r1.f12053b = r7
            if (r7 != r6) goto L_0x003c
            goto L_0x00a1
        L_0x003c:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r1.f12052a
            byte[] r7 = r7.f13243a
            r2.mo25061a(r7, r8, r9, r8)
            r7 = 8
            long r9 = r10 << r7
            r11 = -256(0xffffffffffffff00, double:NaN)
            long r9 = r9 & r11
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r1.f12052a
            byte[] r7 = r7.f13243a
            byte r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r11 = (long) r7
            long r10 = r9 | r11
            goto L_0x002c
        L_0x0056:
            long r6 = r1.mo25180a(r0)
            int r10 = r1.f12053b
            long r10 = (long) r10
            r12 = -9223372036854775808
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00a1
            if (r5 == 0) goto L_0x006c
            long r14 = r10 + r6
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x006c
            goto L_0x00a1
        L_0x006c:
            int r3 = r1.f12053b
            long r3 = (long) r3
            long r14 = r10 + r6
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x009e
            long r3 = r1.mo25180a(r0)
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x007e
            goto L_0x00a1
        L_0x007e:
            long r3 = r1.mo25180a(r0)
            r14 = 0
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x00a1
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r14 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            if (r5 == 0) goto L_0x006c
            int r5 = (int) r3
            r2.mo25060a(r5, r8)
            int r5 = r1.f12053b
            long r14 = (long) r5
            long r14 = r14 + r3
            int r3 = (int) r14
            r1.f12053b = r3
            goto L_0x006c
        L_0x009e:
            if (r3 != 0) goto L_0x00a1
            r8 = r9
        L_0x00a1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.mo25091a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        this.f11982Y = hVar;
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        this.f11958A = -9223372036854775807L;
        this.f11962E = 0;
        C4711a aVar = (C4711a) this.f11983a;
        aVar.f11950e = 0;
        aVar.f11947b.clear();
        C4720f fVar = aVar.f11948c;
        fVar.f12056b = 0;
        fVar.f12057c = 0;
        C4720f fVar2 = this.f11984b;
        fVar2.f12056b = 0;
        fVar2.f12057c = 0;
        mo25170a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25088a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g r9, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f11980W = r0
            r1 = 1
            r2 = r1
        L_0x0005:
            if (r2 == 0) goto L_0x003d
            boolean r3 = r8.f11980W
            if (r3 != 0) goto L_0x003d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b r2 = r8.f11983a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4711a) r2
            boolean r2 = r2.mo25165a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r9)
            if (r2 == 0) goto L_0x0005
            r3 = r9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r3
            long r3 = r3.f11670c
            boolean r5 = r8.f12006x
            if (r5 == 0) goto L_0x0028
            r8.f12008z = r3
            long r3 = r8.f12007y
            r10.f11944a = r3
            r8.f12006x = r0
        L_0x0026:
            r3 = r1
            goto L_0x003a
        L_0x0028:
            boolean r3 = r8.f12003u
            if (r3 == 0) goto L_0x0039
            long r3 = r8.f12008z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0039
            r10.f11944a = r3
            r8.f12008z = r5
            goto L_0x0026
        L_0x0039:
            r3 = r0
        L_0x003a:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003d:
            if (r2 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.mo25088a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final void mo25173a(C4718c cVar, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(cVar.f12026a)) {
            byte[] bArr2 = this.f11993k.f13243a;
            long j2 = this.f11964G;
            if (j2 == -9223372036854775807L) {
                bArr = f11956a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                String format = String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (1000000 * i3))) / 1000))});
                int i4 = C4991u.f13270a;
                bArr = format.getBytes(Charset.defaultCharset());
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            C4746n nVar = cVar.f12024O;
            C4978k kVar = this.f11993k;
            nVar.mo25075a(kVar, kVar.f13245c);
            this.f11979V += this.f11993k.f13245c;
        }
        cVar.f12024O.mo25072a(j, this.f11970M, this.f11979V, 0, cVar.f12032g);
        this.f11980W = true;
        mo25170a();
    }

    /* renamed from: a */
    public final void mo25170a() {
        this.f11971N = 0;
        this.f11979V = 0;
        this.f11978U = 0;
        this.f11972O = false;
        this.f11973P = false;
        this.f11975R = false;
        this.f11977T = 0;
        this.f11976S = 0;
        this.f11974Q = false;
        this.f11992j.mo25539r();
    }

    /* renamed from: a */
    public final void mo25171a(C4672g gVar, int i) throws IOException, InterruptedException {
        C4978k kVar = this.f11989g;
        if (kVar.f13245c < i) {
            if (kVar.mo25518b() < i) {
                C4978k kVar2 = this.f11989g;
                byte[] bArr = kVar2.f13243a;
                kVar2.mo25516a(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.f11989g.f13245c);
            }
            C4978k kVar3 = this.f11989g;
            byte[] bArr2 = kVar3.f13243a;
            int i2 = kVar3.f13245c;
            ((C4657b) gVar).mo25063b(bArr2, i2, i - i2, false);
            this.f11989g.mo25523d(i);
        }
    }

    /* renamed from: a */
    public final void mo25172a(C4672g gVar, C4718c cVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.f12026a)) {
            byte[] bArr = f11955Z;
            int length = bArr.length + i;
            if (this.f11993k.mo25518b() < length) {
                this.f11993k.f13243a = Arrays.copyOf(bArr, length + i);
            }
            ((C4657b) gVar).mo25063b(this.f11993k.f13243a, bArr.length, i, false);
            this.f11993k.mo25525e(0);
            this.f11993k.mo25523d(length);
            return;
        }
        C4746n nVar = cVar.f12024O;
        if (!this.f11972O) {
            if (cVar.f12030e) {
                this.f11970M &= -1073741825;
                int i3 = 128;
                if (!this.f11973P) {
                    ((C4657b) gVar).mo25063b(this.f11989g.f13243a, 0, 1, false);
                    this.f11971N++;
                    byte[] bArr2 = this.f11989g.f13243a;
                    if ((bArr2[0] & 128) != 128) {
                        this.f11976S = bArr2[0];
                        this.f11973P = true;
                    } else {
                        throw new C4815l("Extension bit is set in signal byte");
                    }
                }
                byte b = this.f11976S;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.f11970M |= 1073741824;
                    if (!this.f11974Q) {
                        ((C4657b) gVar).mo25063b(this.f11994l.f13243a, 0, 8, false);
                        this.f11971N += 8;
                        this.f11974Q = true;
                        C4978k kVar = this.f11989g;
                        byte[] bArr3 = kVar.f13243a;
                        if (!z) {
                            i3 = 0;
                        }
                        bArr3[0] = (byte) (i3 | 8);
                        kVar.mo25525e(0);
                        nVar.mo25075a(this.f11989g, 1);
                        this.f11979V++;
                        this.f11994l.mo25525e(0);
                        nVar.mo25075a(this.f11994l, 8);
                        this.f11979V += 8;
                    }
                    if (z) {
                        if (!this.f11975R) {
                            ((C4657b) gVar).mo25063b(this.f11989g.f13243a, 0, 1, false);
                            this.f11971N++;
                            this.f11989g.mo25525e(0);
                            this.f11977T = this.f11989g.mo25533l();
                            this.f11975R = true;
                        }
                        int i4 = this.f11977T * 4;
                        this.f11989g.mo25521c(i4);
                        ((C4657b) gVar).mo25063b(this.f11989g.f13243a, 0, i4, false);
                        this.f11971N += i4;
                        short s = (short) ((this.f11977T / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f11996n;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.f11996n = ByteBuffer.allocate(i5);
                        }
                        this.f11996n.position(0);
                        this.f11996n.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.f11977T;
                            if (i6 >= i2) {
                                break;
                            }
                            int o = this.f11989g.mo25536o();
                            if (i6 % 2 == 0) {
                                this.f11996n.putShort((short) (o - i7));
                            } else {
                                this.f11996n.putInt(o - i7);
                            }
                            i6++;
                            i7 = o;
                        }
                        int i8 = (i - this.f11971N) - i7;
                        if (i2 % 2 == 1) {
                            this.f11996n.putInt(i8);
                        } else {
                            this.f11996n.putShort((short) i8);
                            this.f11996n.putInt(0);
                        }
                        this.f11995m.mo25516a(this.f11996n.array(), i5);
                        nVar.mo25075a(this.f11995m, i5);
                        this.f11979V += i5;
                    }
                }
            } else {
                byte[] bArr4 = cVar.f12031f;
                if (bArr4 != null) {
                    C4978k kVar2 = this.f11992j;
                    int length2 = bArr4.length;
                    kVar2.f13243a = bArr4;
                    kVar2.f13245c = length2;
                    kVar2.f13244b = 0;
                }
            }
            this.f11972O = true;
        }
        int i9 = i + this.f11992j.f13245c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f12026a) && !"V_MPEGH/ISO/HEVC".equals(cVar.f12026a)) {
            while (true) {
                int i10 = this.f11971N;
                if (i10 >= i9) {
                    break;
                }
                mo25168a(gVar, nVar, i9 - i10);
            }
        } else {
            byte[] bArr5 = this.f11988f.f13243a;
            bArr5[0] = 0;
            bArr5[1] = 0;
            bArr5[2] = 0;
            int i11 = cVar.f12025P;
            int i12 = 4 - i11;
            while (this.f11971N < i9) {
                int i13 = this.f11978U;
                if (i13 == 0) {
                    int min = Math.min(i11, this.f11992j.mo25513a());
                    ((C4657b) gVar).mo25063b(bArr5, i12 + min, i11 - min, false);
                    if (min > 0) {
                        C4978k kVar3 = this.f11992j;
                        System.arraycopy(kVar3.f13243a, kVar3.f13244b, bArr5, i12, min);
                        kVar3.f13244b += min;
                    }
                    this.f11971N += i11;
                    this.f11988f.mo25525e(0);
                    this.f11978U = this.f11988f.mo25536o();
                    this.f11987e.mo25525e(0);
                    nVar.mo25075a(this.f11987e, 4);
                    this.f11979V += 4;
                } else {
                    this.f11978U = i13 - mo25168a(gVar, nVar, i13);
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f12026a)) {
            this.f11990h.mo25525e(0);
            nVar.mo25075a(this.f11990h, 4);
            this.f11979V += 4;
        }
    }

    /* renamed from: a */
    public final int mo25168a(C4672g gVar, C4746n nVar, int i) throws IOException, InterruptedException {
        int i2;
        int a = this.f11992j.mo25513a();
        if (a > 0) {
            i2 = Math.min(i, a);
            nVar.mo25075a(this.f11992j, i2);
        } else {
            i2 = nVar.mo25068a(gVar, i, false);
        }
        this.f11971N += i2;
        this.f11979V += i2;
        return i2;
    }

    /* renamed from: a */
    public final long mo25169a(long j) throws C4815l {
        long j2 = this.f11999q;
        if (j2 != -9223372036854775807L) {
            return C4991u.m15135a(j, j2, 1000);
        }
        throw new C4815l("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    public static int[] m14403a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }
}
