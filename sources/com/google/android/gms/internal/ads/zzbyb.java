package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbyb {
    public final boolean zza;
    public final String zzb;

    public zzbyb(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    public static zzbyb zza(JSONObject jSONObject) {
        return new zzbyb(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
