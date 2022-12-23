package com.tapjoy.internal;

import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: com.tapjoy.internal.em */
public final class C11416em {

    /* renamed from: a */
    final C11647jd f27234a;

    /* renamed from: b */
    public C11395ei f27235b;

    /* renamed from: c */
    private long f27236c = 0;

    /* renamed from: d */
    private long f27237d = Long.MAX_VALUE;

    /* renamed from: e */
    private int f27238e;

    /* renamed from: f */
    private int f27239f = 2;

    /* renamed from: g */
    private int f27240g = -1;

    /* renamed from: h */
    private long f27241h = -1;

    public C11416em(C11647jd jdVar) {
        this.f27234a = jdVar;
    }

    /* renamed from: a */
    public final long mo69858a() {
        if (this.f27239f == 2) {
            int i = this.f27238e + 1;
            this.f27238e = i;
            if (i <= 65) {
                long j = this.f27241h;
                this.f27241h = -1;
                this.f27239f = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    /* renamed from: a */
    public final void mo69859a(long j) {
        if (this.f27239f == 6) {
            int i = this.f27238e - 1;
            this.f27238e = i;
            if (i < 0 || this.f27241h != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.f27236c == this.f27237d || i == 0) {
                this.f27237d = j;
            } else {
                throw new IOException("Expected to end at " + this.f27237d + " but was " + this.f27236c);
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }

    /* renamed from: b */
    public final int mo69860b() {
        int i = this.f27239f;
        if (i == 7) {
            this.f27239f = 2;
            return this.f27240g;
        } else if (i == 6) {
            while (this.f27236c < this.f27237d && !this.f27234a.mo70255b()) {
                int h = m31206h();
                if (h != 0) {
                    int i2 = h >> 3;
                    this.f27240g = i2;
                    int i3 = h & 7;
                    if (i3 == 0) {
                        this.f27235b = C11395ei.VARINT;
                        this.f27239f = 0;
                        return this.f27240g;
                    } else if (i3 == 1) {
                        this.f27235b = C11395ei.FIXED64;
                        this.f27239f = 1;
                        return this.f27240g;
                    } else if (i3 == 2) {
                        this.f27235b = C11395ei.LENGTH_DELIMITED;
                        this.f27239f = 2;
                        int h2 = m31206h();
                        if (h2 < 0) {
                            throw new ProtocolException("Negative length: ".concat(String.valueOf(h2)));
                        } else if (this.f27241h == -1) {
                            long j = this.f27237d;
                            this.f27241h = j;
                            long j2 = this.f27236c + ((long) h2);
                            this.f27237d = j2;
                            if (j2 <= j) {
                                return this.f27240g;
                            }
                            throw new EOFException();
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (i3 == 3) {
                        m31204a(i2);
                    } else if (i3 == 4) {
                        throw new ProtocolException("Unexpected end group");
                    } else if (i3 == 5) {
                        this.f27235b = C11395ei.FIXED32;
                        this.f27239f = 5;
                        return this.f27240g;
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i3)));
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    /* renamed from: a */
    private void m31204a(int i) {
        while (this.f27236c < this.f27237d && !this.f27234a.mo70255b()) {
            int h = m31206h();
            if (h != 0) {
                int i2 = h >> 3;
                int i3 = h & 7;
                if (i3 == 0) {
                    this.f27239f = 0;
                    mo69862d();
                } else if (i3 == 1) {
                    this.f27239f = 1;
                    mo69864f();
                } else if (i3 == 2) {
                    long h2 = (long) m31206h();
                    this.f27236c += h2;
                    this.f27234a.mo70263d(h2);
                } else if (i3 == 3) {
                    m31204a(i2);
                } else if (i3 != 4) {
                    if (i3 == 5) {
                        this.f27239f = 5;
                        mo69863e();
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i3)));
                    }
                } else if (i2 != i) {
                    throw new ProtocolException("Unexpected end group");
                } else {
                    return;
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public final int mo69861c() {
        int i = this.f27239f;
        if (i == 0 || i == 2) {
            int h = m31206h();
            m31205b(0);
            return h;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f27239f);
    }

    /* renamed from: h */
    private int m31206h() {
        int i;
        this.f27236c++;
        byte d = this.f27234a.mo70261d();
        if (d >= 0) {
            return d;
        }
        byte b = d & Byte.MAX_VALUE;
        this.f27236c++;
        byte d2 = this.f27234a.mo70261d();
        if (d2 >= 0) {
            i = d2 << 7;
        } else {
            b |= (d2 & Byte.MAX_VALUE) << 7;
            this.f27236c++;
            byte d3 = this.f27234a.mo70261d();
            if (d3 >= 0) {
                i = d3 << Ascii.f18306SO;
            } else {
                b |= (d3 & Byte.MAX_VALUE) << Ascii.f18306SO;
                this.f27236c++;
                byte d4 = this.f27234a.mo70261d();
                if (d4 >= 0) {
                    i = d4 << Ascii.NAK;
                } else {
                    byte b2 = b | ((d4 & Byte.MAX_VALUE) << Ascii.NAK);
                    this.f27236c++;
                    byte d5 = this.f27234a.mo70261d();
                    byte b3 = b2 | (d5 << Ascii.f18299FS);
                    if (d5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        this.f27236c++;
                        if (this.f27234a.mo70261d() >= 0) {
                            return b3;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
            }
        }
        return b | i;
    }

    /* renamed from: d */
    public final long mo69862d() {
        int i = this.f27239f;
        if (i == 0 || i == 2) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                this.f27236c++;
                byte d = this.f27234a.mo70261d();
                j |= ((long) (d & Byte.MAX_VALUE)) << i2;
                if ((d & 128) == 0) {
                    m31205b(0);
                    return j;
                }
            }
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f27239f);
    }

    /* renamed from: e */
    public final int mo69863e() {
        int i = this.f27239f;
        if (i == 5 || i == 2) {
            this.f27234a.mo70248a(4);
            this.f27236c += 4;
            int f = this.f27234a.mo70268f();
            m31205b(5);
            return f;
        }
        throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f27239f);
    }

    /* renamed from: f */
    public final long mo69864f() {
        int i = this.f27239f;
        if (i == 1 || i == 2) {
            this.f27234a.mo70248a(8);
            this.f27236c += 8;
            long g = this.f27234a.mo70271g();
            m31205b(1);
            return g;
        }
        throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f27239f);
    }

    /* renamed from: b */
    private void m31205b(int i) {
        if (this.f27239f == i) {
            this.f27239f = 6;
            return;
        }
        long j = this.f27236c;
        long j2 = this.f27237d;
        if (j > j2) {
            throw new IOException("Expected to end at " + this.f27237d + " but was " + this.f27236c);
        } else if (j == j2) {
            this.f27237d = this.f27241h;
            this.f27241h = -1;
            this.f27239f = 6;
        } else {
            this.f27239f = 7;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final long mo69865g() {
        if (this.f27239f == 2) {
            long j = this.f27237d - this.f27236c;
            this.f27234a.mo70248a(j);
            this.f27239f = 6;
            this.f27236c = this.f27237d;
            this.f27237d = this.f27241h;
            this.f27241h = -1;
            return j;
        }
        throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f27239f);
    }
}
