package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgpq extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgpq zzb;
    private zzgpp zzA;
    private zzgkz zzB = zzaJ();
    private zzgor zzC;
    private String zzD = "";
    private zzgoj zzE;
    private byte zzF = 2;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzgon zzk;
    private zzgkz zzl = zzaJ();
    private zzgkz zzm = zzaJ();
    private String zzn = "";
    private zzgpe zzo;
    private boolean zzp;
    private zzgkz zzq = zzgkq.zzaJ();
    private String zzr = "";
    private boolean zzs;
    private boolean zzt;
    private zzgji zzu = zzgji.zzb;
    private zzgpm zzv;
    private boolean zzw;
    private String zzx = "";
    private zzgkz zzy = zzgkq.zzaJ();
    private zzgkz zzz = zzgkq.zzaJ();

    static {
        zzgpq zzgpq = new zzgpq();
        zzb = zzgpq;
        zzgkq.zzaP(zzgpq.class, zzgpq);
    }

    private zzgpq() {
    }

    public static zzgol zza() {
        return (zzgol) zzb.zzay();
    }

    static /* synthetic */ void zzg(zzgpq zzgpq, String str) {
        str.getClass();
        zzgpq.zze |= 4;
        zzgpq.zzh = str;
    }

    static /* synthetic */ void zzh(zzgpq zzgpq, String str) {
        str.getClass();
        zzgpq.zze |= 8;
        zzgpq.zzi = str;
    }

    static /* synthetic */ void zzi(zzgpq zzgpq, zzgon zzgon) {
        zzgon.getClass();
        zzgpq.zzk = zzgon;
        zzgpq.zze |= 32;
    }

    static /* synthetic */ void zzj(zzgpq zzgpq, zzgpk zzgpk) {
        zzgpk.getClass();
        zzgkz zzgkz = zzgpq.zzl;
        if (!zzgkz.zzc()) {
            zzgpq.zzl = zzgkq.zzaK(zzgkz);
        }
        zzgpq.zzl.add(zzgpk);
    }

    static /* synthetic */ void zzk(zzgpq zzgpq, String str) {
        zzgpq.zze |= 64;
        zzgpq.zzn = str;
    }

    static /* synthetic */ void zzl(zzgpq zzgpq) {
        zzgpq.zze &= -65;
        zzgpq.zzn = zzb.zzn;
    }

    static /* synthetic */ void zzm(zzgpq zzgpq, zzgpe zzgpe) {
        zzgpe.getClass();
        zzgpq.zzo = zzgpe;
        zzgpq.zze |= 128;
    }

    static /* synthetic */ void zzn(zzgpq zzgpq, zzgpm zzgpm) {
        zzgpm.getClass();
        zzgpq.zzv = zzgpm;
        zzgpq.zze |= 8192;
    }

    static /* synthetic */ void zzo(zzgpq zzgpq, Iterable iterable) {
        zzgkz zzgkz = zzgpq.zzy;
        if (!zzgkz.zzc()) {
            zzgpq.zzy = zzgkq.zzaK(zzgkz);
        }
        zzgir.zzat(iterable, zzgpq.zzy);
    }

    static /* synthetic */ void zzp(zzgpq zzgpq, Iterable iterable) {
        zzgkz zzgkz = zzgpq.zzz;
        if (!zzgkz.zzc()) {
            zzgpq.zzz = zzgkq.zzaK(zzgkz);
        }
        zzgir.zzat(iterable, zzgpq.zzz);
    }

    static /* synthetic */ void zzq(zzgpq zzgpq, int i) {
        zzgpq.zzf = i - 1;
        zzgpq.zze |= 1;
    }

    public final String zzd() {
        return this.zzn;
    }

    public final String zze() {
        return this.zzh;
    }

    public final List zzf() {
        return this.zzl;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzF);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0006\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", zzgpk.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzf", zzgpf.zza, "zzg", zzgok.zza, "zzk", "zzn", "zzo", "zzu", "zzm", zzgpu.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzgqa.class, "zzC", "zzD", "zzE"});
        } else if (i2 == 3) {
            return new zzgpq();
        } else {
            if (i2 == 4) {
                return new zzgol((zzgoc) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzF = b;
            return null;
        }
    }
}
