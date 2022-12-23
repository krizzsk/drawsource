package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5161s1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.l */
public abstract class C5125l extends C5090h {

    /* renamed from: b */
    public static final Logger f13629b = Logger.getLogger(C5125l.class.getName());

    /* renamed from: c */
    public static final boolean f13630c = C5154r1.f13667g;

    /* renamed from: a */
    public C5133m f13631a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$b */
    public static abstract class C5127b extends C5125l {

        /* renamed from: d */
        public final byte[] f13632d;

        /* renamed from: e */
        public final int f13633e;

        /* renamed from: f */
        public int f13634f;

        /* renamed from: g */
        public int f13635g;

        public C5127b(int i) {
            super();
            if (i >= 0) {
                int max = Math.max(i, 20);
                this.f13632d = new byte[max];
                this.f13633e = max;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: a */
        public final int mo26041a() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* renamed from: b */
        public final void mo26061b(byte b) {
            byte[] bArr = this.f13632d;
            int i = this.f13634f;
            this.f13634f = i + 1;
            bArr[i] = b;
            this.f13635g++;
        }

        /* renamed from: e */
        public final void mo26062e(long j) {
            byte[] bArr = this.f13632d;
            int i = this.f13634f;
            int i2 = i + 1;
            this.f13634f = i2;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            this.f13634f = i3;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            this.f13634f = i4;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            this.f13634f = i5;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            this.f13634f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f13634f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f13634f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f13634f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f13635g += 8;
        }

        /* renamed from: f */
        public final void mo26063f(long j) {
            if (C5125l.f13630c) {
                long j2 = (long) this.f13634f;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f13632d;
                    int i = this.f13634f;
                    this.f13634f = i + 1;
                    C5154r1.m15973a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f13632d;
                int i2 = this.f13634f;
                this.f13634f = i2 + 1;
                C5154r1.m15973a(bArr2, (long) i2, (byte) ((int) j));
                this.f13635g += (int) (((long) this.f13634f) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f13632d;
                int i3 = this.f13634f;
                this.f13634f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f13635g++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f13632d;
            int i4 = this.f13634f;
            this.f13634f = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f13635g++;
        }

        /* renamed from: h */
        public final void mo26064h(int i) {
            byte[] bArr = this.f13632d;
            int i2 = this.f13634f;
            int i3 = i2 + 1;
            this.f13634f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f13634f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f13634f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f13634f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f13635g += 4;
        }

        /* renamed from: i */
        public final void mo26065i(int i) {
            if (C5125l.f13630c) {
                long j = (long) this.f13634f;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f13632d;
                    int i2 = this.f13634f;
                    this.f13634f = i2 + 1;
                    C5154r1.m15973a(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f13632d;
                int i3 = this.f13634f;
                this.f13634f = i3 + 1;
                C5154r1.m15973a(bArr2, (long) i3, (byte) i);
                this.f13635g += (int) (((long) this.f13634f) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f13632d;
                int i4 = this.f13634f;
                this.f13634f = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f13635g++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f13632d;
            int i5 = this.f13634f;
            this.f13634f = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f13635g++;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$d */
    public static class C5129d extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public C5129d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public C5129d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: a */
    public static int m15776a(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: a */
    public static C5125l m15780a(byte[] bArr) {
        return new C5128c(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m15782b(int i, int i2) {
        return m15781b(i) + 4;
    }

    /* renamed from: b */
    public static long m15784b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: c */
    public static int m15785c(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: c */
    public static int m15786c(int i, int i2) {
        return m15781b(i) + m15767a(i2);
    }

    /* renamed from: d */
    public static int m15788d(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: d */
    public static int m15789d(int i, int i2) {
        return m15781b(i) + 4;
    }

    /* renamed from: e */
    public static int m15791e(int i, int i2) {
        return m15781b(i) + m15785c(m15788d(i2));
    }

    /* renamed from: f */
    public static int m15793f(int i, int i2) {
        return m15781b(i) + m15785c(i2);
    }

    /* renamed from: a */
    public abstract int mo26041a();

    /* renamed from: a */
    public abstract void mo26042a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo26043a(int i, C5149q0 q0Var) throws IOException;

    /* renamed from: b */
    public abstract void mo26045b(int i, C5093i iVar) throws IOException;

    /* renamed from: b */
    public abstract void mo26046b(int i, C5149q0 q0Var, C5083f1 f1Var) throws IOException;

    /* renamed from: b */
    public abstract void mo26047b(int i, String str) throws IOException;

    /* renamed from: b */
    public abstract void mo26048b(int i, boolean z) throws IOException;

    /* renamed from: c */
    public abstract void mo26049c(int i, C5093i iVar) throws IOException;

    /* renamed from: c */
    public abstract void mo26050c(long j) throws IOException;

    /* renamed from: d */
    public abstract void mo26051d(long j) throws IOException;

    /* renamed from: e */
    public abstract void mo26052e(int i) throws IOException;

    /* renamed from: f */
    public abstract void mo26053f(int i) throws IOException;

    /* renamed from: f */
    public abstract void mo26054f(int i, long j) throws IOException;

    /* renamed from: g */
    public abstract void mo26055g(int i) throws IOException;

    /* renamed from: g */
    public abstract void mo26056g(int i, int i2) throws IOException;

    /* renamed from: g */
    public abstract void mo26057g(int i, long j) throws IOException;

    /* renamed from: h */
    public abstract void mo26058h(int i, int i2) throws IOException;

    /* renamed from: i */
    public abstract void mo26059i(int i, int i2) throws IOException;

    /* renamed from: j */
    public abstract void mo26060j(int i, int i2) throws IOException;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$c */
    public static class C5128c extends C5125l {

        /* renamed from: d */
        public final byte[] f13636d;

        /* renamed from: e */
        public final int f13637e;

        /* renamed from: f */
        public int f13638f;

        public C5128c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f13636d = bArr;
                    this.f13638f = i;
                    this.f13637e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public final void mo26043a(int i, C5149q0 q0Var) throws IOException {
            mo26055g(C5169t1.m16117a(1, 3));
            mo26060j(2, i);
            mo26055g(C5169t1.m16117a(3, 2));
            mo26055g(q0Var.getSerializedSize());
            q0Var.writeTo(this);
            mo26055g(C5169t1.m16117a(1, 4));
        }

        /* renamed from: b */
        public final void mo26048b(int i, boolean z) throws IOException {
            mo26055g(C5169t1.m16117a(i, 0));
            mo26042a(z ? (byte) 1 : 0);
        }

        /* renamed from: c */
        public final void mo26049c(int i, C5093i iVar) throws IOException {
            mo26055g(C5169t1.m16117a(1, 3));
            mo26060j(2, i);
            mo26045b(3, iVar);
            mo26055g(C5169t1.m16117a(1, 4));
        }

        /* renamed from: d */
        public final void mo26051d(long j) throws IOException {
            if (!C5125l.f13630c || mo26041a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f13636d;
                    int i = this.f13638f;
                    this.f13638f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f13636d;
                    int i2 = this.f13638f;
                    this.f13638f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C5129d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13638f), Integer.valueOf(this.f13637e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f13636d;
                    int i3 = this.f13638f;
                    this.f13638f = i3 + 1;
                    C5154r1.m15973a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f13636d;
                int i4 = this.f13638f;
                this.f13638f = i4 + 1;
                C5154r1.m15973a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: e */
        public final void mo26052e(int i) throws IOException {
            try {
                byte[] bArr = this.f13636d;
                int i2 = this.f13638f;
                int i3 = i2 + 1;
                this.f13638f = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                this.f13638f = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                this.f13638f = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f13638f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C5129d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13638f), Integer.valueOf(this.f13637e), 1}), e);
            }
        }

        /* renamed from: f */
        public final void mo26054f(int i, long j) throws IOException {
            mo26055g(C5169t1.m16117a(i, 1));
            mo26050c(j);
        }

        /* renamed from: g */
        public final void mo26055g(int i) throws IOException {
            if (!C5125l.f13630c || C5072d.m15287a() || mo26041a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f13636d;
                    int i2 = this.f13638f;
                    this.f13638f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f13636d;
                    int i3 = this.f13638f;
                    this.f13638f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C5129d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13638f), Integer.valueOf(this.f13637e), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f13636d;
                int i4 = this.f13638f;
                this.f13638f = i4 + 1;
                C5154r1.m15973a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f13636d;
                int i5 = this.f13638f;
                this.f13638f = i5 + 1;
                C5154r1.m15973a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f13636d;
                    int i7 = this.f13638f;
                    this.f13638f = i7 + 1;
                    C5154r1.m15973a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f13636d;
                int i8 = this.f13638f;
                this.f13638f = i8 + 1;
                C5154r1.m15973a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f13636d;
                    int i10 = this.f13638f;
                    this.f13638f = i10 + 1;
                    C5154r1.m15973a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f13636d;
                int i11 = this.f13638f;
                this.f13638f = i11 + 1;
                C5154r1.m15973a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f13636d;
                    int i13 = this.f13638f;
                    this.f13638f = i13 + 1;
                    C5154r1.m15973a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f13636d;
                int i14 = this.f13638f;
                this.f13638f = i14 + 1;
                C5154r1.m15973a(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f13636d;
                int i15 = this.f13638f;
                this.f13638f = i15 + 1;
                C5154r1.m15973a(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: h */
        public final void mo26058h(int i, int i2) throws IOException {
            mo26055g(C5169t1.m16117a(i, 0));
            if (i2 >= 0) {
                mo26055g(i2);
            } else {
                mo26051d((long) i2);
            }
        }

        /* renamed from: i */
        public final void mo26059i(int i, int i2) throws IOException {
            mo26055g(C5169t1.m16117a(i, i2));
        }

        /* renamed from: j */
        public final void mo26060j(int i, int i2) throws IOException {
            mo26055g(C5169t1.m16117a(i, 0));
            mo26055g(i2);
        }

        /* renamed from: b */
        public final void mo26045b(int i, C5093i iVar) throws IOException {
            mo26055g(C5169t1.m16117a(i, 2));
            mo26066b(iVar);
        }

        /* renamed from: f */
        public final void mo26053f(int i) throws IOException {
            if (i >= 0) {
                mo26055g(i);
            } else {
                mo26051d((long) i);
            }
        }

        /* renamed from: b */
        public final void mo26046b(int i, C5149q0 q0Var, C5083f1 f1Var) throws IOException {
            mo26055g(C5169t1.m16117a(i, 2));
            mo26055g(((C5058a) q0Var).getSerializedSize(f1Var));
            f1Var.mo25870a(q0Var, (C5184u1) this.f13631a);
        }

        /* renamed from: c */
        public final void mo26050c(long j) throws IOException {
            try {
                byte[] bArr = this.f13636d;
                int i = this.f13638f;
                int i2 = i + 1;
                this.f13638f = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                this.f13638f = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                this.f13638f = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                this.f13638f = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                this.f13638f = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                this.f13638f = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                this.f13638f = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f13638f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C5129d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13638f), Integer.valueOf(this.f13637e), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo26042a(byte b) throws IOException {
            try {
                byte[] bArr = this.f13636d;
                int i = this.f13638f;
                this.f13638f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C5129d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13638f), Integer.valueOf(this.f13637e), 1}), e);
            }
        }

        /* renamed from: b */
        public final void mo26047b(int i, String str) throws IOException {
            mo26055g(C5169t1.m16117a(i, 2));
            mo26067b(str);
        }

        /* renamed from: b */
        public final void mo26066b(C5093i iVar) throws IOException {
            mo26055g(iVar.size());
            iVar.mo25906a((C5090h) this);
        }

        /* renamed from: a */
        public final void mo25892a(byte[] bArr, int i, int i2) throws IOException {
            mo26068b(bArr, i, i2);
        }

        /* renamed from: a */
        public final int mo26041a() {
            return this.f13637e - this.f13638f;
        }

        /* renamed from: b */
        public final void mo26068b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f13636d, this.f13638f, i2);
                this.f13638f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C5129d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13638f), Integer.valueOf(this.f13637e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: b */
        public final void mo26067b(String str) throws IOException {
            int i = this.f13638f;
            try {
                int c = C5125l.m15785c(str.length() * 3);
                int c2 = C5125l.m15785c(str.length());
                if (c2 == c) {
                    int i2 = i + c2;
                    this.f13638f = i2;
                    int a = C5161s1.f13672a.mo26168a((CharSequence) str, this.f13636d, i2, mo26041a());
                    this.f13638f = i;
                    mo26055g((a - i) - c2);
                    this.f13638f = a;
                    return;
                }
                mo26055g(C5161s1.m16046a((CharSequence) str));
                this.f13638f = C5161s1.f13672a.mo26168a((CharSequence) str, this.f13636d, this.f13638f, mo26041a());
            } catch (C5161s1.C5165d e) {
                this.f13638f = i;
                mo26044a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C5129d(e2);
            }
        }

        /* renamed from: g */
        public final void mo26056g(int i, int i2) throws IOException {
            mo26055g(C5169t1.m16117a(i, 5));
            mo26052e(i2);
        }

        /* renamed from: g */
        public final void mo26057g(int i, long j) throws IOException {
            mo26055g(C5169t1.m16117a(i, 0));
            mo26051d(j);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$e */
    public static final class C5130e extends C5127b {

        /* renamed from: h */
        public final OutputStream f13639h;

        public C5130e(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f13639h = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: a */
        public void mo26043a(int i, C5149q0 q0Var) throws IOException {
            mo26055g(C5169t1.m16117a(1, 3));
            mo26060j(2, i);
            mo26055g(C5169t1.m16117a(3, 2));
            mo26055g(q0Var.getSerializedSize());
            q0Var.writeTo(this);
            mo26055g(C5169t1.m16117a(1, 4));
        }

        /* renamed from: b */
        public void mo26045b(int i, C5093i iVar) throws IOException {
            mo26055g(C5169t1.m16117a(i, 2));
            mo26070b(iVar);
        }

        /* renamed from: c */
        public void mo26049c(int i, C5093i iVar) throws IOException {
            mo26055g(C5169t1.m16117a(1, 3));
            mo26060j(2, i);
            mo26045b(3, iVar);
            mo26055g(C5169t1.m16117a(1, 4));
        }

        /* renamed from: d */
        public void mo26051d(long j) throws IOException {
            mo26073j(10);
            mo26063f(j);
        }

        /* renamed from: e */
        public void mo26052e(int i) throws IOException {
            mo26073j(4);
            mo26064h(i);
        }

        /* renamed from: f */
        public void mo26054f(int i, long j) throws IOException {
            mo26073j(18);
            mo26065i(C5169t1.m16117a(i, 1));
            mo26062e(j);
        }

        /* renamed from: g */
        public void mo26056g(int i, int i2) throws IOException {
            mo26073j(14);
            mo26065i(C5169t1.m16117a(i, 5));
            mo26064h(i2);
        }

        /* renamed from: h */
        public void mo26058h(int i, int i2) throws IOException {
            mo26073j(20);
            mo26065i(C5169t1.m16117a(i, 0));
            if (i2 >= 0) {
                mo26065i(i2);
            } else {
                mo26063f((long) i2);
            }
        }

        /* renamed from: i */
        public void mo26059i(int i, int i2) throws IOException {
            mo26055g(C5169t1.m16117a(i, i2));
        }

        /* renamed from: j */
        public void mo26060j(int i, int i2) throws IOException {
            mo26073j(20);
            mo26065i(C5169t1.m16117a(i, 0));
            mo26065i(i2);
        }

        /* renamed from: b */
        public void mo26046b(int i, C5149q0 q0Var, C5083f1 f1Var) throws IOException {
            mo26055g(C5169t1.m16117a(i, 2));
            mo26055g(((C5058a) q0Var).getSerializedSize(f1Var));
            f1Var.mo25870a(q0Var, (C5184u1) this.f13631a);
        }

        /* renamed from: f */
        public void mo26053f(int i) throws IOException {
            if (i >= 0) {
                mo26073j(5);
                mo26065i(i);
                return;
            }
            mo26051d((long) i);
        }

        /* renamed from: g */
        public void mo26057g(int i, long j) throws IOException {
            mo26073j(20);
            mo26065i(C5169t1.m16117a(i, 0));
            mo26063f(j);
        }

        /* renamed from: j */
        public final void mo26073j(int i) throws IOException {
            if (this.f13633e - this.f13634f < i) {
                mo26069b();
            }
        }

        /* renamed from: c */
        public void mo26050c(long j) throws IOException {
            mo26073j(8);
            mo26062e(j);
        }

        /* renamed from: b */
        public void mo26047b(int i, String str) throws IOException {
            mo26055g(C5169t1.m16117a(i, 2));
            mo26071b(str);
        }

        /* renamed from: a */
        public void mo26042a(byte b) throws IOException {
            if (this.f13634f == this.f13633e) {
                mo26069b();
            }
            mo26061b(b);
        }

        /* renamed from: g */
        public void mo26055g(int i) throws IOException {
            mo26073j(5);
            mo26065i(i);
        }

        /* renamed from: b */
        public void mo26048b(int i, boolean z) throws IOException {
            mo26073j(11);
            mo26065i(C5169t1.m16117a(i, 0));
            mo26061b(z ? (byte) 1 : 0);
        }

        /* renamed from: b */
        public void mo26070b(C5093i iVar) throws IOException {
            mo26055g(iVar.size());
            iVar.mo25906a((C5090h) this);
        }

        /* renamed from: a */
        public void mo25892a(byte[] bArr, int i, int i2) throws IOException {
            mo26072b(bArr, i, i2);
        }

        /* renamed from: b */
        public void mo26071b(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int c = C5125l.m15785c(length);
                int i3 = c + length;
                int i4 = this.f13633e;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int a = C5161s1.f13672a.mo26168a((CharSequence) str, bArr, 0, length);
                    mo26055g(a);
                    mo26072b(bArr, 0, a);
                    return;
                }
                if (i3 > i4 - this.f13634f) {
                    mo26069b();
                }
                int c2 = C5125l.m15785c(str.length());
                i = this.f13634f;
                if (c2 == c) {
                    int i5 = i + c2;
                    this.f13634f = i5;
                    int a2 = C5161s1.f13672a.mo26168a((CharSequence) str, this.f13632d, i5, this.f13633e - i5);
                    this.f13634f = i;
                    i2 = (a2 - i) - c2;
                    mo26065i(i2);
                    this.f13634f = a2;
                } else {
                    i2 = C5161s1.m16046a((CharSequence) str);
                    mo26065i(i2);
                    this.f13634f = C5161s1.f13672a.mo26168a((CharSequence) str, this.f13632d, this.f13634f, i2);
                }
                this.f13635g += i2;
            } catch (C5161s1.C5165d e) {
                this.f13635g -= this.f13634f - i;
                this.f13634f = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C5129d(e2);
            } catch (C5161s1.C5165d e3) {
                mo26044a(str, e3);
            }
        }

        /* renamed from: b */
        public void mo26072b(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f13633e;
            int i4 = this.f13634f;
            int i5 = i3 - i4;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, this.f13632d, i4, i2);
                this.f13634f += i2;
                this.f13635g += i2;
                return;
            }
            System.arraycopy(bArr, i, this.f13632d, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f13634f = this.f13633e;
            this.f13635g += i5;
            mo26069b();
            if (i7 <= this.f13633e) {
                System.arraycopy(bArr, i6, this.f13632d, 0, i7);
                this.f13634f = i7;
            } else {
                this.f13639h.write(bArr, i6, i7);
            }
            this.f13635g += i7;
        }

        /* renamed from: b */
        public final void mo26069b() throws IOException {
            this.f13639h.write(this.f13632d, 0, this.f13634f);
            this.f13634f = 0;
        }
    }

    public C5125l() {
    }

    /* renamed from: b */
    public static int m15783b(int i, long j) {
        return m15781b(i) + m15776a(j);
    }

    /* renamed from: c */
    public static int m15787c(int i, long j) {
        return m15781b(i) + 8;
    }

    /* renamed from: d */
    public static int m15790d(int i, long j) {
        return m15781b(i) + m15776a(m15784b(j));
    }

    /* renamed from: a */
    public static int m15777a(C5073d0 d0Var) {
        int i;
        if (d0Var.f13536b != null) {
            i = d0Var.f13536b.size();
        } else {
            i = d0Var.f13535a != null ? d0Var.f13535a.getSerializedSize() : 0;
        }
        return m15785c(i) + i;
    }

    /* renamed from: e */
    public static int m15792e(int i, long j) {
        return m15781b(i) + m15776a(j);
    }

    /* renamed from: b */
    public static int m15781b(int i) {
        return m15785c(C5169t1.m16117a(i, 0));
    }

    /* renamed from: a */
    public static int m15771a(int i, long j) {
        return m15781b(i) + 8;
    }

    /* renamed from: a */
    public static int m15769a(int i, float f) {
        return m15781b(i) + 4;
    }

    /* renamed from: a */
    public static int m15768a(int i, double d) {
        return m15781b(i) + 8;
    }

    /* renamed from: a */
    public static int m15775a(int i, boolean z) {
        return m15781b(i) + 1;
    }

    /* renamed from: a */
    public static int m15770a(int i, int i2) {
        return m15781b(i) + m15767a(i2);
    }

    /* renamed from: a */
    public static int m15774a(int i, String str) {
        return m15781b(i) + m15779a(str);
    }

    /* renamed from: a */
    public static int m15772a(int i, C5093i iVar) {
        int b = m15781b(i);
        int size = iVar.size();
        return b + m15785c(size) + size;
    }

    /* renamed from: a */
    public static int m15767a(int i) {
        if (i >= 0) {
            return m15785c(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m15779a(String str) {
        int i;
        try {
            i = C5161s1.m16046a((CharSequence) str);
        } catch (C5161s1.C5165d unused) {
            i = str.getBytes(C5194z.f13762a).length;
        }
        return m15785c(i) + i;
    }

    /* renamed from: a */
    public static int m15778a(C5093i iVar) {
        int size = iVar.size();
        return m15785c(size) + size;
    }

    /* renamed from: a */
    public final void mo26044a(String str, C5161s1.C5165d dVar) throws IOException {
        f13629b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C5194z.f13762a);
        try {
            mo26055g(bytes.length);
            mo25892a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C5129d(e);
        } catch (C5129d e2) {
            throw e2;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static int m15773a(int i, C5149q0 q0Var, C5083f1 f1Var) {
        return (m15781b(i) * 2) + ((C5058a) q0Var).getSerializedSize(f1Var);
    }
}
