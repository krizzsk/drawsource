package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzawn implements zzaxn {
    private final zzaxn[] zza;

    public zzawn(zzaxn[] zzaxnArr) {
        this.zza = zzaxnArr;
    }

    public final long zza() {
        long j = Long.MAX_VALUE;
        for (zzaxn zza2 : this.zza) {
            long zza3 = zza2.zza();
            if (zza3 != Long.MIN_VALUE) {
                j = Math.min(j, zza3);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean zzbj(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zza2 = zza();
            if (zza2 == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzaxn zzaxn : this.zza) {
                if (zzaxn.zza() == zza2) {
                    z |= zzaxn.zzbj(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
