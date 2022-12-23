package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzamc extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzamc zzb;
    private int zze;
    private zzgji zzf = zzgji.zzb;
    private zzgji zzg;
    private zzgji zzh;
    private zzgji zzi;

    static {
        zzamc zzamc = new zzamc();
        zzb = zzamc;
        zzgkq.zzaP(zzamc.class, zzamc);
    }

    private zzamc() {
        zzgji zzgji = zzgji.zzb;
        this.zzg = zzgji;
        this.zzh = zzgji;
        this.zzi = zzgji;
    }

    public static zzamb zza() {
        return (zzamb) zzb.zzay();
    }

    public static zzamc zzd(byte[] bArr, zzgkc zzgkc) throws zzglc {
        return (zzamc) zzgkq.zzaF(zzb, bArr, zzgkc);
    }

    static /* synthetic */ void zzi(zzamc zzamc, zzgji zzgji) {
        zzamc.zze |= 1;
        zzamc.zzf = zzgji;
    }

    static /* synthetic */ void zzj(zzamc zzamc, zzgji zzgji) {
        zzamc.zze |= 2;
        zzamc.zzg = zzgji;
    }

    static /* synthetic */ void zzk(zzamc zzamc, zzgji zzgji) {
        zzamc.zze |= 4;
        zzamc.zzh = zzgji;
    }

    static /* synthetic */ void zzl(zzamc zzamc, zzgji zzgji) {
        zzamc.zze |= 8;
        zzamc.zzi = zzgji;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzamc();
        } else {
            if (i2 == 4) {
                return new zzamb((zzalh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgji zze() {
        return this.zzf;
    }

    public final zzgji zzf() {
        return this.zzg;
    }

    public final zzgji zzg() {
        return this.zzi;
    }

    public final zzgji zzh() {
        return this.zzh;
    }
}
