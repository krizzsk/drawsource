package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfo extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgfo zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public zzgji zzf = zzgji.zzb;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgfo zzgfo = new zzgfo();
        zzb = zzgfo;
        zzgkq.zzaP(zzgfo.class, zzgfo);
    }

    private zzgfo() {
    }

    public static zzgfn zza() {
        return (zzgfn) zzb.zzay();
    }

    public static zzgfo zzd() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgfo zzgfo, String str) {
        str.getClass();
        zzgfo.zze = str;
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
            return new zzgfo();
        } else {
            if (i2 == 4) {
                return new zzgfn((zzgfm) null);
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
        int zzb2 = zzggp.zzb(this.zzg);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
