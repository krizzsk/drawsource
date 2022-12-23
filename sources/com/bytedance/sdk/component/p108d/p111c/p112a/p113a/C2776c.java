package com.bytedance.sdk.component.p108d.p111c.p112a.p113a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.d.c.a.a.c */
/* compiled from: StrictLineReader */
class C2776c implements Closeable {

    /* renamed from: a */
    private final InputStream f6201a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Charset f6202b;

    /* renamed from: c */
    private byte[] f6203c;

    /* renamed from: d */
    private int f6204d;

    /* renamed from: e */
    private int f6205e;

    public C2776c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C2776c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C2778d.f6207a)) {
            this.f6201a = inputStream;
            this.f6202b = charset;
            this.f6203c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public void close() throws IOException {
        synchronized (this.f6201a) {
            if (this.f6203c != null) {
                this.f6203c = null;
                this.f6201a.close();
            }
        }
    }

    /* renamed from: a */
    public String mo17575a() throws IOException {
        int i;
        int i2;
        synchronized (this.f6201a) {
            if (this.f6203c != null) {
                if (this.f6204d >= this.f6205e) {
                    m7608c();
                }
                for (int i3 = this.f6204d; i3 != this.f6205e; i3++) {
                    if (this.f6203c[i3] == 10) {
                        if (i3 != this.f6204d) {
                            i2 = i3 - 1;
                            if (this.f6203c[i2] == 13) {
                                String str = new String(this.f6203c, this.f6204d, i2 - this.f6204d, this.f6202b.name());
                                this.f6204d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f6203c, this.f6204d, i2 - this.f6204d, this.f6202b.name());
                        this.f6204d = i3 + 1;
                        return str2;
                    }
                }
                C27771 r1 = new ByteArrayOutputStream((this.f6205e - this.f6204d) + 80) {
                    public String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, C2776c.this.f6202b.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f6203c, this.f6204d, this.f6205e - this.f6204d);
                    this.f6205e = -1;
                    m7608c();
                    i = this.f6204d;
                    while (true) {
                        if (i != this.f6205e) {
                            if (this.f6203c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f6204d) {
                    r1.write(this.f6203c, this.f6204d, i - this.f6204d);
                }
                this.f6204d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    /* renamed from: b */
    public boolean mo17576b() {
        return this.f6205e == -1;
    }

    /* renamed from: c */
    private void m7608c() throws IOException {
        InputStream inputStream = this.f6201a;
        byte[] bArr = this.f6203c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f6204d = 0;
            this.f6205e = read;
            return;
        }
        throw new EOFException();
    }
}
