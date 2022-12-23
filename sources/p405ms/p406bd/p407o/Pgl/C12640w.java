package p405ms.p406bd.p407o.Pgl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import okio.Utf8;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.w */
final class C12640w extends pblb.pgla {
    C12640w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m33513a().mo74929b();
        if (b != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) b.getSystemService((String) pblk.m33455a(16777217, 0, 0, "6b685f", new byte[]{36, 111, 75, 66, Ascii.f18305SI, 114, 33, 74, 113, 97, 51, 121}));
                Class<?> cls = connectivityManager.getClass();
                Method declaredMethod = cls.getDeclaredMethod((String) pblk.m33455a(16777217, 0, 0, "517402", new byte[]{35, 54, 80, 97, Ascii.f18298FF, 49, Utf8.REPLACEMENT_BYTE, 6, 99, 74, 33, 39, 83, 79, Ascii.f18300GS, 46, Ascii.f18308US, Ascii.f18304RS, 96, 107}), new Class[0]);
                declaredMethod.setAccessible(true);
                NetworkInfo networkInfo = (NetworkInfo) declaredMethod.invoke(connectivityManager, new Object[0]);
                if (networkInfo != null) {
                    Class<?> cls2 = networkInfo.getClass();
                    Method declaredMethod2 = cls2.getDeclaredMethod((String) pblk.m33455a(16777217, 0, 0, "e35ca4", new byte[]{125, 34, 103, 1, 95, 42, 106, 19, 102, Utf8.REPLACEMENT_BYTE, 113}), new Class[0]);
                    declaredMethod2.setAccessible(true);
                    return Boolean.valueOf(((Boolean) declaredMethod2.invoke(networkInfo, new Object[0])).booleanValue());
                }
            } catch (Throwable unused) {
            }
        }
        return Boolean.FALSE;
    }
}
