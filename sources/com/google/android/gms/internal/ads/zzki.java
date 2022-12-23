package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzki {
    public final long zza;
    public final zzci zzb;
    public final int zzc;
    public final zzsa zzd;
    public final long zze;
    public final zzci zzf;
    public final int zzg;
    public final zzsa zzh;
    public final long zzi;
    public final long zzj;

    public zzki(long j, zzci zzci, int i, zzsa zzsa, long j2, zzci zzci2, int i2, zzsa zzsa2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzci;
        this.zzc = i;
        this.zzd = zzsa;
        this.zze = j2;
        this.zzf = zzci2;
        this.zzg = i2;
        this.zzh = zzsa2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzki zzki = (zzki) obj;
            return this.zza == zzki.zza && this.zzc == zzki.zzc && this.zze == zzki.zze && this.zzg == zzki.zzg && this.zzi == zzki.zzi && this.zzj == zzki.zzj && zzfoq.zza(this.zzb, zzki.zzb) && zzfoq.zza(this.zzd, zzki.zzd) && zzfoq.zza(this.zzf, zzki.zzf) && zzfoq.zza(this.zzh, zzki.zzh);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
