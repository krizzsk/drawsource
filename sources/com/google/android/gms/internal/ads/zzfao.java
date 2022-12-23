package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfao extends zzfko implements zzddh, zzdbw, zzdbt, zzdcj, zzdee, zzeyx, zzdjg {
    private final zzfdk zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfao(zzfdk zzfdk) {
        this.zza = zzfdk;
    }

    public final void zza(zze zze2) {
        int i = zze2.zza;
        zzeyo.zza(this.zzc, new zzezu(zze2));
        zzeyo.zza(this.zzc, new zzezv(i));
        zzeyo.zza(this.zze, new zzezw(i));
    }

    public final void zzb(zzfko zzfko) {
        this.zzb.set(zzfko);
    }

    public final void zzbL(zzeyx zzeyx) {
        throw null;
    }

    public final void zzbv() {
        zzeyo.zza(this.zze, zzezz.zza);
    }

    public final void zzc(zzde zzde) {
        this.zzh.set(zzde);
    }

    public final void zzd(zzcbh zzcbh) {
        this.zzd.set(zzcbh);
    }

    public final void zze(zzcbl zzcbl) {
        this.zzc.set(zzcbl);
    }

    @Deprecated
    public final void zzf(zzcar zzcar) {
        this.zze.set(zzcar);
    }

    public final void zzg(zzs zzs) {
        zzeyo.zza(this.zzh, new zzezt(zzs));
    }

    @Deprecated
    public final void zzh(zzcam zzcam) {
        this.zzg.set(zzcam);
    }

    public final void zzi(zzcbm zzcbm) {
        this.zzf.set(zzcbm);
    }

    public final void zzj() {
        this.zza.zza();
        zzeyo.zza(this.zzd, zzfaa.zza);
        zzeyo.zza(this.zze, zzfab.zza);
    }

    public final void zzk(zze zze2) {
        zzeyo.zza(this.zzd, new zzezx(zze2));
        zzeyo.zza(this.zzd, new zzezy(zze2));
    }

    public final void zzm() {
        zzeyo.zza(this.zze, zzfaj.zza);
    }

    public final void zzn() {
        zzeyo.zza(this.zzc, zzfag.zza);
        zzeyo.zza(this.zze, zzfah.zza);
    }

    public final void zzo() {
        zzeyo.zza(this.zzd, zzfac.zza);
        zzeyo.zza(this.zze, zzfae.zza);
        zzeyo.zza(this.zzd, zzfaf.zza);
    }

    public final void zzp(zzcal zzcal, String str, String str2) {
        zzeyo.zza(this.zzd, new zzfak(zzcal));
        zzeyo.zza(this.zzf, new zzfal(zzcal, str, str2));
        zzeyo.zza(this.zze, new zzfam(zzcal));
        zzeyo.zza(this.zzg, new zzfan(zzcal, str, str2));
    }

    public final void zzq() {
        zzeyo.zza(this.zzd, zzezs.zza);
    }

    public final void zzr() {
        zzeyo.zza(this.zze, zzfad.zza);
    }

    public final void zzv() {
        zzeyo.zza(this.zzb, zzfai.zza);
    }
}
