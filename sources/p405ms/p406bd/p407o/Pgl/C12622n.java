package p405ms.p406bd.p407o.Pgl;

import android.content.Context;
import android.content.pm.Signature;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.n */
final class C12622n extends pblb.pgla {
    C12622n() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m33513a().mo74929b();
        Signature[] signatureArr = b.getPackageManager().getPackageInfo(b.getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        return signatureArr[0].toByteArray();
    }
}
