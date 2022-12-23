package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcsn {
    private final Map zza;
    private final Map zzb;

    zzcsn(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfbx zzfbx) throws Exception {
        for (zzfbv zzfbv : zzfbx.zzb.zzc) {
            if (this.zza.containsKey(zzfbv.zza)) {
                ((zzcsq) this.zza.get(zzfbv.zza)).zza(zzfbv.zzb);
            } else if (this.zzb.containsKey(zzfbv.zza)) {
                zzcsp zzcsp = (zzcsp) this.zzb.get(zzfbv.zza);
                JSONObject jSONObject = zzfbv.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcsp.zza(hashMap);
            }
        }
    }
}
