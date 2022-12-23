package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzesd implements Callable {
    public final /* synthetic */ List zza;

    public /* synthetic */ zzesd(List list) {
        this.zza = list;
    }

    public final Object call() {
        List<zzfvl> list = this.zza;
        JSONArray jSONArray = new JSONArray();
        for (zzfvl zzfvl : list) {
            if (((JSONObject) zzfvl.get()) != null) {
                jSONArray.put(zzfvl.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzesh(jSONArray.toString());
    }
}
