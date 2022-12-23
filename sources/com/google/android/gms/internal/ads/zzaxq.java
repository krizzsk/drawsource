package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaxq {
    public static final zzaxq zza = new zzaxq(new zzaxp[0]);
    public final int zzb;
    private final zzaxp[] zzc;
    private int zzd;

    public zzaxq(zzaxp... zzaxpArr) {
        this.zzc = zzaxpArr;
        this.zzb = zzaxpArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaxq zzaxq = (zzaxq) obj;
            return this.zzb == zzaxq.zzb && Arrays.equals(this.zzc, zzaxq.zzc);
        }
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    public final int zza(zzaxp zzaxp) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zzc[i] == zzaxp) {
                return i;
            }
        }
        return -1;
    }

    public final zzaxp zzb(int i) {
        return this.zzc[i];
    }
}
