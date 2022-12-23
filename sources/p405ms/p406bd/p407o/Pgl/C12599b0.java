package p405ms.p406bd.p407o.Pgl;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.b0 */
final class C12599b0 extends pblb.pgla {
    C12599b0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        String str2;
        try {
            WifiInfo connectionInfo = ((WifiManager) pgla.m33513a().mo74929b().getApplicationContext().getSystemService((String) pblk.m33455a(16777217, 0, 0, "da81a7", new byte[]{98, 106, 77, 76}))).getConnectionInfo();
            Class<?> cls = connectionInfo.getClass();
            Method declaredMethod = cls.getDeclaredMethod(new String(pblz.m33512a((String) pblk.m33455a(16777217, 0, 0, "6211fb", new byte[]{113, 103, Ascii.DC4, Ascii.DLE, Ascii.f18306SO, 33, 97, 74, 55, 49, 115, 97, Ascii.DC4, 17, Ascii.f18305SI, 33, 98, 65, 54, 52, 112, 99, Ascii.NAK, Ascii.SYN}))), new Class[0]);
            declaredMethod.setAccessible(true);
            str2 = Integer.toString(((Integer) declaredMethod.invoke(connectionInfo, new Object[0])).intValue());
        } catch (Throwable unused) {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2.trim();
        }
        return (String) pblk.m33455a(16777217, 0, 0, "dd4a1c", new byte[]{37});
    }
}
