package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbex extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbex zzb;
    private int zze;
    private int zzf;
    private zzbgm zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        zzbex zzbex = new zzbex();
        zzb = zzbex;
        zzgkq.zzaP(zzbex.class, zzbex);
    }

    private zzbex() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", zzbew.zza, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzbex();
        } else {
            if (i2 == 4) {
                return new zzbev((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
