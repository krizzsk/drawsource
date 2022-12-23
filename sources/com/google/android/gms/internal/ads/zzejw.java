package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzejw implements zzeff {
    private final zzela zza;

    public zzejw(zzela zzela) {
        this.zza = zzela;
    }

    public final zzefg zza(String str, JSONObject jSONObject) throws zzfci {
        zzbvt zza2 = this.zza.zza(str);
        if (zza2 == null) {
            return null;
        }
        return new zzefg(zza2, new zzegz(), str);
    }
}
