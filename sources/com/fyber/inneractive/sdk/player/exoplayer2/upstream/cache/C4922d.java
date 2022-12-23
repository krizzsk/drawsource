package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4936f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4940h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4964z;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4916a;
import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d */
public final class C4922d implements C4938g {

    /* renamed from: a */
    public final C4916a f13058a;

    /* renamed from: b */
    public final C4938g f13059b;

    /* renamed from: c */
    public final C4938g f13060c;

    /* renamed from: d */
    public final C4938g f13061d;

    /* renamed from: e */
    public final C4923a f13062e;

    /* renamed from: f */
    public final boolean f13063f;

    /* renamed from: g */
    public final boolean f13064g;

    /* renamed from: h */
    public final boolean f13065h;

    /* renamed from: i */
    public C4938g f13066i;

    /* renamed from: j */
    public boolean f13067j;

    /* renamed from: k */
    public Uri f13068k;

    /* renamed from: l */
    public int f13069l;

    /* renamed from: m */
    public String f13070m;

    /* renamed from: n */
    public long f13071n;

    /* renamed from: o */
    public long f13072o;

    /* renamed from: p */
    public C4926g f13073p;

    /* renamed from: q */
    public boolean f13074q;

    /* renamed from: r */
    public boolean f13075r;

    /* renamed from: s */
    public long f13076s;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d$a */
    public interface C4923a {
        /* renamed from: a */
        void mo25456a(long j, long j2);
    }

    public C4922d(C4916a aVar, C4938g gVar, C4938g gVar2, C4936f fVar, int i, C4923a aVar2) {
        this.f13058a = aVar;
        this.f13059b = gVar2;
        boolean z = false;
        this.f13063f = (i & 1) != 0;
        this.f13064g = (i & 2) != 0;
        this.f13065h = (i & 4) != 0 ? true : z;
        this.f13061d = gVar;
        if (fVar != null) {
            this.f13060c = new C4964z(gVar, fVar);
        } else {
            this.f13060c = null;
        }
        this.f13062e = aVar2;
    }

