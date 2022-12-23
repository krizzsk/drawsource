package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgbs extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgbs zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgby zzf;
    private zzgem zzg;

    static {
        zzgbs zzgbs = new zzgbs();
        zzb = zzgbs;
        zzgkq.zzaP(zzgbs.class, zzgbs);
    }

    private zzgbs() {
    }

    public static zzgbr zzc() {
        return (zzgbr) zzb.zzay();
    }

    public static zzgbs zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgbs) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzi(zzgbs zzgbs, zzgby zzgby) {
        zzgby.getClass();
        zzgbs.zzf = zzgby;
    }

    static /* synthetic */ void zzj(zzgbs zzgbs, zzgem zzgem) {
        zzgem.getClass();
        zzgbs.zzg = zzgem;
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
            return zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgbs();
        } else {
            if (i2 == 4) {
                return new zzgbr((zzgbq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgby zzf() {
        zzgby zzgby = this.zzf;
        return zzgby == null ? zzgby.zze() : zzgby;
    }

    public final zzgem zzg() {
        zzgem zzgem = this.zzg;
        return zzgem == null ? zzgem.zze() : zzgem;
    }
}
