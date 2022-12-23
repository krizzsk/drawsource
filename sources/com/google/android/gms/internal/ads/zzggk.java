package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzggk extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzggk zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzggn zzf;

    static {
        zzggk zzggk = new zzggk();
        zzb = zzggk;
        zzgkq.zzaP(zzggk.class, zzggk);
    }

    private zzggk() {
    }

    public static zzggj zzc() {
        return (zzggj) zzb.zzay();
    }

    public static zzggk zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzggk) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzh(zzggk zzggk, zzggn zzggn) {
        zzggn.getClass();
        zzggk.zzf = zzggn;
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
            return new zzggk();
        } else {
            if (i2 == 4) {
                return new zzggj((zzggi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzggn zzf() {
        zzggn zzggn = this.zzf;
        return zzggn == null ? zzggn.zzd() : zzggn;
    }
}
