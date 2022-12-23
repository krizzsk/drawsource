package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzezn implements zzfuy {
    final /* synthetic */ zzemw zza;
    final /* synthetic */ zzfhs zzb;
    final /* synthetic */ zzfhh zzc;
    final /* synthetic */ zzdky zzd;
    final /* synthetic */ zzezo zze;

    zzezn(zzezo zzezo, zzemw zzemw, zzfhs zzfhs, zzfhh zzfhh, zzdky zzdky) {
        this.zze = zzezo;
        this.zza = zzemw;
        this.zzb = zzfhs;
        this.zzc = zzfhh;
        this.zzd = zzdky;
    }

    public final void zza(Throwable th) {
        zzfhs zzfhs;
        zze zza2 = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zza(zza2);
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzgR)).booleanValue()) {
                this.zze.zzb.execute(new zzezl(this, zza2));
                this.zze.zzb.execute(new zzezm(this, zza2));
            }
            zzfcx.zzb(zza2.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbji.zzc.zze()).booleanValue() || (zzfhs = this.zzb) == null) {
                zzfhu zze2 = this.zze.zzg;
                zzfhh zzfhh = this.zzc;
                zzfhh.zza(zza2);
                zzfhh.zze(false);
                zze2.zzb(zzfhh.zzj());
            } else {
                zzfhs.zzc(zza2);
                zzfhh zzfhh2 = this.zzc;
                zzfhh2.zze(false);
                zzfhs.zza(zzfhh2);
                zzfhs.zzg();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhs zzfhs;
        zzdjz zzdjz = (zzdjz) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzgR)).booleanValue()) {
                zzdfx zzn = zzdjz.zzn();
                zzn.zza(this.zze.zzd);
                zzn.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdjz);
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzgR)).booleanValue()) {
                this.zze.zzb.execute(new zzezj(this));
                this.zze.zzb.execute(new zzezk(this));
            }
            if (!((Boolean) zzbji.zzc.zze()).booleanValue() || (zzfhs = this.zzb) == null) {
                zzfhu zze2 = this.zze.zzg;
                zzfhh zzfhh = this.zzc;
                zzfhh.zzb(zzdjz.zzp().zzb);
                zzfhh.zzc(zzdjz.zzl().zzg());
                zzfhh.zze(true);
                zze2.zzb(zzfhh.zzj());
            } else {
                zzfhs.zzf(zzdjz.zzp().zzb);
                zzfhs.zze(zzdjz.zzl().zzg());
                zzfhh zzfhh2 = this.zzc;
                zzfhh2.zze(true);
                zzfhs.zza(zzfhh2);
                zzfhs.zzg();
            }
        }
    }
}
