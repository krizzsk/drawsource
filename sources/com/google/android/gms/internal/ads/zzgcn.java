package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgcn extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgcn zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgcn zzgcn = new zzgcn();
        zzb = zzgcn;
        zzgkq.zzaP(zzgcn.class, zzgcn);
    }

    private zzgcn() {
    }

    public static zzgcm zzc() {
        return (zzgcm) zzb.zzay();
    }

    public static zzgcn zze() {
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
            return new zzgcn();
        } else {
            if (i2 == 4) {
                return new zzgcm((zzgcl) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
