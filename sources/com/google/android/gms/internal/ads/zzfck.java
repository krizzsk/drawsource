package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzfck implements zzbom {
    public final /* synthetic */ zzdjg zza;
    public final /* synthetic */ zzfii zzb;
    public final /* synthetic */ zzees zzc;

    public /* synthetic */ zzfck(zzdjg zzdjg, zzfii zzfii, zzees zzees) {
        this.zza = zzdjg;
        this.zzb = zzfii;
        this.zzc = zzees;
    }

    public final void zza(Object obj, Map map) {
        zzdjg zzdjg = this.zza;
        zzfii zzfii = this.zzb;
        zzees zzees = this.zzc;
        zzcli zzcli = (zzcli) obj;
        zzbol.zzd(map, zzdjg);
        String str = (String) map.get("u");
        if (str == null) {
            zze.zzj("URL missing from click GMSG.");
        } else {
            zzfvc.zzr(zzbol.zzb(zzcli, str), new zzfcl(zzcli, zzfii, zzees), zzcfv.zza);
        }
    }
}
