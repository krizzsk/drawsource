package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzggn extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzggn zzb;
    private String zze = "";
    private zzgfo zzf;

    static {
        zzggn zzggn = new zzggn();
        zzb = zzggn;
        zzgkq.zzaP(zzggn.class, zzggn);
    }

    private zzggn() {
    }

    public static zzggn zzd() {
        return zzb;
    }

    public static zzggn zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzggn) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    public final zzgfo zza() {
        zzgfo zzgfo = this.zzf;
        return zzgfo == null ? zzgfo.zzd() : zzgfo;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzggn();
        } else {
            if (i2 == 4) {
                return new zzggm((zzggl) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzf != null;
    }
}
