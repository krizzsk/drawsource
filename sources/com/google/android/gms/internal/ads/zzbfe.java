package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbfe extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbfe zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private zzgkv zzh = zzaG();
    private zzbgk zzi;

    static {
        zzbfe zzbfe = new zzbfe();
        zzb = zzbfe;
        zzgkq.zzaP(zzbfe.class, zzbfe);
    }

    private zzbfe() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbez.zza, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzbfe();
        } else {
            if (i2 == 4) {
                return new zzbfd((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
