package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbhf extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbhf zzb;
    private int zze;
    private int zzf = 1000;
    private zzbgt zzg;

    static {
        zzbhf zzbhf = new zzbhf();
        zzb = zzbhf;
        zzgkq.zzaP(zzbhf.class, zzbhf);
    }

    private zzbhf() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbez.zza, "zzg"});
        } else if (i2 == 3) {
            return new zzbhf();
        } else {
            if (i2 == 4) {
                return new zzbhe((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
