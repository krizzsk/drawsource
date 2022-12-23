package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzuq implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzuq(zzad zzad, int i) {
        this.zza = 1 != (zzad.zze & 1) ? false : true;
        this.zzb = zzve.zzi(i, false);
    }

    /* renamed from: zza */
    public final int compareTo(zzuq zzuq) {
        return zzfqy.zzj().zzd(this.zzb, zzuq.zzb).zzd(this.zza, zzuq.zza).zza();
    }
}
