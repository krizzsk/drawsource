package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4889r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.a */
public abstract class C4896a implements C4906e {

    /* renamed from: a */
    public final C4889r f13003a;

    /* renamed from: b */
    public final int f13004b;

    /* renamed from: c */
    public final int[] f13005c;

    /* renamed from: d */
    public final C4811i[] f13006d;

    /* renamed from: e */
    public final long[] f13007e;

    /* renamed from: f */
    public int f13008f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.a$b */
    public static final class C4898b implements Comparator<C4811i> {
        public C4898b() {
        }

        public int compare(Object obj, Object obj2) {
            return ((C4811i) obj2).f12751b - ((C4811i) obj).f12751b;
        }
    }

    public C4896a(C4889r rVar, int... iArr) {
        int i = 0;
        C4965a.m15051b(iArr.length > 0);
        this.f13003a = (C4889r) C4965a.m15047a(rVar);
        int length = iArr.length;
        this.f13004b = length;
        this.f13006d = new C4811i[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f13006d[i2] = rVar.mo25407a(iArr[i2]);
        }
        Arrays.sort(this.f13006d, new C4898b());
        this.f13005c = new int[this.f13004b];
        while (true) {
            int i3 = this.f13004b;
            if (i < i3) {
                this.f13005c[i] = rVar.mo25406a(this.f13006d[i]);
                i++;
            } else {
                this.f13007e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final C4811i mo25415a(int i) {
        return this.f13006d[i];
    }

    /* renamed from: b */
    public final C4889r mo25418b() {
        return this.f13003a;
    }

    /* renamed from: c */
    public final int mo25420c(int i) {
        for (int i2 = 0; i2 < this.f13004b; i2++) {
            if (this.f13005c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4896a aVar = (C4896a) obj;
        if (this.f13003a != aVar.f13003a || !Arrays.equals(this.f13005c, aVar.f13005c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo25423f() {
        return this.f13005c.length;
    }

    public int hashCode() {
        if (this.f13008f == 0) {
            this.f13008f = (System.identityHashCode(this.f13003a) * 31) + Arrays.hashCode(this.f13005c);
        }
        return this.f13008f;
    }

    /* renamed from: a */
    public final int mo25414a(C4811i iVar) {
        for (int i = 0; i < this.f13004b; i++) {
            if (this.f13006d[i] == iVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo25417b(int i) {
        return this.f13005c[i];
    }

    /* renamed from: b */
    public final boolean mo25419b(int i, long j) {
        return this.f13007e[i] > j;
    }

    /* renamed from: c */
    public final C4811i mo25421c() {
        return this.f13006d[mo25106e()];
    }

    /* renamed from: a */
    public final int mo25413a() {
        return this.f13005c[mo25106e()];
    }

    /* renamed from: a */
    public final boolean mo25416a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = mo25419b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f13004b && !b) {
            b = i2 != i && !mo25419b(i2, elapsedRealtime);
            i2++;
        }
        if (!b) {
            return false;
        }
        long[] jArr = this.f13007e;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + j);
        return true;
    }
}
