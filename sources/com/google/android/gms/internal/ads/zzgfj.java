package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfj extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgfj zzb;
    /* access modifiers changed from: private */
    public String zze = "";
    /* access modifiers changed from: private */
    public zzgji zzf = zzgji.zzb;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgfj zzgfj = new zzgfj();
        zzb = zzgfj;
        zzgkq.zzaP(zzgfj.class, zzgfj);
    }

    private zzgfj() {
    }

    public static zzgfi zza() {
        return (zzgfi) zzb.zzay();
    }

    public static zzgfj zzd() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgfj();
        } else {
            if (i2 == 4) {
                return new zzgfi((zzgfh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgji zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int i = this.zzg;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
