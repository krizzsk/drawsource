package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgcb extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgcb zzb;
    private zzgce zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgcb zzgcb = new zzgcb();
        zzb = zzgcb;
        zzgkq.zzaP(zzgcb.class, zzgcb);
    }

    private zzgcb() {
    }

    public static zzgca zzc() {
        return (zzgca) zzb.zzay();
    }

    public static zzgcb zze() {
        return zzb;
    }

    public static zzgcb zzf(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgcb) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzh(zzgcb zzgcb, zzgce zzgce) {
        zzgce.getClass();
        zzgcb.zze = zzgce;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgcb();
        } else {
            if (i2 == 4) {
                return new zzgca((zzgbz) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgce zzg() {
        zzgce zzgce = this.zze;
        return zzgce == null ? zzgce.zze() : zzgce;
    }
}
