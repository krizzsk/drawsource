package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.q */
public final class C4949q implements C4938g {

    /* renamed from: a */
    public final C4912a0<? super C4949q> f13179a;

    /* renamed from: b */
    public RandomAccessFile f13180b;

    /* renamed from: c */
    public Uri f13181c;

    /* renamed from: d */
    public long f13182d;

    /* renamed from: e */
    public boolean f13183e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.q$a */
    public static class C4950a extends IOException {
        public C4950a(IOException iOException) {
            super(iOException);
        }
    }

    public C4949q(C4912a0<? super C4949q> a0Var) {
        this.f13179a = a0Var;
    }

    /* renamed from: a */
    public long mo24756a(C4942j jVar) throws C4950a {
        try {
            this.f13181c = jVar.f13126a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(jVar.f13126a.getPath(), CampaignEx.JSON_KEY_AD_R);
            this.f13180b = randomAccessFile;
            randomAccessFile.seek(jVar.f13129d);
            long j = jVar.f13130e;
            if (j == -1) {
                j = this.f13180b.length() - jVar.f13129d;
            }
            this.f13182d = j;
            if (j >= 0) {
                this.f13183e = true;
                C4912a0<? super C4949q> a0Var = this.f13179a;
                if (a0Var != null) {
                    ((C4944l) a0Var).mo25484a(this, jVar);
                }
                return this.f13182d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C4950a(e);
        }
    }

    public void close() throws C4950a {
        this.f13181c = null;
        try {
            RandomAccessFile randomAccessFile = this.f13180b;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f13180b = null;
            if (this.f13183e) {
                this.f13183e = false;
                C4912a0<? super C4949q> a0Var = this.f13179a;
                if (a0Var != null) {
                    ((C4944l) a0Var).mo25483a(this);
                }
            }
        } catch (IOException e) {
            throw new C4950a(e);
        } catch (Throwable th) {
            this.f13180b = null;
            if (this.f13183e) {
                this.f13183e = false;
                C4912a0<? super C4949q> a0Var2 = this.f13179a;
                if (a0Var2 != null) {
                    ((C4944l) a0Var2).mo25483a(this);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public int mo24755a(byte[] bArr, int i, int i2) throws C4950a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13182d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f13180b.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                long j2 = (long) read;
                this.f13182d -= j2;
                C4912a0<? super C4949q> a0Var = this.f13179a;
                if (a0Var != null) {
                    C4944l lVar = (C4944l) a0Var;
                    synchronized (lVar) {
                        lVar.f13144d += j2;
                    }
                }
            }
            return read;
        } catch (IOException e) {
            throw new C4950a(e);
        }
    }

    /* renamed from: a */
    public Uri mo24757a() {
        return this.f13181c;
    }
}
