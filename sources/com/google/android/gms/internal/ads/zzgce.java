package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgce extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgce zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgce zzgce = new zzgce();
        zzb = zzgce;
        zzgkq.zzaP(zzgce.class, zzgce);
    }

    private zzgce() {
    }

    public static zzgcd zzc() {
        return (zzgcd) zzb.zzay();
    }

    public static zzgce zze() {
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
            return new zzgce();
        } else {
            if (i2 == 4) {
                return new zzgcd((zzgcc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
