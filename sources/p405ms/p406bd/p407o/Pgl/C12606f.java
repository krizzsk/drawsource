package p405ms.p406bd.p407o.Pgl;

import android.content.Context;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.f */
final class C12606f extends pblb.pgla {
    C12606f() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m33513a().mo74929b();
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }
}
