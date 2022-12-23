package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdxy implements Runnable {
    public final /* synthetic */ zzdyj zza;
    public final /* synthetic */ zzcga zzb;

    public /* synthetic */ zzdxy(zzdyj zzdyj, zzcga zzcga) {
        this.zza = zzdyj;
        this.zzb = zzcga;
    }

    public final void run() {
        zzcga zzcga = this.zzb;
        String zzc = zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            zzcga.zzd(zzc);
        } else {
            zzcga.zze(new Exception());
        }
    }
}
