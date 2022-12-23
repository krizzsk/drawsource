package p405ms.p406bd.p407o.Pgl;

import android.content.Context;
import android.content.SharedPreferences;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.u */
final class C12636u extends pblb.pgla {
    C12636u() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m33513a().mo74929b();
        String[] split = str.split((String) pblk.m33455a(16777217, 0, 0, "cea70a", new byte[]{78, 123}));
        String str2 = split[0];
        String str3 = split[1];
        SharedPreferences.Editor edit = b.getSharedPreferences(str2, 0).edit();
        edit.putString(str3, (String) obj);
        edit.commit();
        return null;
    }
}
