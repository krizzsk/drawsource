package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcsx implements zzcsp {
    private final zzdzb zza;

    zzcsx(zzdzb zzdzb) {
        this.zza = zzdzb;
    }

    public final void zza(Map map) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhL)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (!TextUtils.isEmpty(str)) {
                this.zza.zzk(str);
            }
        }
    }
}
