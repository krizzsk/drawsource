package p405ms.p406bd.p407o.Pgl;

import android.telephony.TelephonyManager;
import com.google.common.base.Ascii;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.o */
final class C12624o extends pblb.pgla {
    C12624o() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        Boolean bool = Boolean.FALSE;
        TelephonyManager telephonyManager = (TelephonyManager) pgla.m33513a().mo74929b().getApplicationContext().getSystemService((String) pblk.m33455a(16777217, 0, 0, "9f4f2e", new byte[]{56, 108, 72, Ascii.f18299FS, 8}));
        return (telephonyManager == null || telephonyManager.getSimState() != 5) ? bool : Boolean.TRUE;
    }
}
