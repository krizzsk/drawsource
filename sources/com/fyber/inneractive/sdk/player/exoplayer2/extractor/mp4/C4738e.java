package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.core.view.ViewCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4831a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4839e;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4846h;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4849j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.IronSourceSegment;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e */
public final class C4738e {

    /* renamed from: A */
    public static final int f12246A = C4991u.m15133a("sosn");

    /* renamed from: B */
    public static final int f12247B = C4991u.m15133a("tvsh");

    /* renamed from: C */
    public static final int f12248C = C4991u.m15133a("----");

    /* renamed from: D */
    public static final String[] f12249D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    public static final int f12250a = C4991u.m15133a("nam");

    /* renamed from: b */
    public static final int f12251b = C4991u.m15133a("trk");

    /* renamed from: c */
    public static final int f12252c = C4991u.m15133a("cmt");

    /* renamed from: d */
    public static final int f12253d = C4991u.m15133a("day");

    /* renamed from: e */
    public static final int f12254e = C4991u.m15133a("ART");

    /* renamed from: f */
    public static final int f12255f = C4991u.m15133a("too");

    /* renamed from: g */
    public static final int f12256g = C4991u.m15133a("alb");

    /* renamed from: h */
    public static final int f12257h = C4991u.m15133a("com");

    /* renamed from: i */
    public static final int f12258i = C4991u.m15133a("wrt");

    /* renamed from: j */
    public static final int f12259j = C4991u.m15133a("lyr");

    /* renamed from: k */
    public static final int f12260k = C4991u.m15133a(IronSourceSegment.GENDER);

    /* renamed from: l */
    public static final int f12261l = C4991u.m15133a("covr");

    /* renamed from: m */
    public static final int f12262m = C4991u.m15133a("gnre");

    /* renamed from: n */
    public static final int f12263n = C4991u.m15133a("grp");

    /* renamed from: o */
    public static final int f12264o = C4991u.m15133a("disk");

    /* renamed from: p */
    public static final int f12265p = C4991u.m15133a("trkn");

    /* renamed from: q */
    public static final int f12266q = C4991u.m15133a("tmpo");

    /* renamed from: r */
    public static final int f12267r = C4991u.m15133a("cpil");

    /* renamed from: s */
    public static final int f12268s = C4991u.m15133a("aART");

    /* renamed from: t */
    public static final int f12269t = C4991u.m15133a("sonm");

    /* renamed from: u */
    public static final int f12270u = C4991u.m15133a("soal");

    /* renamed from: v */
    public static final int f12271v = C4991u.m15133a("soar");

    /* renamed from: w */
    public static final int f12272w = C4991u.m15133a("soaa");

    /* renamed from: x */
    public static final int f12273x = C4991u.m15133a("soco");

    /* renamed from: y */
    public static final int f12274y = C4991u.m15133a("rtng");

    /* renamed from: z */
    public static final int f12275z = C4991u.m15133a("pgap");

    /* renamed from: a */
    public static C4846h m14478a(C4978k kVar, int i) {
        int i2 = -1;
        int i3 = -1;
        String str = null;
        String str2 = null;
        while (true) {
            int i4 = kVar.f13244b;
            if (i4 >= i) {
                break;
            }
            int c = kVar.mo25520c();
            int c2 = kVar.mo25520c();
            kVar.mo25527f(4);
            if (c2 == C4726a.f12092D0) {
                str = kVar.mo25514a(c - 12);
            } else if (c2 == C4726a.f12094E0) {
                str2 = kVar.mo25514a(c - 12);
            } else {
                if (c2 == C4726a.f12096F0) {
                    i2 = i4;
                    i3 = c;
                }
                kVar.mo25527f(c - 12);
            }
        }
        if (!"com.apple.iTunes".equals(str) || !"iTunSMPB".equals(str2) || i2 == -1) {
            return null;
        }
        kVar.mo25525e(i2);
        kVar.mo25527f(16);
        return new C4839e("und", str2, kVar.mo25514a(i3 - 16));
    }

    /* renamed from: b */
    public static C4849j m14481b(int i, String str, C4978k kVar) {
        int c = kVar.mo25520c();
        if (kVar.mo25520c() == C4726a.f12096F0) {
            kVar.mo25527f(8);
            return new C4849j(str, (String) null, kVar.mo25514a(c - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + C4726a.m14446a(i));
        return null;
    }

    /* renamed from: b */
    public static int m14480b(C4978k kVar) {
        kVar.mo25527f(4);
        if (kVar.mo25520c() == C4726a.f12096F0) {
            kVar.mo25527f(8);
            return kVar.mo25533l();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: a */
    public static C4839e m14476a(int i, C4978k kVar) {
        int c = kVar.mo25520c();
        if (kVar.mo25520c() == C4726a.f12096F0) {
            kVar.mo25527f(8);
            String a = kVar.mo25514a(c - 16);
            return new C4839e("und", a, a);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + C4726a.m14446a(i));
        return null;
    }

    /* renamed from: a */
    public static C4846h m14477a(int i, String str, C4978k kVar, boolean z, boolean z2) {
        int b = m14480b(kVar);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + C4726a.m14446a(i));
            return null;
        } else if (z) {
            return new C4849j(str, (String) null, Integer.toString(b));
        } else {
            return new C4839e("und", str, Integer.toString(b));
        }
    }

    /* renamed from: a */
    public static C4849j m14479a(int i, String str, C4978k kVar) {
        int c = kVar.mo25520c();
        if (kVar.mo25520c() == C4726a.f12096F0 && c >= 22) {
            kVar.mo25527f(10);
            int q = kVar.mo25538q();
            if (q > 0) {
                String str2 = "" + q;
                int q2 = kVar.mo25538q();
                if (q2 > 0) {
                    str2 = str2 + "/" + q2;
                }
                return new C4849j(str, (String) null, str2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + C4726a.m14446a(i));
        return null;
    }

    /* renamed from: a */
    public static C4831a m14475a(C4978k kVar) {
        int c = kVar.mo25520c();
        if (kVar.mo25520c() == C4726a.f12096F0) {
            int c2 = kVar.mo25520c() & ViewCompat.MEASURED_SIZE_MASK;
            String str = c2 == 13 ? MimeTypes.IMAGE_JPEG : c2 == 14 ? "image/png" : null;
            if (str == null) {
                Log.w("MetadataUtil", "Unrecognized cover art flags: " + c2);
                return null;
            }
            kVar.mo25527f(4);
            int i = c - 16;
            byte[] bArr = new byte[i];
            System.arraycopy(kVar.f13243a, kVar.f13244b, bArr, 0, i);
            kVar.f13244b += i;
            return new C4831a(str, (String) null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }
}
