package com.bytedance.sdk.openadsdk.p178l;

import android.os.Build;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;

/* renamed from: com.bytedance.sdk.openadsdk.l.q */
/* compiled from: SlotUtils */
public class C3891q {
    /* renamed from: a */
    public static boolean m12709a(C3431n nVar) {
        int e;
        if (nVar == null || (e = C3898x.m12790e(nVar)) == 8 || e == 7 || nVar.mo19514G() == null || Build.VERSION.SDK_INT > 27) {
            return false;
        }
        return true;
    }
}
