package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbeu extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbeu zzb;
    private int zze;
    private String zzf = "";
    private zzbgk zzg;
    private int zzh;
    private zzbgm zzi;
    private int zzj;
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        zzbeu zzbeu = new zzbeu();
        zzb = zzbeu;
        zzgkq.zzaP(zzbeu.class, zzbeu);
    }

    private zzbeu() {
    }

    public static zzbeu zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzbeu zzbeu, String str) {
        zzbeu.zze |= 1;
        zzbeu.zzf = str;
    }

    static /* synthetic */ void zze(zzbeu zzbeu, zzbgm zzbgm) {
        zzbgm.getClass();
        zzbeu.zzi = zzbgm;
        zzbeu.zze |= 8;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgku zzgku = zzbez.zza;
            return zzaO(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgku, "zzl", zzgku, "zzm", zzgku});
        } else if (i2 == 3) {
            return new zzbeu();
        } else {
            if (i2 == 4) {
                return new zzbet((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
