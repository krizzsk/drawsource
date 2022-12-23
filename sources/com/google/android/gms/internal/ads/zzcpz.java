package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcpz implements zzdxi {
    private final Long zza;
    private final String zzb;
    private final zzcop zzc;
    private final zzcqd zzd;
    private final zzcpz zze = this;

    /* synthetic */ zzcpz(zzcop zzcop, zzcqd zzcqd, Long l, String str, zzcpy zzcpy) {
        this.zzc = zzcop;
        this.zzd = zzcqd;
        this.zza = l;
        this.zzb = str;
    }

    public final zzdxs zza() {
        long longValue = this.zza.longValue();
        zzcqd zzcqd = this.zzd;
        return zzdxt.zza(longValue, zzcqd.zza, zzdxm.zzc(zzcqd.zzb), this.zzc, this.zzb);
    }

    public final zzdxw zzb() {
        long longValue = this.zza.longValue();
        zzcqd zzcqd = this.zzd;
        return zzdxx.zza(longValue, zzcqd.zza, zzdxm.zzc(zzcqd.zzb), this.zzc, this.zzb);
    }
}
