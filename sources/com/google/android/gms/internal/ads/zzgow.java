package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgow extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgow zzb;
    private int zze;
    private zzgji zzf = zzgji.zzb;
    private zzgji zzg;
    private zzgji zzh;

    static {
        zzgow zzgow = new zzgow();
        zzb = zzgow;
        zzgkq.zzaP(zzgow.class, zzgow);
    }

    private zzgow() {
        zzgji zzgji = zzgji.zzb;
        this.zzg = zzgji;
        this.zzh = zzgji;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgow();
        } else {
            if (i2 == 4) {
                return new zzgov((zzgoc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
