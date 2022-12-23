package p405ms.p406bd.p407o.Pgl;

import com.google.common.base.Ascii;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblf */
final class pblf extends pblb.pgla {
    pblf() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        boolean z;
        try {
            z = pblj.m33454b(pgla.m33513a().mo74929b(), str, obj.toString());
        } catch (Throwable unused) {
            String str2 = (String) pblk.m33455a(16777217, 0, 0, "9c0de9", new byte[]{47, 96, 69});
            z = false;
        }
        if (z) {
            return (String) pblk.m33455a(16777217, 0, 0, "b967ac", new byte[]{92, Ascii.DLE});
        }
        return null;
    }
}
