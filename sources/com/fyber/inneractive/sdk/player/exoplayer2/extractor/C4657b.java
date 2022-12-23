package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.b */
public final class C4657b implements C4672g {

    /* renamed from: g */
    public static final byte[] f11667g = new byte[4096];

    /* renamed from: a */
    public final C4938g f11668a;

    /* renamed from: b */
    public final long f11669b;

    /* renamed from: c */
    public long f11670c;

    /* renamed from: d */
    public byte[] f11671d = new byte[65536];

    /* renamed from: e */
    public int f11672e;

    /* renamed from: f */
    public int f11673f;

    public C4657b(C4938g gVar, long j, long j2) {
        this.f11668a = gVar;
        this.f11670c = j;
        this.f11669b = j2;
    }

    /* renamed from: a */
    public boolean mo25061a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!mo25060a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f11671d, this.f11672e - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: b */
    public int mo25062b(int i) throws IOException, InterruptedException {
        int min = Math.min(this.f11673f, i);
        mo25065d(min);
        if (min == 0) {
            byte[] bArr = f11667g;
            min = mo25058a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        mo25059a(min);
        return min;
    }

    /* renamed from: c */
    public void mo25064c(int i) throws IOException, InterruptedException {
        int min = Math.min(this.f11673f, i);
        mo25065d(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = f11667g;
            i2 = mo25058a(bArr, -i2, Math.min(i, bArr.length + i2), i2, false);
        }
        mo25059a(i2);
    }

    /* renamed from: d */
    public final void mo25065d(int i) {
        int i2 = this.f11673f - i;
        this.f11673f = i2;
        this.f11672e = 0;
        byte[] bArr = this.f11671d;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f11671d = bArr2;
    }

    /* renamed from: a */
    public boolean mo25060a(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f11672e + i;
        byte[] bArr = this.f11671d;
        if (i2 > bArr.length) {
            int i3 = C4991u.f13270a;
            this.f11671d = Arrays.copyOf(this.f11671d, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int min = Math.min(this.f11673f - this.f11672e, i);
        while (min < i) {
            min = mo25058a(this.f11671d, this.f11672e, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i4 = this.f11672e + i;
        this.f11672e = i4;
        this.f11673f = Math.max(this.f11673f, i4);
        return true;
    }

    /* renamed from: b */
    public boolean mo25063b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int i3;
        int i4 = this.f11673f;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.f11671d, 0, bArr, i, min);
            mo25065d(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = mo25058a(bArr, i, i2, i3, z);
        }
        mo25059a(i3);
        if (i3 != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int mo25057a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int i3 = this.f11673f;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f11671d, 0, bArr, i, min);
            mo25065d(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = mo25058a(bArr, i, i2, 0, true);
        }
        mo25059a(i4);
        return i4;
    }

    /* renamed from: a */
    public final int mo25058a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.f11668a.mo24755a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    public final void mo25059a(int i) {
        if (i != -1) {
            this.f11670c += (long) i;
        }
    }
}
