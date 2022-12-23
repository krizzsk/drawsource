package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaxo extends zzase {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;

    public zzaxo(long j, boolean z) {
        this.zzc = j;
        this.zzd = j;
    }

    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    public final int zzb() {
        return 1;
    }

    public final int zzc() {
        return 1;
    }

    public final zzasc zzd(int i, zzasc zzasc, boolean z) {
        zzayz.zza(i, 0, 1);
        Object obj = z ? zzb : null;
        long j = this.zzc;
        zzasc.zza = obj;
        zzasc.zzb = obj;
        zzasc.zzc = j;
        return zzasc;
    }

    public final zzasd zze(int i, zzasd zzasd, boolean z, long j) {
        zzayz.zza(i, 0, 1);
        zzasd.zza = this.zzd;
        return zzasd;
    }
}
