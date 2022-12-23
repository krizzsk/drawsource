package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzjw {
    public static final zzjw zza = new zzjw(0, 0);
    public static final zzjw zzb = new zzjw(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final zzjw zzc = new zzjw(Long.MAX_VALUE, 0);
    public static final zzjw zzd = new zzjw(0, Long.MAX_VALUE);
    public static final zzjw zze = zza;
    public final long zzf;
    public final long zzg;

    public zzjw(long j, long j2) {
        boolean z = true;
        zzcw.zzd(j >= 0);
        zzcw.zzd(j2 < 0 ? false : z);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjw zzjw = (zzjw) obj;
            return this.zzf == zzjw.zzf && this.zzg == zzjw.zzg;
        }
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
