package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzjn {
    private static final zzsa zzt = new zzsa(new Object());
    public final zzci zza;
    public final zzsa zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzgt zzf;
    public final boolean zzg;
    public final zzty zzh;
    public final zzvn zzi;
    public final List zzj;
    public final zzsa zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzbt zzn;
    public final boolean zzo;
    public final boolean zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzjn(zzci zzci, zzsa zzsa, long j, long j2, int i, zzgt zzgt, boolean z, zzty zzty, zzvn zzvn, List list, zzsa zzsa2, boolean z2, int i2, zzbt zzbt, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.zza = zzci;
        this.zzb = zzsa;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzgt;
        this.zzg = z;
        this.zzh = zzty;
        this.zzi = zzvn;
        this.zzj = list;
        this.zzk = zzsa2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzbt;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzo = z3;
        this.zzp = z4;
    }

    public static zzjn zzh(zzvn zzvn) {
        return new zzjn(zzci.zza, zzt, -9223372036854775807L, 0, 1, (zzgt) null, false, zzty.zza, zzvn, zzfrj.zzo(), zzt, false, 0, zzbt.zza, 0, 0, 0, false, false);
    }

    public static zzsa zzi() {
        return zzt;
    }

    public final zzjn zza(zzsa zzsa) {
        zzci zzci = this.zza;
        return new zzjn(zzci, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzsa, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjn zzb(zzsa zzsa, long j, long j2, long j3, long j4, zzty zzty, zzvn zzvn, List list) {
        long j5 = j;
        zzty zzty2 = zzty;
        zzvn zzvn2 = zzvn;
        List list2 = list;
        zzci zzci = this.zza;
        return new zzjn(zzci, zzsa, j2, j3, this.zze, this.zzf, this.zzg, zzty2, zzvn2, list2, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, j4, j5, this.zzo, this.zzp);
    }

    public final zzjn zzc(boolean z) {
        zzci zzci = this.zza;
        return new zzjn(zzci, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, z, this.zzp);
    }

    public final zzjn zzd(boolean z, int i) {
        zzci zzci = this.zza;
        return new zzjn(zzci, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjn zze(zzgt zzgt) {
        zzci zzci = this.zza;
        return new zzjn(zzci, this.zzb, this.zzc, this.zzd, this.zze, zzgt, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjn zzf(int i) {
        zzci zzci = this.zza;
        return new zzjn(zzci, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjn zzg(zzci zzci) {
        return new zzjn(zzci, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }
}
