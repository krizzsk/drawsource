package com.google.android.gms.ads.query;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.internal.ads.zzcfi;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public class AdInfo {
    private final QueryInfo zza;
    private final String zzb;

    public AdInfo(QueryInfo queryInfo, String str) {
        this.zza = queryInfo;
        this.zzb = str;
    }

    public static String getRequestId(String str) {
        if (str == null) {
            zzcfi.zzj("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
        } catch (JSONException unused) {
            zzcfi.zzj("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    public String getAdString() {
        return this.zzb;
    }

    public QueryInfo getQueryInfo() {
        return this.zza;
    }
}
