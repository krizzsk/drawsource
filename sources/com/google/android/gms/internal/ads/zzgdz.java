package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgdz extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgdz zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgec zzf;
    /* access modifiers changed from: private */
    public zzgji zzg = zzgji.zzb;

    static {
        zzgdz zzgdz = new zzgdz();
        zzb = zzgdz;
        zzgkq.zzaP(zzgdz.class, zzgdz);
    }

    private zzgdz() {
    }

    public static zzgdy zzc() {
        return (zzgdy) zzb.zzay();
    }

    public static zzgdz zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgdz) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzi(zzgdz zzgdz, zzgec zzgec) {
        zzgec.getClass();
        zzgdz.zzf = zzgec;
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
            return new zzgdz();
        } else {
            if (i2 == 4) {
                return new zzgdy((zzgdx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgec zzf() {
        zzgec zzgec = this.zzf;
        return zzgec == null ? zzgec.zzf() : zzgec;
    }

    public final zzgji zzg() {
        return this.zzg;
    }
}
