package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgby extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgby zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgce zzf;
    /* access modifiers changed from: private */
    public zzgji zzg = zzgji.zzb;

    static {
        zzgby zzgby = new zzgby();
        zzb = zzgby;
        zzgkq.zzaP(zzgby.class, zzgby);
    }

    private zzgby() {
    }

    public static zzgbx zzc() {
        return (zzgbx) zzb.zzay();
    }

    public static zzgby zze() {
        return zzb;
    }

    public static zzgby zzf(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgby) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzj(zzgby zzgby, zzgce zzgce) {
        zzgce.getClass();
        zzgby.zzf = zzgce;
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
            return new zzgby();
        } else {
            if (i2 == 4) {
                return new zzgbx((zzgbw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgce zzg() {
        zzgce zzgce = this.zzf;
        return zzgce == null ? zzgce.zze() : zzgce;
    }

    public final zzgji zzh() {
        return this.zzg;
    }
}
