package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbgi extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbgi zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private zzbgk zzh;

    static {
        zzbgi zzbgi = new zzbgi();
        zzb = zzbgi;
        zzgkq.zzaP(zzbgi.class, zzbgi);
    }

    private zzbgi() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbez.zza, "zzh"});
        } else if (i2 == 3) {
            return new zzbgi();
        } else {
            if (i2 == 4) {
                return new zzbgh((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
