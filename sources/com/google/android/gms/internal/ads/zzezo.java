package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzezo implements zzemx {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcnf zzc;
    /* access modifiers changed from: private */
    public final zzemh zzd;
    /* access modifiers changed from: private */
    public final zzfao zze;
    private zzbiu zzf;
    /* access modifiers changed from: private */
    public final zzfhu zzg;
    private final zzfcb zzh;
    /* access modifiers changed from: private */
    public zzfvl zzi;

    public zzezo(Context context, Executor executor, zzcnf zzcnf, zzemh zzemh, zzfao zzfao, zzfcb zzfcb) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnf;
        this.zzd = zzemh;
        this.zzh = zzfcb;
        this.zze = zzfao;
        this.zzg = zzcnf.zzy();
    }

    public final boolean zza() {
        zzfvl zzfvl = this.zzi;
        return zzfvl != null && !zzfvl.isDone();
    }

    public final boolean zzb(zzl zzl, String str, zzemv zzemv, zzemw zzemw) {
        zzdky zzf2;
        zzfhs zzfhs;
        if (str == null) {
            zze.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new zzezi(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzl.zzf) {
                this.zzc.zzk().zzl(true);
            }
            zzq zzq = ((zzezh) zzemv).zza;
            zzfcb zzfcb = this.zzh;
            zzfcb.zzs(str);
            zzfcb.zzr(zzq);
            zzfcb.zzE(zzl);
            zzfcd zzG = zzfcb.zzG();
            zzfhh zzb2 = zzfhg.zzb(this.zza, zzfhr.zzf(zzG), 4, zzl);
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzgR)).booleanValue()) {
                zzdkx zzg2 = this.zzc.zzg();
                zzdbd zzdbd = new zzdbd();
                zzdbd.zzc(this.zza);
                zzdbd.zzf(zzG);
                zzg2.zze(zzdbd.zzg());
                zzdhd zzdhd = new zzdhd();
                zzdhd.zzj(this.zzd, this.zzb);
                zzdhd.zzk(this.zzd, this.zzb);
                zzg2.zzd(zzdhd.zzn());
                zzg2.zzc(new zzekr(this.zzf));
                zzf2 = zzg2.zzf();
            } else {
                zzdhd zzdhd2 = new zzdhd();
                zzfao zzfao = this.zze;
                if (zzfao != null) {
                    zzdhd2.zze(zzfao, this.zzb);
                    zzdhd2.zzf(this.zze, this.zzb);
                    zzdhd2.zzb(this.zze, this.zzb);
                }
                zzdkx zzg3 = this.zzc.zzg();
                zzdbd zzdbd2 = new zzdbd();
                zzdbd2.zzc(this.zza);
                zzdbd2.zzf(zzG);
                zzg3.zze(zzdbd2.zzg());
                zzdhd2.zzj(this.zzd, this.zzb);
                zzdhd2.zze(this.zzd, this.zzb);
                zzdhd2.zzf(this.zzd, this.zzb);
                zzdhd2.zzb(this.zzd, this.zzb);
                zzdhd2.zza(this.zzd, this.zzb);
                zzdhd2.zzl(this.zzd, this.zzb);
                zzdhd2.zzk(this.zzd, this.zzb);
                zzdhd2.zzi(this.zzd, this.zzb);
                zzdhd2.zzc(this.zzd, this.zzb);
                zzg3.zzd(zzdhd2.zzn());
                zzg3.zzc(new zzekr(this.zzf));
                zzf2 = zzg3.zzf();
            }
            zzdky zzdky = zzf2;
            if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
                zzfhs zzf3 = zzdky.zzf();
                zzf3.zzh(4);
                zzf3.zzb(zzl.zzp);
                zzfhs = zzf3;
            } else {
                zzfhs = null;
            }
            zzcza zza2 = zzdky.zza();
            zzfvl zzh2 = zza2.zzh(zza2.zzi());
            this.zzi = zzh2;
            zzfvc.zzr(zzh2, new zzezn(this, zzemw, zzfhs, zzb2, zzdky), this.zzb);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zza(zzfdc.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    public final void zzi(zzbiu zzbiu) {
        this.zzf = zzbiu;
    }
}
