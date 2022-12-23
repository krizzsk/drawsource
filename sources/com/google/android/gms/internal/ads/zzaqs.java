package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqs extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzaqs zzb;
    private int zze;
    private zzaqv zzf;
    private zzgji zzg = zzgji.zzb;
    private zzgji zzh = zzgji.zzb;

    static {
        zzaqs zzaqs = new zzaqs();
        zzb = zzaqs;
        zzgkq.zzaP(zzaqs.class, zzaqs);
    }

    private zzaqs() {
    }

    public static zzaqs zzc(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzaqs) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzaqs();
        } else {
            if (i2 == 4) {
                return new zzaqr((zzaqq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzaqv zzd() {
        zzaqv zzaqv = this.zzf;
        return zzaqv == null ? zzaqv.zzg() : zzaqv;
    }

    public final zzgji zze() {
        return this.zzh;
    }

    public final zzgji zzf() {
        return this.zzg;
    }
}
