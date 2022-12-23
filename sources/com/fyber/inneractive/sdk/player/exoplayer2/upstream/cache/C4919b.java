package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4936f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4916a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4982o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b */
public final class C4919b implements C4936f {

    /* renamed from: a */
    public final C4916a f13046a;

    /* renamed from: b */
    public final long f13047b;

    /* renamed from: c */
    public final int f13048c;

    /* renamed from: d */
    public C4942j f13049d;

    /* renamed from: e */
    public File f13050e;

    /* renamed from: f */
    public OutputStream f13051f;

    /* renamed from: g */
    public FileOutputStream f13052g;

    /* renamed from: h */
    public long f13053h;

    /* renamed from: i */
    public long f13054i;

    /* renamed from: j */
    public C4982o f13055j;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b$a */
    public static class C4920a extends C4916a.C4917a {
        public C4920a(IOException iOException) {
            super(iOException);
        }
    }

    public C4919b(C4916a aVar, long j, int i) {
        this.f13046a = (C4916a) C4965a.m15047a(aVar);
        this.f13047b = j;
        this.f13048c = i;
    }

    /* renamed from: a */
    public void mo25449a(C4942j jVar) throws C4920a {
        if (jVar.f13130e != -1 || jVar.mo25478a(2)) {
            this.f13049d = jVar;
            this.f13054i = 0;
            try {
                mo25451b();
            } catch (IOException e) {
                throw new C4920a(e);
            }
        } else {
            this.f13049d = null;
        }
    }

    /* renamed from: b */
    public final void mo25451b() throws IOException {
        long j;
        long j2 = this.f13049d.f13130e;
        if (j2 == -1) {
            j = this.f13047b;
        } else {
            j = Math.min(j2 - this.f13054i, this.f13047b);
        }
        long j3 = j;
        C4916a aVar = this.f13046a;
        C4942j jVar = this.f13049d;
        this.f13050e = aVar.mo25438a(jVar.f13131f, this.f13054i + jVar.f13128c, j3);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f13050e);
        this.f13052g = fileOutputStream;
        if (this.f13048c > 0) {
            C4982o oVar = this.f13055j;
            if (oVar == null) {
                this.f13055j = new C4982o(this.f13052g, this.f13048c);
            } else {
                oVar.mo25552a(fileOutputStream);
            }
            this.f13051f = this.f13055j;
        } else {
            this.f13051f = fileOutputStream;
        }
        this.f13053h = 0;
    }

    public void close() throws C4920a {
        if (this.f13049d != null) {
            try {
                mo25448a();
            } catch (IOException e) {
                throw new C4920a(e);
            }
        }
    }

    /* renamed from: a */
    public void mo25450a(byte[] bArr, int i, int i2) throws C4920a {
        if (this.f13049d != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f13053h == this.f13047b) {
                        mo25448a();
                        mo25451b();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.f13047b - this.f13053h);
                    this.f13051f.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.f13053h += j;
                    this.f13054i += j;
                } catch (IOException e) {
                    throw new C4920a(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25448a() throws IOException {
        OutputStream outputStream = this.f13051f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f13052g.getFD().sync();
                C4991u.m15138a((Closeable) this.f13051f);
                this.f13051f = null;
                File file = this.f13050e;
                this.f13050e = null;
                this.f13046a.mo25440a(file);
            } catch (Throwable th) {
                C4991u.m15138a((Closeable) this.f13051f);
                this.f13051f = null;
                File file2 = this.f13050e;
                this.f13050e = null;
                file2.delete();
                throw th;
            }
        }
    }
}
