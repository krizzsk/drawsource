package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzfcj implements zzbom {
    public final /* synthetic */ zzfii zza;
    public final /* synthetic */ zzees zzb;

    public /* synthetic */ zzfcj(zzfii zzfii, zzees zzees) {
        this.zza = zzfii;
        this.zzb = zzees;
    }

    public final void zza(Object obj, Map map) {
        zzfii zzfii = this.zza;
        zzees zzees = this.zzb;
        zzckz zzckz = (zzckz) obj;
        String str = (String) map.get("u");
        if (str == null) {
            zze.zzj("URL missing from httpTrack GMSG.");
        } else if (!zzckz.zzF().zzak) {
            zzfii.zzc(str, (zzfhs) null);
        } else {
            zzees.zzd(new zzeeu(zzt.zzA().currentTimeMillis(), ((zzcmf) zzckz).zzR().zzb, str, 2));
        }
    }
}
