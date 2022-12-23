package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzzs {
    public final zzzv zza;
    public final zzzv zzb;

    public zzzs(zzzv zzzv, zzzv zzzv2) {
        this.zza = zzzv;
        this.zzb = zzzv2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzzs zzzs = (zzzs) obj;
            return this.zza.equals(zzzs.zza) && this.zzb.equals(zzzs.zzb);
        }
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String concat = this.zza.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString());
        return "[" + obj + concat + "]";
    }
}
