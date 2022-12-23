package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzaxu {
    protected final zzaxp zza;
    protected final int[] zzb;
    private final zzart[] zzc;
    private int zzd;

    public zzaxu(zzaxp zzaxp, int... iArr) {
        if (zzaxp != null) {
            this.zza = zzaxp;
            this.zzc = new zzart[1];
            for (int i = 0; i <= 0; i++) {
                this.zzc[i] = zzaxp.zzb(iArr[i]);
            }
            Arrays.sort(this.zzc, new zzaxt((zzaxs) null));
            this.zzb = new int[1];
            for (int i2 = 0; i2 <= 0; i2++) {
                this.zzb[i2] = zzaxp.zza(this.zzc[i2]);
            }
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaxu zzaxu = (zzaxu) obj;
            return this.zza == zzaxu.zza && Arrays.equals(this.zzb, zzaxu.zzb);
        }
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzb);
        this.zzd = identityHashCode;
        return identityHashCode;
    }

    public final int zza(int i) {
        return this.zzb[0];
    }

    public final int zzb() {
        int length = this.zzb.length;
        return 1;
    }

    public final zzart zzc(int i) {
        return this.zzc[i];
    }

    public final zzaxp zzd() {
        return this.zza;
    }
}
