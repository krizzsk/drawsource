package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5093i;
import com.fyber.inneractive.sdk.protobuf.C5119j0;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.f */
public abstract class C5079f implements C5078e1 {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.f$b */
    public static final class C5081b extends C5079f {

        /* renamed from: a */
        public final boolean f13546a;

        /* renamed from: b */
        public final byte[] f13547b;

        /* renamed from: c */
        public int f13548c;

        /* renamed from: d */
        public int f13549d;

        /* renamed from: e */
        public int f13550e;

        /* renamed from: f */
        public int f13551f;

        public C5081b(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f13546a = z;
            this.f13547b = byteBuffer.array();
            this.f13548c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f13549d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: A */
        public final int mo25849A() throws IOException {
            byte b;
            int i = this.f13548c;
            int i2 = this.f13549d;
            if (i2 != i) {
                byte[] bArr = this.f13547b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f13548c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo25851C();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << Ascii.f18306SO);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << Ascii.NAK);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << Ascii.f18299FS)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw C5061a0.m15275e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f13548c = i4;
                    return b;
                }
            } else {
                throw C5061a0.m15279i();
            }
        }

        /* renamed from: B */
        public long mo25850B() throws IOException {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f13548c;
            int i3 = this.f13549d;
            if (i3 != i2) {
                byte[] bArr = this.f13547b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f13548c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo25851C();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << Ascii.f18306SO);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << Ascii.NAK);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw C5061a0.m15275e();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f13548c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f13548c = i;
                    return j;
                }
            } else {
                throw C5061a0.m15279i();
            }
        }

        /* renamed from: C */
        public final long mo25851C() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte v = mo25863v();
                j |= ((long) (v & Byte.MAX_VALUE)) << i;
                if ((v & 128) == 0) {
                    return j;
                }
            }
            throw C5061a0.m15275e();
        }

        /* renamed from: a */
        public String mo25852a(boolean z) throws IOException {
            mo25857c(2);
            int A = mo25849A();
            if (A == 0) {
                return "";
            }
            mo25853a(A);
            if (z) {
                byte[] bArr = this.f13547b;
                int i = this.f13548c;
                if (!C5161s1.m16049b(bArr, i, i + A)) {
                    throw C5061a0.m15273c();
                }
            }
            String str = new String(this.f13547b, this.f13548c, A, C5194z.f13762a);
            this.f13548c += A;
            return str;
        }

        /* renamed from: b */
        public <T> T mo25813b(Class<T> cls, C5147q qVar) throws IOException {
            mo25857c(2);
            return mo25858d(C5066b1.f13524c.mo25762a(cls), qVar);
        }

        /* renamed from: c */
        public final <T> T mo25856c(C5083f1<T> f1Var, C5147q qVar) throws IOException {
            int i = this.f13551f;
            int i2 = this.f13550e;
            int i3 = C5169t1.f13694a;
            this.f13551f = C5169t1.m16117a(i2 >>> 3, 4);
            try {
                T a = f1Var.mo25868a();
                f1Var.mo25869a(a, this, qVar);
                f1Var.mo25876c(a);
                if (this.f13550e == this.f13551f) {
                    return a;
                }
                throw C5061a0.m15277g();
            } finally {
                this.f13551f = i;
            }
        }

        /* renamed from: d */
        public int mo25818d() throws IOException {
            mo25857c(0);
            return mo25849A();
        }

        /* renamed from: e */
        public int mo25820e() {
            return this.f13550e;
        }

        /* renamed from: f */
        public long mo25822f() throws IOException {
            mo25857c(0);
            return mo25850B();
        }

        /* renamed from: g */
        public long mo25824g() throws IOException {
            mo25857c(1);
            return mo25866y();
        }

        /* renamed from: h */
        public double mo25826h() throws IOException {
            mo25857c(1);
            return Double.longBitsToDouble(mo25866y());
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[LOOP:0: B:18:0x0032->B:21:0x003f, LOOP_START] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo25829i() throws java.io.IOException {
            /*
                r7 = this;
                boolean r0 = r7.mo25862u()
                r1 = 0
                if (r0 != 0) goto L_0x0089
                int r0 = r7.f13550e
                int r2 = r7.f13551f
                if (r0 != r2) goto L_0x000f
                goto L_0x0089
            L_0x000f:
                int r3 = com.fyber.inneractive.sdk.protobuf.C5169t1.f13694a
                r3 = r0 & 7
                r4 = 1
                if (r3 == 0) goto L_0x005d
                if (r3 == r4) goto L_0x0057
                r1 = 2
                if (r3 == r1) goto L_0x004f
                r1 = 4
                r5 = 3
                if (r3 == r5) goto L_0x002b
                r0 = 5
                if (r3 != r0) goto L_0x0026
                r7.mo25859d((int) r1)
                return r4
            L_0x0026:
                com.fyber.inneractive.sdk.protobuf.a0$a r0 = com.fyber.inneractive.sdk.protobuf.C5061a0.m15274d()
                throw r0
            L_0x002b:
                int r0 = r0 >>> r5
                int r0 = com.fyber.inneractive.sdk.protobuf.C5169t1.m16117a(r0, r1)
                r7.f13551f = r0
            L_0x0032:
                int r0 = r7.mo25847s()
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L_0x0041
                boolean r0 = r7.mo25829i()
                if (r0 != 0) goto L_0x0032
            L_0x0041:
                int r0 = r7.f13550e
                int r1 = r7.f13551f
                if (r0 != r1) goto L_0x004a
                r7.f13551f = r2
                return r4
            L_0x004a:
                com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C5061a0.m15277g()
                throw r0
            L_0x004f:
                int r0 = r7.mo25849A()
                r7.mo25859d((int) r0)
                return r4
            L_0x0057:
                r0 = 8
                r7.mo25859d((int) r0)
                return r4
            L_0x005d:
                int r0 = r7.f13549d
                int r2 = r7.f13548c
                int r0 = r0 - r2
                r3 = 10
                if (r0 < r3) goto L_0x0078
                byte[] r0 = r7.f13547b
                r5 = r1
            L_0x0069:
                if (r5 >= r3) goto L_0x0078
                int r6 = r2 + 1
                byte r2 = r0[r2]
                if (r2 < 0) goto L_0x0074
                r7.f13548c = r6
                goto L_0x0080
            L_0x0074:
                int r5 = r5 + 1
                r2 = r6
                goto L_0x0069
            L_0x0078:
                if (r1 >= r3) goto L_0x0084
                byte r0 = r7.mo25863v()
                if (r0 < 0) goto L_0x0081
            L_0x0080:
                return r4
            L_0x0081:
                int r1 = r1 + 1
                goto L_0x0078
            L_0x0084:
                com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C5061a0.m15275e()
                throw r0
            L_0x0089:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5079f.C5081b.mo25829i():boolean");
        }

        /* renamed from: j */
        public int mo25830j() throws IOException {
            mo25857c(0);
            return C5114j.m15569b(mo25849A());
        }

        /* renamed from: k */
        public float mo25832k() throws IOException {
            mo25857c(5);
            return Float.intBitsToFloat(mo25864w());
        }

        /* renamed from: l */
        public long mo25834l() throws IOException {
            mo25857c(0);
            return C5114j.m15565a(mo25850B());
        }

        /* renamed from: m */
        public int mo25836m() throws IOException {
            mo25857c(5);
            return mo25864w();
        }

        /* renamed from: n */
        public String mo25838n() throws IOException {
            return mo25852a(false);
        }

        /* renamed from: o */
        public long mo25840o() throws IOException {
            mo25857c(0);
            return mo25850B();
        }

        /* renamed from: p */
        public String mo25842p() throws IOException {
            return mo25852a(true);
        }

        /* renamed from: q */
        public int mo25844q() throws IOException {
            mo25857c(5);
            return mo25864w();
        }

        /* renamed from: r */
        public boolean mo25846r() throws IOException {
            mo25857c(0);
            if (mo25849A() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        public int mo25847s() throws IOException {
            if (mo25862u()) {
                return Integer.MAX_VALUE;
            }
            int A = mo25849A();
            this.f13550e = A;
            if (A == this.f13551f) {
                return Integer.MAX_VALUE;
            }
            int i = C5169t1.f13694a;
            return A >>> 3;
        }

        /* renamed from: t */
        public long mo25848t() throws IOException {
            mo25857c(1);
            return mo25866y();
        }

        /* renamed from: u */
        public final boolean mo25862u() {
            return this.f13548c == this.f13549d;
        }

        /* renamed from: v */
        public final byte mo25863v() throws IOException {
            int i = this.f13548c;
            if (i != this.f13549d) {
                byte[] bArr = this.f13547b;
                this.f13548c = i + 1;
                return bArr[i];
            }
            throw C5061a0.m15279i();
        }

        /* renamed from: w */
        public final int mo25864w() throws IOException {
            mo25853a(4);
            return mo25865x();
        }

        /* renamed from: x */
        public final int mo25865x() {
            int i = this.f13548c;
            byte[] bArr = this.f13547b;
            this.f13548c = i + 4;
            return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
        }

        /* renamed from: y */
        public final long mo25866y() throws IOException {
            mo25853a(8);
            return mo25867z();
        }

        /* renamed from: z */
        public final long mo25867z() {
            int i = this.f13548c;
            byte[] bArr = this.f13547b;
            this.f13548c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: e */
        public void mo25821e(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5192y) {
                C5192y yVar = (C5192y) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 2) {
                    int A = mo25849A();
                    mo25860e(A);
                    int i6 = this.f13548c + A;
                    while (this.f13548c < i6) {
                        yVar.mo26230c(mo25865x());
                    }
                } else if (i5 == 5) {
                    do {
                        yVar.mo26230c(mo25844q());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i7 = this.f13550e;
                int i8 = C5169t1.f13694a;
                int i9 = i7 & 7;
                if (i9 == 2) {
                    int A2 = mo25849A();
                    mo25860e(A2);
                    int i10 = this.f13548c + A2;
                    while (this.f13548c < i10) {
                        list.add(Integer.valueOf(mo25865x()));
                    }
                } else if (i9 == 5) {
                    do {
                        list.add(Integer.valueOf(mo25844q()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: n */
        public void mo25839n(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5091h0) {
                C5091h0 h0Var = (C5091h0) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 1) {
                    do {
                        h0Var.mo25893a(mo25824g());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = mo25849A();
                    mo25861f(A);
                    int i6 = this.f13548c + A;
                    while (this.f13548c < i6) {
                        h0Var.mo25893a(mo25867z());
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i7 = this.f13550e;
                int i8 = C5169t1.f13694a;
                int i9 = i7 & 7;
                if (i9 == 1) {
                    do {
                        list.add(Long.valueOf(mo25824g()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i9 == 2) {
                    int A2 = mo25849A();
                    mo25861f(A2);
                    int i10 = this.f13548c + A2;
                    while (this.f13548c < i10) {
                        list.add(Long.valueOf(mo25867z()));
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: p */
        public void mo25843p(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5192y) {
                C5192y yVar = (C5192y) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo26230c(mo25811b());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = this.f13548c + mo25849A();
                    while (this.f13548c < A) {
                        yVar.mo26230c(mo25849A());
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i6 = this.f13550e;
                int i7 = C5169t1.f13694a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo25811b()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13548c + mo25849A();
                    while (this.f13548c < A2) {
                        list.add(Integer.valueOf(mo25849A()));
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: d */
        public final <T> T mo25858d(C5083f1<T> f1Var, C5147q qVar) throws IOException {
            int A = mo25849A();
            mo25853a(A);
            int i = this.f13549d;
            int i2 = this.f13548c + A;
            this.f13549d = i2;
            try {
                T a = f1Var.mo25868a();
                f1Var.mo25869a(a, this, qVar);
                f1Var.mo25876c(a);
                if (this.f13548c == i2) {
                    return a;
                }
                throw C5061a0.m15277g();
            } finally {
                this.f13549d = i;
            }
        }

        /* renamed from: f */
        public void mo25823f(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5192y) {
                C5192y yVar = (C5192y) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 2) {
                    int A = mo25849A();
                    mo25860e(A);
                    int i6 = this.f13548c + A;
                    while (this.f13548c < i6) {
                        yVar.mo26230c(mo25865x());
                    }
                } else if (i5 == 5) {
                    do {
                        yVar.mo26230c(mo25836m());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i7 = this.f13550e;
                int i8 = C5169t1.f13694a;
                int i9 = i7 & 7;
                if (i9 == 2) {
                    int A2 = mo25849A();
                    mo25860e(A2);
                    int i10 = this.f13548c + A2;
                    while (this.f13548c < i10) {
                        list.add(Integer.valueOf(mo25865x()));
                    }
                } else if (i9 == 5) {
                    do {
                        list.add(Integer.valueOf(mo25836m()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: g */
        public void mo25825g(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5091h0) {
                C5091h0 h0Var = (C5091h0) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        h0Var.mo25893a(mo25834l());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = this.f13548c + mo25849A();
                    while (this.f13548c < A) {
                        h0Var.mo25893a(C5114j.m15565a(mo25850B()));
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i6 = this.f13550e;
                int i7 = C5169t1.f13694a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Long.valueOf(mo25834l()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13548c + mo25849A();
                    while (this.f13548c < A2) {
                        list.add(Long.valueOf(C5114j.m15565a(mo25850B())));
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: h */
        public void mo25827h(List<C5093i> list) throws IOException {
            int i;
            int i2 = this.f13550e;
            int i3 = C5169t1.f13694a;
            if ((i2 & 7) == 2) {
                do {
                    list.add(mo25805a());
                    if (!mo25862u()) {
                        i = this.f13548c;
                    } else {
                        return;
                    }
                } while (mo25849A() == this.f13550e);
                this.f13548c = i;
                return;
            }
            throw C5061a0.m15274d();
        }

        /* renamed from: j */
        public void mo25831j(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5136n) {
                C5136n nVar = (C5136n) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 1) {
                    do {
                        nVar.mo26108a(mo25826h());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = mo25849A();
                    mo25861f(A);
                    int i6 = this.f13548c + A;
                    while (this.f13548c < i6) {
                        nVar.mo26108a(Double.longBitsToDouble(mo25867z()));
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i7 = this.f13550e;
                int i8 = C5169t1.f13694a;
                int i9 = i7 & 7;
                if (i9 == 1) {
                    do {
                        list.add(Double.valueOf(mo25826h()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i9 == 2) {
                    int A2 = mo25849A();
                    mo25861f(A2);
                    int i10 = this.f13548c + A2;
                    while (this.f13548c < i10) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo25867z())));
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: k */
        public void mo25833k(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5091h0) {
                C5091h0 h0Var = (C5091h0) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        h0Var.mo25893a(mo25840o());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = this.f13548c + mo25849A();
                    while (this.f13548c < A) {
                        h0Var.mo25893a(mo25850B());
                    }
                    mo25855b(A);
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i6 = this.f13550e;
                int i7 = C5169t1.f13694a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Long.valueOf(mo25840o()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13548c + mo25849A();
                    while (this.f13548c < A2) {
                        list.add(Long.valueOf(mo25850B()));
                    }
                    mo25855b(A2);
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: l */
        public void mo25835l(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5084g) {
                C5084g gVar = (C5084g) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        gVar.mo25878a(mo25846r());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = this.f13548c + mo25849A();
                    while (this.f13548c < A) {
                        gVar.mo25878a(mo25849A() != 0);
                    }
                    mo25855b(A);
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i6 = this.f13550e;
                int i7 = C5169t1.f13694a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo25846r()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13548c + mo25849A();
                    while (this.f13548c < A2) {
                        list.add(Boolean.valueOf(mo25849A() != 0));
                    }
                    mo25855b(A2);
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: m */
        public void mo25837m(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5091h0) {
                C5091h0 h0Var = (C5091h0) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 1) {
                    do {
                        h0Var.mo25893a(mo25848t());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = mo25849A();
                    mo25861f(A);
                    int i6 = this.f13548c + A;
                    while (this.f13548c < i6) {
                        h0Var.mo25893a(mo25867z());
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i7 = this.f13550e;
                int i8 = C5169t1.f13694a;
                int i9 = i7 & 7;
                if (i9 == 1) {
                    do {
                        list.add(Long.valueOf(mo25848t()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i9 == 2) {
                    int A2 = mo25849A();
                    mo25861f(A2);
                    int i10 = this.f13548c + A2;
                    while (this.f13548c < i10) {
                        list.add(Long.valueOf(mo25867z()));
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: o */
        public void mo25841o(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5192y) {
                C5192y yVar = (C5192y) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo26230c(mo25818d());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = this.f13548c + mo25849A();
                    while (this.f13548c < A) {
                        yVar.mo26230c(mo25849A());
                    }
                    mo25855b(A);
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i6 = this.f13550e;
                int i7 = C5169t1.f13694a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo25818d()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13548c + mo25849A();
                    while (this.f13548c < A2) {
                        list.add(Integer.valueOf(mo25849A()));
                    }
                    mo25855b(A2);
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: q */
        public void mo25845q(List<String> list) throws IOException {
            mo25854a(list, false);
        }

        /* renamed from: b */
        public <T> T mo25812b(C5083f1<T> f1Var, C5147q qVar) throws IOException {
            mo25857c(2);
            return mo25858d(f1Var, qVar);
        }

        /* renamed from: b */
        public int mo25811b() throws IOException {
            mo25857c(0);
            return mo25849A();
        }

        /* renamed from: b */
        public void mo25814b(List<String> list) throws IOException {
            mo25854a(list, true);
        }

        /* renamed from: b */
        public <T> void mo25815b(List<T> list, C5083f1<T> f1Var, C5147q qVar) throws IOException {
            int i;
            int i2 = this.f13550e;
            int i3 = C5169t1.f13694a;
            if ((i2 & 7) == 2) {
                do {
                    list.add(mo25858d(f1Var, qVar));
                    if (!mo25862u()) {
                        i = this.f13548c;
                    } else {
                        return;
                    }
                } while (mo25849A() == i2);
                this.f13548c = i;
                return;
            }
            throw C5061a0.m15274d();
        }

        /* renamed from: a */
        public <T> T mo25807a(Class<T> cls, C5147q qVar) throws IOException {
            mo25857c(3);
            return mo25856c(C5066b1.f13524c.mo25762a(cls), qVar);
        }

        /* renamed from: a */
        public <T> T mo25806a(C5083f1<T> f1Var, C5147q qVar) throws IOException {
            mo25857c(3);
            return mo25856c(f1Var, qVar);
        }

        /* renamed from: a */
        public C5093i mo25805a() throws IOException {
            C5093i iVar;
            mo25857c(2);
            int A = mo25849A();
            if (A == 0) {
                return C5093i.f13565b;
            }
            mo25853a(A);
            if (this.f13546a) {
                byte[] bArr = this.f13547b;
                int i = this.f13548c;
                C5093i iVar2 = C5093i.f13565b;
                iVar = new C5093i.C5097d(bArr, i, A);
            } else {
                iVar = C5093i.m15515a(this.f13547b, this.f13548c, A);
            }
            this.f13548c += A;
            return iVar;
        }

        /* renamed from: c */
        public int mo25816c() throws IOException {
            mo25857c(0);
            return mo25849A();
        }

        /* renamed from: b */
        public final void mo25855b(int i) throws IOException {
            if (this.f13548c != i) {
                throw C5061a0.m15279i();
            }
        }

        /* renamed from: c */
        public void mo25817c(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5192y) {
                C5192y yVar = (C5192y) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo26230c(mo25830j());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = this.f13548c + mo25849A();
                    while (this.f13548c < A) {
                        yVar.mo26230c(C5114j.m15569b(mo25849A()));
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i6 = this.f13550e;
                int i7 = C5169t1.f13694a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo25830j()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13548c + mo25849A();
                    while (this.f13548c < A2) {
                        list.add(Integer.valueOf(C5114j.m15569b(mo25849A())));
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: a */
        public void mo25808a(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5091h0) {
                C5091h0 h0Var = (C5091h0) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        h0Var.mo25893a(mo25822f());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = this.f13548c + mo25849A();
                    while (this.f13548c < A) {
                        h0Var.mo25893a(mo25850B());
                    }
                    mo25855b(A);
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i6 = this.f13550e;
                int i7 = C5169t1.f13694a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Long.valueOf(mo25822f()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13548c + mo25849A();
                    while (this.f13548c < A2) {
                        list.add(Long.valueOf(mo25850B()));
                    }
                    mo25855b(A2);
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: d */
        public void mo25819d(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5188w) {
                C5188w wVar = (C5188w) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 2) {
                    int A = mo25849A();
                    mo25860e(A);
                    int i6 = this.f13548c + A;
                    while (this.f13548c < i6) {
                        wVar.mo26218a(Float.intBitsToFloat(mo25865x()));
                    }
                } else if (i5 == 5) {
                    do {
                        wVar.mo26218a(mo25832k());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i7 = this.f13550e;
                int i8 = C5169t1.f13694a;
                int i9 = i7 & 7;
                if (i9 == 2) {
                    int A2 = mo25849A();
                    mo25860e(A2);
                    int i10 = this.f13548c + A2;
                    while (this.f13548c < i10) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo25865x())));
                    }
                } else if (i9 == 5) {
                    do {
                        list.add(Float.valueOf(mo25832k()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: i */
        public void mo25828i(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5192y) {
                C5192y yVar = (C5192y) list;
                int i3 = this.f13550e;
                int i4 = C5169t1.f13694a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo26230c(mo25816c());
                        if (!mo25862u()) {
                            i2 = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i2;
                } else if (i5 == 2) {
                    int A = this.f13548c + mo25849A();
                    while (this.f13548c < A) {
                        yVar.mo26230c(mo25849A());
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            } else {
                int i6 = this.f13550e;
                int i7 = C5169t1.f13694a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo25816c()));
                        if (!mo25862u()) {
                            i = this.f13548c;
                        } else {
                            return;
                        }
                    } while (mo25849A() == this.f13550e);
                    this.f13548c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13548c + mo25849A();
                    while (this.f13548c < A2) {
                        list.add(Integer.valueOf(mo25849A()));
                    }
                } else {
                    throw C5061a0.m15274d();
                }
            }
        }

        /* renamed from: e */
        public final void mo25860e(int i) throws IOException {
            mo25853a(i);
            if ((i & 3) != 0) {
                throw C5061a0.m15277g();
            }
        }

        /* renamed from: f */
        public final void mo25861f(int i) throws IOException {
            mo25853a(i);
            if ((i & 7) != 0) {
                throw C5061a0.m15277g();
            }
        }

        /* renamed from: c */
        public final void mo25857c(int i) throws IOException {
            int i2 = this.f13550e;
            int i3 = C5169t1.f13694a;
            if ((i2 & 7) != i) {
                throw C5061a0.m15274d();
            }
        }

        /* renamed from: a */
        public void mo25854a(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            int i3 = this.f13550e;
            int i4 = C5169t1.f13694a;
            if ((i3 & 7) != 2) {
                throw C5061a0.m15274d();
            } else if (!(list instanceof C5082f0) || z) {
                do {
                    list.add(mo25852a(z));
                    if (!mo25862u()) {
                        i = this.f13548c;
                    } else {
                        return;
                    }
                } while (mo25849A() == this.f13550e);
                this.f13548c = i;
            } else {
                C5082f0 f0Var = (C5082f0) list;
                do {
                    f0Var.mo25799a(mo25805a());
                    if (!mo25862u()) {
                        i2 = this.f13548c;
                    } else {
                        return;
                    }
                } while (mo25849A() == this.f13550e);
                this.f13548c = i2;
            }
        }

        /* renamed from: d */
        public final void mo25859d(int i) throws IOException {
            mo25853a(i);
            this.f13548c += i;
        }

        /* renamed from: a */
        public <T> void mo25809a(List<T> list, C5083f1<T> f1Var, C5147q qVar) throws IOException {
            int i;
            int i2 = this.f13550e;
            int i3 = C5169t1.f13694a;
            if ((i2 & 7) == 3) {
                do {
                    list.add(mo25856c(f1Var, qVar));
                    if (!mo25862u()) {
                        i = this.f13548c;
                    } else {
                        return;
                    }
                } while (mo25849A() == i2);
                this.f13548c = i;
                return;
            }
            throw C5061a0.m15274d();
        }

        /* renamed from: a */
        public <K, V> void mo25810a(Map<K, V> map, C5119j0.C5120a<K, V> aVar, C5147q qVar) throws IOException {
            mo25857c(2);
            int A = mo25849A();
            mo25853a(A);
            int i = this.f13549d;
            this.f13549d = this.f13548c + A;
            try {
                throw null;
            } catch (Throwable th) {
                this.f13549d = i;
                throw th;
            }
        }

        /* renamed from: a */
        public final void mo25853a(int i) throws IOException {
            if (i < 0 || i > this.f13549d - this.f13548c) {
                throw C5061a0.m15279i();
            }
        }
    }

    public C5079f() {
    }
}
