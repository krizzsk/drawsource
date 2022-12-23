package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzoc {
    private final zzmy[] zza;
    private final zzou zzb;
    private final zzow zzc;

    public zzoc(zzmy... zzmyArr) {
        zzou zzou = new zzou();
        zzow zzow = new zzow();
        zzmy[] zzmyArr2 = new zzmy[2];
        this.zza = zzmyArr2;
        System.arraycopy(zzmyArr, 0, zzmyArr2, 0, 0);
        this.zzb = zzou;
        this.zzc = zzow;
        zzmy[] zzmyArr3 = this.zza;
        zzmyArr3[0] = zzou;
        zzmyArr3[1] = zzow;
    }

    public final long zza(long j) {
        return this.zzc.zzi(j);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbt zzc(zzbt zzbt) {
        this.zzc.zzk(zzbt.zzc);
        this.zzc.zzj(zzbt.zzd);
        return zzbt;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzmy[] zze() {
        return this.zza;
    }
}
