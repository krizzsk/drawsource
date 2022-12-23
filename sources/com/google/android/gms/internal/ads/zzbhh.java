package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbhh extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbhh zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbhh zzbhh = new zzbhh();
        zzb = zzbhh;
        zzgkq.zzaP(zzbhh.class, zzbhh);
    }

    private zzbhh() {
    }

    public static zzbhg zza() {
        return (zzbhg) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzbhh zzbhh, boolean z) {
        zzbhh.zze |= 1;
        zzbhh.zzf = z;
    }

    static /* synthetic */ void zze(zzbhh zzbhh, int i) {
        zzbhh.zze |= 2;
        zzbhh.zzg = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbhh();
        } else {
            if (i2 == 4) {
                return new zzbhg((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
