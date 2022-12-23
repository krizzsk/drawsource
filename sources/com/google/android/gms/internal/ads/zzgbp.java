package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgbp extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgbp zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgbp zzgbp = new zzgbp();
        zzb = zzgbp;
        zzgkq.zzaP(zzgbp.class, zzgbp);
    }

    private zzgbp() {
    }

    public static zzgbo zzc() {
        return (zzgbo) zzb.zzay();
    }

    public static zzgbp zze() {
        return zzb;
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
            return zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgbp();
        } else {
            if (i2 == 4) {
                return new zzgbo((zzgbn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
