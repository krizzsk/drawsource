package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a */
public abstract class C4726a {

    /* renamed from: A */
    public static final int f12085A = C4991u.m15133a("trun");

    /* renamed from: A0 */
    public static final int f12086A0 = C4991u.m15133a("udta");

    /* renamed from: B */
    public static final int f12087B = C4991u.m15133a("sidx");

    /* renamed from: B0 */
    public static final int f12088B0 = C4991u.m15133a("meta");

    /* renamed from: C */
    public static final int f12089C = C4991u.m15133a("moov");

    /* renamed from: C0 */
    public static final int f12090C0 = C4991u.m15133a("ilst");

    /* renamed from: D */
    public static final int f12091D = C4991u.m15133a("mvhd");

    /* renamed from: D0 */
    public static final int f12092D0 = C4991u.m15133a("mean");

    /* renamed from: E */
    public static final int f12093E = C4991u.m15133a("trak");

    /* renamed from: E0 */
    public static final int f12094E0 = C4991u.m15133a("name");

    /* renamed from: F */
    public static final int f12095F = C4991u.m15133a("mdia");

    /* renamed from: F0 */
    public static final int f12096F0 = C4991u.m15133a("data");

    /* renamed from: G */
    public static final int f12097G = C4991u.m15133a("minf");

    /* renamed from: G0 */
    public static final int f12098G0 = C4991u.m15133a("emsg");

    /* renamed from: H */
    public static final int f12099H = C4991u.m15133a("stbl");

    /* renamed from: H0 */
    public static final int f12100H0 = C4991u.m15133a("st3d");

    /* renamed from: I */
    public static final int f12101I = C4991u.m15133a("avcC");

    /* renamed from: I0 */
    public static final int f12102I0 = C4991u.m15133a("sv3d");

    /* renamed from: J */
    public static final int f12103J = C4991u.m15133a("hvcC");

    /* renamed from: J0 */
    public static final int f12104J0 = C4991u.m15133a("proj");

    /* renamed from: K */
    public static final int f12105K = C4991u.m15133a("esds");

    /* renamed from: K0 */
    public static final int f12106K0 = C4991u.m15133a("vp08");

    /* renamed from: L */
    public static final int f12107L = C4991u.m15133a("moof");

    /* renamed from: L0 */
    public static final int f12108L0 = C4991u.m15133a("vp09");

    /* renamed from: M */
    public static final int f12109M = C4991u.m15133a("traf");

    /* renamed from: M0 */
    public static final int f12110M0 = C4991u.m15133a("vpcC");

    /* renamed from: N */
    public static final int f12111N = C4991u.m15133a("mvex");

    /* renamed from: N0 */
    public static final int f12112N0 = C4991u.m15133a("camm");

    /* renamed from: O */
    public static final int f12113O = C4991u.m15133a("mehd");

    /* renamed from: O0 */
    public static final int f12114O0 = C4991u.m15133a("alac");

    /* renamed from: P */
    public static final int f12115P = C4991u.m15133a("tkhd");

    /* renamed from: Q */
    public static final int f12116Q = C4991u.m15133a("edts");

    /* renamed from: R */
    public static final int f12117R = C4991u.m15133a("elst");

    /* renamed from: S */
    public static final int f12118S = C4991u.m15133a("mdhd");

    /* renamed from: T */
    public static final int f12119T = C4991u.m15133a("hdlr");

    /* renamed from: U */
    public static final int f12120U = C4991u.m15133a("stsd");

    /* renamed from: V */
    public static final int f12121V = C4991u.m15133a("pssh");

    /* renamed from: W */
    public static final int f12122W = C4991u.m15133a("sinf");

    /* renamed from: X */
    public static final int f12123X = C4991u.m15133a("schm");

    /* renamed from: Y */
    public static final int f12124Y = C4991u.m15133a("schi");

    /* renamed from: Z */
    public static final int f12125Z = C4991u.m15133a("tenc");

    /* renamed from: a0 */
    public static final int f12126a0 = C4991u.m15133a("encv");

    /* renamed from: b */
    public static final int f12127b = C4991u.m15133a("ftyp");

    /* renamed from: b0 */
    public static final int f12128b0 = C4991u.m15133a("enca");

    /* renamed from: c */
    public static final int f12129c = C4991u.m15133a("avc1");

    /* renamed from: c0 */
    public static final int f12130c0 = C4991u.m15133a("frma");

    /* renamed from: d */
    public static final int f12131d = C4991u.m15133a("avc3");

    /* renamed from: d0 */
    public static final int f12132d0 = C4991u.m15133a("saiz");

    /* renamed from: e */
    public static final int f12133e = C4991u.m15133a("hvc1");

    /* renamed from: e0 */
    public static final int f12134e0 = C4991u.m15133a("saio");

    /* renamed from: f */
    public static final int f12135f = C4991u.m15133a("hev1");

    /* renamed from: f0 */
    public static final int f12136f0 = C4991u.m15133a("sbgp");

    /* renamed from: g */
    public static final int f12137g = C4991u.m15133a("s263");

    /* renamed from: g0 */
    public static final int f12138g0 = C4991u.m15133a("sgpd");

