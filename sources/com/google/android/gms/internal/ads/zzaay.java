package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzaay implements zzzu {
    final /* synthetic */ zzzu zza;
    final /* synthetic */ zzaaz zzb;

    zzaay(zzaaz zzaaz, zzzu zzzu) {
        this.zzb = zzaaz;
        this.zza = zzzu;
    }

    public final long zze() {
        return this.zza.zze();
    }

    public final zzzs zzg(long j) {
        zzzs zzg = this.zza.zzg(j);
        zzzv zzzv = zzg.zza;
        zzzv zzzv2 = new zzzv(zzzv.zzb, zzzv.zzc + this.zzb.zzb);
        zzzv zzzv3 = zzg.zzb;
        return new zzzs(zzzv2, new zzzv(zzzv3.zzb, zzzv3.zzc + this.zzb.zzb));
    }

    public final boolean zzh() {
        return this.zza.zzh();
    }
}
