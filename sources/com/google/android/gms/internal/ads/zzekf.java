package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzekf extends zzbuf {
    private final zzdbr zza;
    private final zzdje zzb;
    private final zzdcl zzc;
    private final zzdda zzd;
    private final zzddf zze;
    private final zzdgm zzf;
    private final zzddz zzg;
    private final zzdjw zzh;
    private final zzdgi zzi;
    private final zzdcg zzj;

    public zzekf(zzdbr zzdbr, zzdje zzdje, zzdcl zzdcl, zzdda zzdda, zzddf zzddf, zzdgm zzdgm, zzddz zzddz, zzdjw zzdjw, zzdgi zzdgi, zzdcg zzdcg) {
        this.zza = zzdbr;
        this.zzb = zzdje;
        this.zzc = zzdcl;
        this.zzd = zzdda;
        this.zze = zzddf;
        this.zzf = zzdgm;
        this.zzg = zzddz;
        this.zzh = zzdjw;
        this.zzi = zzdgi;
        this.zzj = zzdcg;
    }

    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzq();
    }

    public final void zzf() {
        this.zzg.zzf(4);
    }

    public final void zzg(int i) {
    }

    public final void zzh(zze zze2) {
    }

    public final void zzi(int i, String str) {
    }

    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new zze(i, "", AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
    }

    public final void zzk(zze zze2) {
        this.zzj.zza(zzfdc.zzc(8, zze2));
    }

    public final void zzl(String str) {
        zzk(new zze(0, str, AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    public final void zzn() {
        this.zzd.zzb();
    }

    public final void zzo() {
        this.zze.zzn();
    }

    public final void zzp() {
        this.zzg.zzb();
        this.zzi.zza();
    }

    public final void zzq(String str, String str2) {
        this.zzf.zzbD(str, str2);
    }

    public final void zzr(zzblv zzblv, String str) {
    }

    public void zzs(zzcax zzcax) {
    }

    public void zzt(zzcbb zzcbb) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    public final void zzw() {
        this.zzh.zzb();
    }

    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
