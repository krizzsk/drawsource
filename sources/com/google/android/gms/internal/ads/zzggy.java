package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzggy extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzggy zzb;
    private int zze;

    static {
        zzggy zzggy = new zzggy();
        zzb = zzggy;
        zzgkq.zzaP(zzggy.class, zzggy);
    }

    private zzggy() {
    }

    public static zzggy zzc() {
        return zzb;
    }

    public static zzggy zzd(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzggy) zzgkq.zzaD(zzb, zzgji, zzgkc);
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
            return new zzggy();
        } else {
            if (i2 == 4) {
                return new zzggx((zzggw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
