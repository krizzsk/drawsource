package p405ms.p406bd.p407o.Pgl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.y */
final class C12644y extends pblb.pgla {
    C12644y() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m33513a().mo74929b();
        ApplicationInfo applicationInfo = b.getPackageManager().getApplicationInfo(b.getPackageName(), 0);
        String str2 = applicationInfo.sourceDir;
        return str2 != null ? str2 : applicationInfo.publicSourceDir;
    }
}
