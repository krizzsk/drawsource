package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4889r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4862a;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4864c;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4896a;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4906e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c */
public class C4676c {

    /* renamed from: a */
    public final C4938g f11741a;

    /* renamed from: b */
    public final C4938g f11742b;

    /* renamed from: c */
    public final C4689k f11743c;

    /* renamed from: d */
    public final C4691a.C4692a[] f11744d;

    /* renamed from: e */
    public final C4698e f11745e;

    /* renamed from: f */
    public final C4889r f11746f;

    /* renamed from: g */
    public final List<C4811i> f11747g;

    /* renamed from: h */
    public boolean f11748h;

    /* renamed from: i */
    public byte[] f11749i;

    /* renamed from: j */
    public IOException f11750j;

    /* renamed from: k */
    public C4691a.C4692a f11751k;

    /* renamed from: l */
    public Uri f11752l;

    /* renamed from: m */
    public byte[] f11753m;

    /* renamed from: n */
    public String f11754n;

    /* renamed from: o */
    public byte[] f11755o;

    /* renamed from: p */
    public C4906e f11756p;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$a */
    public static final class C4677a extends C4864c {

        /* renamed from: l */
        public final String f11757l;

        /* renamed from: m */
        public byte[] f11758m;

        public C4677a(C4938g gVar, C4942j jVar, C4811i iVar, int i, Object obj, byte[] bArr, String str) {
            super(gVar, jVar, 3, iVar, i, obj, bArr);
            this.f11757l = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$b */
    public static final class C4678b {

        /* renamed from: a */
        public C4862a f11759a;

        /* renamed from: b */
        public boolean f11760b;

        /* renamed from: c */
        public C4691a.C4692a f11761c;

        public C4678b() {
            mo25103a();
        }

        /* renamed from: a */
        public void mo25103a() {
            this.f11759a = null;
            this.f11760b = false;
            this.f11761c = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$c */
    public static final class C4679c extends C4896a {

        /* renamed from: g */
        public int f11762g;

        public C4679c(C4889r rVar, int[] iArr) {
            super(rVar, iArr);
            this.f11762g = mo25414a(rVar.mo25407a(0));
        }

        /* renamed from: a */
        public void mo25104a(long j) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo25419b(this.f11762g, elapsedRealtime)) {
                for (int i = this.f13004b - 1; i >= 0; i--) {
                    if (!mo25419b(i, elapsedRealtime)) {
                        this.f11762g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: d */
        public int mo25105d() {
            return 0;
        }

        /* renamed from: e */
        public int mo25106e() {
            return this.f11762g;
        }

        /* renamed from: g */
        public Object mo25107g() {
            return null;
        }
    }

    public C4676c(C4698e eVar, C4691a.C4692a[] aVarArr, C4680d dVar, C4689k kVar, List<C4811i> list) {
        this.f11745e = eVar;
        this.f11744d = aVarArr;
        this.f11743c = kVar;
        this.f11747g = list;
        C4811i[] iVarArr = new C4811i[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            iVarArr[i] = aVarArr[i].f11851b;
            iArr[i] = i;
        }
        C4675b bVar = (C4675b) dVar;
        this.f11741a = bVar.mo25101a(1);
        this.f11742b = bVar.mo25101a(3);
        C4889r rVar = new C4889r(iVarArr);
        this.f11746f = rVar;
        this.f11756p = new C4679c(rVar, iArr);
    }

    /* renamed from: a */
    public final void mo25102a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(str.toLowerCase(Locale.getDefault()).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f11752l = uri;
        this.f11753m = bArr;
        this.f11754n = str;
        this.f11755o = bArr2;
    }
}
