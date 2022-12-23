package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfhe implements zzdiq, zzdcj, zzdiu {
    private final zzfhs zza;
    private final zzfhh zzb;

    zzfhe(Context context, zzfhs zzfhs) {
        this.zza = zzfhs;
        this.zzb = zzfhg.zza(context, 13);
    }

    public final void zza() {
    }

    public final void zzb() {
        if (((Boolean) zzbji.zzd.zze()).booleanValue()) {
            zzfhs zzfhs = this.zza;
            zzfhh zzfhh = this.zzb;
            zzfhh.zze(true);
            zzfhs.zza(zzfhh);
        }
    }

    public final void zze() {
    }

    public final void zzf() {
        if (((Boolean) zzbji.zzd.zze()).booleanValue()) {
            this.zzb.zzf();
        }
    }

    public final void zzk(zze zze) {
        if (((Boolean) zzbji.zzd.zze()).booleanValue()) {
            zzfhs zzfhs = this.zza;
            zzfhh zzfhh = this.zzb;
            zzfhh.zze(false);
            zzfhs.zza(zzfhh);
        }
    }
}
