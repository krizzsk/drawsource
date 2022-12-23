package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbea extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbea zzb;
    private int zze;
    private int zzf;
    private zzbee zzg;
    private zzbeg zzh;

    static {
        zzbea zzbea = new zzbea();
        zzb = zzbea;
        zzgkq.zzaP(zzbea.class, zzbea);
    }

    private zzbea() {
    }

    public static zzbdz zza() {
        return (zzbdz) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzbea zzbea, zzbee zzbee) {
        zzbee.getClass();
        zzbea.zzg = zzbee;
        zzbea.zze |= 2;
    }

    static /* synthetic */ void zze(zzbea zzbea, zzbeg zzbeg) {
        zzbeg.getClass();
        zzbea.zzh = zzbeg;
        zzbea.zze |= 4;
    }

    static /* synthetic */ void zzf(zzbea zzbea, int i) {
        zzbea.zzf = 1;
        zzbea.zze = 1 | zzbea.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbec.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbea();
        } else {
            if (i2 == 4) {
                return new zzbdz((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
