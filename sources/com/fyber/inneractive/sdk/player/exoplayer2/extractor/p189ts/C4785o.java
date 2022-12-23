package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4977j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4988r;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.o */
public final class C4785o implements C4795v {

    /* renamed from: a */
    public final C4773h f12581a;

    /* renamed from: b */
    public final C4977j f12582b = new C4977j(new byte[10]);

    /* renamed from: c */
    public int f12583c = 0;

    /* renamed from: d */
    public int f12584d;

    /* renamed from: e */
    public C4988r f12585e;

    /* renamed from: f */
    public boolean f12586f;

    /* renamed from: g */
    public boolean f12587g;

    /* renamed from: h */
    public boolean f12588h;

    /* renamed from: i */
    public int f12589i;

    /* renamed from: j */
    public int f12590j;

    /* renamed from: k */
    public boolean f12591k;

    /* renamed from: l */
    public long f12592l;

    public C4785o(C4773h hVar) {
        this.f12581a = hVar;
    }

    /* renamed from: a */
    public void mo25241a(C4988r rVar, C4673h hVar, C4795v.C4799d dVar) {
        this.f12585e = rVar;
        this.f12581a.mo25220a(hVar, dVar);
    }

    /* renamed from: a */
    public final void mo25238a() {
        this.f12583c = 0;
        this.f12584d = 0;
        this.f12588h = false;
        this.f12581a.mo25218a();
    }

    /* renamed from: a */
    public final void mo25240a(C4978k kVar, boolean z) {
        boolean z2;
        C4978k kVar2 = kVar;
        if (z) {
            int i = this.f12583c;
            if (i == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i == 3) {
                if (this.f12590j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f12590j + " more bytes");
                }
                this.f12581a.mo25222b();
            }
            mo25239a(1);
        }
        while (kVar.mo25513a() > 0) {
            int i2 = this.f12583c;
            if (i2 != 0) {
                int i3 = 0;
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (mo25242a(kVar2, this.f12582b.f13239a, Math.min(10, this.f12589i)) && mo25242a(kVar2, (byte[]) null, this.f12589i)) {
                            this.f12582b.mo25510b(0);
                            this.f12592l = -9223372036854775807L;
                            if (this.f12586f) {
                                this.f12582b.mo25512c(4);
                                this.f12582b.mo25512c(1);
                                this.f12582b.mo25512c(1);
                                long a = (((long) this.f12582b.mo25508a(3)) << 30) | ((long) (this.f12582b.mo25508a(15) << 15)) | ((long) this.f12582b.mo25508a(15));
                                this.f12582b.mo25512c(1);
                                if (!this.f12588h && this.f12587g) {
                                    this.f12582b.mo25512c(4);
                                    this.f12582b.mo25512c(1);
                                    this.f12582b.mo25512c(1);
                                    long a2 = (((long) this.f12582b.mo25508a(3)) << 30) | ((long) (this.f12582b.mo25508a(15) << 15)) | ((long) this.f12582b.mo25508a(15));
                                    this.f12582b.mo25512c(1);
                                    this.f12585e.mo25560b(a2);
                                    this.f12588h = true;
                                }
                                this.f12592l = this.f12585e.mo25560b(a);
                            }
                            this.f12581a.mo25219a(this.f12592l, this.f12591k);
                            mo25239a(3);
                        }
                    } else if (i2 == 3) {
                        int a3 = kVar.mo25513a();
                        int i4 = this.f12590j;
                        if (i4 != -1) {
                            i3 = a3 - i4;
                        }
                        if (i3 > 0) {
                            a3 -= i3;
                            kVar2.mo25523d(kVar2.f13244b + a3);
                        }
                        this.f12581a.mo25221a(kVar2);
                        int i5 = this.f12590j;
                        if (i5 != -1) {
                            int i6 = i5 - a3;
                            this.f12590j = i6;
                            if (i6 == 0) {
                                this.f12581a.mo25222b();
                                mo25239a(1);
                            }
                        }
                    }
                } else if (mo25242a(kVar2, this.f12582b.f13239a, 9)) {
                    this.f12582b.mo25510b(0);
                    int a4 = this.f12582b.mo25508a(24);
                    if (a4 != 1) {
                        Log.w("PesReader", "Unexpected start code prefix: " + a4);
                        this.f12590j = -1;
                        z2 = false;
                    } else {
                        this.f12582b.mo25512c(8);
                        int a5 = this.f12582b.mo25508a(16);
                        this.f12582b.mo25512c(5);
                        this.f12591k = this.f12582b.mo25511b();
                        this.f12582b.mo25512c(2);
                        this.f12586f = this.f12582b.mo25511b();
                        this.f12587g = this.f12582b.mo25511b();
                        this.f12582b.mo25512c(6);
                        int a6 = this.f12582b.mo25508a(8);
                        this.f12589i = a6;
                        if (a5 == 0) {
                            this.f12590j = -1;
                        } else {
                            this.f12590j = ((a5 + 6) - 9) - a6;
                        }
                        z2 = true;
                    }
                    if (z2) {
                        i3 = 2;
                    }
                    mo25239a(i3);
                }
            } else {
                kVar2.mo25527f(kVar.mo25513a());
            }
        }
    }

    /* renamed from: a */
    public final void mo25239a(int i) {
        this.f12583c = i;
        this.f12584d = 0;
    }

    /* renamed from: a */
    public final boolean mo25242a(C4978k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo25513a(), i - this.f12584d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            kVar.mo25527f(min);
        } else {
            System.arraycopy(kVar.f13243a, kVar.f13244b, bArr, this.f12584d, min);
            kVar.f13244b += min;
        }
        int i2 = this.f12584d + min;
        this.f12584d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
