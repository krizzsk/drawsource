package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzggb extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzggb zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgkz zzf = zzaJ();

    static {
        zzggb zzggb = new zzggb();
        zzb = zzggb;
        zzgkq.zzaP(zzggb.class, zzggb);
    }

    private zzggb() {
    }

    public static zzgfy zza() {
        return (zzgfy) zzb.zzay();
    }

    static /* synthetic */ void zze(zzggb zzggb, zzgga zzgga) {
        zzgga.getClass();
        zzgkz zzgkz = zzggb.zzf;
        if (!zzgkz.zzc()) {
            zzggb.zzf = zzgkq.zzaK(zzgkz);
        }
        zzggb.zzf.add(zzgga);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgga.class});
        } else if (i2 == 3) {
            return new zzggb();
        } else {
            if (i2 == 4) {
                return new zzgfy((zzgfx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
