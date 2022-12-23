package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.text.C4892a;
import com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.C4894a;
import com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.C4895b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4988r;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l */
public final class C4690l implements C4665f {

    /* renamed from: g */
    public static final Pattern f11837g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    public static final Pattern f11838h = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a */
    public final String f11839a;

    /* renamed from: b */
    public final C4988r f11840b;

    /* renamed from: c */
    public final C4978k f11841c = new C4978k();

    /* renamed from: d */
    public C4673h f11842d;

    /* renamed from: e */
    public byte[] f11843e = new byte[1024];

    /* renamed from: f */
    public int f11844f;

    public C4690l(String str, C4988r rVar) {
        this.f11839a = str;
        this.f11840b = rVar;
    }

    /* renamed from: a */
    public boolean mo25091a(C4672g gVar) throws IOException, InterruptedException {
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        this.f11842d = hVar;
        hVar.mo25099a(new C4709m.C4710a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public int mo25088a(C4672g gVar, C4708l lVar) throws IOException, InterruptedException {
        Matcher matcher;
        String d;
        int i;
        C4657b bVar = (C4657b) gVar;
        int i2 = (int) bVar.f11669b;
        int i3 = this.f11844f;
        byte[] bArr = this.f11843e;
        if (i3 == bArr.length) {
            if (i2 != -1) {
                i = i2;
            } else {
                i = bArr.length;
            }
            this.f11843e = Arrays.copyOf(bArr, (i * 3) / 2);
        }
        byte[] bArr2 = this.f11843e;
        int i4 = this.f11844f;
        int a = bVar.mo25057a(bArr2, i4, bArr2.length - i4);
        if (a != -1) {
            int i5 = this.f11844f + a;
            this.f11844f = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        C4978k kVar = new C4978k(this.f11843e);
        try {
            Pattern pattern = C4895b.f13001a;
            String d2 = kVar.mo25522d();
            if (d2 == null || !C4895b.f13002b.matcher(d2).matches()) {
                throw new C4892a("Expected WEBVTT. Got " + d2);
            }
            long j = 0;
            long j2 = 0;
            while (true) {
                String d3 = kVar.mo25522d();
                if (TextUtils.isEmpty(d3)) {
                    while (true) {
                        String d4 = kVar.mo25522d();
                        if (d4 == null) {
                            matcher = null;
                            break;
                        } else if (C4895b.f13001a.matcher(d4).matches()) {
                            do {
                                d = kVar.mo25522d();
                                if (d == null) {
                                    break;
                                }
                            } while (d.isEmpty());
                        } else {
                            matcher = C4894a.f13000a.matcher(d4);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        mo25150a(0);
                    } else {
                        long a2 = C4895b.m14901a(matcher.group(1));
                        long a3 = this.f11840b.mo25559a((j2 + a2) - j);
                        C4746n a4 = mo25150a(a3 - a2);
                        this.f11841c.mo25516a(this.f11843e, this.f11844f);
                        a4.mo25075a(this.f11841c, this.f11844f);
                        a4.mo25072a(a3, 1, this.f11844f, 0, (byte[]) null);
                    }
                    return -1;
                } else if (d3.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f11837g.matcher(d3);
                    if (matcher2.find()) {
                        Matcher matcher3 = f11838h.matcher(d3);
                        if (matcher3.find()) {
                            j = C4895b.m14901a(matcher2.group(1));
                            j2 = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                        } else {
                            throw new C4815l("X-TIMESTAMP-MAP doesn't contain media timestamp: " + d3);
                        }
                    } else {
                        throw new C4815l("X-TIMESTAMP-MAP doesn't contain local timestamp: " + d3);
                    }
                }
            }
        } catch (C4892a e) {
            throw new C4815l((Throwable) e);
        }
    }

    /* renamed from: a */
    public final C4746n mo25150a(long j) {
        C4746n a = this.f11842d.mo25098a(0, 3);
        a.mo25074a(C4811i.m14723a((String) null, "text/vtt", (String) null, -1, 0, this.f11839a, -1, (C4644a) null, j, Collections.emptyList()));
        this.f11842d.mo25100c();
        return a;
    }
}
