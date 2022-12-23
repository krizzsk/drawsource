package com.bytedance.sdk.openadsdk.p128b;

import com.bytedance.sdk.component.utils.C2898h;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3892r;

/* renamed from: com.bytedance.sdk.openadsdk.b.o */
/* compiled from: LastShowAdManager */
public class C3108o {
    /* renamed from: a */
    public static void m9025a(final C3431n nVar, final String str) {
        if (nVar != null) {
            C2898h.m8093a().post(new Runnable() {
                public void run() {
                    try {
                        C3892r.m12712a(nVar.mo19584ar().toString(), str);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
