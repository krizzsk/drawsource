package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzml implements zzkh {
    private final zzcx zza;
    private final zzcf zzb;
    private final zzch zzc;
    private final zzmk zzd;
    private final SparseArray zze;
    private zzdm zzf;
    private zzcb zzg;
    private zzdg zzh;
    private boolean zzi;

    public static /* synthetic */ void zzW(zzml zzml) {
        zzki zzU = zzml.zzU();
        zzml.zzZ(zzU, 1028, new zzlh(zzU));
        zzml.zzf.zze();
    }

    private final zzki zzab(int i, zzsa zzsa) {
        zzcb zzcb = this.zzg;
        if (zzcb == null) {
            throw null;
        } else if (zzsa == null) {
            zzci zzn = zzcb.zzn();
            if (i >= zzn.zzc()) {
                zzn = zzci.zza;
            }
            return zzV(zzn, i, (zzsa) null);
        } else if (this.zzd.zza(zzsa) != null) {
            return zzaa(zzsa);
        } else {
            return zzV(zzci.zza, i, zzsa);
        }
    }

    private final zzki zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final zzki zzad() {
        return zzaa(this.zzd.zze());
    }

    private final zzki zzae(zzbr zzbr) {
        zzbi zzbi;
        if (!(zzbr instanceof zzgt) || (zzbi = ((zzgt) zzbr).zzj) == null) {
            return zzU();
        }
        return zzaa(new zzsa(zzbi));
    }

    public final void zzA(String str) {
        zzki zzad = zzad();
        zzZ(zzad, 1012, new zzmj(zzad, str));
    }

    public final void zzB(zzgl zzgl) {
        zzki zzac = zzac();
        zzZ(zzac, 1013, new zzlz(zzac, zzgl));
    }

    public final void zzC(zzgl zzgl) {
        zzki zzad = zzad();
        zzZ(zzad, 1007, new zzlo(zzad, zzgl));
    }

    public final void zzD(zzad zzad, zzgm zzgm) {
        zzki zzad2 = zzad();
        zzZ(zzad2, 1009, new zzly(zzad2, zzad, zzgm));
    }

    public final void zzE(long j) {
        zzki zzad = zzad();
        zzZ(zzad, 1010, new zzmb(zzad, j));
    }

    public final void zzF(Exception exc) {
        zzki zzad = zzad();
        zzZ(zzad, 1014, new zzkw(zzad, exc));
    }

    public final void zzG(int i, long j, long j2) {
        zzki zzad = zzad();
        zzZ(zzad, 1011, new zzko(zzad, i, j, j2));
    }

    public final void zzH(int i, long j) {
        zzki zzac = zzac();
        zzZ(zzac, 1018, new zzlj(zzac, i, j));
    }

    public final void zzI(Object obj, long j) {
        zzki zzad = zzad();
        zzZ(zzad, 26, new zzmf(zzad, obj, j));
    }

    public final void zzJ(Exception exc) {
        zzki zzad = zzad();
        zzZ(zzad, 1030, new zzku(zzad, exc));
    }

    public final void zzK(String str, long j, long j2) {
        zzki zzad = zzad();
        zzZ(zzad, 1016, new zzlf(zzad, str, j2, j));
    }

    public final void zzL(String str) {
        zzki zzad = zzad();
        zzZ(zzad, 1019, new zzkn(zzad, str));
    }

    public final void zzM(zzgl zzgl) {
        zzki zzac = zzac();
        zzZ(zzac, 1020, new zzme(zzac, zzgl));
    }

    public final void zzN(zzgl zzgl) {
        zzki zzad = zzad();
        zzZ(zzad, 1015, new zzlk(zzad, zzgl));
    }

    public final void zzO(long j, int i) {
        zzki zzac = zzac();
        zzZ(zzac, 1021, new zzkx(zzac, j, i));
    }

    public final void zzP(zzad zzad, zzgm zzgm) {
        zzki zzad2 = zzad();
        zzZ(zzad2, 1017, new zzkm(zzad2, zzad, zzgm));
    }

    public final void zzQ() {
        zzdg zzdg = this.zzh;
        zzcw.zzb(zzdg);
        zzdg.zzg(new zzma(this));
    }

    public final void zzR(zzkk zzkk) {
        this.zzf.zzf(zzkk);
    }

    public final void zzS(zzcb zzcb, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        zzcw.zzf(z);
        if (zzcb != null) {
            this.zzg = zzcb;
            this.zzh = this.zza.zzb(looper, (Handler.Callback) null);
            this.zzf = this.zzf.zza(looper, new zzle(this, zzcb));
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final zzki zzU() {
        return zzaa(this.zzd.zzb());
    }

    /* access modifiers changed from: protected */
    @RequiresNonNull({"player"})
    public final zzki zzV(zzci zzci, int i, zzsa zzsa) {
        zzci zzci2 = zzci;
        int i2 = i;
        boolean z = true;
        zzsa zzsa2 = true == zzci.zzo() ? null : zzsa;
        long zza2 = this.zza.zza();
        if (!zzci2.equals(this.zzg.zzn()) || i2 != this.zzg.zzf()) {
            z = false;
        }
        long j = 0;
        if (zzsa2 == null || !zzsa2.zzb()) {
            if (z) {
                j = this.zzg.zzk();
            } else if (!zzci.zzo()) {
                long j2 = zzci2.zze(i2, this.zzc, 0).zzm;
                j = zzeg.zzz(0);
            }
        } else if (z && this.zzg.zzd() == zzsa2.zzb && this.zzg.zze() == zzsa2.zzc) {
            j = this.zzg.zzl();
        }
        return new zzki(zza2, zzci, i, zzsa2, j, this.zzg.zzn(), this.zzg.zzf(), this.zzd.zzb(), this.zzg.zzl(), this.zzg.zzm());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzX(zzcb zzcb, zzkk zzkk, zzy zzy) {
        zzkk.zzi(zzcb, new zzkj(zzy, this.zze));
    }

    public final void zzY(int i, long j, long j2) {
        zzki zzaa = zzaa(this.zzd.zzc());
        zzZ(zzaa, 1006, new zzkv(zzaa, i, j, j2));
    }

    /* access modifiers changed from: protected */
    public final void zzZ(zzki zzki, int i, zzdj zzdj) {
        this.zze.put(i, zzki);
        zzdm zzdm = this.zzf;
        zzdm.zzd(i, zzdj);
        zzdm.zzc();
    }

    public final void zza(zzbx zzbx) {
        zzki zzU = zzU();
        zzZ(zzU, 13, new zzkz(zzU, zzbx));
    }

    public final void zzaf(int i, zzsa zzsa, zzrw zzrw) {
        zzki zzab = zzab(i, zzsa);
        zzZ(zzab, 1004, new zzkt(zzab, zzrw));
    }

    public final void zzag(int i, zzsa zzsa, zzrr zzrr, zzrw zzrw) {
        zzki zzab = zzab(i, zzsa);
        zzZ(zzab, 1002, new zzll(zzab, zzrr, zzrw));
    }

    public final void zzah(int i, zzsa zzsa, zzrr zzrr, zzrw zzrw) {
        zzki zzab = zzab(i, zzsa);
        zzZ(zzab, 1001, new zzlv(zzab, zzrr, zzrw));
    }

    public final void zzai(int i, zzsa zzsa, zzrr zzrr, zzrw zzrw, IOException iOException, boolean z) {
        zzki zzab = zzab(i, zzsa);
        zzZ(zzab, 1003, new zzlg(zzab, zzrr, zzrw, iOException, z));
    }

    public final void zzaj(int i, zzsa zzsa, zzrr zzrr, zzrw zzrw) {
        zzki zzab = zzab(i, zzsa);
        zzZ(zzab, 1000, new zzlq(zzab, zzrr, zzrw));
    }

    public final void zzb(zzr zzr) {
        zzki zzU = zzU();
        zzZ(zzU, 29, new zzla(zzU, zzr));
    }

    public final void zzc(int i, boolean z) {
        zzki zzU = zzU();
        zzZ(zzU, 30, new zzld(zzU, i, z));
    }

    public final void zzd(boolean z) {
        zzki zzU = zzU();
        zzZ(zzU, 3, new zzmi(zzU, z));
    }

    public final void zze(boolean z) {
        zzki zzU = zzU();
        zzZ(zzU, 7, new zzlr(zzU, z));
    }

    public final void zzf(zzbb zzbb, int i) {
        zzki zzU = zzU();
        zzZ(zzU, 1, new zzlu(zzU, zzbb, i));
    }

    public final void zzg(zzbh zzbh) {
        zzki zzU = zzU();
        zzZ(zzU, 14, new zzlx(zzU, zzbh));
    }

    public final void zzh(boolean z, int i) {
        zzki zzU = zzU();
        zzZ(zzU, 5, new zzlp(zzU, z, i));
    }

    public final void zzi(zzbt zzbt) {
        zzki zzU = zzU();
        zzZ(zzU, 12, new zzkq(zzU, zzbt));
    }

    public final void zzj(int i) {
        zzki zzU = zzU();
        zzZ(zzU, 4, new zzlt(zzU, i));
    }

    public final void zzk(int i) {
        zzki zzU = zzU();
        zzZ(zzU, 6, new zzmh(zzU, i));
    }

    public final void zzl(zzbr zzbr) {
        zzki zzae = zzae(zzbr);
        zzZ(zzae, 10, new zzlm(zzae, zzbr));
    }

    public final void zzm(zzbr zzbr) {
        zzki zzae = zzae(zzbr);
        zzZ(zzae, 10, new zzlw(zzae, zzbr));
    }

    public final void zzn(boolean z, int i) {
        zzki zzU = zzU();
        zzZ(zzU, -1, new zzkl(zzU, z, i));
    }

    public final void zzp() {
        zzki zzU = zzU();
        zzZ(zzU, -1, new zzks(zzU));
    }

    public final void zzq(boolean z) {
        zzki zzad = zzad();
        zzZ(zzad, 23, new zzls(zzad, z));
    }

    public final void zzr(int i, int i2) {
        zzki zzad = zzad();
        zzZ(zzad, 24, new zzmg(zzad, i, i2));
    }

    public final void zzt(zzct zzct) {
        zzki zzU = zzU();
        zzZ(zzU, 2, new zzlb(zzU, zzct));
    }

    public final void zzu(zzcv zzcv) {
        zzki zzad = zzad();
        zzZ(zzad, 25, new zzmd(zzad, zzcv));
    }

    public final void zzv(float f) {
        zzki zzad = zzad();
        zzZ(zzad, 22, new zzkp(zzad, f));
    }

    public final void zzw(zzkk zzkk) {
        this.zzf.zzb(zzkk);
    }

    public final void zzx() {
        if (!this.zzi) {
            zzki zzU = zzU();
            this.zzi = true;
            zzZ(zzU, -1, new zzmc(zzU));
        }
    }

    public final void zzy(Exception exc) {
        zzki zzad = zzad();
        zzZ(zzad, 1029, new zzlc(zzad, exc));
    }

    public final void zzz(String str, long j, long j2) {
        zzki zzad = zzad();
        zzZ(zzad, 1008, new zzln(zzad, str, j2, j));
    }

    private final zzki zzaa(zzsa zzsa) {
        zzci zzci;
        if (this.zzg != null) {
            if (zzsa == null) {
                zzci = null;
            } else {
                zzci = this.zzd.zza(zzsa);
            }
            if (zzsa != null && zzci != null) {
                return zzV(zzci, zzci.zzn(zzsa.zza, this.zzb).zzd, zzsa);
            }
            int zzf2 = this.zzg.zzf();
            zzci zzn = this.zzg.zzn();
            if (zzf2 >= zzn.zzc()) {
                zzn = zzci.zza;
            }
            return zzV(zzn, zzf2, (zzsa) null);
        }
        throw null;
    }

    public final void zzT(List list, zzsa zzsa) {
        zzmk zzmk = this.zzd;
        zzcb zzcb = this.zzg;
        if (zzcb != null) {
            zzmk.zzh(list, zzsa, zzcb);
            return;
        }
        throw null;
    }

    public final void zzo(zzca zzca, zzca zzca2, int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzmk zzmk = this.zzd;
        zzcb zzcb = this.zzg;
        if (zzcb != null) {
            zzmk.zzg(zzcb);
            zzki zzU = zzU();
            zzZ(zzU, 11, new zzky(zzU, i, zzca, zzca2));
            return;
        }
        throw null;
    }

    public final void zzs(zzci zzci, int i) {
        zzmk zzmk = this.zzd;
        zzcb zzcb = this.zzg;
        if (zzcb != null) {
            zzmk.zzi(zzcb);
            zzki zzU = zzU();
            zzZ(zzU, 0, new zzli(zzU, i));
            return;
        }
        throw null;
    }

    public zzml(zzcx zzcx) {
        if (zzcx != null) {
            this.zza = zzcx;
            this.zzf = new zzdm(zzeg.zzD(), zzcx, zzkr.zza);
            this.zzb = new zzcf();
            this.zzc = new zzch();
            this.zzd = new zzmk(this.zzb);
            this.zze = new SparseArray();
            return;
        }
        throw null;
    }
}
