package com.tapjoy.internal;

import android.graphics.Bitmap;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.im */
public class C11619im {

    /* renamed from: d */
    private static final String f27953d = C11619im.class.getSimpleName();

    /* renamed from: a */
    int f27954a;

    /* renamed from: b */
    int f27955b;

    /* renamed from: c */
    C11622io f27956c;

    /* renamed from: e */
    private int[] f27957e;

    /* renamed from: f */
    private final int[] f27958f;

    /* renamed from: g */
    private ByteBuffer f27959g;

    /* renamed from: h */
    private byte[] f27960h;
    @Nullable

    /* renamed from: i */
    private byte[] f27961i;

    /* renamed from: j */
    private int f27962j;

    /* renamed from: k */
    private int f27963k;

    /* renamed from: l */
    private C11623ip f27964l;

    /* renamed from: m */
    private short[] f27965m;

    /* renamed from: n */
    private byte[] f27966n;

    /* renamed from: o */
    private byte[] f27967o;

    /* renamed from: p */
    private byte[] f27968p;

    /* renamed from: q */
    private int[] f27969q;

    /* renamed from: r */
    private C11620a f27970r;

    /* renamed from: s */
    private Bitmap f27971s;

    /* renamed from: t */
    private boolean f27972t;

    /* renamed from: u */
    private int f27973u;

    /* renamed from: v */
    private int f27974v;

    /* renamed from: w */
    private int f27975w;

    /* renamed from: x */
    private int f27976x;

    /* renamed from: y */
    private boolean f27977y;

    /* renamed from: com.tapjoy.internal.im$a */
    interface C11620a {
        @Nonnull
        /* renamed from: a */
        Bitmap mo70200a(int i, int i2, Bitmap.Config config);

        /* renamed from: a */
        byte[] mo70201a(int i);

        /* renamed from: b */
        int[] mo70202b(int i);
    }

    C11619im(C11620a aVar, C11622io ioVar, ByteBuffer byteBuffer) {
        this(aVar, ioVar, byteBuffer, (byte) 0);
    }

    private C11619im(C11620a aVar, C11622io ioVar, ByteBuffer byteBuffer, byte b) {
        this(aVar);
        m31824b(ioVar, byteBuffer);
    }

    private C11619im(C11620a aVar) {
        this.f27958f = new int[256];
        this.f27962j = 0;
        this.f27963k = 0;
        this.f27970r = aVar;
        this.f27956c = new C11622io();
    }

