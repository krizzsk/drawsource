package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgga extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgga zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zzgga zzgga = new zzgga();
        zzb = zzgga;
        zzgkq.zzaP(zzgga.class, zzgga);
    }

    private zzgga() {
    }

    public static zzgfz zza() {
        return (zzgfz) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzgga zzgga, String str) {
        str.getClass();
        zzgga.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgga();
        } else {
            if (i2 == 4) {
                return new zzgfz((zzgfx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
