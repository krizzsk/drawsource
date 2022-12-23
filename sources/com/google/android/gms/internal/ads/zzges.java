package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzges extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzges zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzges zzges = new zzges();
        zzb = zzges;
        zzgkq.zzaP(zzges.class, zzges);
    }

    private zzges() {
    }

    public static zzger zzc() {
        return (zzger) zzb.zzay();
    }

    public static zzges zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzges();
        } else {
            if (i2 == 4) {
                return new zzger((zzgeq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzg() {
        int zzb2 = zzgej.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
