package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdqv implements zzban {
    public final /* synthetic */ zzcli zza;

    public /* synthetic */ zzdqv(zzcli zzcli) {
        this.zza = zzcli;
    }

    public final void zzc(zzbam zzbam) {
        zzcli zzcli = this.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != zzbam.zzj ? "0" : "1");
        zzcli.zzd("onAdVisibilityChanged", hashMap);
    }
}
