package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzzt implements zzzu {
    private final long zza;
    private final zzzs zzb;

    public zzzt(long j, long j2) {
        this.zza = j;
        zzzv zzzv = j2 == 0 ? zzzv.zza : new zzzv(0, j2);
        this.zzb = new zzzs(zzzv, zzzv);
    }

    public final long zze() {
        return this.zza;
    }

    public final zzzs zzg(long j) {
        return this.zzb;
    }

    public final boolean zzh() {
        return false;
    }
}
