package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbeo extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbeo zzb;
    private int zze;
    private String zzf = "";
    private zzgkz zzg = zzaJ();
    private int zzh;

    static {
        zzbeo zzbeo = new zzbeo();
        zzb = zzbeo;
        zzgkq.zzaP(zzbeo.class, zzbeo);
    }

    private zzbeo() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzbem.class, "zzh", zzbez.zza});
        } else if (i2 == 3) {
            return new zzbeo();
        } else {
            if (i2 == 4) {
                return new zzben((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
