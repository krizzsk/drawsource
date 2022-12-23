package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zze implements Runnable {
    public final /* synthetic */ zzdwm zza;
    public final /* synthetic */ zzdwc zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Pair[] zzd;

    public /* synthetic */ zze(zzdwm zzdwm, zzdwc zzdwc, String str, Pair[] pairArr) {
        this.zza = zzdwm;
        this.zzb = zzdwc;
        this.zzc = str;
        this.zzd = pairArr;
    }

    public final void run() {
        Map map;
        zzdwm zzdwm = this.zza;
        zzdwc zzdwc = this.zzb;
        String str = this.zzc;
        Pair[] pairArr = this.zzd;
        if (zzdwc == null) {
            map = zzdwm.zzc();
        } else {
            map = zzdwc.zza();
        }
        map.put("action", str);
        for (Pair pair : pairArr) {
            map.put((String) pair.first, (String) pair.second);
        }
        zzdwm.zze(map);
    }
}
