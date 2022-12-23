package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdse {
    /* access modifiers changed from: private */
    public final zzdry zza = new zzdry((zzdrx) null);
    private final zza zzb;
    private final zzclu zzc;
    private final Context zzd;
    private final zzdwh zze;
    private final zzfgp zzf;
    private final Executor zzg;
    private final zzaoc zzh;
    private final zzcfo zzi;
    private final zzbpa zzj;
    private final zzees zzk;
    private final zzfii zzl;
    private zzfvl zzm;

    zzdse(zzdsb zzdsb) {
        this.zzd = zzdsb.zzc;
        this.zzg = zzdsb.zzg;
        this.zzh = zzdsb.zzh;
        this.zzi = zzdsb.zzi;
        this.zzb = zzdsb.zza;
        this.zzc = zzdsb.zzb;
        this.zzj = new zzbpa();
        this.zzk = zzdsb.zzf;
        this.zzl = zzdsb.zzj;
        this.zze = zzdsb.zzd;
        this.zzf = zzdsb.zze;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcli zza(zzcli zzcli) {
        zzcli zzcli2 = zzcli;
        zzcli2.zzaf("/result", this.zzj);
        zzcmv zzP = zzcli.zzP();
        zzdry zzdry = this.zza;
        zzb zzb2 = r2;
        zzb zzb3 = new zzb(this.zzd, (zzccj) null, (zzbzj) null);
        zzP.zzL((com.google.android.gms.ads.internal.client.zza) null, zzdry, zzdry, zzdry, zzdry, false, (zzbop) null, zzb2, (zzbww) null, (zzccj) null, this.zzk, this.zzl, this.zze, this.zzf, (zzbon) null, (zzdjg) null);
        return zzcli2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(String str, JSONObject jSONObject, zzcli zzcli) throws Exception {
        return this.zzj.zzb(zzcli, str, jSONObject);
    }

    public final synchronized zzfvl zzd(String str, JSONObject jSONObject) {
        zzfvl zzfvl = this.zzm;
        if (zzfvl == null) {
            return zzfvc.zzi((Object) null);
        }
        return zzfvc.zzn(zzfvl, new zzdrq(this, str, jSONObject), this.zzg);
    }

    public final synchronized void zze(zzfbl zzfbl, zzfbo zzfbo) {
        zzfvl zzfvl = this.zzm;
        if (zzfvl != null) {
            zzfvc.zzr(zzfvl, new zzdrw(this, zzfbl, zzfbo), this.zzg);
        }
    }

    public final synchronized void zzf() {
        zzfvl zzfvl = this.zzm;
        if (zzfvl != null) {
            zzfvc.zzr(zzfvl, new zzdrs(this), this.zzg);
            this.zzm = null;
        }
    }

    public final synchronized void zzg(String str, Map map) {
        zzfvl zzfvl = this.zzm;
        if (zzfvl != null) {
            zzfvc.zzr(zzfvl, new zzdrv(this, "sendMessageToNativeJs", map), this.zzg);
        }
    }

    public final synchronized void zzh() {
        Context context = this.zzd;
        zzcfo zzcfo = this.zzi;
        zzbhr zzbhr = zzbhz.zzcN;
        zzfvl zzm2 = zzfvc.zzm(zzfvc.zzl(new zzclr(context, this.zzh, zzcfo, this.zzb, (String) zzay.zzc().zzb(zzbhr)), zzcfv.zze), new zzdrr(this), this.zzg);
        this.zzm = zzm2;
        zzcfy.zza(zzm2, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbom zzbom) {
        zzfvl zzfvl = this.zzm;
        if (zzfvl != null) {
            zzfvc.zzr(zzfvl, new zzdrt(this, str, zzbom), this.zzg);
        }
    }

    public final void zzj(WeakReference weakReference, String str, zzbom zzbom) {
        zzi(str, new zzdsd(this, weakReference, str, zzbom, (zzdsc) null));
    }

    public final synchronized void zzk(String str, zzbom zzbom) {
        zzfvl zzfvl = this.zzm;
        if (zzfvl != null) {
            zzfvc.zzr(zzfvl, new zzdru(this, str, zzbom), this.zzg);
        }
    }
}
