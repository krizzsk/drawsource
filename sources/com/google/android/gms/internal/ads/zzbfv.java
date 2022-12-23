package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbfv extends zzgkq implements zzgmb {
    private static final zzgkw zzb = new zzbft();
    /* access modifiers changed from: private */
    public static final zzbfv zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private zzgkv zzk = zzaG();
    private zzbfq zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;

    static {
        zzbfv zzbfv = new zzbfv();
        zze = zzbfv;
        zzgkq.zzaP(zzbfv.class, zzbfv);
    }

    private zzbfv() {
    }

    static /* synthetic */ void zzA(zzbfv zzbfv, int i) {
        zzbfv.zzn = i - 1;
        zzbfv.zzf |= 64;
    }

    static /* synthetic */ void zzB(zzbfv zzbfv, int i) {
        zzbfv.zzo = i - 1;
        zzbfv.zzf |= 128;
    }

    static /* synthetic */ void zzC(zzbfv zzbfv, int i) {
        zzbfv.zzq = i - 1;
        zzbfv.zzf |= 512;
    }

    public static zzbfu zzg() {
        return (zzbfu) zze.zzay();
    }

    public static zzbfv zzi(byte[] bArr) throws zzglc {
        return (zzbfv) zzgkq.zzaC(zze, bArr);
    }

    static /* synthetic */ void zzl(zzbfv zzbfv, long j) {
        zzbfv.zzf |= 1;
        zzbfv.zzg = j;
    }

    static /* synthetic */ void zzm(zzbfv zzbfv, long j) {
        zzbfv.zzf |= 4;
        zzbfv.zzi = j;
    }

    static /* synthetic */ void zzn(zzbfv zzbfv, long j) {
        zzbfv.zzf |= 8;
        zzbfv.zzj = j;
    }

    static /* synthetic */ void zzo(zzbfv zzbfv, Iterable iterable) {
        zzgkv zzgkv = zzbfv.zzk;
        if (!zzgkv.zzc()) {
            zzbfv.zzk = zzgkq.zzaH(zzgkv);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbfv.zzk.zzh(((zzbek) it.next()).zza());
        }
    }

    static /* synthetic */ void zzp(zzbfv zzbfv, zzbfq zzbfq) {
        zzbfq.getClass();
        zzbfv.zzl = zzbfq;
        zzbfv.zzf |= 16;
    }

    static /* synthetic */ void zzq(zzbfv zzbfv, int i) {
        zzbfv.zzf |= 256;
        zzbfv.zzp = i;
    }

    static /* synthetic */ void zzr(zzbfv zzbfv, zzbfz zzbfz) {
        zzbfv.zzr = zzbfz.zza();
        zzbfv.zzf |= 1024;
    }

    static /* synthetic */ void zzs(zzbfv zzbfv, long j) {
        zzbfv.zzf |= 2048;
        zzbfv.zzs = j;
    }

    static /* synthetic */ void zzy(zzbfv zzbfv, int i) {
        zzbfv.zzh = i - 1;
        zzbfv.zzf |= 2;
    }

    static /* synthetic */ void zzz(zzbfv zzbfv, int i) {
        zzbfv.zzm = i - 1;
        zzbfv.zzf |= 32;
    }

    public final int zza() {
        return this.zzp;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgku zzgku = zzbez.zza;
            return zzaO(zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zzf", "zzg", "zzh", zzbez.zza, "zzi", "zzj", "zzk", zzbek.zzc(), "zzl", "zzm", zzgku, "zzn", zzgku, "zzo", zzgku, "zzp", "zzq", zzgku, "zzr", zzbfz.zzc(), "zzs"});
        } else if (i2 == 3) {
            return new zzbfv();
        } else {
            if (i2 == 4) {
                return new zzbfu((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final long zze() {
        return this.zzg;
    }

    public final zzbfq zzf() {
        zzbfq zzbfq = this.zzl;
        return zzbfq == null ? zzbfq.zzd() : zzbfq;
    }

    public final zzbfz zzj() {
        zzbfz zzb2 = zzbfz.zzb(this.zzr);
        return zzb2 == null ? zzbfz.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzgkx(this.zzk, zzb);
    }

    public final int zzt() {
        int zza = zzbfa.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzbfa.zza(this.zzo);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzbfa.zza(this.zzq);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzbfa.zza(this.zzh);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzbfa.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
