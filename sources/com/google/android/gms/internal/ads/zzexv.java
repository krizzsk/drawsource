package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzexv implements zzemx {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcnf zzc;
    /* access modifiers changed from: private */
    public final zzemh zzd;
    /* access modifiers changed from: private */
    public final zzeml zze;
    /* access modifiers changed from: private */
    public final ViewGroup zzf;
    private zzbiu zzg;
    /* access modifiers changed from: private */
    public final zzdei zzh;
    /* access modifiers changed from: private */
    public final zzfhu zzi;
    /* access modifiers changed from: private */
    public final zzdgo zzj;
    private final zzfcb zzk;
    /* access modifiers changed from: private */
    public zzfvl zzl;

    public zzexv(Context context, Executor executor, zzq zzq, zzcnf zzcnf, zzemh zzemh, zzeml zzeml, zzfcb zzfcb, zzdgo zzdgo) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnf;
        this.zzd = zzemh;
        this.zze = zzeml;
        this.zzk = zzfcb;
        this.zzh = zzcnf.zzf();
        this.zzi = zzcnf.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdgo;
        zzfcb.zzr(zzq);
    }

    public final boolean zza() {
        zzfvl zzfvl = this.zzl;
        return zzfvl != null && !zzfvl.isDone();
    }

    public final boolean zzb(zzl zzl2, String str, zzemv zzemv, zzemw zzemw) throws RemoteException {
        zzcws zzcws;
        zzfhs zzfhs;
        if (str == null) {
            zze.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new zzexr(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzl2.zzf) {
                this.zzc.zzk().zzl(true);
            }
            zzfcb zzfcb = this.zzk;
            zzfcb.zzs(str);
            zzfcb.zzE(zzl2);
            zzfcd zzG = zzfcb.zzG();
            zzfhh zzb2 = zzfhg.zzb(this.zza, zzfhr.zzf(zzG), 3, zzl2);
            if (!((Boolean) zzbju.zzc.zze()).booleanValue() || !this.zzk.zzg().zzk) {
                if (((Boolean) zzay.zzc().zzb(zzbhz.zzgP)).booleanValue()) {
                    zzcwr zze2 = this.zzc.zze();
                    zzdbd zzdbd = new zzdbd();
                    zzdbd.zzc(this.zza);
                    zzdbd.zzf(zzG);
                    zze2.zzi(zzdbd.zzg());
                    zzdhd zzdhd = new zzdhd();
                    zzdhd.zzj(this.zzd, this.zzb);
                    zzdhd.zzk(this.zzd, this.zzb);
                    zze2.zzf(zzdhd.zzn());
                    zze2.zze(new zzekr(this.zzg));
                    zze2.zzd(new zzdlp(zzdns.zza, (zzbf) null));
                    zze2.zzg(new zzcxp(this.zzh, this.zzj));
                    zze2.zzc(new zzcvs(this.zzf));
                    zzcws = zze2.zzj();
                } else {
                    zzcwr zze3 = this.zzc.zze();
                    zzdbd zzdbd2 = new zzdbd();
                    zzdbd2.zzc(this.zza);
                    zzdbd2.zzf(zzG);
                    zze3.zzi(zzdbd2.zzg());
                    zzdhd zzdhd2 = new zzdhd();
                    zzdhd2.zzj(this.zzd, this.zzb);
                    zzdhd2.zza(this.zzd, this.zzb);
                    zzdhd2.zza(this.zze, this.zzb);
                    zzdhd2.zzl(this.zzd, this.zzb);
                    zzdhd2.zzd(this.zzd, this.zzb);
                    zzdhd2.zze(this.zzd, this.zzb);
                    zzdhd2.zzf(this.zzd, this.zzb);
                    zzdhd2.zzb(this.zzd, this.zzb);
                    zzdhd2.zzk(this.zzd, this.zzb);
                    zzdhd2.zzi(this.zzd, this.zzb);
                    zze3.zzf(zzdhd2.zzn());
                    zze3.zze(new zzekr(this.zzg));
                    zze3.zzd(new zzdlp(zzdns.zza, (zzbf) null));
                    zze3.zzg(new zzcxp(this.zzh, this.zzj));
                    zze3.zzc(new zzcvs(this.zzf));
                    zzcws = zze3.zzj();
                }
                zzcws zzcws2 = zzcws;
                if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
                    zzfhs zzj2 = zzcws2.zzj();
                    zzj2.zzh(3);
                    zzj2.zzb(zzl2.zzp);
                    zzfhs = zzj2;
                } else {
                    zzfhs = null;
                }
                zzcza zzd2 = zzcws2.zzd();
                zzfvl zzh2 = zzd2.zzh(zzd2.zzi());
                this.zzl = zzh2;
                zzfvc.zzr(zzh2, new zzexu(this, zzemw, zzfhs, zzb2, zzcws2), this.zzb);
                return true;
            }
            zzemh zzemh = this.zzd;
            if (zzemh != null) {
                zzemh.zza(zzfdc.zzd(7, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            }
            return false;
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfcb zzi() {
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzd.zza(zzfdc.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(zzbc zzbc) {
        this.zze.zza(zzbc);
    }

    public final void zzp(zzdej zzdej) {
        this.zzh.zzj(zzdej, this.zzb);
    }

    public final void zzq(zzbiu zzbiu) {
        this.zzg = zzbiu;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzt.zzp();
        return zzs.zzR(view, view.getContext());
    }
}
