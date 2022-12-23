package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbeg extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbeg zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzbeg zzbeg = new zzbeg();
        zzb = zzbeg;
        zzgkq.zzaP(zzbeg.class, zzbeg);
    }

    private zzbeg() {
    }

    public static zzbef zza() {
        return (zzbef) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzbeg zzbeg, boolean z) {
        zzbeg.zze |= 1;
        zzbeg.zzf = z;
    }

    static /* synthetic */ void zze(zzbeg zzbeg, boolean z) {
        zzbeg.zze |= 2;
        zzbeg.zzg = z;
    }

    static /* synthetic */ void zzf(zzbeg zzbeg, int i) {
        zzbeg.zze |= 4;
        zzbeg.zzh = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbeg();
        } else {
            if (i2 == 4) {
                return new zzbef((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
