package com.saygames.saypromo.p378a;

import android.os.StatFs;

/* renamed from: com.saygames.saypromo.a.c1 */
public final class C10573c1 implements C10565b1 {
    C10573c1() {
    }

    /* renamed from: a */
    public final Long mo65425a(String str) {
        StatFs statFs;
        try {
            statFs = new StatFs(str);
        } catch (Throwable unused) {
            statFs = null;
        }
        if (statFs == null) {
            return null;
        }
        return Long.valueOf(statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong());
    }
}
