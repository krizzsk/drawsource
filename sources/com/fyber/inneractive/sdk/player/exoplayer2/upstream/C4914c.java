package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.c */
public final class C4914c implements C4938g {

    /* renamed from: a */
    public final AssetManager f13040a;

    /* renamed from: b */
    public final C4912a0<? super C4914c> f13041b;

    /* renamed from: c */
    public Uri f13042c;

    /* renamed from: d */
    public InputStream f13043d;

    /* renamed from: e */
    public long f13044e;

    /* renamed from: f */
    public boolean f13045f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.c$a */
    public static final class C4915a extends IOException {
        public C4915a(IOException iOException) {
            super(iOException);
        }
    }

    public C4914c(Context context, C4912a0<? super C4914c> a0Var) {
        this.f13040a = context.getAssets();
        this.f13041b = a0Var;
    }

    /* renamed from: a */
    public long mo24756a(C4942j jVar) throws C4915a {
        try {
            Uri uri = jVar.f13126a;
            this.f13042c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f13040a.open(path, 1);
            this.f13043d = open;
            if (open.skip(jVar.f13129d) >= jVar.f13129d) {
                long j = jVar.f13130e;
                if (j != -1) {
                    this.f13044e = j;
                } else {
                    long available = (long) this.f13043d.available();
                    this.f13044e = available;
                    if (available == 2147483647L) {
                        this.f13044e = -1;
                    }
                }
                this.f13045f = true;
                C4912a0<? super C4914c> a0Var = this.f13041b;
                if (a0Var != null) {
                    ((C4944l) a0Var).mo25484a(this, jVar);
                }
                return this.f13044e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C4915a(e);
        }
    }

    public void close() throws C4915a {
        this.f13042c = null;
        try {
            InputStream inputStream = this.f13043d;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f13043d = null;
            if (this.f13045f) {
                this.f13045f = false;
                C4912a0<? super C4914c> a0Var = this.f13041b;
                if (a0Var != null) {
                    ((C4944l) a0Var).mo25483a(this);
                }
            }
        } catch (IOException e) {
            throw new C4915a(e);
        } catch (Throwable th) {
            this.f13043d = null;
            if (this.f13045f) {
                this.f13045f = false;
                C4912a0<? super C4914c> a0Var2 = this.f13041b;
                if (a0Var2 != null) {
                    ((C4944l) a0Var2).mo25483a(this);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public int mo24755a(byte[] bArr, int i, int i2) throws C4915a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13044e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C4915a(e);
            }
        }
        int read = this.f13043d.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f13044e;
            if (j2 != -1) {
                this.f13044e = j2 - ((long) read);
            }
            C4912a0<? super C4914c> a0Var = this.f13041b;
            if (a0Var != null) {
                C4944l lVar = (C4944l) a0Var;
                synchronized (lVar) {
                    lVar.f13144d += (long) read;
                }
            }
            return read;
        } else if (this.f13044e == -1) {
            return -1;
        } else {
            throw new C4915a(new EOFException());
        }
    }

    /* renamed from: a */
    public Uri mo24757a() {
        return this.f13042c;
    }
}
