package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzbnd extends zzbme {
    final /* synthetic */ zzbng zza;

    /* synthetic */ zzbnd(zzbng zzbng, zzbnc zzbnc) {
        this.zza = zzbng;
    }

    public final void zze(zzblv zzblv, String str) {
        zzbng zzbng = this.zza;
        if (zzbng.zzb != null) {
            zzbng.zzb.onCustomClick(zzbng.zzf(zzblv), str);
        }
    }
}
