package p405ms.p406bd.p407o.Pgl;

import android.content.Context;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.e */
final class C12604e extends pblb.pgla {
    C12604e() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        int i2;
        Context b = pgla.m33513a().mo74929b();
        try {
            i2 = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }
}
