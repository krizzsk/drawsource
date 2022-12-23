package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4621b;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.f */
public final class C4634f implements C4621b {

    /* renamed from: b */
    public int f11588b = -1;

    /* renamed from: c */
    public int f11589c = -1;

    /* renamed from: d */
    public int f11590d = 0;

    /* renamed from: e */
    public ByteBuffer f11591e;

    /* renamed from: f */
    public ByteBuffer f11592f;

    /* renamed from: g */
    public boolean f11593g;

    public C4634f() {
        ByteBuffer byteBuffer = C4621b.f11503a;
        this.f11591e = byteBuffer;
        this.f11592f = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo24988a(int i, int i2, int i3) throws C4621b.C4622a {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C4621b.C4622a(i, i2, i3);
        } else if (this.f11588b == i && this.f11589c == i2 && this.f11590d == i3) {
            return false;
        } else {
            this.f11588b = i;
            this.f11589c = i2;
            this.f11590d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f11591e = C4621b.f11503a;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo24989b() {
        return this.f11593g && this.f11592f == C4621b.f11503a;
    }

    /* renamed from: c */
    public void mo24990c() {
        this.f11593g = true;
    }

    /* renamed from: d */
    public boolean mo24991d() {
        int i = this.f11590d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* renamed from: e */
    public int mo24992e() {
        return 2;
    }

    /* renamed from: f */
    public int mo24993f() {
        return this.f11589c;
    }

    public void flush() {
        this.f11592f = C4621b.f11503a;
        this.f11593g = false;
    }

    /* renamed from: g */
    public void mo24995g() {
        flush();
        this.f11591e = C4621b.f11503a;
        this.f11588b = -1;
        this.f11589c = -1;
        this.f11590d = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24987a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f11590d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 * 2
        L_0x0023:
            java.nio.ByteBuffer r3 = r7.f11591e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x003a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f11591e = r2
            goto L_0x003f
        L_0x003a:
            java.nio.ByteBuffer r2 = r7.f11591e
            r2.clear()
        L_0x003f:
            int r2 = r7.f11590d
            if (r2 == r5) goto L_0x0081
            if (r2 == r6) goto L_0x0068
            if (r2 != r4) goto L_0x0062
        L_0x0047:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f11591e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11591e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0047
        L_0x0062:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0068:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f11591e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11591e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0068
        L_0x0081:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f11591e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11591e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0081
        L_0x009c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f11591e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f11591e
            r7.f11592f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4634f.mo24987a(java.nio.ByteBuffer):void");
    }

    /* renamed from: a */
    public ByteBuffer mo24986a() {
        ByteBuffer byteBuffer = this.f11592f;
        this.f11592f = C4621b.f11503a;
        return byteBuffer;
    }
}
