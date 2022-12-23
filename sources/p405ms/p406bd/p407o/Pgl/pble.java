package p405ms.p406bd.p407o.Pgl;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import okio.Utf8;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pble */
final class pble extends pblb.pgla {
    pble() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        File file = new File(pgla.m33513a().mo74929b().getFilesDir(), (String) pblk.m33455a(16777217, 0, 0, "304015", new byte[]{108, Utf8.REPLACEMENT_BYTE, 84, SignedBytes.MAX_POWER_OF_TWO, Ascii.f18305SI, 54, 49}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }
}
