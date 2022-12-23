package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfv extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgfv zzb;
    private zzgfj zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zzgfv zzgfv = new zzgfv();
        zzb = zzgfv;
        zzgkq.zzaP(zzgfv.class, zzgfv);
    }

    private zzgfv() {
    }

    public static zzgfu zzd() {
        return (zzgfu) zzb.zzay();
    }

    static /* synthetic */ void zzf(zzgfv zzgfv, zzgfj zzgfj) {
        zzgfj.getClass();
        zzgfv.zze = zzgfj;
    }

    public final int zza() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgfv();
        } else {
            if (i2 == 4) {
                return new zzgfu((zzgfs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgfj zzc() {
        zzgfj zzgfj = this.zze;
        return zzgfj == null ? zzgfj.zzd() : zzgfj;
    }

    public final boolean zzh() {
        return this.zze != null;
    }

    public final int zzi() {
        int i = this.zzf;
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

    public final int zzj() {
        int zzb2 = zzggp.zzb(this.zzh);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
