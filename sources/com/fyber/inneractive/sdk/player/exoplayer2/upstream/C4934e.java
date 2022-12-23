package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.e */
public final class C4934e implements C4938g {

    /* renamed from: a */
    public final ContentResolver f13112a;

    /* renamed from: b */
    public final C4912a0<? super C4934e> f13113b;

    /* renamed from: c */
    public Uri f13114c;

    /* renamed from: d */
    public AssetFileDescriptor f13115d;

    /* renamed from: e */
    public InputStream f13116e;

    /* renamed from: f */
    public long f13117f;

    /* renamed from: g */
    public boolean f13118g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.e$a */
    public static class C4935a extends IOException {
        public C4935a(IOException iOException) {
            super(iOException);
        }
    }

    public C4934e(Context context, C4912a0<? super C4934e> a0Var) {
        this.f13112a = context.getContentResolver();
        this.f13113b = a0Var;
    }

    /* renamed from: a */
    public long mo24756a(C4942j jVar) throws C4935a {
        try {
            Uri uri = jVar.f13126a;
            this.f13114c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f13112a.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
            this.f13115d = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f13116e = new FileInputStream(this.f13115d.getFileDescriptor());
                long startOffset = this.f13115d.getStartOffset();
                if (this.f13116e.skip(jVar.f13129d + startOffset) - startOffset == jVar.f13129d) {
                    long j = jVar.f13130e;
                    if (j != -1) {
                        this.f13117f = j;
                    } else {
                        long length = this.f13115d.getLength();
                        this.f13117f = length;
                        if (length == -1) {
                            long available = (long) this.f13116e.available();
                            this.f13117f = available;
                            if (available == 0) {
                                this.f13117f = -1;
                            }
                        }
                    }
                    this.f13118g = true;
                    C4912a0<? super C4934e> a0Var = this.f13113b;
                    if (a0Var != null) {
                        ((C4944l) a0Var).mo25484a(this, jVar);
                    }
                    return this.f13117f;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f13114c);
        } catch (IOException e) {
            throw new C4935a(e);
        }
    }

    public void close() throws C4935a {
        this.f13114c = null;
        try {
            InputStream inputStream = this.f13116e;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f13116e = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f13115d;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f13115d = null;
                if (this.f13118g) {
                    this.f13118g = false;
                    C4912a0<? super C4934e> a0Var = this.f13113b;
                    if (a0Var != null) {
                        ((C4944l) a0Var).mo25483a(this);
                    }
                }
            } catch (IOException e) {
                throw new C4935a(e);
            } catch (Throwable th) {
                this.f13115d = null;
                if (this.f13118g) {
                    this.f13118g = false;
                    C4912a0<? super C4934e> a0Var2 = this.f13113b;
                    if (a0Var2 != null) {
                        ((C4944l) a0Var2).mo25483a(this);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C4935a(e2);
        } catch (Throwable th2) {
            this.f13116e = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f13115d;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f13115d = null;
                if (this.f13118g) {
                    this.f13118g = false;
                    C4912a0<? super C4934e> a0Var3 = this.f13113b;
                    if (a0Var3 != null) {
                        ((C4944l) a0Var3).mo25483a(this);
                    }
                }
                throw th2;
            } catch (IOException e3) {
                throw new C4935a(e3);
            } catch (Throwable th3) {
                this.f13115d = null;
                if (this.f13118g) {
                    this.f13118g = false;
                    C4912a0<? super C4934e> a0Var4 = this.f13113b;
                    if (a0Var4 != null) {
                        ((C4944l) a0Var4).mo25483a(this);
                    }
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    public int mo24755a(byte[] bArr, int i, int i2) throws C4935a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13117f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C4935a(e);
            }
        }
        int read = this.f13116e.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f13117f;
            if (j2 != -1) {
                this.f13117f = j2 - ((long) read);
            }
            C4912a0<? super C4934e> a0Var = this.f13113b;
            if (a0Var != null) {
                C4944l lVar = (C4944l) a0Var;
                synchronized (lVar) {
                    lVar.f13144d += (long) read;
                }
            }
            return read;
        } else if (this.f13117f == -1) {
            return -1;
        } else {
            throw new C4935a(new EOFException());
        }
    }

    /* renamed from: a */
    public Uri mo24757a() {
        return this.f13114c;
    }
}
