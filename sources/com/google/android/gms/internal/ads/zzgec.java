package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgec extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgec zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgdw zzf;
    /* access modifiers changed from: private */
    public zzgji zzg = zzgji.zzb;
    /* access modifiers changed from: private */
    public zzgji zzh = zzgji.zzb;

    static {
        zzgec zzgec = new zzgec();
        zzb = zzgec;
        zzgkq.zzaP(zzgec.class, zzgec);
    }

    private zzgec() {
    }

    public static zzgeb zzd() {
        return (zzgeb) zzb.zzay();
    }

    public static zzgec zzf() {
        return zzb;
    }

    public static zzgec zzg(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgec) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzk(zzgec zzgec, zzgdw zzgdw) {
        zzgdw.getClass();
        zzgec.zzf = zzgdw;
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
            return zzaO(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgec();
        } else {
            if (i2 == 4) {
                return new zzgeb((zzgea) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgdw zzc() {
        zzgdw zzgdw = this.zzf;
        return zzgdw == null ? zzgdw.zze() : zzgdw;
    }

    public final zzgji zzh() {
        return this.zzg;
    }

    public final zzgji zzi() {
        return this.zzh;
    }
}
