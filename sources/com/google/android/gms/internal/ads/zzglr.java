package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzglr implements zzgly {
    private final zzgly[] zza;

    zzglr(zzgly... zzglyArr) {
        this.zza = zzglyArr;
    }

    public final zzglx zzb(Class cls) {
        zzgly[] zzglyArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzgly zzgly = zzglyArr[i];
            if (zzgly.zzc(cls)) {
                return zzgly.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    public final boolean zzc(Class cls) {
        zzgly[] zzglyArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzglyArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
