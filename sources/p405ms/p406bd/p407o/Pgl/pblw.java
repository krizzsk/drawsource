package p405ms.p406bd.p407o.Pgl;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: ms.bd.o.Pgl.pblw */
class pblw implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ String f29900a;

    pblw(pblv pblv, String str) {
        this.f29900a = str;
    }

    public boolean accept(File file, String str) {
        return str.startsWith(this.f29900a);
    }
}
