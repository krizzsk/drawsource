package p405ms.p406bd.p407o.Pgl;

import android.content.Context;
import android.content.Intent;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.v */
final class C12638v extends pblb.pgla {
    C12638v() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m33513a().mo74929b();
        String[] strArr = (String[]) obj;
        if (b == null || str == null || strArr == null || strArr.length % 2 != 0) {
            return null;
        }
        Intent intent = new Intent(str);
        intent.setPackage(b.getPackageName());
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            intent.putExtra(strArr[i2], strArr[i2 + 1]);
        }
        b.sendBroadcast(intent);
        return null;
    }
}
