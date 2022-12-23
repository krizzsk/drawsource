package p405ms.p406bd.p407o.Pgl;

import java.util.TimeZone;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.i0 */
final class C12613i0 extends pblb.pgla {
    C12613i0() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        String str2;
        int i2;
        try {
            TimeZone timeZone = TimeZone.getDefault();
            str2 = timeZone.getID();
            try {
                i2 = ((timeZone.getRawOffset() / 60) / 60) / 1000;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
            i2 = 0;
            return str2 + ((String) pblk.m33455a(16777217, 0, 0, "329840", new byte[]{110})) + i2;
        }
        return str2 + ((String) pblk.m33455a(16777217, 0, 0, "329840", new byte[]{110})) + i2;
    }
}
