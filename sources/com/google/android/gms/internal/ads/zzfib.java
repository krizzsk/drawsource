package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfib extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzfib zzb;
    private zzfhx zze;

    static {
        zzfib zzfib = new zzfib();
        zzb = zzfib;
        zzgkq.zzaP(zzfib.class, zzfib);
    }

    private zzfib() {
    }

    public static zzfia zza() {
        return (zzfia) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzfib zzfib, zzfhx zzfhx) {
        zzfhx.getClass();
        zzfib.zze = zzfhx;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzfib();
        } else {
            if (i2 == 4) {
                return new zzfia((zzfhy) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
