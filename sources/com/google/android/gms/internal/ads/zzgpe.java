package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgpe extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgpe zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgji zzh = zzgji.zzb;
    private zzgji zzi = zzgji.zzb;

    static {
        zzgpe zzgpe = new zzgpe();
        zzb = zzgpe;
        zzgkq.zzaP(zzgpe.class, zzgpe);
    }

    private zzgpe() {
    }

    public static zzgpc zza() {
        return (zzgpc) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzgpe zzgpe, String str) {
        zzgpe.zze |= 2;
        zzgpe.zzg = "image/png";
    }

    static /* synthetic */ void zze(zzgpe zzgpe, zzgji zzgji) {
        zzgji.getClass();
        zzgpe.zze |= 4;
        zzgpe.zzh = zzgji;
    }

    static /* synthetic */ void zzf(zzgpe zzgpe, int i) {
        zzgpe.zzf = 1;
        zzgpe.zze = 1 | zzgpe.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", zzgpd.zza, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzgpe();
        } else {
            if (i2 == 4) {
                return new zzgpc((zzgoc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
