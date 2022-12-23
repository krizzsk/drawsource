package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgdc extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgdc zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgji zzf = zzgji.zzb;

    static {
        zzgdc zzgdc = new zzgdc();
        zzb = zzgdc;
        zzgkq.zzaP(zzgdc.class, zzgdc);
    }

    private zzgdc() {
    }

    public static zzgdb zzc() {
        return (zzgdb) zzb.zzay();
    }

    public static zzgdc zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgdc) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgdc();
        } else {
            if (i2 == 4) {
                return new zzgdb((zzgda) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgji zzf() {
        return this.zzf;
    }
}
