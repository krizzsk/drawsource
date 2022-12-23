package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdst extends zzcxx {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdlg zze;
    private final zzdip zzf;
    private final zzdcg zzg;
    private final zzddn zzh;
    private final zzcyr zzi;
    private final zzcbb zzj;
    private final zzflf zzk;
    private boolean zzl = false;

    zzdst(zzcxw zzcxw, Context context, zzcli zzcli, zzdlg zzdlg, zzdip zzdip, zzdcg zzdcg, zzddn zzddn, zzcyr zzcyr, zzfbl zzfbl, zzflf zzflf) {
        super(zzcxw);
        this.zzc = context;
        this.zze = zzdlg;
        this.zzd = new WeakReference(zzcli);
        this.zzf = zzdip;
        this.zzg = zzdcg;
        this.zzh = zzddn;
        this.zzi = zzcyr;
        this.zzk = zzflf;
        zzcax zzcax = zzfbl.zzm;
        this.zzj = new zzcbv(zzcax != null ? zzcax.zza : "", zzcax != null ? zzcax.zzb : 1);
    }

    public final void finalize() throws Throwable {
        try {
            zzcli zzcli = (zzcli) this.zzd.get();
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzfI)).booleanValue()) {
                if (!this.zzl && zzcli != null) {
                    zzcfv.zze.execute(new zzdss(zzcli));
                }
            } else if (zzcli != null) {
                zzcli.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzcbb zzc() {
        return this.zzj;
    }

    public final boolean zzd() {
        return this.zzi.zzg();
    }

    public final boolean zze() {
        return this.zzl;
    }

    public final boolean zzf() {
        zzcli zzcli = (zzcli) this.zzd.get();
        return zzcli != null && !zzcli.zzaD();
    }

    public final boolean zzg(boolean z, Activity activity) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzay)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(this.zzc)) {
                zze.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) zzay.zzc().zzb(zzbhz.zzaz)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzl) {
            zze.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfdc.zzd(10, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return false;
        }
        this.zzl = true;
        this.zzf.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            this.zze.zza(z, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdlf e) {
            this.zzg.zze(e);
            return false;
        }
    }
}
