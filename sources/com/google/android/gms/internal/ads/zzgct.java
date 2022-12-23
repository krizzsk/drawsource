package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgct extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgct zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgct zzgct = new zzgct();
        zzb = zzgct;
        zzgkq.zzaP(zzgct.class, zzgct);
    }

    private zzgct() {
    }

    public static zzgcs zzc() {
        return (zzgcs) zzb.zzay();
    }

    public static zzgct zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgct) zzgkq.zzaD(zzb, zzgji, zzgkc);
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
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgct();
        } else {
            if (i2 == 4) {
                return new zzgcs((zzgcr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
