package com.bytedance.sdk.component.p118e.p122d;

import android.content.Context;
import com.bytedance.sdk.component.p118e.p121c.C2861g;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.sdk.component.e.d.c */
/* compiled from: MultiProcessFileUtils */
public class C2868c {
    /* renamed from: a */
    public static void m8000a(Context context, int i, String str, int i2) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i == 1) {
                linkedHashMap.put(m7998a(i2), str);
            }
            C2863b.m7994b("MultiProcessFileUtils", "saveData = " + str);
            if (C2861g.m7987a().mo17766a(i2).mo17758d() != null) {
                C2861g.m7987a().mo17766a(i2).mo17758d().mo17738a(context, linkedHashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7999a(android.content.Context r2, int r3, int r4) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            if (r3 == r1) goto L_0x0006
            goto L_0x0029
        L_0x0006:
            com.bytedance.sdk.component.e.c.g r3 = com.bytedance.sdk.component.p118e.p121c.C2861g.m7987a()     // Catch:{ Exception -> 0x0029 }
            com.bytedance.sdk.component.e.c.e r3 = r3.mo17766a(r4)     // Catch:{ Exception -> 0x0029 }
            com.bytedance.sdk.component.e.c.b r3 = r3.mo17758d()     // Catch:{ Exception -> 0x0029 }
            if (r3 == 0) goto L_0x0029
            com.bytedance.sdk.component.e.c.g r3 = com.bytedance.sdk.component.p118e.p121c.C2861g.m7987a()     // Catch:{ Exception -> 0x0029 }
            com.bytedance.sdk.component.e.c.e r3 = r3.mo17766a(r4)     // Catch:{ Exception -> 0x0029 }
            com.bytedance.sdk.component.e.c.b r3 = r3.mo17758d()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r4 = m7998a(r4)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = r3.mo17737a(r2, r4, r0)     // Catch:{ Exception -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r2 = r0
        L_0x002a:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0032
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p122d.C2868c.m7999a(android.content.Context, int, int):java.lang.String");
    }

    /* renamed from: a */
    private static String m7998a(int i) {
        return "tnc_config" + i;
    }
}
