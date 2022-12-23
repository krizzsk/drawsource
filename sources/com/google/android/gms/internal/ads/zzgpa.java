package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgpa extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgpa zzb;
    private int zze;
    private int zzf;
    private zzgji zzg = zzgji.zzb;
    private zzgji zzh = zzgji.zzb;

    static {
        zzgpa zzgpa = new zzgpa();
        zzb = zzgpa;
        zzgkq.zzaP(zzgpa.class, zzgpa);
    }

    private zzgpa() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgpa();
        } else {
            if (i2 == 4) {
                return new zzgoz((zzgoc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
