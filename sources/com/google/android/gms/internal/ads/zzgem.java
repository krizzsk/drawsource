package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgem extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgem zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzges zzf;
    /* access modifiers changed from: private */
    public zzgji zzg = zzgji.zzb;

    static {
        zzgem zzgem = new zzgem();
        zzb = zzgem;
        zzgkq.zzaP(zzgem.class, zzgem);
    }

    private zzgem() {
    }

    public static zzgel zzc() {
        return (zzgel) zzb.zzay();
    }

    public static zzgem zze() {
        return zzb;
    }

    public static zzgem zzf(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgem) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzj(zzgem zzgem, zzges zzges) {
        zzges.getClass();
        zzgem.zzf = zzges;
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
            return zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgem();
        } else {
            if (i2 == 4) {
                return new zzgel((zzgek) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzges zzg() {
        zzges zzges = this.zzf;
        return zzges == null ? zzges.zze() : zzges;
    }

    public final zzgji zzh() {
        return this.zzg;
    }
}
