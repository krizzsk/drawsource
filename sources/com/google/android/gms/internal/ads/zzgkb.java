package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgkb {
    private final Object zza;
    private final int zzb;

    zzgkb(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgkb)) {
            return false;
        }
        zzgkb zzgkb = (zzgkb) obj;
        if (this.zza == zzgkb.zza && this.zzb == zzgkb.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
