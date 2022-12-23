package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdqz {
    private final zzfcd zza;
    private final Executor zzb;
    private final zzdtp zzc;
    private final zzdsk zzd;
    private final Context zze;
    private final zzdwh zzf;
    private final zzfgp zzg;
    private final zzfii zzh;
    private final zzees zzi;

    public zzdqz(zzfcd zzfcd, Executor executor, zzdtp zzdtp, Context context, zzdwh zzdwh, zzfgp zzfgp, zzfii zzfii, zzees zzees, zzdsk zzdsk) {
        this.zza = zzfcd;
        this.zzb = executor;
        this.zzc = zzdtp;
        this.zze = context;
        this.zzf = zzdwh;
        this.zzg = zzfgp;
        this.zzh = zzfii;
        this.zzi = zzees;
        this.zzd = zzdsk;
    }

    private final void zzh(zzcli zzcli) {
        zzi(zzcli);
        zzcli.zzaf("/video", zzbol.zzl);
        zzcli.zzaf("/videoMeta", zzbol.zzm);
        zzcli.zzaf("/precache", new zzcjv());
        zzcli.zzaf("/delayPageLoaded", zzbol.zzp);
        zzcli.zzaf("/instrument", zzbol.zzn);
        zzcli.zzaf("/log", zzbol.zzg);
        zzcli.zzaf("/click", zzbol.zza((zzdjg) null));
        if (this.zza.zzb != null) {
            zzcli.zzP().zzC(true);
            zzcli.zzaf("/open", new zzbox((zzb) null, (zzbwp) null, (zzees) null, (zzdwh) null, (zzfgp) null));
        } else {
            zzcli.zzP().zzC(false);
        }
        if (zzt.zzn().zzu(zzcli.getContext())) {
            zzcli.zzaf("/logScionEvent", new zzbos(zzcli.getContext()));
        }
    }

    private static final void zzi(zzcli zzcli) {
        zzcli.zzaf("/videoClicked", zzbol.zzh);
        zzcli.zzP().zzE(true);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzcP)).booleanValue()) {
            zzcli.zzaf("/getNativeAdViewSignals", zzbol.zzs);
        }
        zzcli.zzaf("/getNativeClickMeta", zzbol.zzt);
    }

    public final zzfvl zza(JSONObject jSONObject) {
        return zzfvc.zzn(zzfvc.zzn(zzfvc.zzi((Object) null), new zzdqp(this), this.zzb), new zzdqq(this, jSONObject), this.zzb);
    }

    public final zzfvl zzb(String str, String str2, zzfbl zzfbl, zzfbo zzfbo, zzq zzq) {
        return zzfvc.zzn(zzfvc.zzi((Object) null), new zzdqs(this, zzq, zzfbl, zzfbo, str, str2), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(JSONObject jSONObject, zzcli zzcli) throws Exception {
        zzcfz zza2 = zzcfz.zza(zzcli);
        if (this.zza.zzb != null) {
            zzcli.zzai(zzcmx.zzd());
        } else {
            zzcli.zzai(zzcmx.zze());
        }
        zzcli.zzP().zzz(new zzdqo(this, zzcli, zza2));
        zzcli.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzd(zzq zzq, zzfbl zzfbl, zzfbo zzfbo, String str, String str2, Object obj) throws Exception {
        zzcli zza2 = this.zzc.zza(zzq, zzfbl, zzfbo);
        zzcfz zza3 = zzcfz.zza(zza2);
        if (this.zza.zzb != null) {
            zzh(zza2);
            zza2.zzai(zzcmx.zzd());
        } else {
            zzdsh zzb2 = this.zzd.zzb();
            zzdsh zzdsh = zzb2;
            zzcmv zzP = zza2.zzP();
            zzb zzb3 = r3;
            zzb zzb4 = new zzb(this.zze, (zzccj) null, (zzbzj) null);
            zzP.zzL(zzb2, zzdsh, zzb2, zzb2, zzb2, false, (zzbop) null, zzb3, (zzbww) null, (zzccj) null, this.zzi, this.zzh, this.zzf, this.zzg, (zzbon) null, zzb2);
            zzi(zza2);
        }
        zza2.zzP().zzz(new zzdqt(this, zza2, zza3));
        zza2.zzad(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zze(Object obj) throws Exception {
        zzcli zza2 = this.zzc.zza(zzq.zzc(), (zzfbl) null, (zzfbo) null);
        zzcfz zza3 = zzcfz.zza(zza2);
        zzh(zza2);
        zza2.zzP().zzF(new zzdqr(zza3));
        zza2.loadUrl((String) zzay.zzc().zzb(zzbhz.zzcO));
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcli zzcli, zzcfz zzcfz, boolean z) {
        if (!(this.zza.zza == null || zzcli.zzs() == null)) {
            zzcli.zzs().zzs(this.zza.zza);
        }
        zzcfz.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcli zzcli, zzcfz zzcfz, boolean z) {
        if (z) {
            if (!(this.zza.zza == null || zzcli.zzs() == null)) {
                zzcli.zzs().zzs(this.zza.zza);
            }
            zzcfz.zzb();
            return;
        }
        zzcfz.zze(new zzeit(1, "Html video Web View failed to load."));
    }
}
