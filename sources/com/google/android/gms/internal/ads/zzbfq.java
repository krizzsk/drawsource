package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbfq extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbfq zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbfq zzbfq = new zzbfq();
        zzb = zzbfq;
        zzgkq.zzaP(zzbfq.class, zzbfq);
    }

    private zzbfq() {
    }

    public static zzbfj zza() {
        return (zzbfj) zzb.zzay();
    }

    public static zzbfq zzd() {
        return zzb;
    }

    static /* synthetic */ void zzi(zzbfq zzbfq, int i) {
        zzbfq.zzf = i - 1;
        zzbfq.zze |= 1;
    }

    static /* synthetic */ void zzj(zzbfq zzbfq, int i) {
        zzbfq.zzg = i - 1;
        zzbfq.zze |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", zzbfo.zza, "zzg", zzbfl.zza});
        } else if (i2 == 3) {
            return new zzbfq();
        } else {
            if (i2 == 4) {
                return new zzbfj((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zze() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }

    public final int zzg() {
        int zza = zzbfm.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzbfp.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
