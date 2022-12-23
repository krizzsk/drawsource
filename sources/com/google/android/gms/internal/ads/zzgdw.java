package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgdw extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgdw zzb;
    private zzgef zze;
    private zzgdq zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgdw zzgdw = new zzgdw();
        zzb = zzgdw;
        zzgkq.zzaP(zzgdw.class, zzgdw);
    }

    private zzgdw() {
    }

    public static zzgdv zzc() {
        return (zzgdv) zzb.zzay();
    }

    public static zzgdw zze() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgdw zzgdw, zzgef zzgef) {
        zzgef.getClass();
        zzgdw.zze = zzgef;
    }

    static /* synthetic */ void zzh(zzgdw zzgdw, zzgdq zzgdq) {
        zzgdq.getClass();
        zzgdw.zzf = zzgdq;
    }

    public final zzgdq zza() {
        zzgdq zzgdq = this.zzf;
        return zzgdq == null ? zzgdq.zzd() : zzgdq;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgdw();
        } else {
            if (i2 == 4) {
                return new zzgdv((zzgdu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgef zzf() {
        zzgef zzgef = this.zze;
        return zzgef == null ? zzgef.zzd() : zzgef;
    }

    public final int zzi() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
