package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzuc {
    public final long zza;
    public final long zzb;

    public zzuc(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuc)) {
            return false;
        }
        zzuc zzuc = (zzuc) obj;
        return this.zza == zzuc.zza && this.zzb == zzuc.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
