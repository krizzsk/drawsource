package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzexu implements zzfuy {
    final /* synthetic */ zzemw zza;
    final /* synthetic */ zzfhs zzb;
    final /* synthetic */ zzfhh zzc;
    final /* synthetic */ zzcws zzd;
    final /* synthetic */ zzexv zze;

    zzexu(zzexv zzexv, zzemw zzemw, zzfhs zzfhs, zzfhh zzfhh, zzcws zzcws) {
        this.zze = zzexv;
        this.zza = zzemw;
        this.zzb = zzfhs;
        this.zzc = zzfhh;
        this.zzd = zzcws;
    }

    public final void zza(Throwable th) {
        zzfhs zzfhs;
        zze zza2 = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zza2);
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzgP)).booleanValue()) {
                this.zze.zzb.execute(new zzext(this, zza2));
            }
            zzexv zzexv = this.zze;
            zzexv.zzh.zzd(zzexv.zzj.zzc());
            zzfcx.zzb(zza2.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbji.zzc.zze()).booleanValue() || (zzfhs = this.zzb) == null) {
                zzfhu zzj = this.zze.zzi;
                zzfhh zzfhh = this.zzc;
                zzfhh.zza(zza2);
                zzfhh.zze(false);
                zzj.zzb(zzfhh.zzj());
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
        zzcvv zzcvv = (zzcvv) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zze.zzf.removeAllViews();
            if (zzcvv.zzc() != null) {
                ViewParent parent = zzcvv.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    if (zzcvv.zzl() != null) {
                        str = zzcvv.zzl().zzg();
                    }
                    com.google.android.gms.ads.internal.util.zze.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcvv.zzc());
                }
            }
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzgP)).booleanValue()) {
                zzdfx zzn = zzcvv.zzn();
                zzn.zza(this.zze.zzd);
                zzn.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(zzcvv.zzc());
            this.zza.zzb(zzcvv);
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzgP)).booleanValue()) {
                zzexv zzexv = this.zze;
                Executor zzk = zzexv.zzb;
                zzemh zzg = zzexv.zzd;
                zzg.getClass();
                zzk.execute(new zzexs(zzg));
            }
            this.zze.zzh.zzd(zzcvv.zza());
            if (!((Boolean) zzbji.zzc.zze()).booleanValue() || (zzfhs = this.zzb) == null) {
                zzfhu zzj = this.zze.zzi;
                zzfhh zzfhh = this.zzc;
                zzfhh.zzb(zzcvv.zzp().zzb);
                zzfhh.zzc(zzcvv.zzl().zzg());
                zzfhh.zze(true);
                zzj.zzb(zzfhh.zzj());
            } else {
                zzfhs.zzf(zzcvv.zzp().zzb);
                zzfhs.zze(zzcvv.zzl().zzg());
                zzfhh zzfhh2 = this.zzc;
                zzfhh2.zze(true);
                zzfhs.zza(zzfhh2);
                zzfhs.zzg();
            }
        }
    }
}
