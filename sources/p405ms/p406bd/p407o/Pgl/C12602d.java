package p405ms.p406bd.p407o.Pgl;

import java.io.File;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.d */
final class C12602d extends pblb.pgla {
    C12602d() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        File file = new File(pgla.m33513a().mo74929b().getFilesDir(), (String) pblk.m33455a(16777217, 0, 0, "d556c6", new byte[]{59, 58, 85, 70, 93, 53, 102}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }
}
