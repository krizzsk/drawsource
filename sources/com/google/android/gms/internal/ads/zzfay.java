package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfay implements zzemx {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcnf zzc;
    /* access modifiers changed from: private */
    public final zzfao zzd;
    /* access modifiers changed from: private */
    public final zzeza zze;
    private final zzfby zzf;
    /* access modifiers changed from: private */
    public final zzfhu zzg;
    private final zzfcb zzh;
    private zzfvl zzi;

    public zzfay(Context context, Executor executor, zzcnf zzcnf, zzeza zzeza, zzfao zzfao, zzfcb zzfcb, zzfby zzfby) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnf;
        this.zze = zzeza;
        this.zzd = zzfao;
        this.zzh = zzfcb;
        this.zzf = zzfby;
        this.zzg = zzcnf.zzy();
    }

    /* access modifiers changed from: private */
    public final zzdsx zzk(zzeyy zzeyy) {
        zzfax zzfax = (zzfax) zzeyy;
        zzdsx zzi2 = this.zzc.zzi();
        zzdbd zzdbd = new zzdbd();
        zzdbd.zzc(this.zza);
        zzdbd.zzf(zzfax.zza);
        String str = zzfax.zzb;
        zzdbd.zze(this.zzf);
        zzi2.zzd(zzdbd.zzg());
        zzi2.zzc(new zzdhd().zzn());
        return zzi2;
    }

    public final boolean zza() {
        throw null;
    }

    public final boolean zzb(zzl zzl, String str, zzemv zzemv, zzemw zzemw) throws RemoteException {
        zzfhs zzfhs;
        zzcas zzcas = new zzcas(zzl, str);
        if (zzcas.zzb == null) {
            zze.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new zzfar(this));
        } else {
            zzfvl zzfvl = this.zzi;
            if (zzfvl == null || zzfvl.isDone()) {
                if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
                    zzeza zzeza = this.zze;
                    if (zzeza.zzd() != null) {
                        zzfhs zzh2 = ((zzdsy) zzeza.zzd()).zzh();
                        zzh2.zzh(5);
                        zzh2.zzb(zzcas.zza.zzp);
                        zzfhs = zzh2;
                        zzfcx.zza(this.zza, zzcas.zza.zzf);
                        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzcas.zza.zzf) {
                            this.zzc.zzk().zzl(true);
                        }
                        zzfcb zzfcb = this.zzh;
                        zzfcb.zzs(zzcas.zzb);
                        zzfcb.zzr(zzq.zzd());
                        zzfcb.zzE(zzcas.zza);
                        zzfcd zzG = zzfcb.zzG();
                        zzfhh zzb2 = zzfhg.zzb(this.zza, zzfhr.zzf(zzG), 5, zzcas.zza);
                        zzfax zzfax = new zzfax((zzfaw) null);
                        zzfax.zza = zzG;
                        zzfax.zzb = null;
                        zzfvl zzc2 = this.zze.zzc(new zzezb(zzfax, (zzbzv) null), new zzfas(this), (Object) null);
                        this.zzi = zzc2;
                        zzfvc.zzr(zzc2, new zzfav(this, zzemw, zzfhs, zzb2, zzfax), this.zzb);
                        return true;
                    }
                }
                zzfhs = null;
                zzfcx.zza(this.zza, zzcas.zza.zzf);
                this.zzc.zzk().zzl(true);
                zzfcb zzfcb2 = this.zzh;
                zzfcb2.zzs(zzcas.zzb);
                zzfcb2.zzr(zzq.zzd());
                zzfcb2.zzE(zzcas.zza);
                zzfcd zzG2 = zzfcb2.zzG();
                zzfhh zzb22 = zzfhg.zzb(this.zza, zzfhr.zzf(zzG2), 5, zzcas.zza);
                zzfax zzfax2 = new zzfax((zzfaw) null);
                zzfax2.zza = zzG2;
                zzfax2.zzb = null;
                zzfvl zzc22 = this.zze.zzc(new zzezb(zzfax2, (zzbzv) null), new zzfas(this), (Object) null);
                this.zzi = zzc22;
                zzfvc.zzr(zzc22, new zzfav(this, zzemw, zzfhs, zzb22, zzfax2), this.zzb);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zzd.zza(zzfdc.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i) {
        this.zzh.zzo().zza(i);
    }
}
