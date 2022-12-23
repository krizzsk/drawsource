package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzflv extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzflv zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private zzflr zzi;

    static {
        zzflv zzflv = new zzflv();
        zzb = zzflv;
        zzgkq.zzaP(zzflv.class, zzflv);
    }

    private zzflv() {
    }

    public static zzflt zza() {
        return (zzflt) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzflv zzflv, String str) {
        str.getClass();
        zzflv.zze |= 2;
        zzflv.zzg = str;
    }

    static /* synthetic */ void zze(zzflv zzflv, zzflr zzflr) {
        zzflr.getClass();
        zzflv.zzi = zzflr;
        zzflv.zze |= 8;
    }

    static /* synthetic */ void zzf(zzflv zzflv, int i) {
        zzflv.zzf = 1;
        zzflv.zze = 1 | zzflv.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", zzflu.zza, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzflv();
        } else {
            if (i2 == 4) {
                return new zzflt((zzfls) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
