package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbga extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbga zzb;
    private int zze;
    private zzgkz zzf = zzaJ();
    private int zzg;
    private int zzh;
    private long zzi;
    private String zzj = "";
    private String zzk = "";
    private long zzl;
    private int zzm;

    static {
        zzbga zzbga = new zzbga();
        zzb = zzbga;
        zzgkq.zzaP(zzbga.class, zzbga);
    }

    private zzbga() {
    }

    public static zzbfw zza() {
        return (zzbfw) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzbga zzbga, Iterable iterable) {
        zzgkz zzgkz = zzbga.zzf;
        if (!zzgkz.zzc()) {
            zzbga.zzf = zzgkq.zzaK(zzgkz);
        }
        zzgir.zzat(iterable, zzbga.zzf);
    }

    static /* synthetic */ void zze(zzbga zzbga, int i) {
        zzbga.zze |= 1;
        zzbga.zzg = i;
    }

    static /* synthetic */ void zzf(zzbga zzbga, int i) {
        zzbga.zze |= 2;
        zzbga.zzh = i;
    }

    static /* synthetic */ void zzg(zzbga zzbga, long j) {
        zzbga.zze |= 4;
        zzbga.zzi = j;
    }

    static /* synthetic */ void zzh(zzbga zzbga, String str) {
        str.getClass();
        zzbga.zze |= 8;
        zzbga.zzj = str;
    }

    static /* synthetic */ void zzi(zzbga zzbga, String str) {
        str.getClass();
        zzbga.zze |= 16;
        zzbga.zzk = str;
    }

    static /* synthetic */ void zzj(zzbga zzbga, long j) {
        zzbga.zze |= 32;
        zzbga.zzl = j;
    }

    static /* synthetic */ void zzk(zzbga zzbga, int i) {
        zzbga.zze |= 64;
        zzbga.zzm = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zze", "zzf", zzbfv.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new zzbga();
        } else {
            if (i2 == 4) {
                return new zzbfw((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