    /* renamed from: a */
    public long mo24756a(C4942j jVar) throws IOException {
        try {
            Uri uri = jVar.f13126a;
            this.f13068k = uri;
            this.f13069l = jVar.f13132g;
            String str = jVar.f13131f;
            if (str == null) {
                str = uri.toString();
            }
            this.f13070m = str;
            this.f13071n = jVar.f13129d;
            boolean z = (this.f13064g && this.f13074q) || (jVar.f13130e == -1 && this.f13065h);
            this.f13075r = z;
            long j = jVar.f13130e;
            if (j == -1) {
                if (!z) {
                    long a = this.f13058a.mo25437a(str);
                    this.f13072o = a;
                    if (a != -1) {
                        long j2 = a - jVar.f13129d;
                        this.f13072o = j2;
                        if (j2 <= 0) {
                            throw new C4940h(0);
                        }
                    }
                    mo25454a(true);
                    return this.f13072o;
                }
            }
            this.f13072o = j;
            mo25454a(true);
            return this.f13072o;
        } catch (IOException e) {
            mo25453a(e);
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo25455b() throws IOException {
        C4938g gVar = this.f13066i;
        if (gVar != null) {
            try {
                gVar.close();
                this.f13066i = null;
                this.f13067j = false;
            } finally {
                C4926g gVar2 = this.f13073p;
                if (gVar2 != null) {
                    this.f13058a.mo25443b(gVar2);
                    this.f13073p = null;
                }
            }
        }
    }

    public void close() throws IOException {
        this.f13068k = null;
        C4923a aVar = this.f13062e;
        if (aVar != null && this.f13076s > 0) {
            aVar.mo25456a(this.f13058a.mo25436a(), this.f13076s);
            this.f13076s = 0;
        }
        try {
            mo25455b();
        } catch (IOException e) {
            mo25453a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public int mo24755a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f13072o == 0) {
            return -1;
        }
        try {
            int a = this.f13066i.mo24755a(bArr, i, i2);
            if (a >= 0) {
                if (this.f13066i == this.f13059b) {
                    this.f13076s += (long) a;
                }
                long j = (long) a;
                this.f13071n += j;
                long j2 = this.f13072o;
                if (j2 != -1) {
                    this.f13072o = j2 - j;
                }
            } else {
                if (this.f13067j) {
                    long j3 = this.f13071n;
                    if (this.f13066i == this.f13060c) {
                        this.f13058a.mo25441a(this.f13070m, j3);
                    }
                    this.f13072o = 0;
                }
                mo25455b();
                long j4 = this.f13072o;
                if ((j4 > 0 || j4 == -1) && mo25454a(false)) {
                    return mo24755a(bArr, i, i2);
                }
            }
            return a;
        } catch (IOException e) {
            mo25453a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public Uri mo24757a() {
        C4938g gVar = this.f13066i;
        return gVar == this.f13061d ? gVar.mo24757a() : this.f13068k;
    }

    /* renamed from: a */
    public final boolean mo25454a(boolean z) throws IOException {
        C4926g gVar;
        C4942j jVar;
        IOException iOException = null;
        if (this.f13075r) {
            gVar = null;
        } else if (this.f13063f) {
            try {
                gVar = this.f13058a.mo25442b(this.f13070m, this.f13071n);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            gVar = this.f13058a.mo25444c(this.f13070m, this.f13071n);
        }
        boolean z2 = true;
        if (gVar == null) {
            this.f13066i = this.f13061d;
            Uri uri = this.f13068k;
            long j = this.f13071n;
            jVar = new C4942j(uri, (byte[]) null, j, j, this.f13072o, this.f13070m, this.f13069l);
        } else if (gVar.f13084d) {
            Uri fromFile = Uri.fromFile(gVar.f13085e);
            long j2 = this.f13071n - gVar.f13082b;
            long j3 = gVar.f13083c - j2;
            long j4 = this.f13072o;
            if (j4 != -1) {
                j3 = Math.min(j3, j4);
            }
            C4942j jVar2 = new C4942j(fromFile, (byte[]) null, this.f13071n, j2, j3, this.f13070m, this.f13069l);
            this.f13066i = this.f13059b;
            jVar = jVar2;
        } else {
            long j5 = gVar.f13083c;
            if (j5 == -1) {
                j5 = this.f13072o;
            } else {
                long j6 = this.f13072o;
                if (j6 != -1) {
                    j5 = Math.min(j5, j6);
                }
            }
            Uri uri2 = this.f13068k;
            long j7 = this.f13071n;
            jVar = new C4942j(uri2, (byte[]) null, j7, j7, j5, this.f13070m, this.f13069l);
            C4938g gVar2 = this.f13060c;
            if (gVar2 != null) {
                this.f13066i = gVar2;
                this.f13073p = gVar;
            } else {
                this.f13066i = this.f13061d;
                this.f13058a.mo25443b(gVar);
            }
        }
        this.f13067j = jVar.f13130e == -1;
        long j8 = 0;
        try {
            j8 = this.f13066i.mo24756a(jVar);
        } catch (IOException e) {
            if (!z && this.f13067j) {
                Throwable th = e;
                while (true) {
                    if (th != null) {
                        if ((th instanceof C4940h) && ((C4940h) th).f13119a == 0) {
                            break;
                        }
                        th = th.getCause();
                    } else {
                        break;
                    }
                }
            }
            iOException = e;
            if (iOException == null) {
                z2 = false;
            } else {
                throw iOException;
            }
        }
        if (this.f13067j && j8 != -1) {
            this.f13072o = j8;
            long j9 = jVar.f13129d + j8;
            if (this.f13066i == this.f13060c) {
                this.f13058a.mo25441a(this.f13070m, j9);
            }
        }
        return z2;
    }

    /* renamed from: a */
    public final void mo25453a(IOException iOException) {
        if (this.f13066i == this.f13059b || (iOException instanceof C4916a.C4917a)) {
            this.f13074q = true;
        }
    }
}
