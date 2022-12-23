package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcth implements zzcsp {
    private final zzdzb zza;

    zzcth(zzdzb zzdzb) {
        this.zza = zzdzb;
    }

    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzl(str.equals("true"));
        }
    }
}
