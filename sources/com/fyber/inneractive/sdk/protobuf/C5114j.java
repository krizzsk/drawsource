package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5093i;
import com.fyber.inneractive.sdk.protobuf.C5149q0;
import com.fyber.inneractive.sdk.protobuf.C5154r1;
import com.fyber.inneractive.sdk.protobuf.C5161s1;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.protobuf.j */
public abstract class C5114j {

    /* renamed from: a */
    public int f13594a;

    /* renamed from: b */
    public int f13595b;

    /* renamed from: c */
    public int f13596c;

    /* renamed from: d */
    public C5122k f13597d;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.j$b */
    public static final class C5116b extends C5114j {

        /* renamed from: e */
        public final byte[] f13598e;

        /* renamed from: f */
        public final boolean f13599f;

        /* renamed from: g */
        public int f13600g;

        /* renamed from: h */
        public int f13601h;

        /* renamed from: i */
        public int f13602i;

        /* renamed from: j */
        public int f13603j;

        /* renamed from: k */
        public int f13604k;

        /* renamed from: l */
        public int f13605l = Integer.MAX_VALUE;

        public C5116b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f13598e = bArr;
            this.f13600g = i2 + i;
            this.f13602i = i;
            this.f13603j = i;
            this.f13599f = z;
        }

        /* renamed from: A */
        public long mo25998A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = mo26001w();
                j |= ((long) (w & Byte.MAX_VALUE)) << i;
                if ((w & 128) == 0) {
                    return j;
                }
            }
            throw C5061a0.m15275e();
        }

        /* renamed from: B */
        public final void mo25999B() {
            int i = this.f13600g + this.f13601h;
            this.f13600g = i;
            int i2 = i - this.f13603j;
            int i3 = this.f13605l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f13601h = i4;
                this.f13600g = i - i4;
                return;
            }
            this.f13601h = 0;
        }

        /* renamed from: a */
        public void mo25971a(int i) throws C5061a0 {
            if (this.f13604k != i) {
                throw C5061a0.m15271a();
            }
        }

        /* renamed from: b */
        public int mo25974b() {
            return this.f13602i - this.f13603j;
        }

        /* renamed from: c */
        public void mo25975c(int i) {
            this.f13605l = i;
            mo25999B();
        }

        /* renamed from: d */
        public boolean mo25978d() throws IOException {
            return mo26004z() != 0;
        }

        /* renamed from: e */
        public boolean mo25980e(int i) throws IOException {
            int t;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.f13600g - this.f13602i >= 10) {
                    while (i4 < 10) {
                        byte[] bArr = this.f13598e;
                        int i5 = this.f13602i;
                        this.f13602i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw C5061a0.m15275e();
                }
                while (i4 < 10) {
                    if (mo26001w() < 0) {
                        i4++;
                    }
                }
                throw C5061a0.m15275e();
                return true;
            } else if (i3 == 1) {
                mo26000f(8);
                return true;
            } else if (i3 == 2) {
                mo26000f(mo25988m());
                return true;
            } else if (i3 == 3) {
                do {
                    t = mo25995t();
                    if (t == 0 || !mo25980e(t)) {
                        mo25971a(C5169t1.m16117a(i >>> 3, 4));
                    }
                    t = mo25995t();
                    break;
                } while (!mo25980e(t));
                mo25971a(C5169t1.m16117a(i >>> 3, 4));
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    mo26000f(4);
                    return true;
                }
                throw C5061a0.m15274d();
            }
        }

        /* renamed from: f */
        public double mo25981f() throws IOException {
            return Double.longBitsToDouble(mo26003y());
        }

        /* renamed from: g */
        public int mo25982g() throws IOException {
            return mo25988m();
        }

        /* renamed from: h */
        public int mo25983h() throws IOException {
            return mo26002x();
        }

        /* renamed from: i */
        public long mo25984i() throws IOException {
            return mo26003y();
        }

        /* renamed from: j */
        public float mo25985j() throws IOException {
            return Float.intBitsToFloat(mo26002x());
        }

        /* renamed from: k */
        public int mo25986k() throws IOException {
            return mo25988m();
        }

        /* renamed from: l */
        public long mo25987l() throws IOException {
            return mo26004z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo25988m() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f13602i
                int r1 = r5.f13600g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f13598e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f13602i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo25998A()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f13602i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5114j.C5116b.mo25988m():int");
        }

        /* renamed from: n */
        public int mo25989n() throws IOException {
            return mo26002x();
        }

        /* renamed from: o */
        public long mo25990o() throws IOException {
            return mo26003y();
        }

        /* renamed from: p */
        public int mo25991p() throws IOException {
            return C5114j.m15569b(mo25988m());
        }

        /* renamed from: q */
        public long mo25992q() throws IOException {
            return C5114j.m15565a(mo26004z());
        }

        /* renamed from: r */
        public String mo25993r() throws IOException {
            int m = mo25988m();
            if (m > 0) {
                int i = this.f13600g;
                int i2 = this.f13602i;
                if (m <= i - i2) {
                    String str = new String(this.f13598e, i2, m, C5194z.f13762a);
                    this.f13602i += m;
                    return str;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m < 0) {
                throw C5061a0.m15276f();
            }
            throw C5061a0.m15279i();
        }

        /* renamed from: s */
        public String mo25994s() throws IOException {
            int m = mo25988m();
            if (m > 0) {
                int i = this.f13600g;
                int i2 = this.f13602i;
                if (m <= i - i2) {
                    String a = C5161s1.f13672a.mo26170a(this.f13598e, i2, m);
                    this.f13602i += m;
                    return a;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m <= 0) {
                throw C5061a0.m15276f();
            }
            throw C5061a0.m15279i();
        }

        /* renamed from: t */
        public int mo25995t() throws IOException {
            if (mo25976c()) {
                this.f13604k = 0;
                return 0;
            }
            int m = mo25988m();
            this.f13604k = m;
            int i = C5169t1.f13694a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw C5061a0.m15272b();
        }

        /* renamed from: u */
        public int mo25996u() throws IOException {
            return mo25988m();
        }

        /* renamed from: v */
        public long mo25997v() throws IOException {
            return mo26004z();
        }

        /* renamed from: w */
        public byte mo26001w() throws IOException {
            int i = this.f13602i;
            if (i != this.f13600g) {
                byte[] bArr = this.f13598e;
                this.f13602i = i + 1;
                return bArr[i];
            }
            throw C5061a0.m15279i();
        }

        /* renamed from: x */
        public int mo26002x() throws IOException {
            int i = this.f13602i;
            if (this.f13600g - i >= 4) {
                byte[] bArr = this.f13598e;
                this.f13602i = i + 4;
                return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
            }
            throw C5061a0.m15279i();
        }

        /* renamed from: y */
        public long mo26003y() throws IOException {
            int i = this.f13602i;
            if (this.f13600g - i >= 8) {
                byte[] bArr = this.f13598e;
                this.f13602i = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw C5061a0.m15279i();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo26004z() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f13602i
                int r1 = r11.f13600g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f13598e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f13602i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo25998A()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f13602i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5114j.C5116b.mo26004z():long");
        }

        /* renamed from: d */
        public int mo25977d(int i) throws C5061a0 {
            if (i >= 0) {
                int b = i + mo25974b();
                int i2 = this.f13605l;
                if (b <= i2) {
                    this.f13605l = b;
                    mo25999B();
                    return i2;
                }
                throw C5061a0.m15279i();
            }
            throw C5061a0.m15276f();
        }

        /* renamed from: f */
        public void mo26000f(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f13600g;
                int i3 = this.f13602i;
                if (i <= i2 - i3) {
                    this.f13602i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw C5061a0.m15276f();
            }
            throw C5061a0.m15279i();
        }

        /* renamed from: a */
        public void mo25972a(int i, C5149q0.C5150a aVar, C5147q qVar) throws IOException {
            int i2 = this.f13594a;
            if (i2 < this.f13595b) {
                this.f13594a = i2 + 1;
                ((GeneratedMessageLite.C5050a) aVar).mo25733a((C5114j) this, qVar);
                mo25971a(C5169t1.m16117a(i, 4));
                this.f13594a--;
                return;
            }
            throw C5061a0.m15278h();
        }

        /* renamed from: c */
        public boolean mo25976c() throws IOException {
            return this.f13602i == this.f13600g;
        }

        /* renamed from: a */
        public void mo25973a(C5149q0.C5150a aVar, C5147q qVar) throws IOException {
            int m = mo25988m();
            if (this.f13594a < this.f13595b) {
                int d = mo25977d(m);
                this.f13594a++;
                ((GeneratedMessageLite.C5050a) aVar).mo25733a((C5114j) this, qVar);
                mo25971a(0);
                this.f13594a--;
                this.f13605l = d;
                mo25999B();
                return;
            }
            throw C5061a0.m15278h();
        }

        /* renamed from: a */
        public int mo25970a() {
            int i = this.f13605l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo25974b();
        }

        /* renamed from: e */
        public C5093i mo25979e() throws IOException {
            byte[] bArr;
            int m = mo25988m();
            if (m > 0) {
                int i = this.f13600g;
                int i2 = this.f13602i;
                if (m <= i - i2) {
                    C5093i a = C5093i.m15515a(this.f13598e, i2, m);
                    this.f13602i += m;
                    return a;
                }
            }
            if (m == 0) {
                return C5093i.f13565b;
            }
            if (m > 0) {
                int i3 = this.f13600g;
                int i4 = this.f13602i;
                if (m <= i3 - i4) {
                    int i5 = m + i4;
                    this.f13602i = i5;
                    bArr = Arrays.copyOfRange(this.f13598e, i4, i5);
                    C5093i iVar = C5093i.f13565b;
                    return new C5093i.C5101h(bArr);
                }
            }
            if (m > 0) {
                throw C5061a0.m15279i();
            } else if (m == 0) {
                bArr = C5194z.f13763b;
                C5093i iVar2 = C5093i.f13565b;
                return new C5093i.C5101h(bArr);
            } else {
                throw C5061a0.m15276f();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.j$c */
    public static final class C5117c extends C5114j {

        /* renamed from: e */
        public final InputStream f13606e;

        /* renamed from: f */
        public final byte[] f13607f;

        /* renamed from: g */
        public int f13608g;

        /* renamed from: h */
        public int f13609h;

        /* renamed from: i */
        public int f13610i;

        /* renamed from: j */
        public int f13611j;

        /* renamed from: k */
        public int f13612k;

        /* renamed from: l */
        public int f13613l = Integer.MAX_VALUE;

        public C5117c(InputStream inputStream, int i) {
            super();
            C5194z.m16182a(inputStream, "input");
            this.f13606e = inputStream;
            this.f13607f = new byte[i];
            this.f13608g = 0;
            this.f13610i = 0;
            this.f13612k = 0;
        }

        /* renamed from: A */
        public long mo26005A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = mo26013w();
                j |= ((long) (w & Byte.MAX_VALUE)) << i;
                if ((w & 128) == 0) {
                    return j;
                }
            }
            throw C5061a0.m15275e();
        }

        /* renamed from: B */
        public final void mo26006B() {
            int i = this.f13608g + this.f13609h;
            this.f13608g = i;
            int i2 = this.f13612k + i;
            int i3 = this.f13613l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f13609h = i4;
                this.f13608g = i - i4;
                return;
            }
            this.f13609h = 0;
        }

        /* renamed from: a */
        public void mo25971a(int i) throws C5061a0 {
            if (this.f13611j != i) {
                throw C5061a0.m15271a();
            }
        }

        /* renamed from: b */
        public int mo25974b() {
            return this.f13612k + this.f13610i;
        }

        /* renamed from: c */
        public void mo25975c(int i) {
            this.f13613l = i;
            mo26006B();
        }

        /* renamed from: d */
        public boolean mo25978d() throws IOException {
            return mo26016z() != 0;
        }

        /* renamed from: e */
        public boolean mo25980e(int i) throws IOException {
            int t;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.f13608g - this.f13610i >= 10) {
                    while (i4 < 10) {
                        byte[] bArr = this.f13607f;
                        int i5 = this.f13610i;
                        this.f13610i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw C5061a0.m15275e();
                }
                while (i4 < 10) {
                    if (mo26013w() < 0) {
                        i4++;
                    }
                }
                throw C5061a0.m15275e();
                return true;
            } else if (i3 == 1) {
                mo26011i(8);
                return true;
            } else if (i3 == 2) {
                mo26011i(mo25988m());
                return true;
            } else if (i3 == 3) {
                do {
                    t = mo25995t();
                    if (t == 0 || !mo25980e(t)) {
                        mo25971a(C5169t1.m16117a(i >>> 3, 4));
                    }
                    t = mo25995t();
                    break;
                } while (!mo25980e(t));
                mo25971a(C5169t1.m16117a(i >>> 3, 4));
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    mo26011i(4);
                    return true;
                }
                throw C5061a0.m15274d();
            }
        }

        /* renamed from: f */
        public double mo25981f() throws IOException {
            return Double.longBitsToDouble(mo26015y());
        }

        /* renamed from: g */
        public int mo25982g() throws IOException {
            return mo25988m();
        }

        /* renamed from: h */
        public int mo25983h() throws IOException {
            return mo26014x();
        }

        /* renamed from: i */
        public long mo25984i() throws IOException {
            return mo26015y();
        }

        /* renamed from: j */
        public float mo25985j() throws IOException {
            return Float.intBitsToFloat(mo26014x());
        }

        /* renamed from: k */
        public int mo25986k() throws IOException {
            return mo25988m();
        }

        /* renamed from: l */
        public long mo25987l() throws IOException {
            return mo26016z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo25988m() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f13610i
                int r1 = r5.f13608g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f13607f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f13610i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo26005A()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f13610i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5114j.C5117c.mo25988m():int");
        }

        /* renamed from: n */
        public int mo25989n() throws IOException {
            return mo26014x();
        }

        /* renamed from: o */
        public long mo25990o() throws IOException {
            return mo26015y();
        }

        /* renamed from: p */
        public int mo25991p() throws IOException {
            return C5114j.m15569b(mo25988m());
        }

        /* renamed from: q */
        public long mo25992q() throws IOException {
            return C5114j.m15565a(mo26016z());
        }

        /* renamed from: r */
        public String mo25993r() throws IOException {
            int m = mo25988m();
            if (m > 0) {
                int i = this.f13608g;
                int i2 = this.f13610i;
                if (m <= i - i2) {
                    String str = new String(this.f13607f, i2, m, C5194z.f13762a);
                    this.f13610i += m;
                    return str;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m > this.f13608g) {
                return new String(mo26007a(m, false), C5194z.f13762a);
            }
            mo26010h(m);
            String str2 = new String(this.f13607f, this.f13610i, m, C5194z.f13762a);
            this.f13610i += m;
            return str2;
        }

        /* renamed from: s */
        public String mo25994s() throws IOException {
            byte[] bArr;
            int m = mo25988m();
            int i = this.f13610i;
            int i2 = this.f13608g;
            if (m <= i2 - i && m > 0) {
                bArr = this.f13607f;
                this.f13610i = i + m;
            } else if (m == 0) {
                return "";
            } else {
                if (m <= i2) {
                    mo26010h(m);
                    bArr = this.f13607f;
                    this.f13610i = m + 0;
                } else {
                    bArr = mo26007a(m, false);
                }
                i = 0;
            }
            return C5161s1.f13672a.mo26170a(bArr, i, m);
        }

        /* renamed from: t */
        public int mo25995t() throws IOException {
            if (mo25976c()) {
                this.f13611j = 0;
                return 0;
            }
            int m = mo25988m();
            this.f13611j = m;
            int i = C5169t1.f13694a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw C5061a0.m15272b();
        }

        /* renamed from: u */
        public int mo25996u() throws IOException {
            return mo25988m();
        }

        /* renamed from: v */
        public long mo25997v() throws IOException {
            return mo26016z();
        }

        /* renamed from: w */
        public byte mo26013w() throws IOException {
            if (this.f13610i == this.f13608g) {
                mo26010h(1);
            }
            byte[] bArr = this.f13607f;
            int i = this.f13610i;
            this.f13610i = i + 1;
            return bArr[i];
        }

        /* renamed from: x */
        public int mo26014x() throws IOException {
            int i = this.f13610i;
            if (this.f13608g - i < 4) {
                mo26010h(4);
                i = this.f13610i;
            }
            byte[] bArr = this.f13607f;
            this.f13610i = i + 4;
            return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
        }

        /* renamed from: y */
        public long mo26015y() throws IOException {
            int i = this.f13610i;
            if (this.f13608g - i < 8) {
                mo26010h(8);
                i = this.f13610i;
            }
            byte[] bArr = this.f13607f;
            this.f13610i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo26016z() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f13610i
                int r1 = r11.f13608g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f13607f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f13610i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo26005A()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f13610i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5114j.C5117c.mo26016z():long");
        }

        /* renamed from: d */
        public int mo25977d(int i) throws C5061a0 {
            if (i >= 0) {
                int i2 = i + this.f13612k + this.f13610i;
                int i3 = this.f13613l;
                if (i2 <= i3) {
                    this.f13613l = i2;
                    mo26006B();
                    return i3;
                }
                throw C5061a0.m15279i();
            }
            throw C5061a0.m15276f();
        }

        /* renamed from: f */
        public final byte[] mo26008f(int i) throws IOException {
            if (i == 0) {
                return C5194z.f13763b;
            }
            if (i >= 0) {
                int i2 = this.f13612k;
                int i3 = this.f13610i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f13596c <= 0) {
                    int i5 = this.f13613l;
                    if (i4 <= i5) {
                        int i6 = this.f13608g - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f13606e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f13607f, this.f13610i, bArr, 0, i6);
                        this.f13612k += this.f13608g;
                        this.f13610i = 0;
                        this.f13608g = 0;
                        while (i6 < i) {
                            int read = this.f13606e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f13612k += read;
                                i6 += read;
                            } else {
                                throw C5061a0.m15279i();
                            }
                        }
                        return bArr;
                    }
                    mo26011i((i5 - i2) - i3);
                    throw C5061a0.m15279i();
                }
                throw new C5061a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C5061a0.m15276f();
        }

        /* renamed from: g */
        public final List<byte[]> mo26009g(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f13606e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f13612k += read;
                        i2 += read;
                    } else {
                        throw C5061a0.m15279i();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: h */
        public final void mo26010h(int i) throws IOException {
            if (mo26012j(i)) {
                return;
            }
            if (i > (this.f13596c - this.f13612k) - this.f13610i) {
                throw new C5061a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C5061a0.m15279i();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
            throw new java.lang.IllegalStateException(r7.f13606e.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26011i(int r8) throws java.io.IOException {
            /*
                r7 = this;
                int r0 = r7.f13608g
                int r1 = r7.f13610i
                int r0 = r0 - r1
                if (r8 > r0) goto L_0x000e
                if (r8 < 0) goto L_0x000e
                int r1 = r1 + r8
                r7.f13610i = r1
                goto L_0x0090
            L_0x000e:
                if (r8 < 0) goto L_0x009b
                int r2 = r7.f13612k
                int r3 = r2 + r1
                int r4 = r3 + r8
                int r5 = r7.f13613l
                if (r4 > r5) goto L_0x0091
                r7.f13612k = r3
                r1 = 0
                r7.f13608g = r1
                r7.f13610i = r1
            L_0x0021:
                if (r0 >= r8) goto L_0x006b
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f13606e     // Catch:{ all -> 0x0061 }
                long r3 = (long) r1     // Catch:{ all -> 0x0061 }
                long r1 = r2.skip(r3)     // Catch:{ all -> 0x0061 }
                r5 = 0
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x003c
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L_0x003c
                if (r5 != 0) goto L_0x0039
                goto L_0x006b
            L_0x0039:
                int r1 = (int) r1     // Catch:{ all -> 0x0061 }
                int r0 = r0 + r1
                goto L_0x0021
            L_0x003c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
                r3.<init>()     // Catch:{ all -> 0x0061 }
                java.io.InputStream r4 = r7.f13606e     // Catch:{ all -> 0x0061 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0061 }
                r3.append(r4)     // Catch:{ all -> 0x0061 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0061 }
                r3.append(r1)     // Catch:{ all -> 0x0061 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0061 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0061 }
                r8.<init>(r1)     // Catch:{ all -> 0x0061 }
                throw r8     // Catch:{ all -> 0x0061 }
            L_0x0061:
                r8 = move-exception
                int r1 = r7.f13612k
                int r1 = r1 + r0
                r7.f13612k = r1
                r7.mo26006B()
                throw r8
            L_0x006b:
                int r1 = r7.f13612k
                int r1 = r1 + r0
                r7.f13612k = r1
                r7.mo26006B()
                if (r0 >= r8) goto L_0x0090
                int r0 = r7.f13608g
                int r1 = r7.f13610i
                int r1 = r0 - r1
                r7.f13610i = r0
                r0 = 1
                r7.mo26010h(r0)
            L_0x0081:
                int r2 = r8 - r1
                int r3 = r7.f13608g
                if (r2 <= r3) goto L_0x008e
                int r1 = r1 + r3
                r7.f13610i = r3
                r7.mo26010h(r0)
                goto L_0x0081
            L_0x008e:
                r7.f13610i = r2
            L_0x0090:
                return
            L_0x0091:
                int r5 = r5 - r2
                int r5 = r5 - r1
                r7.mo26011i(r5)
                com.fyber.inneractive.sdk.protobuf.a0 r8 = com.fyber.inneractive.sdk.protobuf.C5061a0.m15279i()
                throw r8
            L_0x009b:
                com.fyber.inneractive.sdk.protobuf.a0 r8 = com.fyber.inneractive.sdk.protobuf.C5061a0.m15276f()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5114j.C5117c.mo26011i(int):void");
        }

        /* renamed from: j */
        public final boolean mo26012j(int i) throws IOException {
            int i2 = this.f13610i;
            int i3 = i2 + i;
            int i4 = this.f13608g;
            if (i3 > i4) {
                int i5 = this.f13596c;
                int i6 = this.f13612k;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f13613l) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f13607f;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f13612k += i2;
                    this.f13608g -= i2;
                    this.f13610i = 0;
                }
                InputStream inputStream = this.f13606e;
                byte[] bArr2 = this.f13607f;
                int i7 = this.f13608g;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f13596c - this.f13612k) - i7));
                if (read == 0 || read < -1 || read > this.f13607f.length) {
                    throw new IllegalStateException(this.f13606e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f13608g += read;
                    mo26006B();
                    if (this.f13608g >= i) {
                        return true;
                    }
                    return mo26012j(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: a */
        public void mo25972a(int i, C5149q0.C5150a aVar, C5147q qVar) throws IOException {
            int i2 = this.f13594a;
            if (i2 < this.f13595b) {
                this.f13594a = i2 + 1;
                ((GeneratedMessageLite.C5050a) aVar).mo25733a((C5114j) this, qVar);
                mo25971a(C5169t1.m16117a(i, 4));
                this.f13594a--;
                return;
            }
            throw C5061a0.m15278h();
        }

        /* renamed from: c */
        public boolean mo25976c() throws IOException {
            return this.f13610i == this.f13608g && !mo26012j(1);
        }

        /* renamed from: a */
        public void mo25973a(C5149q0.C5150a aVar, C5147q qVar) throws IOException {
            int m = mo25988m();
            if (this.f13594a < this.f13595b) {
                int d = mo25977d(m);
                this.f13594a++;
                ((GeneratedMessageLite.C5050a) aVar).mo25733a((C5114j) this, qVar);
                mo25971a(0);
                this.f13594a--;
                this.f13613l = d;
                mo26006B();
                return;
            }
            throw C5061a0.m15278h();
        }

        /* renamed from: a */
        public int mo25970a() {
            int i = this.f13613l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f13612k + this.f13610i);
        }

        /* renamed from: a */
        public final byte[] mo26007a(int i, boolean z) throws IOException {
            byte[] f = mo26008f(i);
            if (f != null) {
                return z ? (byte[]) f.clone() : f;
            }
            int i2 = this.f13610i;
            int i3 = this.f13608g;
            int i4 = i3 - i2;
            this.f13612k += i3;
            this.f13610i = 0;
            this.f13608g = 0;
            List<byte[]> g = mo26009g(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f13607f, i2, bArr, 0, i4);
            Iterator it = ((ArrayList) g).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: e */
        public C5093i mo25979e() throws IOException {
            int m = mo25988m();
            int i = this.f13608g;
            int i2 = this.f13610i;
            if (m <= i - i2 && m > 0) {
                C5093i a = C5093i.m15515a(this.f13607f, i2, m);
                this.f13610i += m;
                return a;
            } else if (m == 0) {
                return C5093i.f13565b;
            } else {
                byte[] f = mo26008f(m);
                if (f != null) {
                    C5093i iVar = C5093i.f13565b;
                    return C5093i.m15515a(f, 0, f.length);
                }
                int i3 = this.f13610i;
                int i4 = this.f13608g;
                int i5 = i4 - i3;
                this.f13612k += i4;
                this.f13610i = 0;
                this.f13608g = 0;
                List<byte[]> g = mo26009g(m - i5);
                byte[] bArr = new byte[m];
                System.arraycopy(this.f13607f, i3, bArr, 0, i5);
                Iterator it = ((ArrayList) g).iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    i5 += bArr2.length;
                }
                C5093i iVar2 = C5093i.f13565b;
                return new C5093i.C5101h(bArr);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.j$d */
    public static final class C5118d extends C5114j {

        /* renamed from: e */
        public final ByteBuffer f13614e;

        /* renamed from: f */
        public final boolean f13615f;

        /* renamed from: g */
        public final long f13616g;

        /* renamed from: h */
        public long f13617h;

        /* renamed from: i */
        public long f13618i;

        /* renamed from: j */
        public long f13619j;

        /* renamed from: k */
        public int f13620k;

        /* renamed from: l */
        public int f13621l;

        /* renamed from: m */
        public int f13622m = Integer.MAX_VALUE;

        public C5118d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f13614e = byteBuffer;
            long a = C5154r1.m15963a(byteBuffer);
            this.f13616g = a;
            this.f13617h = ((long) byteBuffer.limit()) + a;
            long position = a + ((long) byteBuffer.position());
            this.f13618i = position;
            this.f13619j = position;
            this.f13615f = z;
        }

        /* renamed from: A */
        public long mo26017A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = mo26022w();
                j |= ((long) (w & Byte.MAX_VALUE)) << i;
                if ((w & 128) == 0) {
                    return j;
                }
            }
            throw C5061a0.m15275e();
        }

        /* renamed from: B */
        public final void mo26018B() {
            long j = this.f13617h + ((long) this.f13620k);
            this.f13617h = j;
            int i = (int) (j - this.f13619j);
            int i2 = this.f13622m;
            if (i > i2) {
                int i3 = i - i2;
                this.f13620k = i3;
                this.f13617h = j - ((long) i3);
                return;
            }
            this.f13620k = 0;
        }

        /* renamed from: C */
        public final int mo26019C() {
            return (int) (this.f13617h - this.f13618i);
        }

        /* renamed from: a */
        public void mo25971a(int i) throws C5061a0 {
            if (this.f13621l != i) {
                throw C5061a0.m15271a();
            }
        }

        /* renamed from: b */
        public int mo25974b() {
            return (int) (this.f13618i - this.f13619j);
        }

        /* renamed from: c */
        public void mo25975c(int i) {
            this.f13622m = i;
            mo26018B();
        }

        /* renamed from: d */
        public boolean mo25978d() throws IOException {
            return mo26025z() != 0;
        }

        /* renamed from: e */
        public boolean mo25980e(int i) throws IOException {
            int t;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (mo26019C() >= 10) {
                    while (i4 < 10) {
                        long j = this.f13618i;
                        this.f13618i = 1 + j;
                        if (C5154r1.f13665e.mo26155a(j) < 0) {
                            i4++;
                        }
                    }
                    throw C5061a0.m15275e();
                }
                while (i4 < 10) {
                    if (mo26022w() < 0) {
                        i4++;
                    }
                }
                throw C5061a0.m15275e();
                return true;
            } else if (i3 == 1) {
                mo26021f(8);
                return true;
            } else if (i3 == 2) {
                mo26021f(mo25988m());
                return true;
            } else if (i3 == 3) {
                do {
                    t = mo25995t();
                    if (t == 0 || !mo25980e(t)) {
                        mo25971a(C5169t1.m16117a(i >>> 3, 4));
                    }
                    t = mo25995t();
                    break;
                } while (!mo25980e(t));
                mo25971a(C5169t1.m16117a(i >>> 3, 4));
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    mo26021f(4);
                    return true;
                }
                throw C5061a0.m15274d();
            }
        }

        /* renamed from: f */
        public double mo25981f() throws IOException {
            return Double.longBitsToDouble(mo26024y());
        }

        /* renamed from: g */
        public int mo25982g() throws IOException {
            return mo25988m();
        }

        /* renamed from: h */
        public int mo25983h() throws IOException {
            return mo26023x();
        }

        /* renamed from: i */
        public long mo25984i() throws IOException {
            return mo26024y();
        }

        /* renamed from: j */
        public float mo25985j() throws IOException {
            return Float.intBitsToFloat(mo26023x());
        }

        /* renamed from: k */
        public int mo25986k() throws IOException {
            return mo25988m();
        }

        /* renamed from: l */
        public long mo25987l() throws IOException {
            return mo26025z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
            if (r6.mo26155a(r4) < 0) goto L_0x0087;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo25988m() throws java.io.IOException {
            /*
                r11 = this;
                long r0 = r11.f13618i
                long r2 = r11.f13617h
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0087
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                com.fyber.inneractive.sdk.protobuf.r1$d r6 = com.fyber.inneractive.sdk.protobuf.C5154r1.f13665e
                byte r0 = r6.mo26155a(r0)
                if (r0 < 0) goto L_0x0019
                r11.f13618i = r4
                return r0
            L_0x0019:
                long r7 = r11.f13617h
                long r7 = r7 - r4
                r9 = 9
                int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r1 >= 0) goto L_0x0023
                goto L_0x0087
            L_0x0023:
                long r7 = r4 + r2
                byte r1 = r6.mo26155a(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0031
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008d
            L_0x0031:
                long r4 = r7 + r2
                byte r1 = r6.mo26155a(r7)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0040
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003e:
                r7 = r4
                goto L_0x008d
            L_0x0040:
                long r7 = r4 + r2
                byte r1 = r6.mo26155a(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0050
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008d
            L_0x0050:
                long r4 = r7 + r2
                byte r1 = r6.mo26155a(r7)
                int r7 = r1 << 28
                r0 = r0 ^ r7
                r7 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r7
                if (r1 >= 0) goto L_0x003e
                long r7 = r4 + r2
                byte r1 = r6.mo26155a(r4)
                if (r1 >= 0) goto L_0x008d
                long r4 = r7 + r2
                byte r1 = r6.mo26155a(r7)
                if (r1 >= 0) goto L_0x003e
                long r7 = r4 + r2
                byte r1 = r6.mo26155a(r4)
                if (r1 >= 0) goto L_0x008d
                long r4 = r7 + r2
                byte r1 = r6.mo26155a(r7)
                if (r1 >= 0) goto L_0x003e
                long r7 = r4 + r2
                byte r1 = r6.mo26155a(r4)
                if (r1 >= 0) goto L_0x008d
            L_0x0087:
                long r0 = r11.mo26017A()
                int r0 = (int) r0
                return r0
            L_0x008d:
                r11.f13618i = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5114j.C5118d.mo25988m():int");
        }

        /* renamed from: n */
        public int mo25989n() throws IOException {
            return mo26023x();
        }

        /* renamed from: o */
        public long mo25990o() throws IOException {
            return mo26024y();
        }

        /* renamed from: p */
        public int mo25991p() throws IOException {
            return C5114j.m15569b(mo25988m());
        }

        /* renamed from: q */
        public long mo25992q() throws IOException {
            return C5114j.m15565a(mo26025z());
        }

        /* renamed from: r */
        public String mo25993r() throws IOException {
            int m = mo25988m();
            if (m > 0 && m <= mo26019C()) {
                byte[] bArr = new byte[m];
                long j = (long) m;
                C5154r1.f13665e.mo26156a(this.f13618i, bArr, 0, j);
                String str = new String(bArr, C5194z.f13762a);
                this.f13618i += j;
                return str;
            } else if (m == 0) {
                return "";
            } else {
                if (m < 0) {
                    throw C5061a0.m15276f();
                }
                throw C5061a0.m15279i();
            }
        }

        /* renamed from: s */
        public String mo25994s() throws IOException {
            String str;
            int m = mo25988m();
            if (m > 0 && m <= mo26019C()) {
                int b = mo26020b(this.f13618i);
                ByteBuffer byteBuffer = this.f13614e;
                C5161s1.C5163b bVar = C5161s1.f13672a;
                bVar.getClass();
                if (byteBuffer.hasArray()) {
                    str = bVar.mo26170a(byteBuffer.array(), byteBuffer.arrayOffset() + b, m);
                } else if (byteBuffer.isDirect()) {
                    str = bVar.mo26171b(byteBuffer, b, m);
                } else {
                    str = bVar.mo26169a(byteBuffer, b, m);
                }
                this.f13618i += (long) m;
                return str;
            } else if (m == 0) {
                return "";
            } else {
                if (m <= 0) {
                    throw C5061a0.m15276f();
                }
                throw C5061a0.m15279i();
            }
        }

        /* renamed from: t */
        public int mo25995t() throws IOException {
            if (mo25976c()) {
                this.f13621l = 0;
                return 0;
            }
            int m = mo25988m();
            this.f13621l = m;
            int i = C5169t1.f13694a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw C5061a0.m15272b();
        }

        /* renamed from: u */
        public int mo25996u() throws IOException {
            return mo25988m();
        }

        /* renamed from: v */
        public long mo25997v() throws IOException {
            return mo26025z();
        }

        /* renamed from: w */
        public byte mo26022w() throws IOException {
            long j = this.f13618i;
            if (j != this.f13617h) {
                this.f13618i = 1 + j;
                return C5154r1.f13665e.mo26155a(j);
            }
            throw C5061a0.m15279i();
        }

        /* renamed from: x */
        public int mo26023x() throws IOException {
            long j = this.f13618i;
            if (this.f13617h - j >= 4) {
                this.f13618i = 4 + j;
                C5154r1.C5158d dVar = C5154r1.f13665e;
                return ((dVar.mo26155a(j + 3) & 255) << Ascii.CAN) | (dVar.mo26155a(j) & 255) | ((dVar.mo26155a(1 + j) & 255) << 8) | ((dVar.mo26155a(2 + j) & 255) << Ascii.DLE);
            }
            throw C5061a0.m15279i();
        }

        /* renamed from: y */
        public long mo26024y() throws IOException {
            long j = this.f13618i;
            if (this.f13617h - j >= 8) {
                this.f13618i = 8 + j;
                C5154r1.C5158d dVar = C5154r1.f13665e;
                return ((((long) dVar.mo26155a(j + 7)) & 255) << 56) | (((long) dVar.mo26155a(j)) & 255) | ((((long) dVar.mo26155a(1 + j)) & 255) << 8) | ((((long) dVar.mo26155a(2 + j)) & 255) << 16) | ((((long) dVar.mo26155a(3 + j)) & 255) << 24) | ((((long) dVar.mo26155a(4 + j)) & 255) << 32) | ((((long) dVar.mo26155a(5 + j)) & 255) << 40) | ((((long) dVar.mo26155a(6 + j)) & 255) << 48);
            }
            throw C5061a0.m15279i();
        }

        /* renamed from: z */
        public long mo26025z() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f13618i;
            if (this.f13617h != j4) {
                long j5 = j4 + 1;
                C5154r1.C5158d dVar = C5154r1.f13665e;
                byte a = dVar.mo26155a(j4);
                if (a >= 0) {
                    this.f13618i = j5;
                    return (long) a;
                } else if (this.f13617h - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte a2 = a ^ (dVar.mo26155a(j5) << 7);
                    if (a2 < 0) {
                        b = a2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte a3 = a2 ^ (dVar.mo26155a(j6) << Ascii.f18306SO);
                        if (a3 >= 0) {
                            j = (long) (a3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte a4 = a3 ^ (dVar.mo26155a(j7) << Ascii.NAK);
                            if (a4 < 0) {
                                b = a4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long a5 = ((long) a4) ^ (((long) dVar.mo26155a(j6)) << 28);
                                if (a5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long a6 = a5 ^ (((long) dVar.mo26155a(j7)) << 35);
                                    if (a6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        a5 = a6 ^ (((long) dVar.mo26155a(j8)) << 42);
                                        if (a5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            a6 = a5 ^ (((long) dVar.mo26155a(j7)) << 49);
                                            if (a6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (a6 ^ (((long) dVar.mo26155a(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) dVar.mo26155a(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f13618i = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = a6 ^ j2;
                                    j6 = j8;
                                    this.f13618i = j6;
                                    return j;
                                }
                                j = a5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f13618i = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f13618i = j6;
                    return j;
                }
            }
            return mo26017A();
        }

        /* renamed from: b */
        public final int mo26020b(long j) {
            return (int) (j - this.f13616g);
        }

        /* renamed from: d */
        public int mo25977d(int i) throws C5061a0 {
            if (i >= 0) {
                int b = i + mo25974b();
                int i2 = this.f13622m;
                if (b <= i2) {
                    this.f13622m = b;
                    mo26018B();
                    return i2;
                }
                throw C5061a0.m15279i();
            }
            throw C5061a0.m15276f();
        }

        /* renamed from: f */
        public void mo26021f(int i) throws IOException {
            if (i >= 0 && i <= mo26019C()) {
                this.f13618i += (long) i;
            } else if (i < 0) {
                throw C5061a0.m15276f();
            } else {
                throw C5061a0.m15279i();
            }
        }

        /* renamed from: a */
        public void mo25972a(int i, C5149q0.C5150a aVar, C5147q qVar) throws IOException {
            int i2 = this.f13594a;
            if (i2 < this.f13595b) {
                this.f13594a = i2 + 1;
                ((GeneratedMessageLite.C5050a) aVar).mo25733a((C5114j) this, qVar);
                mo25971a(C5169t1.m16117a(i, 4));
                this.f13594a--;
                return;
            }
            throw C5061a0.m15278h();
        }

        /* renamed from: c */
        public boolean mo25976c() throws IOException {
            return this.f13618i == this.f13617h;
        }

        /* renamed from: a */
        public void mo25973a(C5149q0.C5150a aVar, C5147q qVar) throws IOException {
            int m = mo25988m();
            if (this.f13594a < this.f13595b) {
                int d = mo25977d(m);
                this.f13594a++;
                ((GeneratedMessageLite.C5050a) aVar).mo25733a((C5114j) this, qVar);
                mo25971a(0);
                this.f13594a--;
                this.f13622m = d;
                mo26018B();
                return;
            }
            throw C5061a0.m15278h();
        }

        /* renamed from: a */
        public int mo25970a() {
            int i = this.f13622m;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo25974b();
        }

        /* renamed from: e */
        public C5093i mo25979e() throws IOException {
            int m = mo25988m();
            if (m > 0 && m <= mo26019C()) {
                byte[] bArr = new byte[m];
                long j = (long) m;
                C5154r1.f13665e.mo26156a(this.f13618i, bArr, 0, j);
                this.f13618i += j;
                C5093i iVar = C5093i.f13565b;
                return new C5093i.C5101h(bArr);
            } else if (m == 0) {
                return C5093i.f13565b;
            } else {
                if (m < 0) {
                    throw C5061a0.m15276f();
                }
                throw C5061a0.m15279i();
            }
        }
    }

    /* renamed from: a */
    public static long m15565a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public static C5114j m15566a(InputStream inputStream) {
        if (inputStream != null) {
            return new C5117c(inputStream, 4096);
        }
        byte[] bArr = C5194z.f13763b;
        return m15568a(bArr, 0, bArr.length, false);
    }

    /* renamed from: b */
    public static int m15569b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo25970a();

    /* renamed from: a */
    public abstract void mo25971a(int i) throws C5061a0;

    /* renamed from: a */
    public abstract void mo25972a(int i, C5149q0.C5150a aVar, C5147q qVar) throws IOException;

    /* renamed from: a */
    public abstract void mo25973a(C5149q0.C5150a aVar, C5147q qVar) throws IOException;

    /* renamed from: b */
    public abstract int mo25974b();

    /* renamed from: c */
    public abstract void mo25975c(int i);

    /* renamed from: c */
    public abstract boolean mo25976c() throws IOException;

    /* renamed from: d */
    public abstract int mo25977d(int i) throws C5061a0;

    /* renamed from: d */
    public abstract boolean mo25978d() throws IOException;

    /* renamed from: e */
    public abstract C5093i mo25979e() throws IOException;

    /* renamed from: e */
    public abstract boolean mo25980e(int i) throws IOException;

    /* renamed from: f */
    public abstract double mo25981f() throws IOException;

    /* renamed from: g */
    public abstract int mo25982g() throws IOException;

    /* renamed from: h */
    public abstract int mo25983h() throws IOException;

    /* renamed from: i */
    public abstract long mo25984i() throws IOException;

    /* renamed from: j */
    public abstract float mo25985j() throws IOException;

    /* renamed from: k */
    public abstract int mo25986k() throws IOException;

    /* renamed from: l */
    public abstract long mo25987l() throws IOException;

    /* renamed from: m */
    public abstract int mo25988m() throws IOException;

    /* renamed from: n */
    public abstract int mo25989n() throws IOException;

    /* renamed from: o */
    public abstract long mo25990o() throws IOException;

    /* renamed from: p */
    public abstract int mo25991p() throws IOException;

    /* renamed from: q */
    public abstract long mo25992q() throws IOException;

    /* renamed from: r */
    public abstract String mo25993r() throws IOException;

    /* renamed from: s */
    public abstract String mo25994s() throws IOException;

    /* renamed from: t */
    public abstract int mo25995t() throws IOException;

    /* renamed from: u */
    public abstract int mo25996u() throws IOException;

    /* renamed from: v */
    public abstract long mo25997v() throws IOException;

    public C5114j() {
        this.f13595b = 100;
        this.f13596c = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static C5114j m15568a(byte[] bArr, int i, int i2, boolean z) {
        C5116b bVar = new C5116b(bArr, i, i2, z);
        try {
            bVar.mo25977d(i2);
            return bVar;
        } catch (C5061a0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static C5114j m15567a(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m15568a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C5154r1.f13666f) {
            return new C5118d(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m15568a(bArr, 0, remaining, true);
    }
}