    /* renamed from: h */
    public static final int f12139h = C4991u.m15133a("d263");

    /* renamed from: h0 */
    public static final int f12140h0 = C4991u.m15133a("uuid");

    /* renamed from: i */
    public static final int f12141i = C4991u.m15133a("mdat");

    /* renamed from: i0 */
    public static final int f12142i0 = C4991u.m15133a("senc");

    /* renamed from: j */
    public static final int f12143j = C4991u.m15133a("mp4a");

    /* renamed from: j0 */
    public static final int f12144j0 = C4991u.m15133a("pasp");

    /* renamed from: k */
    public static final int f12145k = C4991u.m15133a(".mp3");

    /* renamed from: k0 */
    public static final int f12146k0 = C4991u.m15133a("TTML");

    /* renamed from: l */
    public static final int f12147l = C4991u.m15133a("wave");

    /* renamed from: l0 */
    public static final int f12148l0 = C4991u.m15133a("mp4v");

    /* renamed from: m */
    public static final int f12149m = C4991u.m15133a("lpcm");

    /* renamed from: m0 */
    public static final int f12150m0 = C4991u.m15133a("stts");

    /* renamed from: n */
    public static final int f12151n = C4991u.m15133a("sowt");

    /* renamed from: n0 */
    public static final int f12152n0 = C4991u.m15133a("stss");

    /* renamed from: o */
    public static final int f12153o = C4991u.m15133a("ac-3");

    /* renamed from: o0 */
    public static final int f12154o0 = C4991u.m15133a("ctts");

    /* renamed from: p */
    public static final int f12155p = C4991u.m15133a("dac3");

    /* renamed from: p0 */
    public static final int f12156p0 = C4991u.m15133a("stsc");

    /* renamed from: q */
    public static final int f12157q = C4991u.m15133a("ec-3");

    /* renamed from: q0 */
    public static final int f12158q0 = C4991u.m15133a("stsz");

    /* renamed from: r */
    public static final int f12159r = C4991u.m15133a("dec3");

    /* renamed from: r0 */
    public static final int f12160r0 = C4991u.m15133a("stz2");

    /* renamed from: s */
    public static final int f12161s = C4991u.m15133a("dtsc");

    /* renamed from: s0 */
    public static final int f12162s0 = C4991u.m15133a("stco");

    /* renamed from: t */
    public static final int f12163t = C4991u.m15133a("dtsh");

    /* renamed from: t0 */
    public static final int f12164t0 = C4991u.m15133a("co64");

    /* renamed from: u */
    public static final int f12165u = C4991u.m15133a("dtsl");

    /* renamed from: u0 */
    public static final int f12166u0 = C4991u.m15133a("tx3g");

    /* renamed from: v */
    public static final int f12167v = C4991u.m15133a("dtse");

    /* renamed from: v0 */
    public static final int f12168v0 = C4991u.m15133a("wvtt");

    /* renamed from: w */
    public static final int f12169w = C4991u.m15133a("ddts");

    /* renamed from: w0 */
    public static final int f12170w0 = C4991u.m15133a("stpp");

    /* renamed from: x */
    public static final int f12171x = C4991u.m15133a("tfdt");

    /* renamed from: x0 */
    public static final int f12172x0 = C4991u.m15133a("c608");

    /* renamed from: y */
    public static final int f12173y = C4991u.m15133a("tfhd");

    /* renamed from: y0 */
    public static final int f12174y0 = C4991u.m15133a("samr");

    /* renamed from: z */
    public static final int f12175z = C4991u.m15133a("trex");

    /* renamed from: z0 */
    public static final int f12176z0 = C4991u.m15133a("sawb");

    /* renamed from: a */
    public final int f12177a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a */
    public static final class C4727a extends C4726a {

        /* renamed from: P0 */
        public final long f12178P0;

        /* renamed from: Q0 */
        public final List<C4728b> f12179Q0 = new ArrayList();

        /* renamed from: R0 */
        public final List<C4727a> f12180R0 = new ArrayList();

        public C4727a(int i, long j) {
            super(i);
            this.f12178P0 = j;
        }

        /* renamed from: c */
        public C4727a mo25186c(int i) {
            int size = this.f12180R0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4727a aVar = this.f12180R0.get(i2);
                if (aVar.f12177a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: d */
        public C4728b mo25187d(int i) {
            int size = this.f12179Q0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4728b bVar = this.f12179Q0.get(i2);
                if (bVar.f12177a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return C4726a.m14446a(this.f12177a) + " leaves: " + Arrays.toString(this.f12179Q0.toArray()) + " containers: " + Arrays.toString(this.f12180R0.toArray());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b */
    public static final class C4728b extends C4726a {

        /* renamed from: P0 */
        public final C4978k f12181P0;

        public C4728b(int i, C4978k kVar) {
            super(i);
            this.f12181P0 = kVar;
        }
    }

    static {
        C4991u.m15133a("vmhd");
    }

    public C4726a(int i) {
        this.f12177a = i;
    }

    /* renamed from: a */
    public static String m14446a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* renamed from: b */
    public static int m14447b(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m14446a(this.f12177a);
    }
}
