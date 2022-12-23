package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzene implements zzemx {
    private final zzfcb zza;
    /* access modifiers changed from: private */
    public final zzcnf zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final zzemu zzd;
    /* access modifiers changed from: private */
    public final zzfhu zze;
    private zzcyl zzf;

    public zzene(zzcnf zzcnf, Context context, zzemu zzemu, zzfcb zzfcb) {
        this.zzb = zzcnf;
        this.zzc = context;
        this.zzd = zzemu;
        this.zza = zzfcb;
        this.zze = zzcnf.zzy();
        zzfcb.zzu(zzemu.zzd());
    }

    public final boolean zza() {
        zzcyl zzcyl = this.zzf;
        return zzcyl != null && zzcyl.zzf();
    }

    public final boolean zzb(zzl zzl, String str, zzemv zzemv, zzemw zzemw) throws RemoteException {
        zzfhs zzfhs;
        zzt.zzp();
        if (zzs.zzD(this.zzc) && zzl.zzs == null) {
            zze.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new zzemz(this));
            return false;
        } else if (str == null) {
            zze.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new zzena(this));
            return false;
        } else {
            zzfcx.zza(this.zzc, zzl.zzf);
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzl.zzf) {
                this.zzb.zzk().zzl(true);
            }
            int i = ((zzemy) zzemv).zza;
            zzfcb zzfcb = this.zza;
            zzfcb.zzE(zzl);
            zzfcb.zzz(i);
            zzfcd zzG = zzfcb.zzG();
            zzfhh zzb2 = zzfhg.zzb(this.zzc, zzfhr.zzf(zzG), 8, zzl);
            zzbz zzbz = zzG.zzn;
            if (zzbz != null) {
                this.zzd.zzd().zzi(zzbz);
            }
            zzdlt zzh = this.zzb.zzh();
            zzdbd zzdbd = new zzdbd();
            zzdbd.zzc(this.zzc);
            zzdbd.zzf(zzG);
            zzh.zzf(zzdbd.zzg());
            zzdhd zzdhd = new zzdhd();
            zzdhd.zzk(this.zzd.zzd(), this.zzb.zzA());
            zzh.zze(zzdhd.zzn());
            zzh.zzd(this.zzd.zzc());
            zzh.zzc(new zzcvs((ViewGroup) null));
            zzdlu zzg = zzh.zzg();
            if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
                zzfhs zzf2 = zzg.zzf();
                zzf2.zzh(8);
                zzf2.zzb(zzl.zzp);
                zzfhs = zzf2;
            } else {
                zzfhs = null;
            }
            this.zzb.zzw().zzc(1);
            zzfvm zzfvm = zzcfv.zza;
            zzgrc.zzb(zzfvm);
            ScheduledExecutorService zzB = this.zzb.zzB();
            zzcza zza2 = zzg.zza();
            zzcyl zzcyl = new zzcyl(zzfvm, zzB, zza2.zzh(zza2.zzi()));
            this.zzf = zzcyl;
            zzcyl.zze(new zzend(this, zzemw, zzfhs, zzb2, zzg));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzfdc.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzfdc.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }
}
