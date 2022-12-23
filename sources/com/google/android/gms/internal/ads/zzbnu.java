package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbnu implements zzbom {
    public final /* synthetic */ zzdjg zza;

    public /* synthetic */ zzbnu(zzdjg zzdjg) {
        this.zza = zzdjg;
    }

    public final void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        zzbol.zzd(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zze.zzj("URL missing from click GMSG.");
        } else {
            zzfvc.zzr(zzbol.zzb(zzcli, str), new zzboc(zzcli), zzcfv.zza);
        }
    }
}
