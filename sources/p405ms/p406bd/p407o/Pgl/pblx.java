package p405ms.p406bd.p407o.Pgl;

import p405ms.p406bd.p407o.Pgl.pblu;

/* renamed from: ms.bd.o.Pgl.pblx */
final class pblx implements pblu.pblb {
    pblx() {
    }

    /* renamed from: a */
    public String mo74924a(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }
}
