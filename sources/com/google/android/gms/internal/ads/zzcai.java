package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcai extends zzcak {
    private final String zza;
    private final int zzb;

    public zzcai(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcai)) {
            zzcai zzcai = (zzcai) obj;
            if (!Objects.equal(this.zza, zzcai.zza) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcai.zzb))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
