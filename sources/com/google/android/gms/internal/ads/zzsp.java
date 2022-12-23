package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzsp implements zztq {
    private final zztq zza;
    private final long zzb;

    public zzsp(zztq zztq, long j) {
        this.zza = zztq;
        this.zzb = j;
    }

    public final int zza(zziz zziz, zzgb zzgb, int i) {
        int zza2 = this.zza.zza(zziz, zzgb, i);
        if (zza2 != -4) {
            return zza2;
        }
        zzgb.zzd = Math.max(0, zzgb.zzd + this.zzb);
        return -4;
    }

    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zztq zzc() {
        return this.zza;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return this.zza.zze();
    }
}
