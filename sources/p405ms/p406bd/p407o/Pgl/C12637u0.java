package p405ms.p406bd.p407o.Pgl;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: ms.bd.o.Pgl.u0 */
public class C12637u0 {

    /* renamed from: a */
    private static int f29921a;

    /* renamed from: a */
    public static String m33529a(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                f29921a = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable unused) {
            }
        }
        return "" + f29921a;
    }
}
