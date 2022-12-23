package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzaey implements zzzu {
    final /* synthetic */ zzaez zza;

    /* synthetic */ zzaey(zzaez zzaez, zzaex zzaex) {
        this.zza = zzaez;
    }

    public final long zze() {
        zzaez zzaez = this.zza;
        return zzaez.zzd.zzf(zzaez.zzf);
    }

    public final zzzs zzg(long j) {
        zzaez zzaez = this.zza;
        long zzg = zzaez.zzd.zzg(j);
        long zzb = zzaez.zzb;
        long zza2 = zzg * (zzaez.zzc - zzaez.zzb);
        zzzv zzzv = new zzzv(j, zzeg.zzr(-30000 + zzb + (zza2 / zzaez.zzf), zzaez.zzb, zzaez.zzc - 1));
        return new zzzs(zzzv, zzzv);
    }

    public final boolean zzh() {
        return true;
    }
}
