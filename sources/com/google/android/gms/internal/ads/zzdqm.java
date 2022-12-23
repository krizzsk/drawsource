package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdqm {
    private final Executor zza;
    private final zzdqh zzb;

    public zzdqm(Executor executor, zzdqh zzdqh) {
        this.zza = executor;
        this.zzb = zzdqh;
    }

    public final zzfvl zza(JSONObject jSONObject, String str) {
        zzfvl zzfvl;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfvc.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zzfvl = zzfvc.zzi((Object) null);
            } else {
                String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzfvl = zzfvc.zzi((Object) null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzfvl = zzfvc.zzi(new zzdql(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzfvl = zzfvc.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzdqj(optString), this.zza);
                    } else {
                        zzfvl = zzfvc.zzi((Object) null);
                    }
                }
            }
            arrayList.add(zzfvl);
        }
        return zzfvc.zzm(zzfvc.zze(arrayList), zzdqk.zza, this.zza);
    }
}
