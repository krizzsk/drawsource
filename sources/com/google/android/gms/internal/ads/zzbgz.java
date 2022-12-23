package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbgz extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbgz zzb;
    private int zze;
    private int zzf = 1000;
    private zzbgt zzg;
    private zzbgk zzh;

    static {
        zzbgz zzbgz = new zzbgz();
        zzb = zzbgz;
        zzgkq.zzaP(zzbgz.class, zzbgz);
    }

    private zzbgz() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbez.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbgz();
        } else {
            if (i2 == 4) {
                return new zzbgy((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
