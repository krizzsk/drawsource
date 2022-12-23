package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzewo implements zzfuy {
    final /* synthetic */ zzemw zza;
    final /* synthetic */ zzfhs zzb;
    final /* synthetic */ zzfhh zzc;
    final /* synthetic */ zzewq zzd;
    final /* synthetic */ zzewr zze;

    zzewo(zzewr zzewr, zzemw zzemw, zzfhs zzfhs, zzfhh zzfhh, zzewq zzewq) {
        this.zze = zzewr;
        this.zza = zzemw;
        this.zzb = zzfhs;
        this.zzc = zzfhh;
        this.zzd = zzewq;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfhs zzfhs;
        zzcvd zzcvd = (zzcvd) this.zze.zze.zzd();
        if (zzcvd == null) {
            zze2 = zzfdc.zzb(th, (zzefi) null);
        } else {
            zze2 = zzcvd.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcvd != null) {
                zzcvd.zzc().zza(zze2);
                if (((Boolean) zzay.zzc().zzb(zzbhz.zzgQ)).booleanValue()) {
                    this.zze.zzc.execute(new zzewn(this, zze2));
                }
            } else {
                this.zze.zzd.zza(zze2);
                ((zzcvd) this.zze.zzm(this.zzd).zzh()).zzb().zzc().zzd();
            }
            zzfcx.zzb(zze2.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbji.zzc.zze()).booleanValue() || (zzfhs = this.zzb) == null) {
                zzfhu zzh = this.zze.zzh;
                zzfhh zzfhh = this.zzc;
                zzfhh.zza(zze2);
                zzfhh.zze(false);
                zzh.zzb(zzfhh.zzj());
            } else {
                zzfhs.zzc(zze2);
                zzfhh zzfhh2 = this.zzc;
                zzfhh2.zze(false);
                zzfhs.zza(zzfhh2);
                zzfhs.zzg();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhs zzfhs;
        zzcxx zzcxx = (zzcxx) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzgQ)).booleanValue()) {
                zzcxx.zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzcxx);
            if (!((Boolean) zzbji.zzc.zze()).booleanValue() || (zzfhs = this.zzb) == null) {
                zzfhu zzh = this.zze.zzh;
                zzfhh zzfhh = this.zzc;
                zzfhh.zzb(zzcxx.zzp().zzb);
                zzfhh.zzc(zzcxx.zzl().zzg());
                zzfhh.zze(true);
                zzh.zzb(zzfhh.zzj());
            } else {
                zzfhs.zzf(zzcxx.zzp().zzb);
                zzfhs.zze(zzcxx.zzl().zzg());
                zzfhh zzfhh2 = this.zzc;
                zzfhh2.zze(true);
                zzfhs.zza(zzfhh2);
                zzfhs.zzg();
            }
        }
    }
}
