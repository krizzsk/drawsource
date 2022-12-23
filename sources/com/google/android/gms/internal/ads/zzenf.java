package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzenf implements zzetg {
    private final Context zza;

    zzenf(Context context) {
        this.zza = context;
    }

    public final int zza() {
        return 2;
    }

    public final zzfvl zzb() {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzcr)).booleanValue()) {
            return zzfvc.zzi((Object) null);
        }
        return zzfvc.zzi(new zzeng(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
