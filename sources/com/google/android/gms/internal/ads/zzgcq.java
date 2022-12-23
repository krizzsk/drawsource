package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgcq extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgcq zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgji zzf = zzgji.zzb;

    static {
        zzgcq zzgcq = new zzgcq();
        zzb = zzgcq;
        zzgkq.zzaP(zzgcq.class, zzgcq);
    }

    private zzgcq() {
    }

    public static zzgcp zzc() {
        return (zzgcp) zzb.zzay();
    }

    public static zzgcq zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgcq) zzgkq.zzaD(zzb, zzgji, zzgkc);
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
            return new zzgcq();
        } else {
            if (i2 == 4) {
                return new zzgcp((zzgco) null);
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
