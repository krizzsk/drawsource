package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public class zzbjb {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbjb(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbjb zza(String str, double d) {
        return new zzbjb(str, Double.valueOf(d), 3);
    }

    public static zzbjb zzb(String str, long j) {
        return new zzbjb(str, Long.valueOf(j), 2);
    }

    public static zzbjb zzc(String str, String str2) {
        return new zzbjb(str, str2, 4);
    }

    public static zzbjb zzd(String str, boolean z) {
        return new zzbjb(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbke zza2 = zzbkg.zza();
        if (zza2 == null) {
            if (zzbkg.zzb() != null) {
                zzbkg.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i == 0) {
            return zza2.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i == 1) {
            return zza2.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        if (i != 2) {
            return zza2.zzd(this.zza, (String) this.zzb);
        }
        return zza2.zzb(this.zza, ((Double) this.zzb).doubleValue());
    }
}
