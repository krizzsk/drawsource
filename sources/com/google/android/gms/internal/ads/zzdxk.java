package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzdxk {
    /* access modifiers changed from: private */
    public Long zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public Integer zzd;
    /* access modifiers changed from: private */
    public String zze;
    /* access modifiers changed from: private */
    public Integer zzf;

    /* synthetic */ zzdxk(String str, zzdxj zzdxj) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdxk zzdxk) {
        String str = (String) zzay.zzc().zzb(zzbhz.zzhV);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdxk.zza);
            jSONObject.put("eventCategory", zzdxk.zzb);
            jSONObject.putOpt("event", zzdxk.zzc);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, zzdxk.zzd);
            jSONObject.putOpt("rewardType", zzdxk.zze);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, zzdxk.zzf);
        } catch (JSONException unused) {
            zze.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
