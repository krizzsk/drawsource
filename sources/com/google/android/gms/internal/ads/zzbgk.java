package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbgk extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbgk zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbgk zzbgk = new zzbgk();
        zzb = zzbgk;
        zzgkq.zzaP(zzbgk.class, zzbgk);
    }

    private zzbgk() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbgk();
        } else {
            if (i2 == 4) {
                return new zzbgj((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}