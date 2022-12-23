package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzct {
    public static final zzct zza = new zzct(zzfrj.zzo());
    public static final zzl zzb = zzcq.zza;
    private final zzfrj zzc;

    public zzct(List list) {
        this.zzc = zzfrj.zzm(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzc.equals(((zzct) obj).zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final zzfrj zza() {
        return this.zzc;
    }

    public final boolean zzb(int i) {
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            zzcs zzcs = (zzcs) this.zzc.get(i2);
            if (zzcs.zzc() && zzcs.zza() == i) {
                return true;
            }
        }
        return false;
    }
}
