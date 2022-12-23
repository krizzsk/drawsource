package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzejg implements zzeff {
    private final Map zza = new HashMap();
    private final zzduc zzb;

    public zzejg(zzduc zzduc) {
        this.zzb = zzduc;
    }

    public final zzefg zza(String str, JSONObject jSONObject) throws zzfci {
        zzefg zzefg;
        synchronized (this) {
            zzefg = (zzefg) this.zza.get(str);
            if (zzefg == null) {
                zzefg = new zzefg(this.zzb.zzc(str, jSONObject), new zzeha(), str);
                this.zza.put(str, zzefg);
            }
        }
        return zzefg;
    }
}
