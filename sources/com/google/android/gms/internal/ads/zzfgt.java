package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfgt {
    public final String zza;
    public final String zzb;

    public zzfgt(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfgt)) {
            return false;
        }
        zzfgt zzfgt = (zzfgt) obj;
        return this.zza.equals(zzfgt.zza) && this.zzb.equals(zzfgt.zzb);
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
