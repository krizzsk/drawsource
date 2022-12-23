package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgdq extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgdq zzb;
    private zzgfo zze;

    static {
        zzgdq zzgdq = new zzgdq();
        zzb = zzgdq;
        zzgkq.zzaP(zzgdq.class, zzgdq);
    }

    private zzgdq() {
    }

    public static zzgdp zza() {
        return (zzgdp) zzb.zzay();
    }

    public static zzgdq zzd() {
        return zzb;
    }

    static /* synthetic */ void zzf(zzgdq zzgdq, zzgfo zzgfo) {
        zzgfo.getClass();
        zzgdq.zze = zzgfo;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgdq();
        } else {
            if (i2 == 4) {
                return new zzgdp((zzgdo) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgfo zze() {
        zzgfo zzgfo = this.zze;
        return zzgfo == null ? zzgfo.zzd() : zzgfo;
    }
}
