package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzean implements zzfuy {
    final /* synthetic */ zzeao zza;

    zzean(zzeao zzeao) {
        this.zza = zzeao;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfg)).booleanValue()) {
            Matcher matcher = zzeao.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfbx zzfbx = (zzfbx) obj;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfg)).booleanValue()) {
            this.zza.zzf.zzi(zzfbx.zzb.zzb.zze);
            this.zza.zzf.zzj(zzfbx.zzb.zzb.zzf);
        }
    }
}
