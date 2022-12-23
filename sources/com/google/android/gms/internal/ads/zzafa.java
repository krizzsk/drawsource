package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzafa implements zzafg {
    private final zzze zza;
    private final zzzd zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzafa(zzze zzze, zzzd zzzd) {
        this.zza = zzze;
        this.zzb = zzzd;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    public final long zzd(zzys zzys) {
        long j = this.zzd;
        if (j < 0) {
            return -1;
        }
        this.zzd = -1;
        return -(j + 2);
    }

    public final zzzu zze() {
        zzcw.zzf(this.zzc != -1);
        return new zzzc(this.zza, this.zzc);
    }

    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzeg.zzd(jArr, j, true, true)];
    }
}
