package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbem extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbem zzb;
    private int zze;
    private int zzf;
    private zzbgg zzg;

    static {
        zzbem zzbem = new zzbem();
        zzb = zzbem;
        zzgkq.zzaP(zzbem.class, zzbem);
    }

    private zzbem() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbek.zzc(), "zzg"});
        } else if (i2 == 3) {
            return new zzbem();
        } else {
            if (i2 == 4) {
                return new zzbel((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
