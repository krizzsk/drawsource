package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgqs implements zzgqu {
    private zzgrh zza;

    public static void zza(zzgrh zzgrh, zzgrh zzgrh2) {
        zzgqs zzgqs = (zzgqs) zzgrh;
        if (zzgqs.zza == null) {
            zzgqs.zza = zzgrh2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object zzb() {
        zzgrh zzgrh = this.zza;
        if (zzgrh != null) {
            return zzgrh.zzb();
        }
        throw new IllegalStateException();
    }
}