    C11619im() {
        this(new C11629ir());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r2v41, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap mo70199b() {
        /*
            r29 = this;
            r1 = r29
            monitor-enter(r29)
            com.tapjoy.internal.io r0 = r1.f27956c     // Catch:{ all -> 0x03ec }
            int r0 = r0.f27991c     // Catch:{ all -> 0x03ec }
            r2 = 2
            r3 = 1
            if (r0 <= 0) goto L_0x000f
            int r0 = r1.f27954a     // Catch:{ all -> 0x03ec }
            if (r0 >= 0) goto L_0x001f
        L_0x000f:
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x03ec }
            com.tapjoy.internal.io r0 = r1.f27956c     // Catch:{ all -> 0x03ec }
            int r0 = r0.f27991c     // Catch:{ all -> 0x03ec }
            java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03ec }
            int r0 = r1.f27954a     // Catch:{ all -> 0x03ec }
            java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03ec }
            r1.f27973u = r3     // Catch:{ all -> 0x03ec }
        L_0x001f:
            int r0 = r1.f27973u     // Catch:{ all -> 0x03ec }
            r4 = 0
            if (r0 == r3) goto L_0x03e2
            int r0 = r1.f27973u     // Catch:{ all -> 0x03ec }
            if (r0 != r2) goto L_0x002a
            goto L_0x03e2
        L_0x002a:
            r0 = 0
            r1.f27973u = r0     // Catch:{ all -> 0x03ec }
            com.tapjoy.internal.io r5 = r1.f27956c     // Catch:{ all -> 0x03ec }
            java.util.List<com.tapjoy.internal.in> r5 = r5.f27993e     // Catch:{ all -> 0x03ec }
            int r6 = r1.f27954a     // Catch:{ all -> 0x03ec }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x03ec }
            com.tapjoy.internal.in r5 = (com.tapjoy.internal.C11621in) r5     // Catch:{ all -> 0x03ec }
            int r6 = r1.f27954a     // Catch:{ all -> 0x03ec }
            int r6 = r6 - r3
            if (r6 < 0) goto L_0x0049
            com.tapjoy.internal.io r7 = r1.f27956c     // Catch:{ all -> 0x03ec }
            java.util.List<com.tapjoy.internal.in> r7 = r7.f27993e     // Catch:{ all -> 0x03ec }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x03ec }
            com.tapjoy.internal.in r6 = (com.tapjoy.internal.C11621in) r6     // Catch:{ all -> 0x03ec }
            goto L_0x004a
        L_0x0049:
            r6 = r4
        L_0x004a:
            int[] r7 = r5.f27988k     // Catch:{ all -> 0x03ec }
            if (r7 == 0) goto L_0x0051
            int[] r7 = r5.f27988k     // Catch:{ all -> 0x03ec }
            goto L_0x0055
        L_0x0051:
            com.tapjoy.internal.io r7 = r1.f27956c     // Catch:{ all -> 0x03ec }
            int[] r7 = r7.f27989a     // Catch:{ all -> 0x03ec }
        L_0x0055:
            r1.f27957e = r7     // Catch:{ all -> 0x03ec }
            if (r7 != 0) goto L_0x0064
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x03ec }
            int r0 = r1.f27954a     // Catch:{ all -> 0x03ec }
            java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03ec }
            r1.f27973u = r3     // Catch:{ all -> 0x03ec }
            monitor-exit(r29)
            return r4
        L_0x0064:
            boolean r4 = r5.f27983f     // Catch:{ all -> 0x03ec }
            if (r4 == 0) goto L_0x007a
            int[] r4 = r1.f27957e     // Catch:{ all -> 0x03ec }
            int[] r7 = r1.f27958f     // Catch:{ all -> 0x03ec }
            int[] r8 = r1.f27957e     // Catch:{ all -> 0x03ec }
            int r8 = r8.length     // Catch:{ all -> 0x03ec }
            java.lang.System.arraycopy(r4, r0, r7, r0, r8)     // Catch:{ all -> 0x03ec }
            int[] r4 = r1.f27958f     // Catch:{ all -> 0x03ec }
            r1.f27957e = r4     // Catch:{ all -> 0x03ec }
            int r7 = r5.f27985h     // Catch:{ all -> 0x03ec }
            r4[r7] = r0     // Catch:{ all -> 0x03ec }
        L_0x007a:
            int[] r4 = r1.f27969q     // Catch:{ all -> 0x03ec }
            if (r6 != 0) goto L_0x0081
            java.util.Arrays.fill(r4, r0)     // Catch:{ all -> 0x03ec }
        L_0x0081:
            r7 = 3
            if (r6 == 0) goto L_0x00dd
            int r8 = r6.f27984g     // Catch:{ all -> 0x03ec }
            if (r8 <= 0) goto L_0x00dd
            int r8 = r6.f27984g     // Catch:{ all -> 0x03ec }
            if (r8 != r2) goto L_0x00ac
            boolean r8 = r5.f27983f     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x00a1
            com.tapjoy.internal.io r8 = r1.f27956c     // Catch:{ all -> 0x03ec }
            int r8 = r8.f28000l     // Catch:{ all -> 0x03ec }
            int[] r9 = r5.f27988k     // Catch:{ all -> 0x03ec }
            if (r9 == 0) goto L_0x00a8
            com.tapjoy.internal.io r9 = r1.f27956c     // Catch:{ all -> 0x03ec }
            int r9 = r9.f27998j     // Catch:{ all -> 0x03ec }
            int r10 = r5.f27985h     // Catch:{ all -> 0x03ec }
            if (r9 != r10) goto L_0x00a8
            goto L_0x00a7
        L_0x00a1:
            int r8 = r1.f27954a     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x00a7
            r1.f27977y = r3     // Catch:{ all -> 0x03ec }
        L_0x00a7:
            r8 = r0
        L_0x00a8:
            r1.m31823a(r4, r6, r8)     // Catch:{ all -> 0x03ec }
            goto L_0x00dd
        L_0x00ac:
            int r8 = r6.f27984g     // Catch:{ all -> 0x03ec }
            if (r8 != r7) goto L_0x00dd
            android.graphics.Bitmap r8 = r1.f27971s     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x00b8
            r1.m31823a(r4, r6, r0)     // Catch:{ all -> 0x03ec }
            goto L_0x00dd
        L_0x00b8:
            int r8 = r6.f27981d     // Catch:{ all -> 0x03ec }
            int r9 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r15 = r8 / r9
            int r8 = r6.f27979b     // Catch:{ all -> 0x03ec }
            int r9 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r13 = r8 / r9
            int r8 = r6.f27980c     // Catch:{ all -> 0x03ec }
            int r9 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r14 = r8 / r9
            int r6 = r6.f27978a     // Catch:{ all -> 0x03ec }
            int r8 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r12 = r6 / r8
            int r6 = r1.f27976x     // Catch:{ all -> 0x03ec }
            int r6 = r6 * r13
            int r10 = r6 + r12
            android.graphics.Bitmap r8 = r1.f27971s     // Catch:{ all -> 0x03ec }
            int r11 = r1.f27976x     // Catch:{ all -> 0x03ec }
            r9 = r4
            r8.getPixels(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x03ec }
        L_0x00dd:
            r1.f27962j = r0     // Catch:{ all -> 0x03ec }
            r1.f27963k = r0     // Catch:{ all -> 0x03ec }
            if (r5 == 0) goto L_0x00ea
            java.nio.ByteBuffer r6 = r1.f27959g     // Catch:{ all -> 0x03ec }
            int r8 = r5.f27987j     // Catch:{ all -> 0x03ec }
            r6.position(r8)     // Catch:{ all -> 0x03ec }
        L_0x00ea:
            if (r5 != 0) goto L_0x00f6
            com.tapjoy.internal.io r6 = r1.f27956c     // Catch:{ all -> 0x03ec }
            int r6 = r6.f27994f     // Catch:{ all -> 0x03ec }
            com.tapjoy.internal.io r8 = r1.f27956c     // Catch:{ all -> 0x03ec }
            int r8 = r8.f27995g     // Catch:{ all -> 0x03ec }
        L_0x00f4:
            int r6 = r6 * r8
            goto L_0x00fb
        L_0x00f6:
            int r6 = r5.f27980c     // Catch:{ all -> 0x03ec }
            int r8 = r5.f27981d     // Catch:{ all -> 0x03ec }
            goto L_0x00f4
        L_0x00fb:
            byte[] r8 = r1.f27968p     // Catch:{ all -> 0x03ec }
            if (r8 == 0) goto L_0x0104
            byte[] r8 = r1.f27968p     // Catch:{ all -> 0x03ec }
            int r8 = r8.length     // Catch:{ all -> 0x03ec }
            if (r8 >= r6) goto L_0x010c
        L_0x0104:
            com.tapjoy.internal.im$a r8 = r1.f27970r     // Catch:{ all -> 0x03ec }
            byte[] r8 = r8.mo70201a(r6)     // Catch:{ all -> 0x03ec }
            r1.f27968p = r8     // Catch:{ all -> 0x03ec }
        L_0x010c:
            short[] r8 = r1.f27965m     // Catch:{ all -> 0x03ec }
            r9 = 4096(0x1000, float:5.74E-42)
            if (r8 != 0) goto L_0x0116
            short[] r8 = new short[r9]     // Catch:{ all -> 0x03ec }
            r1.f27965m = r8     // Catch:{ all -> 0x03ec }
        L_0x0116:
            byte[] r8 = r1.f27966n     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x011e
            byte[] r8 = new byte[r9]     // Catch:{ all -> 0x03ec }
            r1.f27966n = r8     // Catch:{ all -> 0x03ec }
        L_0x011e:
            byte[] r8 = r1.f27967o     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x0128
            r8 = 4097(0x1001, float:5.741E-42)
            byte[] r8 = new byte[r8]     // Catch:{ all -> 0x03ec }
            r1.f27967o = r8     // Catch:{ all -> 0x03ec }
        L_0x0128:
            int r8 = r29.m31826d()     // Catch:{ all -> 0x03ec }
            int r10 = r3 << r8
            int r11 = r10 + 1
            int r12 = r10 + 2
            int r8 = r8 + r3
            int r13 = r3 << r8
            int r13 = r13 - r3
            r14 = r0
        L_0x0137:
            if (r14 >= r10) goto L_0x0146
            short[] r15 = r1.f27965m     // Catch:{ all -> 0x03ec }
            r15[r14] = r0     // Catch:{ all -> 0x03ec }
            byte[] r15 = r1.f27966n     // Catch:{ all -> 0x03ec }
            byte r3 = (byte) r14     // Catch:{ all -> 0x03ec }
            r15[r14] = r3     // Catch:{ all -> 0x03ec }
            int r14 = r14 + 1
            r3 = 1
            goto L_0x0137
        L_0x0146:
            r3 = -1
            r14 = r0
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r21 = r19
            r22 = r21
            r20 = r3
            r25 = r8
            r23 = r12
            r24 = r13
        L_0x015d:
            r26 = 8
            if (r14 >= r6) goto L_0x0256
            if (r15 != 0) goto L_0x016f
            int r15 = r29.m31827e()     // Catch:{ all -> 0x03ec }
            if (r15 > 0) goto L_0x016d
            r1.f27973u = r7     // Catch:{ all -> 0x03ec }
            goto L_0x0256
        L_0x016d:
            r18 = r0
        L_0x016f:
            byte[] r2 = r1.f27960h     // Catch:{ all -> 0x03ec }
            byte r2 = r2[r18]     // Catch:{ all -> 0x03ec }
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r16
            int r17 = r17 + r2
            int r16 = r16 + 8
            int r18 = r18 + 1
            int r15 = r15 + r3
            r2 = r16
            r0 = r20
            r9 = r21
            r3 = r23
            r7 = r25
        L_0x0188:
            if (r2 < r7) goto L_0x0244
            r25 = r8
            r8 = r17 & r24
            int r17 = r17 >> r7
            int r2 = r2 - r7
            if (r8 != r10) goto L_0x019b
            r3 = r12
            r24 = r13
            r7 = r25
            r8 = r7
            r0 = -1
            goto L_0x0188
        L_0x019b:
            if (r8 <= r3) goto L_0x01a4
            r26 = r2
            r2 = 3
            r1.f27973u = r2     // Catch:{ all -> 0x03ec }
            goto L_0x0230
        L_0x01a4:
            r26 = r2
            if (r8 == r11) goto L_0x0230
            r2 = -1
            if (r0 != r2) goto L_0x01be
            byte[] r0 = r1.f27967o     // Catch:{ all -> 0x03ec }
            int r9 = r22 + 1
            byte[] r2 = r1.f27966n     // Catch:{ all -> 0x03ec }
            byte r2 = r2[r8]     // Catch:{ all -> 0x03ec }
            r0[r22] = r2     // Catch:{ all -> 0x03ec }
            r0 = r8
            r22 = r9
            r2 = r26
            r9 = r0
            r8 = r25
            goto L_0x0188
        L_0x01be:
            if (r8 < r3) goto L_0x01cb
            byte[] r2 = r1.f27967o     // Catch:{ all -> 0x03ec }
            int r27 = r22 + 1
            byte r9 = (byte) r9     // Catch:{ all -> 0x03ec }
            r2[r22] = r9     // Catch:{ all -> 0x03ec }
            r2 = r0
            r22 = r27
            goto L_0x01cc
        L_0x01cb:
            r2 = r8
        L_0x01cc:
            if (r2 < r10) goto L_0x01e3
            byte[] r9 = r1.f27967o     // Catch:{ all -> 0x03ec }
            int r27 = r22 + 1
            r28 = r8
            byte[] r8 = r1.f27966n     // Catch:{ all -> 0x03ec }
            byte r8 = r8[r2]     // Catch:{ all -> 0x03ec }
            r9[r22] = r8     // Catch:{ all -> 0x03ec }
            short[] r8 = r1.f27965m     // Catch:{ all -> 0x03ec }
            short r2 = r8[r2]     // Catch:{ all -> 0x03ec }
            r22 = r27
            r8 = r28
            goto L_0x01cc
        L_0x01e3:
            r28 = r8
            byte[] r8 = r1.f27966n     // Catch:{ all -> 0x03ec }
            byte r2 = r8[r2]     // Catch:{ all -> 0x03ec }
            r9 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = r1.f27967o     // Catch:{ all -> 0x03ec }
            int r8 = r22 + 1
            r27 = r8
            byte r8 = (byte) r9     // Catch:{ all -> 0x03ec }
            r2[r22] = r8     // Catch:{ all -> 0x03ec }
            r2 = 4096(0x1000, float:5.74E-42)
            if (r3 >= r2) goto L_0x0210
            short[] r2 = r1.f27965m     // Catch:{ all -> 0x03ec }
            short r0 = (short) r0     // Catch:{ all -> 0x03ec }
            r2[r3] = r0     // Catch:{ all -> 0x03ec }
            byte[] r0 = r1.f27966n     // Catch:{ all -> 0x03ec }
            r0[r3] = r8     // Catch:{ all -> 0x03ec }
            int r3 = r3 + 1
            r0 = r3 & r24
            r8 = 4096(0x1000, float:5.74E-42)
            if (r0 != 0) goto L_0x0211
            if (r3 >= r8) goto L_0x0211
            int r7 = r7 + 1
            int r24 = r24 + r3
            goto L_0x0211
        L_0x0210:
            r8 = r2
        L_0x0211:
            r22 = r27
        L_0x0213:
            if (r22 <= 0) goto L_0x0228
            byte[] r0 = r1.f27968p     // Catch:{ all -> 0x03ec }
            int r2 = r19 + 1
            byte[] r8 = r1.f27967o     // Catch:{ all -> 0x03ec }
            int r22 = r22 + -1
            byte r8 = r8[r22]     // Catch:{ all -> 0x03ec }
            r0[r19] = r8     // Catch:{ all -> 0x03ec }
            int r14 = r14 + 1
            r19 = r2
            r8 = 4096(0x1000, float:5.74E-42)
            goto L_0x0213
        L_0x0228:
            r8 = r25
            r2 = r26
            r0 = r28
            goto L_0x0188
        L_0x0230:
            r20 = r0
            r23 = r3
            r21 = r9
            r8 = r25
            r16 = r26
            r0 = 0
            r2 = 2
            r3 = -1
            r9 = 4096(0x1000, float:5.74E-42)
            r25 = r7
            r7 = 3
            goto L_0x015d
        L_0x0244:
            r20 = r0
            r16 = r2
            r23 = r3
            r25 = r7
            r21 = r9
            r0 = 0
            r2 = 2
            r3 = -1
            r7 = 3
            r9 = 4096(0x1000, float:5.74E-42)
            goto L_0x015d
        L_0x0256:
            r0 = r19
        L_0x0258:
            if (r0 >= r6) goto L_0x0262
            byte[] r2 = r1.f27968p     // Catch:{ all -> 0x03ec }
            r3 = 0
            r2[r0] = r3     // Catch:{ all -> 0x03ec }
            int r0 = r0 + 1
            goto L_0x0258
        L_0x0262:
            r3 = 0
            int r0 = r5.f27981d     // Catch:{ all -> 0x03ec }
            int r2 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r0 = r0 / r2
            int r2 = r5.f27979b     // Catch:{ all -> 0x03ec }
            int r6 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r2 = r2 / r6
            int r6 = r5.f27980c     // Catch:{ all -> 0x03ec }
            int r7 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r6 = r6 / r7
            int r7 = r5.f27978a     // Catch:{ all -> 0x03ec }
            int r8 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r7 = r7 / r8
            int r8 = r1.f27954a     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x027d
            r8 = 1
            goto L_0x027e
        L_0x027d:
            r8 = r3
        L_0x027e:
            r9 = r3
            r11 = r9
            r12 = r26
            r10 = 1
        L_0x0283:
            if (r11 >= r0) goto L_0x03a8
            boolean r13 = r5.f27982e     // Catch:{ all -> 0x03ec }
            if (r13 == 0) goto L_0x02a5
            r13 = 4
            if (r9 < r0) goto L_0x02a0
            int r10 = r10 + 1
            r14 = 2
            if (r10 == r14) goto L_0x029d
            r15 = 3
            if (r10 == r15) goto L_0x029a
            if (r10 == r13) goto L_0x0297
            goto L_0x02a2
        L_0x0297:
            r12 = r14
            r9 = 1
            goto L_0x02a2
        L_0x029a:
            r12 = r13
            r9 = r14
            goto L_0x02a2
        L_0x029d:
            r15 = 3
            r9 = r13
            goto L_0x02a2
        L_0x02a0:
            r14 = 2
            r15 = 3
        L_0x02a2:
            int r13 = r9 + r12
            goto L_0x02a9
        L_0x02a5:
            r14 = 2
            r15 = 3
            r13 = r9
            r9 = r11
        L_0x02a9:
            int r9 = r9 + r2
            int r3 = r1.f27975w     // Catch:{ all -> 0x03ec }
            if (r9 >= r3) goto L_0x0392
            int r3 = r1.f27976x     // Catch:{ all -> 0x03ec }
            int r9 = r9 * r3
            int r3 = r9 + r7
            int r14 = r3 + r6
            int r15 = r1.f27976x     // Catch:{ all -> 0x03ec }
            int r15 = r15 + r9
            if (r15 >= r14) goto L_0x02bd
            int r14 = r1.f27976x     // Catch:{ all -> 0x03ec }
            int r14 = r14 + r9
        L_0x02bd:
            int r9 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r9 = r9 * r11
            int r15 = r5.f27980c     // Catch:{ all -> 0x03ec }
            int r9 = r9 * r15
            int r15 = r14 - r3
            r17 = r0
            int r0 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r15 = r15 * r0
            int r15 = r15 + r9
        L_0x02cb:
            if (r3 >= r14) goto L_0x0394
            int r0 = r1.f27974v     // Catch:{ all -> 0x03ec }
            r18 = r2
            r2 = 1
            if (r0 != r2) goto L_0x02e4
            byte[] r0 = r1.f27968p     // Catch:{ all -> 0x03ec }
            byte r0 = r0[r9]     // Catch:{ all -> 0x03ec }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int[] r2 = r1.f27957e     // Catch:{ all -> 0x03ec }
            r0 = r2[r0]     // Catch:{ all -> 0x03ec }
            r25 = r6
            r27 = r7
            goto L_0x0377
        L_0x02e4:
            int r0 = r5.f27980c     // Catch:{ all -> 0x03ec }
            r25 = r6
            r2 = r9
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
        L_0x02f3:
            int r6 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r6 = r6 + r9
            if (r2 >= r6) goto L_0x032a
            byte[] r6 = r1.f27968p     // Catch:{ all -> 0x03ec }
            int r6 = r6.length     // Catch:{ all -> 0x03ec }
            if (r2 >= r6) goto L_0x032a
            if (r2 >= r15) goto L_0x032a
            byte[] r6 = r1.f27968p     // Catch:{ all -> 0x03ec }
            byte r6 = r6[r2]     // Catch:{ all -> 0x03ec }
            r6 = r6 & 255(0xff, float:3.57E-43)
            r27 = r7
            int[] r7 = r1.f27957e     // Catch:{ all -> 0x03ec }
            r6 = r7[r6]     // Catch:{ all -> 0x03ec }
            if (r6 == 0) goto L_0x0325
            int r7 = r6 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r19 = r19 + r7
            int r7 = r6 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r20 = r20 + r7
            int r7 = r6 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r21 = r21 + r7
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r22 = r22 + r6
            int r24 = r24 + 1
        L_0x0325:
            int r2 = r2 + 1
            r7 = r27
            goto L_0x02f3
        L_0x032a:
            r27 = r7
            int r0 = r0 + r9
            r2 = r0
        L_0x032e:
            int r6 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r6 = r6 + r0
            if (r2 >= r6) goto L_0x0361
            byte[] r6 = r1.f27968p     // Catch:{ all -> 0x03ec }
            int r6 = r6.length     // Catch:{ all -> 0x03ec }
            if (r2 >= r6) goto L_0x0361
            if (r2 >= r15) goto L_0x0361
            byte[] r6 = r1.f27968p     // Catch:{ all -> 0x03ec }
            byte r6 = r6[r2]     // Catch:{ all -> 0x03ec }
            r6 = r6 & 255(0xff, float:3.57E-43)
            int[] r7 = r1.f27957e     // Catch:{ all -> 0x03ec }
            r6 = r7[r6]     // Catch:{ all -> 0x03ec }
            if (r6 == 0) goto L_0x035e
            int r7 = r6 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r19 = r19 + r7
            int r7 = r6 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r20 = r20 + r7
            int r7 = r6 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r21 = r21 + r7
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r22 = r22 + r6
            int r24 = r24 + 1
        L_0x035e:
            int r2 = r2 + 1
            goto L_0x032e
        L_0x0361:
            if (r24 != 0) goto L_0x0365
            r0 = 0
            goto L_0x0377
        L_0x0365:
            int r19 = r19 / r24
            int r0 = r19 << 24
            int r20 = r20 / r24
            int r2 = r20 << 16
            r0 = r0 | r2
            int r21 = r21 / r24
            int r2 = r21 << 8
            r0 = r0 | r2
            int r22 = r22 / r24
            r0 = r0 | r22
        L_0x0377:
            if (r0 == 0) goto L_0x037c
            r4[r3] = r0     // Catch:{ all -> 0x03ec }
            goto L_0x0385
        L_0x037c:
            boolean r0 = r1.f27977y     // Catch:{ all -> 0x03ec }
            if (r0 != 0) goto L_0x0385
            if (r8 == 0) goto L_0x0385
            r0 = 1
            r1.f27977y = r0     // Catch:{ all -> 0x03ec }
        L_0x0385:
            int r0 = r1.f27974v     // Catch:{ all -> 0x03ec }
            int r9 = r9 + r0
            int r3 = r3 + 1
            r2 = r18
            r6 = r25
            r7 = r27
            goto L_0x02cb
        L_0x0392:
            r17 = r0
        L_0x0394:
            r18 = r2
            r25 = r6
            r27 = r7
            int r11 = r11 + 1
            r9 = r13
            r0 = r17
            r2 = r18
            r6 = r25
            r7 = r27
            r3 = 0
            goto L_0x0283
        L_0x03a8:
            boolean r0 = r1.f27972t     // Catch:{ all -> 0x03ec }
            if (r0 == 0) goto L_0x03ce
            int r0 = r5.f27984g     // Catch:{ all -> 0x03ec }
            if (r0 == 0) goto L_0x03b5
            int r0 = r5.f27984g     // Catch:{ all -> 0x03ec }
            r2 = 1
            if (r0 != r2) goto L_0x03ce
        L_0x03b5:
            android.graphics.Bitmap r0 = r1.f27971s     // Catch:{ all -> 0x03ec }
            if (r0 != 0) goto L_0x03bf
            android.graphics.Bitmap r0 = r29.m31828f()     // Catch:{ all -> 0x03ec }
            r1.f27971s = r0     // Catch:{ all -> 0x03ec }
        L_0x03bf:
            android.graphics.Bitmap r8 = r1.f27971s     // Catch:{ all -> 0x03ec }
            r10 = 0
            int r11 = r1.f27976x     // Catch:{ all -> 0x03ec }
            r12 = 0
            r13 = 0
            int r14 = r1.f27976x     // Catch:{ all -> 0x03ec }
            int r15 = r1.f27975w     // Catch:{ all -> 0x03ec }
            r9 = r4
            r8.setPixels(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x03ec }
        L_0x03ce:
            android.graphics.Bitmap r0 = r29.m31828f()     // Catch:{ all -> 0x03ec }
            r10 = 0
            int r11 = r1.f27976x     // Catch:{ all -> 0x03ec }
            r12 = 0
            r13 = 0
            int r14 = r1.f27976x     // Catch:{ all -> 0x03ec }
            int r15 = r1.f27975w     // Catch:{ all -> 0x03ec }
            r8 = r0
            r9 = r4
            r8.setPixels(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x03ec }
            monitor-exit(r29)
            return r0
        L_0x03e2:
            r0 = r3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x03ec }
            int r0 = r1.f27973u     // Catch:{ all -> 0x03ec }
            java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03ec }
            monitor-exit(r29)
            return r4
        L_0x03ec:
            r0 = move-exception
            monitor-exit(r29)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11619im.mo70199b():android.graphics.Bitmap");
    }

    /* renamed from: a */
    private synchronized void m31822a(C11622io ioVar, byte[] bArr) {
        m31821a(ioVar, ByteBuffer.wrap(bArr));
    }

    /* renamed from: a */
    private synchronized void m31821a(C11622io ioVar, ByteBuffer byteBuffer) {
        m31824b(ioVar, byteBuffer);
    }

    /* renamed from: b */
    private synchronized void m31824b(C11622io ioVar, ByteBuffer byteBuffer) {
        int highestOneBit = Integer.highestOneBit(1);
        this.f27973u = 0;
        this.f27956c = ioVar;
        this.f27977y = false;
        this.f27954a = -1;
        this.f27955b = 0;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f27959g = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f27959g.order(ByteOrder.LITTLE_ENDIAN);
        this.f27972t = false;
        Iterator<C11621in> it = ioVar.f27993e.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f27984g == 3) {
                    this.f27972t = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f27974v = highestOneBit;
        this.f27976x = ioVar.f27994f / highestOneBit;
        this.f27975w = ioVar.f27995g / highestOneBit;
        this.f27968p = this.f27970r.mo70201a(ioVar.f27994f * ioVar.f27995g);
        this.f27969q = this.f27970r.mo70202b(this.f27976x * this.f27975w);
    }

    /* renamed from: a */
    private void m31823a(int[] iArr, C11621in inVar, int i) {
        int i2 = inVar.f27981d / this.f27974v;
        int i3 = inVar.f27979b / this.f27974v;
        int i4 = inVar.f27980c / this.f27974v;
        int i5 = inVar.f27978a / this.f27974v;
        int i6 = this.f27976x;
        int i7 = (i3 * i6) + i5;
        int i8 = (i2 * i6) + i7;
        while (i7 < i8) {
            int i9 = i7 + i4;
            for (int i10 = i7; i10 < i9; i10++) {
                iArr[i10] = i;
            }
            i7 += this.f27976x;
        }
    }

    /* renamed from: c */
    private void m31825c() {
        if (this.f27962j <= this.f27963k) {
            if (this.f27961i == null) {
                this.f27961i = this.f27970r.mo70201a(16384);
            }
            this.f27963k = 0;
            int min = Math.min(this.f27959g.remaining(), 16384);
            this.f27962j = min;
            this.f27959g.get(this.f27961i, 0, min);
        }
    }

    /* renamed from: d */
    private int m31826d() {
        try {
            m31825c();
            byte[] bArr = this.f27961i;
            int i = this.f27963k;
            this.f27963k = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.f27973u = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private int m31827e() {
        int d = m31826d();
        if (d > 0) {
            try {
                if (this.f27960h == null) {
                    this.f27960h = this.f27970r.mo70201a(255);
                }
                int i = this.f27962j - this.f27963k;
                if (i >= d) {
                    System.arraycopy(this.f27961i, this.f27963k, this.f27960h, 0, d);
                    this.f27963k += d;
                } else if (this.f27959g.remaining() + i >= d) {
                    System.arraycopy(this.f27961i, this.f27963k, this.f27960h, 0, i);
                    this.f27963k = this.f27962j;
                    m31825c();
                    int i2 = d - i;
                    System.arraycopy(this.f27961i, 0, this.f27960h, i, i2);
                    this.f27963k += i2;
                } else {
                    this.f27973u = 1;
                }
            } catch (Exception unused) {
                Object[] objArr = new Object[1];
                this.f27973u = 1;
            }
        }
        return d;
    }

    /* renamed from: f */
    private Bitmap m31828f() {
        Bitmap a = this.f27970r.mo70200a(this.f27976x, this.f27975w, this.f27977y ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565);
        m31820a(a);
        return a;
    }

    /* renamed from: a */
    private static void m31820a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo70198a() {
        if (-1 >= this.f27956c.f27991c) {
            return false;
        }
        this.f27954a = -1;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo70197a(byte[] bArr) {
        if (this.f27964l == null) {
            this.f27964l = new C11623ip();
        }
        C11622io a = this.f27964l.mo70204a(bArr).mo70203a();
        this.f27956c = a;
        if (bArr != null) {
            m31822a(a, bArr);
        }
        return this.f27973u;
    }
}
