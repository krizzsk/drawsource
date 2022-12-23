package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzecm implements zzbst {
    zzecm() {
    }

    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzecn zzecn = (zzecn) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzecn.zzd.zzb());
        jSONObject2.put("signals", zzecn.zzc);
        jSONObject3.put("body", zzecn.zzb.zzc);
        jSONObject3.put("headers", zzaw.zzb().zzi(zzecn.zzb.zzb));
        jSONObject3.put("response_code", zzecn.zzb.zza);
        jSONObject3.put("latency", zzecn.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzecn.zzd.zzg());
        return jSONObject;
    }
}
