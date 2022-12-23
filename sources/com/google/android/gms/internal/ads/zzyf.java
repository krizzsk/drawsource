package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzyf {
    public static final zzyf zza = new zzyf(-3, -9223372036854775807L, -1);
    /* access modifiers changed from: private */
    public final int zzb;
    /* access modifiers changed from: private */
    public final long zzc;
    /* access modifiers changed from: private */
    public final long zzd;

    private zzyf(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzyf zzd(long j, long j2) {
        return new zzyf(-1, j, j2);
    }

    public static zzyf zze(long j) {
        return new zzyf(0, -9223372036854775807L, j);
    }

    public static zzyf zzf(long j, long j2) {
        return new zzyf(-2, j, j2);
    }
}
