package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzzc implements zzzu {
    private final zzze zza;
    private final long zzb;

    public zzzc(zzze zzze, long j) {
        this.zza = zzze;
        this.zzb = j;
    }

    private final zzzv zza(long j, long j2) {
        return new zzzv((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    public final long zze() {
        return this.zza.zza();
    }

    public final zzzs zzg(long j) {
        long j2;
        zzcw.zzb(this.zza.zzk);
        zzze zzze = this.zza;
        zzzd zzzd = zzze.zzk;
        long[] jArr = zzzd.zza;
        long[] jArr2 = zzzd.zzb;
        int zzd = zzeg.zzd(jArr, zzze.zzb(j), true, false);
        long j3 = 0;
        if (zzd == -1) {
            j2 = 0;
        } else {
            j2 = jArr[zzd];
        }
        if (zzd != -1) {
            j3 = jArr2[zzd];
        }
        zzzv zza2 = zza(j2, j3);
        if (zza2.zzb == j || zzd == jArr.length - 1) {
            return new zzzs(zza2, zza2);
        }
        int i = zzd + 1;
        return new zzzs(zza2, zza(jArr[i], jArr2[i]));
    }

    public final boolean zzh() {
        return true;
    }
}
