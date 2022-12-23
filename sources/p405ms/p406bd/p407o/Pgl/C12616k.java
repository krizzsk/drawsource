package p405ms.p406bd.p407o.Pgl;

import java.util.Locale;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.k */
final class C12616k extends pblb.pgla {
    C12616k() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        String str2;
        try {
            Locale locale = pgla.m33513a().mo74929b().getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append((String) pblk.m33455a(16777217, 0, 0, "b946b3", new byte[]{76}));
            sb.append(country);
            str2 = sb.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        return C12647z0.m33548a(str2);
    }
}
