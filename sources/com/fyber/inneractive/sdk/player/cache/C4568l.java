package com.fyber.inneractive.sdk.player.cache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.cache.l */
public class C4568l implements Closeable {

    /* renamed from: a */
    public final InputStream f11326a;

    /* renamed from: b */
    public final Charset f11327b;

    /* renamed from: c */
    public byte[] f11328c;

    /* renamed from: d */
    public int f11329d;

    /* renamed from: e */
    public int f11330e;

    /* renamed from: com.fyber.inneractive.sdk.player.cache.l$a */
    public class C4569a extends ByteArrayOutputStream {
        public C4569a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0) {
                int i2 = i - 1;
                if (this.buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(this.buf, 0, i, C4568l.this.f11327b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C4568l(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C4570m.f11332a)) {
            this.f11326a = inputStream;
            this.f11327b = charset;
            this.f11328c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public final void mo24774a() throws IOException {
        InputStream inputStream = this.f11326a;
        byte[] bArr = this.f11328c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f11329d = 0;
            this.f11330e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public String mo24775b() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f11326a) {
            if (this.f11328c != null) {
                if (this.f11329d >= this.f11330e) {
                    mo24774a();
                }
                for (int i3 = this.f11329d; i3 != this.f11330e; i3++) {
                    byte[] bArr2 = this.f11328c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f11329d;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f11327b.name());
                                this.f11329d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f11327b.name());
                        this.f11329d = i3 + 1;
                        return str2;
                    }
                }
                C4569a aVar = new C4569a((this.f11330e - this.f11329d) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f11328c;
                    int i5 = this.f11329d;
                    aVar.write(bArr3, i5, this.f11330e - i5);
                    this.f11330e = -1;
                    mo24774a();
                    i = this.f11329d;
                    while (true) {
                        if (i != this.f11330e) {
                            bArr = this.f11328c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f11329d;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f11329d = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() throws IOException {
        synchronized (this.f11326a) {
            if (this.f11328c != null) {
                this.f11328c = null;
                this.f11326a.close();
            }
        }
    }
}
