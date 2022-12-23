package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbbv {
    final long zza;
    final String zzb;
    final int zzc;

    zzbbv(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbbv)) {
            zzbbv zzbbv = (zzbbv) obj;
            if (zzbbv.zza == this.zza && zzbbv.zzc == this.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
