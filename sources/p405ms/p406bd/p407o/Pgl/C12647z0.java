package p405ms.p406bd.p407o.Pgl;

import com.google.common.base.Ascii;
import kotlin.text.Typography;

/* renamed from: ms.bd.o.Pgl.z0 */
public class C12647z0 {
    static {
        String str = (String) pblk.m33455a(16777217, 0, 0, "1772ea", new byte[]{Ascii.ESC, 105, 5, Ascii.CAN, 103});
    }

    /* renamed from: a */
    public static String m33548a(String str) {
        return (str == null || str.length() <= 0) ? "" : str.trim().replace('\'', ' ').replace(Typography.quote, ' ').replace(13, ' ').replace(10, ' ');
    }
}
