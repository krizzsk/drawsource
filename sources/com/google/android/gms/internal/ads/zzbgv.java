package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbgv extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbgv zzb;
    private int zze;
    private zzbgm zzf;
    private int zzg = 1000;
    private zzbgt zzh;
    private zzbgk zzi;

    static {
        zzbgv zzbgv = new zzbgv();
        zzb = zzbgv;
        zzgkq.zzaP(zzbgv.class, zzbgv);
    }

    private zzbgv() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", zzbez.zza, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzbgv();
        } else {
            if (i2 == 4) {
                return new zzbgu((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
