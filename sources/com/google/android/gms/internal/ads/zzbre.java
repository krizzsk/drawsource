package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbre {
    public static void zza(zzbrf zzbrf, String str, Map map) {
        try {
            zzbrf.zze(str, zzaw.zzb().zzi(map));
        } catch (JSONException unused) {
            zze.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbrf zzbrf, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zze.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbrf.zza(sb.toString());
    }

    public static void zzc(zzbrf zzbrf, String str, String str2) {
        zzbrf.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbrf zzbrf, String str, JSONObject jSONObject) {
        zzbrf.zzb(str, jSONObject.toString());
    }
}
