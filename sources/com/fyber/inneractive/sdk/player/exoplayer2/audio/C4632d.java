package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4621b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.d */
public final class C4632d implements C4621b {

    /* renamed from: b */
    public int f11577b = -1;

    /* renamed from: c */
    public int f11578c = -1;

    /* renamed from: d */
    public int[] f11579d;

    /* renamed from: e */
    public boolean f11580e;

    /* renamed from: f */
    public int[] f11581f;

    /* renamed from: g */
    public ByteBuffer f11582g;

    /* renamed from: h */
    public ByteBuffer f11583h;

    /* renamed from: i */
    public boolean f11584i;

    public C4632d() {
        ByteBuffer byteBuffer = C4621b.f11503a;
        this.f11582g = byteBuffer;
        this.f11583h = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo24988a(int i, int i2, int i3) throws C4621b.C4622a {
        boolean z = !Arrays.equals(this.f11579d, this.f11581f);
        int[] iArr = this.f11579d;
        this.f11581f = iArr;
        if (iArr == null) {
            this.f11580e = false;
            return z;
        } else if (i3 != 2) {
            throw new C4621b.C4622a(i, i2, i3);
        } else if (!z && this.f11578c == i && this.f11577b == i2) {
            return false;
        } else {
            this.f11578c = i;
            this.f11577b = i2;
            this.f11580e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f11581f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f11580e = (i5 != i4) | this.f11580e;
                    i4++;
                } else {
                    throw new C4621b.C4622a(i, i2, i3);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo24989b() {
        return this.f11584i && this.f11583h == C4621b.f11503a;
    }

    /* renamed from: c */
    public void mo24990c() {
        this.f11584i = true;
    }

    /* renamed from: d */
    public boolean mo24991d() {
        return this.f11580e;
    }

    /* renamed from: e */
    public int mo24992e() {
        return 2;
    }

    /* renamed from: f */
    public int mo24993f() {
        int[] iArr = this.f11581f;
        return iArr == null ? this.f11577b : iArr.length;
    }

    public void flush() {
        this.f11583h = C4621b.f11503a;
        this.f11584i = false;
    }

    /* renamed from: g */
    public void mo24995g() {
        flush();
        this.f11582g = C4621b.f11503a;
        this.f11577b = -1;
        this.f11578c = -1;
        this.f11581f = null;
        this.f11580e = false;
    }

    /* renamed from: a */
    public void mo24987a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f11577b * 2)) * this.f11581f.length * 2;
        if (this.f11582g.capacity() < length) {
            this.f11582g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f11582g.clear();
        }
        while (position < limit) {
            for (int i : this.f11581f) {
                this.f11582g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f11577b * 2;
        }
        byteBuffer.position(limit);
        this.f11582g.flip();
        this.f11583h = this.f11582g;
    }

    /* renamed from: a */
    public ByteBuffer mo24986a() {
        ByteBuffer byteBuffer = this.f11583h;
        this.f11583h = C4621b.f11503a;
        return byteBuffer;
    }
}
