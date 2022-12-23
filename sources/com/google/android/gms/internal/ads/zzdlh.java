package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdlh implements zzddh, zzo {
    IObjectWrapper zza;
    private final Context zzb;
    private final zzcli zzc;
    private final zzfbl zzd;
    private final zzcfo zze;
    private final zzbdw zzf;

    public zzdlh(Context context, zzcli zzcli, zzfbl zzfbl, zzcfo zzcfo, zzbdw zzbdw) {
        this.zzb = context;
        this.zzc = zzcli;
        this.zzd = zzfbl;
        this.zze = zzcfo;
        this.zzf = zzbdw;
    }

    public final void zzb() {
        zzcli zzcli;
        if (this.zza != null && (zzcli = this.zzc) != null) {
            zzcli.zzd("onSdkImpression", new ArrayMap());
        }
    }

    public final void zzbC() {
    }

    public final void zzbK() {
    }

    public final void zzbr() {
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        this.zza = null;
    }

    public final void zzn() {
        zzbxq zzbxq;
        zzbxr zzbxr;
        zzbxr zzbxr2;
        zzbdw zzbdw;
        if ((this.zzf == zzbdw.REWARD_BASED_VIDEO_AD || (zzbdw = this.zzf) == zzbdw.INTERSTITIAL || zzbdw == zzbdw.APP_OPEN) && this.zzd.zzU && this.zzc != null && zzt.zzh().zze(this.zzb)) {
            zzcfo zzcfo = this.zze;
            String str = zzcfo.zzb + "." + zzcfo.zzc;
            String zza2 = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzbxq = zzbxq.zzc;
                zzbxr = zzbxr.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.zzd.zzZ == 2) {
                    zzbxr2 = zzbxr.UNSPECIFIED;
                } else {
                    zzbxr2 = zzbxr.BEGIN_TO_RENDER;
                }
                zzbxr = zzbxr2;
                zzbxq = zzbxq.HTML_DISPLAY;
            }
            IObjectWrapper zza3 = zzt.zzh().zza(str, this.zzc.zzI(), "", "javascript", zza2, zzbxr, zzbxq, this.zzd.zzan);
            this.zza = zza3;
            if (zza3 != null) {
                zzt.zzh().zzc(this.zza, (View) this.zzc);
                this.zzc.zzar(this.zza);
                zzt.zzh().zzd(this.zza);
                this.zzc.zzd("onSdkLoaded", new ArrayMap());
            }
        }
    }
}
