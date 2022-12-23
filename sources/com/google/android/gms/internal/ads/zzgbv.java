package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgbv extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgbv zzb;
    private zzgcb zze;
    private zzgep zzf;

    static {
        zzgbv zzgbv = new zzgbv();
        zzb = zzgbv;
        zzgkq.zzaP(zzgbv.class, zzgbv);
    }

    private zzgbv() {
    }

    public static zzgbu zza() {
        return (zzgbu) zzb.zzay();
    }

    public static zzgbv zzd(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgbv) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzg(zzgbv zzgbv, zzgcb zzgcb) {
        zzgcb.getClass();
        zzgbv.zze = zzgcb;
    }

    static /* synthetic */ void zzh(zzgbv zzgbv, zzgep zzgep) {
        zzgep.getClass();
        zzgbv.zzf = zzgep;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgbv();
        } else {
            if (i2 == 4) {
                return new zzgbu((zzgbt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgcb zze() {
        zzgcb zzgcb = this.zze;
        return zzgcb == null ? zzgcb.zze() : zzgcb;
    }

    public final zzgep zzf() {
        zzgep zzgep = this.zzf;
        return zzgep == null ? zzgep.zze() : zzgep;
    }
}
