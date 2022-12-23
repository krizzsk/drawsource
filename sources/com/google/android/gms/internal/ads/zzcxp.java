package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcxp {
    private final zzdei zza;
    private final zzdgo zzb;

    public zzcxp(zzdei zzdei, zzdgo zzdgo) {
        this.zza = zzdei;
        this.zzb = zzdgo;
    }

    public final zzdei zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final zzdgo zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final zzdiz zzc() {
        zzdgo zzdgo = this.zzb;
        if (zzdgo != null) {
            return new zzdiz(zzdgo, zzcfv.zzf);
        }
        return new zzdiz(new zzcxo(this), zzcfv.zzf);
    }
}
