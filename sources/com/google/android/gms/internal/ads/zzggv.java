package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzggv extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzggv zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgji zzf = zzgji.zzb;

    static {
        zzggv zzggv = new zzggv();
        zzb = zzggv;
        zzgkq.zzaP(zzggv.class, zzggv);
    }

    private zzggv() {
    }

    public static zzggu zzc() {
        return (zzggu) zzb.zzay();
    }

    public static zzggv zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzggv) zzgkq.zzaD(zzb, zzgji, zzgkc);
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
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzggv();
        } else {
            if (i2 == 4) {
                return new zzggu((zzggt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgji zzf() {
        return this.zzf;
    }
}
