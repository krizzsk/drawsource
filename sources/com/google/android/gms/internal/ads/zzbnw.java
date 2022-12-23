package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbnw implements zzbom {
    public static final /* synthetic */ zzbnw zza = new zzbnw();

    private /* synthetic */ zzbnw() {
    }

    public final void zza(Object obj, Map map) {
        zzcmj zzcmj = (zzcmj) obj;
        zzbom zzbom = zzbol.zza;
        String str = (String) map.get("u");
        if (str == null) {
            zze.zzj("URL missing from httpTrack GMSG.");
        } else {
            new zzby(zzcmj.getContext(), ((zzcmr) zzcmj).zzp().zza, str).zzb();
        }
    }
}
