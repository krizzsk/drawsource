package com.tapjoy.internal;

import com.google.common.base.Ascii;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.tapjoy.internal.ip */
public final class C11623ip {

    /* renamed from: a */
    private final byte[] f28002a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f28003b;

    /* renamed from: c */
    private C11622io f28004c;

    /* renamed from: d */
    private int f28005d = 0;

    /* renamed from: a */
    public final C11623ip mo70204a(byte[] bArr) {
        if (bArr != null) {
            m31835a(ByteBuffer.wrap(bArr));
        } else {
            this.f28003b = null;
            this.f28004c.f27990b = 2;
        }
        return this;
    }

    /* renamed from: a */
    public final C11622io mo70203a() {
        if (this.f28003b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m31847l()) {
            return this.f28004c;
        } else {
            m31842g();
            if (!m31847l()) {
                m31837b();
                if (this.f28004c.f27991c < 0) {
                    this.f28004c.f27990b = 1;
                }
            }
            return this.f28004c;
        }
    }

    /* renamed from: b */
    private void m31837b() {
        m31838c();
    }

    /* renamed from: c */
    private void m31838c() {
        boolean z = false;
        while (!z && !m31847l() && this.f28004c.f27991c <= Integer.MAX_VALUE) {
            int k = m31846k();
            if (k == 33) {
                int k2 = m31846k();
                if (k2 == 1) {
                    m31844i();
                } else if (k2 == 249) {
                    this.f28004c.f27992d = new C11621in();
                    m31839d();
                } else if (k2 == 254) {
                    m31844i();
                } else if (k2 != 255) {
                    m31844i();
                } else {
                    m31845j();
                    String str = "";
                    for (int i = 0; i < 11; i++) {
                        str = str + ((char) this.f28002a[i]);
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        m31841f();
                    } else {
                        m31844i();
                    }
                }
            } else if (k == 44) {
                if (this.f28004c.f27992d == null) {
                    this.f28004c.f27992d = new C11621in();
                }
                m31840e();
            } else if (k != 59) {
                this.f28004c.f27990b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: d */
    private void m31839d() {
        m31846k();
        int k = m31846k();
        this.f28004c.f27992d.f27984g = (k & 28) >> 2;
        boolean z = true;
        if (this.f28004c.f27992d.f27984g == 0) {
            this.f28004c.f27992d.f27984g = 1;
        }
        C11621in inVar = this.f28004c.f27992d;
        if ((k & 1) == 0) {
            z = false;
        }
        inVar.f27983f = z;
        short s = this.f28003b.getShort();
        if (s < 2) {
            s = 10;
        }
        this.f28004c.f27992d.f27986i = s * 10;
        this.f28004c.f27992d.f27985h = m31846k();
        m31846k();
    }

    /* renamed from: e */
    private void m31840e() {
        this.f28004c.f27992d.f27978a = this.f28003b.getShort();
        this.f28004c.f27992d.f27979b = this.f28003b.getShort();
        this.f28004c.f27992d.f27980c = this.f28003b.getShort();
        this.f28004c.f27992d.f27981d = this.f28003b.getShort();
        int k = m31846k();
        boolean z = false;
        boolean z2 = (k & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((k & 7) + 1));
        C11621in inVar = this.f28004c.f27992d;
        if ((k & 64) != 0) {
            z = true;
        }
        inVar.f27982e = z;
        if (z2) {
            this.f28004c.f27992d.f27988k = m31836a(pow);
        } else {
            this.f28004c.f27992d.f27988k = null;
        }
        this.f28004c.f27992d.f27987j = this.f28003b.position();
        m31843h();
        if (!m31847l()) {
            this.f28004c.f27991c++;
            this.f28004c.f27993e.add(this.f28004c.f27992d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31841f() {
        /*
            r3 = this;
        L_0x0000:
            r3.m31845j()
            byte[] r0 = r3.f28002a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x0026
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.tapjoy.internal.io r2 = r3.f28004c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f28001m = r0
            com.tapjoy.internal.io r0 = r3.f28004c
            int r0 = r0.f28001m
            if (r0 != 0) goto L_0x0026
            com.tapjoy.internal.io r0 = r3.f28004c
            r1 = -1
            r0.f28001m = r1
        L_0x0026:
            int r0 = r3.f28005d
            if (r0 <= 0) goto L_0x0030
            boolean r0 = r3.m31847l()
            if (r0 == 0) goto L_0x0000
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11623ip.m31841f():void");
    }

    /* renamed from: g */
    private void m31842g() {
        boolean z = false;
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) m31846k());
        }
        if (!str.startsWith("GIF")) {
            this.f28004c.f27990b = 1;
            return;
        }
        this.f28004c.f27994f = this.f28003b.getShort();
        this.f28004c.f27995g = this.f28003b.getShort();
        int k = m31846k();
        C11622io ioVar = this.f28004c;
        if ((k & 128) != 0) {
            z = true;
        }
        ioVar.f27996h = z;
        this.f28004c.f27997i = 2 << (k & 7);
        this.f28004c.f27998j = m31846k();
        this.f28004c.f27999k = m31846k();
        if (this.f28004c.f27996h && !m31847l()) {
            C11622io ioVar2 = this.f28004c;
            ioVar2.f27989a = m31836a(ioVar2.f27997i);
            C11622io ioVar3 = this.f28004c;
            ioVar3.f28000l = ioVar3.f27989a[this.f28004c.f27998j];
        }
    }

    /* renamed from: a */
    private int[] m31836a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f28003b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << Ascii.DLE) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            Object[] objArr = new Object[1];
            this.f28004c.f27990b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m31843h() {
        m31846k();
        m31844i();
    }

    /* renamed from: i */
    private void m31844i() {
        int k;
        do {
            try {
                k = m31846k();
                this.f28003b.position(this.f28003b.position() + k);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (k > 0);
    }

    /* renamed from: j */
    private int m31845j() {
        int k = m31846k();
        this.f28005d = k;
        int i = 0;
        if (k > 0) {
            int i2 = 0;
            while (i < this.f28005d) {
                try {
                    i2 = this.f28005d - i;
                    this.f28003b.get(this.f28002a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    Object[] objArr = new Object[4];
                    Integer.valueOf(i);
                    Integer.valueOf(i2);
                    Integer.valueOf(this.f28005d);
                    this.f28004c.f27990b = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: k */
    private int m31846k() {
        try {
            return this.f28003b.get() & 255;
        } catch (Exception unused) {
            this.f28004c.f27990b = 1;
            return 0;
        }
    }

    /* renamed from: l */
    private boolean m31847l() {
        return this.f28004c.f27990b != 0;
    }

    /* renamed from: a */
    private C11623ip m31835a(ByteBuffer byteBuffer) {
        this.f28003b = null;
        Arrays.fill(this.f28002a, (byte) 0);
        this.f28004c = new C11622io();
        this.f28005d = 0;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f28003b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f28003b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
