package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcpx implements zzdxh {
    private final zzcop zza;
    private final zzcqd zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcpx(zzcop zzcop, zzcqd zzcqd, zzcpw zzcpw) {
        this.zza = zzcop;
        this.zzb = zzcqd;
    }

    public final /* synthetic */ zzdxh zza(String str) {
        if (str != null) {
            this.zzd = str;
            return this;
        }
        throw null;
    }

    public final /* bridge */ /* synthetic */ zzdxh zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    public final zzdxi zzc() {
        zzgrc.zzc(this.zzc, Long.class);
        zzgrc.zzc(this.zzd, String.class);
        return new zzcpz(this.zza, this.zzb, this.zzc, this.zzd, (zzcpy) null);
    }
}
