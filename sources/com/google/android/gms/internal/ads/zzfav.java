package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfav implements zzfuy {
    final /* synthetic */ zzemw zza;
    final /* synthetic */ zzfhs zzb;
    final /* synthetic */ zzfhh zzc;
    final /* synthetic */ zzfax zzd;
    final /* synthetic */ zzfay zze;

    zzfav(zzfay zzfay, zzemw zzemw, zzfhs zzfhs, zzfhh zzfhh, zzfax zzfax) {
        this.zze = zzfay;
        this.zza = zzemw;
        this.zzb = zzfhs;
        this.zzc = zzfhh;
        this.zzd = zzfax;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfhs zzfhs;
        zzdsy zzdsy = (zzdsy) this.zze.zze.zzd();
        if (zzdsy == null) {
            zze2 = zzfdc.zzb(th, (zzefi) null);
        } else {
            zze2 = zzdsy.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdsy != null) {
                zzdsy.zza().zza(zze2);
                this.zze.zzb.execute(new zzfau(this, zze2));
            } else {
                this.zze.zzd.zza(zze2);
                this.zze.zzk(this.zzd).zze().zzb().zzc().zzd();
            }
            zzfcx.zzb(zze2.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbji.zzc.zze()).booleanValue() || (zzfhs = this.zzb) == null) {
                zzfhu zzg = this.zze.zzg;
                zzfhh zzfhh = this.zzc;
                zzfhh.zza(zze2);
                zzfhh.zze(false);
                zzg.zzb(zzfhh.zzj());
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
        zzdst zzdst = (zzdst) obj;
        synchronized (this.zze) {
            zzdst.zzn().zzd(this.zze.zzd);
            this.zza.zzb(zzdst);
            zzfay zzfay = this.zze;
            Executor zzh = zzfay.zzb;
            zzfao zzf = zzfay.zzd;
            zzf.getClass();
            zzh.execute(new zzfat(zzf));
            this.zze.zzd.zzv();
            if (!((Boolean) zzbji.zzc.zze()).booleanValue() || (zzfhs = this.zzb) == null) {
                zzfhu zzg = this.zze.zzg;
                zzfhh zzfhh = this.zzc;
                zzfhh.zzb(zzdst.zzp().zzb);
                zzfhh.zzc(zzdst.zzl().zzg());
                zzfhh.zze(true);
                zzg.zzb(zzfhh.zzj());
            } else {
                zzfhs.zzf(zzdst.zzp().zzb);
                zzfhs.zze(zzdst.zzl().zzg());
                zzfhh zzfhh2 = this.zzc;
                zzfhh2.zze(true);
                zzfhs.zza(zzfhh2);
                zzfhs.zzg();
            }
        }
    }
}
