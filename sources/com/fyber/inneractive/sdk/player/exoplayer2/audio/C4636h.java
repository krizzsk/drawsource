package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4621b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.h */
public final class C4636h implements C4621b {

    /* renamed from: b */
    public int f11618b = -1;

    /* renamed from: c */
    public int f11619c = -1;

    /* renamed from: d */
    public C4635g f11620d;

    /* renamed from: e */
    public float f11621e = 1.0f;

    /* renamed from: f */
    public float f11622f = 1.0f;

    /* renamed from: g */
    public ByteBuffer f11623g;

    /* renamed from: h */
    public ShortBuffer f11624h;

    /* renamed from: i */
    public ByteBuffer f11625i;

    /* renamed from: j */
    public long f11626j;

    /* renamed from: k */
    public long f11627k;

    /* renamed from: l */
    public boolean f11628l;

    public C4636h() {
        ByteBuffer byteBuffer = C4621b.f11503a;
        this.f11623g = byteBuffer;
        this.f11624h = byteBuffer.asShortBuffer();
        this.f11625i = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo24988a(int i, int i2, int i3) throws C4621b.C4622a {
        if (i3 != 2) {
            throw new C4621b.C4622a(i, i2, i3);
        } else if (this.f11619c == i && this.f11618b == i2) {
            return false;
        } else {
            this.f11619c = i;
            this.f11618b = i2;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f11620d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24989b() {
        /*
            r1 = this;
            boolean r0 = r1.f11628l
            if (r0 == 0) goto L_0x000e
            com.fyber.inneractive.sdk.player.exoplayer2.audio.g r0 = r1.f11620d
            if (r0 == 0) goto L_0x000c
            int r0 = r0.f11611r
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4636h.mo24989b():boolean");
    }

    /* renamed from: c */
    public void mo24990c() {
        int i;
        C4635g gVar = this.f11620d;
        int i2 = gVar.f11610q;
        float f = gVar.f11608o;
        float f2 = gVar.f11609p;
        int i3 = gVar.f11611r + ((int) ((((((float) i2) / (f / f2)) + ((float) gVar.f11612s)) / f2) + 0.5f));
        gVar.mo25022a((gVar.f11598e * 2) + i2);
        int i4 = 0;
        while (true) {
            i = gVar.f11598e * 2;
            int i5 = gVar.f11595b;
            if (i4 >= i * i5) {
                break;
            }
            gVar.f11601h[(i5 * i2) + i4] = 0;
            i4++;
        }
        gVar.f11610q += i;
        gVar.mo25021a();
        if (gVar.f11611r > i3) {
            gVar.f11611r = i3;
        }
        gVar.f11610q = 0;
        gVar.f11613t = 0;
        gVar.f11612s = 0;
        this.f11628l = true;
    }

    /* renamed from: d */
    public boolean mo24991d() {
        return Math.abs(this.f11621e - 1.0f) >= 0.01f || Math.abs(this.f11622f - 1.0f) >= 0.01f;
    }

    /* renamed from: e */
    public int mo24992e() {
        return 2;
    }

    /* renamed from: f */
    public int mo24993f() {
        return this.f11618b;
    }

    public void flush() {
        C4635g gVar = new C4635g(this.f11619c, this.f11618b);
        this.f11620d = gVar;
        gVar.f11608o = this.f11621e;
        gVar.f11609p = this.f11622f;
        this.f11625i = C4621b.f11503a;
        this.f11626j = 0;
        this.f11627k = 0;
        this.f11628l = false;
    }

    /* renamed from: g */
    public void mo24995g() {
        this.f11620d = null;
        ByteBuffer byteBuffer = C4621b.f11503a;
        this.f11623g = byteBuffer;
        this.f11624h = byteBuffer.asShortBuffer();
        this.f11625i = byteBuffer;
        this.f11618b = -1;
        this.f11619c = -1;
        this.f11626j = 0;
        this.f11627k = 0;
        this.f11628l = false;
    }

    /* renamed from: a */
    public void mo24987a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f11626j += (long) remaining;
            C4635g gVar = this.f11620d;
            gVar.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i = gVar.f11595b;
            int i2 = remaining2 / i;
            gVar.mo25022a(i2);
            asShortBuffer.get(gVar.f11601h, gVar.f11610q * gVar.f11595b, ((i * i2) * 2) / 2);
            gVar.f11610q += i2;
            gVar.mo25021a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i3 = this.f11620d.f11611r * this.f11618b * 2;
        if (i3 > 0) {
            if (this.f11623g.capacity() < i3) {
                ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.f11623g = order;
                this.f11624h = order.asShortBuffer();
            } else {
                this.f11623g.clear();
                this.f11624h.clear();
            }
            C4635g gVar2 = this.f11620d;
            ShortBuffer shortBuffer = this.f11624h;
            gVar2.getClass();
            int min = Math.min(shortBuffer.remaining() / gVar2.f11595b, gVar2.f11611r);
            shortBuffer.put(gVar2.f11603j, 0, gVar2.f11595b * min);
            int i4 = gVar2.f11611r - min;
            gVar2.f11611r = i4;
            short[] sArr = gVar2.f11603j;
            int i5 = gVar2.f11595b;
            System.arraycopy(sArr, min * i5, sArr, 0, i4 * i5);
            this.f11627k += (long) i3;
            this.f11623g.limit(i3);
            this.f11625i = this.f11623g;
        }
    }

    /* renamed from: a */
    public ByteBuffer mo24986a() {
        ByteBuffer byteBuffer = this.f11625i;
        this.f11625i = C4621b.f11503a;
        return byteBuffer;
    }
}
