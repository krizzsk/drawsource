package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbfc extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbfc zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private int zzi = 1000;
    private zzbgm zzj;
    /* access modifiers changed from: private */
    public zzgky zzk = zzaI();
    private zzbeu zzl;
    private zzbex zzm;
    private zzbfq zzn;
    private zzbdy zzo;
    private zzbga zzp;
    private zzbhh zzq;
    private zzbeh zzr;

    static {
        zzbfc zzbfc = new zzbfc();
        zzb = zzbfc;
        zzgkq.zzaP(zzbfc.class, zzbfc);
    }

    private zzbfc() {
    }

    public static zzbfb zzd() {
        return (zzbfb) zzb.zzay();
    }

    static /* synthetic */ void zzg(zzbfc zzbfc, String str) {
        str.getClass();
        zzbfc.zze |= 2;
        zzbfc.zzg = str;
    }

    static /* synthetic */ void zzh(zzbfc zzbfc, Iterable iterable) {
        zzgky zzgky = zzbfc.zzk;
        if (!zzgky.zzc()) {
            int size = zzgky.size();
            zzbfc.zzk = zzgky.zza(size == 0 ? 10 : size + size);
        }
        zzgir.zzat(iterable, zzbfc.zzk);
    }

    static /* synthetic */ void zzj(zzbfc zzbfc, zzbeu zzbeu) {
        zzbeu.getClass();
        zzbfc.zzl = zzbeu;
        zzbfc.zze |= 32;
    }

    static /* synthetic */ void zzk(zzbfc zzbfc, zzbdy zzbdy) {
        zzbdy.getClass();
        zzbfc.zzo = zzbdy;
        zzbfc.zze |= 256;
    }

    static /* synthetic */ void zzl(zzbfc zzbfc, zzbga zzbga) {
        zzbga.getClass();
        zzbfc.zzp = zzbga;
        zzbfc.zze |= 512;
    }

    static /* synthetic */ void zzm(zzbfc zzbfc, zzbhh zzbhh) {
        zzbhh.getClass();
        zzbfc.zzq = zzbhh;
        zzbfc.zze |= 1024;
    }

    static /* synthetic */ void zzn(zzbfc zzbfc, zzbeh zzbeh) {
        zzbeh.getClass();
        zzbfc.zzr = zzbeh;
        zzbfc.zze |= 2048;
    }

    public final zzbdy zza() {
        zzbdy zzbdy = this.zzo;
        return zzbdy == null ? zzbdy.zzc() : zzbdy;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzbez.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        } else if (i2 == 3) {
            return new zzbfc();
        } else {
            if (i2 == 4) {
                return new zzbfb((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzbeu zzc() {
        zzbeu zzbeu = this.zzl;
        return zzbeu == null ? zzbeu.zzc() : zzbeu;
    }

    public final String zzf() {
        return this.zzg;
    }
}
