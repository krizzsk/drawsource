package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgot extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgot zzb;
    private int zze;
    private zzgji zzf = zzgji.zzb;
    private zzgji zzg = zzgji.zzb;
    private byte zzh = 2;

    static {
        zzgot zzgot = new zzgot();
        zzb = zzgot;
        zzgkq.zzaP(zzgot.class, zzgot);
    }

    private zzgot() {
    }

    public static zzgos zza() {
        return (zzgos) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzgot zzgot, zzgji zzgji) {
        zzgot.zze |= 1;
        zzgot.zzf = zzgji;
    }

    static /* synthetic */ void zze(zzgot zzgot, zzgji zzgji) {
        zzgot.zze |= 2;
        zzgot.zzg = zzgji;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgot();
        } else {
            if (i2 == 4) {
                return new zzgos((zzgoc) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
