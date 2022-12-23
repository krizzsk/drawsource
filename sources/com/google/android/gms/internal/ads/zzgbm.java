package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgbm extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgbm zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgbp zzf;

    static {
        zzgbm zzgbm = new zzgbm();
        zzb = zzgbm;
        zzgkq.zzaP(zzgbm.class, zzgbm);
    }

    private zzgbm() {
    }

    public static zzgbl zzc() {
        return (zzgbl) zzb.zzay();
    }

    public static zzgbm zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgbm) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzh(zzgbm zzgbm, zzgbp zzgbp) {
        zzgbp.getClass();
        zzgbm.zzf = zzgbp;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgbm();
        } else {
            if (i2 == 4) {
                return new zzgbl((zzgbk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgbp zzf() {
        zzgbp zzgbp = this.zzf;
        return zzgbp == null ? zzgbp.zze() : zzgbp;
    }
}
