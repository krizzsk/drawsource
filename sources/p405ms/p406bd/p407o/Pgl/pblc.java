package p405ms.p406bd.p407o.Pgl;

import android.content.Context;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblc */
final class pblc extends pblb.pgla {
    pblc() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        try {
            Context b = pgla.m33513a().mo74929b();
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            String str2 = (String) pblk.m33455a(16777217, 0, 0, "b2bafb", new byte[]{122, 57});
            return "";
        }
    }
}
