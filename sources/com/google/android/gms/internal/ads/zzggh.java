package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzggh extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzggh zzb;
    private String zze = "";

    static {
        zzggh zzggh = new zzggh();
        zzb = zzggh;
        zzgkq.zzaP(zzggh.class, zzggh);
    }

    private zzggh() {
    }

    public static zzggh zzc() {
        return zzb;
    }

    public static zzggh zzd(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzggh) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzggh();
        } else {
            if (i2 == 4) {
                return new zzggg((zzggf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zze() {
        return this.zze;
    }
}
