package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgon extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgon zzb;
    private int zze;
    private String zzf = "";

    static {
        zzgon zzgon = new zzgon();
        zzb = zzgon;
        zzgkq.zzaP(zzgon.class, zzgon);
    }

    private zzgon() {
    }

    public static zzgom zza() {
        return (zzgom) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzgon zzgon, String str) {
        zzgon.zze |= 1;
        zzgon.zzf = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgon();
        } else {
            if (i2 == 4) {
                return new zzgom((zzgoc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
