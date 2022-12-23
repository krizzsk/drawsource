package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbgm extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbgm zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzbgm zzbgm = new zzbgm();
        zzb = zzbgm;
        zzgkq.zzaP(zzbgm.class, zzbgm);
    }

    private zzbgm() {
    }

    public static zzbgl zza() {
        return (zzbgl) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzbgm zzbgm, int i) {
        zzbgm.zze |= 1;
        zzbgm.zzf = i;
    }

    static /* synthetic */ void zze(zzbgm zzbgm, int i) {
        zzbgm.zze |= 2;
        zzbgm.zzg = i;
    }

    static /* synthetic */ void zzf(zzbgm zzbgm, int i) {
        zzbgm.zze |= 4;
        zzbgm.zzh = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbgm();
        } else {
            if (i2 == 4) {
                return new zzbgl((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
