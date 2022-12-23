package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdpy implements zzfok {
    public final /* synthetic */ zzdqh zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdpy(zzdqh zzdqh, JSONObject jSONObject) {
        this.zza = zzdqh;
        this.zzb = jSONObject;
    }

    public final Object apply(Object obj) {
        return this.zza.zza(this.zzb, (List) obj);
    }
}
