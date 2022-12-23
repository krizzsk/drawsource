package p405ms.p406bd.p407o.Pgl;

import com.google.common.base.Ascii;
import java.util.Locale;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.j0 */
final class C12615j0 extends pblb.pgla {
    C12615j0() {
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
            sb.append((String) pblk.m33455a(16777217, 0, 0, "4a3a24", new byte[]{Ascii.SUB}));
            sb.append(country);
            str2 = sb.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        return C12647z0.m33548a(str2);
    }
}
