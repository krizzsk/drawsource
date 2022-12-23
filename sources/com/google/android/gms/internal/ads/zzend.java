package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzend implements zzfuy {
    final /* synthetic */ zzemw zza;
    final /* synthetic */ zzfhs zzb;
    final /* synthetic */ zzfhh zzc;
    final /* synthetic */ zzdlu zzd;
    final /* synthetic */ zzene zze;

    zzend(zzene zzene, zzemw zzemw, zzfhs zzfhs, zzfhh zzfhh, zzdlu zzdlu) {
        this.zze = zzene;
        this.zza = zzemw;
        this.zzb = zzfhs;
        this.zzc = zzfhh;
        this.zzd = zzdlu;
    }

    public final void zza(Throwable th) {
        zzfhs zzfhs;
        zze zza2 = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zza2);
        this.zze.zzb.zzA().execute(new zzenc(this, zza2));
        zzfcx.zzb(zza2.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbji.zzc.zze()).booleanValue() || (zzfhs = this.zzb) == null) {
            zzfhu zze2 = this.zze.zze;
            zzfhh zzfhh = this.zzc;
            zzfhh.zza(zza2);
            zzfhh.zze(false);
            zze2.zzb(zzfhh.zzj());
            return;
        }
        zzfhs.zzc(zza2);
        zzfhh zzfhh2 = this.zzc;
        zzfhh2.zze(false);
        zzfhs.zza(zzfhh2);
        zzfhs.zzg();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhs zzfhs;
        zzcxx zzcxx = (zzcxx) obj;
        synchronized (this.zze) {
            zzcxx.zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzcxx);
            this.zze.zzb.zzA().execute(new zzenb(this));
            if (!((Boolean) zzbji.zzc.zze()).booleanValue() || (zzfhs = this.zzb) == null) {
                zzfhu zze2 = this.zze.zze;
                zzfhh zzfhh = this.zzc;
                zzfhh.zzb(zzcxx.zzp().zzb);
                zzfhh.zzc(zzcxx.zzl().zzg());
                zzfhh.zze(true);
                zze2.zzb(zzfhh.zzj());
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
