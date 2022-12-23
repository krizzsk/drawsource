package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbee extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbee zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbee zzbee = new zzbee();
        zzb = zzbee;
        zzgkq.zzaP(zzbee.class, zzbee);
    }

    private zzbee() {
    }

    public static zzbed zza() {
        return (zzbed) zzb.zzay();
    }

    public static zzbee zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzbee zzbee, boolean z) {
        zzbee.zze |= 1;
        zzbee.zzf = z;
    }

    static /* synthetic */ void zzf(zzbee zzbee, int i) {
        zzbee.zze |= 2;
        zzbee.zzg = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbee();
        } else {
            if (i2 == 4) {
                return new zzbed((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
