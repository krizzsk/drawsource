package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.j */
public final class C4942j {

    /* renamed from: a */
    public final Uri f13126a;

    /* renamed from: b */
    public final byte[] f13127b;

    /* renamed from: c */
    public final long f13128c;

    /* renamed from: d */
    public final long f13129d;

    /* renamed from: e */
    public final long f13130e;

    /* renamed from: f */
    public final String f13131f;

    /* renamed from: g */
    public final int f13132g;

    public C4942j(Uri uri, int i) {
        this(uri, 0, -1, (String) null, i);
    }

    /* renamed from: a */
    public boolean mo25478a(int i) {
        return (this.f13132g & i) == i;
    }

    public String toString() {
        return "DataSpec[" + this.f13126a + ", " + Arrays.toString(this.f13127b) + ", " + this.f13128c + ", " + this.f13129d + ", " + this.f13130e + ", " + this.f13131f + ", " + this.f13132g + "]";
    }

    public C4942j(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, (String) null, i);
    }

    public C4942j(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    public C4942j(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        C4965a.m15049a(j >= 0);
        C4965a.m15049a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C4965a.m15049a(z);
        this.f13126a = uri;
        this.f13127b = null;
        this.f13128c = j;
        this.f13129d = j2;
        this.f13130e = j3;
        this.f13131f = str;
        this.f13132g = i;
    }
}
