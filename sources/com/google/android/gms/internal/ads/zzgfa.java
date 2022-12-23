package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfa extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgfa zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgfa zzgfa = new zzgfa();
        zzb = zzgfa;
        zzgkq.zzaP(zzgfa.class, zzgfa);
    }

    private zzgfa() {
    }

    public static zzgez zza() {
        return (zzgez) zzb.zzay();
    }

    public static zzgfa zzd() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgfa();
        } else {
            if (i2 == 4) {
                return new zzgez((zzgey) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zze() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzf() {
        int i = this.zzf;
        int i2 = i != 0 ? i != 1 ? 0 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzg() {
        int i = this.zze;
        int i2 = i != 0 ? i != 1 ? 0 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
