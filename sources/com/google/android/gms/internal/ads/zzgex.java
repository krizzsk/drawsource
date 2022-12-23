package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgex extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgex zzb;
    private zzgfa zze;

    static {
        zzgex zzgex = new zzgex();
        zzb = zzgex;
        zzgkq.zzaP(zzgex.class, zzgex);
    }

    private zzgex() {
    }

    public static zzgew zza() {
        return (zzgew) zzb.zzay();
    }

    public static zzgex zzd(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgex) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzf(zzgex zzgex, zzgfa zzgfa) {
        zzgfa.getClass();
        zzgex.zze = zzgfa;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgex();
        } else {
            if (i2 == 4) {
                return new zzgew((zzgev) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgfa zze() {
        zzgfa zzgfa = this.zze;
        return zzgfa == null ? zzgfa.zzd() : zzgfa;
    }
}
