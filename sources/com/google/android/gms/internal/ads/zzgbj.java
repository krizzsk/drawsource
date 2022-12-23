package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgbj extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgbj zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgji zzf = zzgji.zzb;
    private zzgbp zzg;

    static {
        zzgbj zzgbj = new zzgbj();
        zzb = zzgbj;
        zzgkq.zzaP(zzgbj.class, zzgbj);
    }

    private zzgbj() {
    }

    public static zzgbi zzc() {
        return (zzgbi) zzb.zzay();
    }

    public static zzgbj zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgbj) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzj(zzgbj zzgbj, zzgbp zzgbp) {
        zzgbp.getClass();
        zzgbj.zzg = zzgbp;
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
            return zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgbj();
        } else {
            if (i2 == 4) {
                return new zzgbi((zzgbh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgbp zzf() {
        zzgbp zzgbp = this.zzg;
        return zzgbp == null ? zzgbp.zze() : zzgbp;
    }

    public final zzgji zzg() {
        return this.zzf;
    }
}
