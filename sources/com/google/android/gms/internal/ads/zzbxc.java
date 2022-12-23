package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzbxc extends zzbme {
    final /* synthetic */ zzbxf zza;

    /* synthetic */ zzbxc(zzbxf zzbxf, zzbxb zzbxb) {
        this.zza = zzbxf;
    }

    public final void zze(zzblv zzblv, String str) {
        zzbxf zzbxf = this.zza;
        if (zzbxf.zzb != null) {
            zzbxf.zzb.onCustomClick(zzbxf.zzf(zzblv), str);
        }
    }
}
