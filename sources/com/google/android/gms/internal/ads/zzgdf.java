package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgdf extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgdf zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgdf zzgdf = new zzgdf();
        zzb = zzgdf;
        zzgkq.zzaP(zzgdf.class, zzgdf);
    }

    private zzgdf() {
    }

    public static zzgde zzc() {
        return (zzgde) zzb.zzay();
    }

    public static zzgdf zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgdf) zzgkq.zzaD(zzb, zzgji, zzgkc);
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
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgdf();
        } else {
            if (i2 == 4) {
                return new zzgde((zzgdd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
