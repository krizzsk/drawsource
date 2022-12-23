package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbdy extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbdy zzb;
    private int zze;
    private int zzf;
    private int zzg = 1000;
    private zzbeo zzh;
    private zzbeq zzi;
    private zzgkz zzj = zzaJ();
    private zzbes zzk;
    private zzbgc zzl;
    private zzbfs zzm;
    private zzbfg zzn;
    private zzbfi zzo;
    private zzgkz zzp = zzaJ();

    static {
        zzbdy zzbdy = new zzbdy();
        zzb = zzbdy;
        zzgkq.zzaP(zzbdy.class, zzbdy);
    }

    private zzbdy() {
    }

    public static zzbdy zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzbdy zzbdy, zzbdw zzbdw) {
        zzbdy.zzf = zzbdw.zza();
        zzbdy.zze |= 1;
    }

    static /* synthetic */ void zzf(zzbdy zzbdy, zzbeq zzbeq) {
        zzbeq.getClass();
        zzbdy.zzi = zzbeq;
        zzbdy.zze |= 8;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", zzbdw.zzc(), "zzg", zzbez.zza, "zzh", "zzi", "zzj", zzbem.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzbgo.class});
        } else if (i2 == 3) {
            return new zzbdy();
        } else {
            if (i2 == 4) {
                return new zzbdx((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzbeq zzd() {
        zzbeq zzbeq = this.zzi;
        return zzbeq == null ? zzbeq.zzc() : zzbeq;
    }
}
