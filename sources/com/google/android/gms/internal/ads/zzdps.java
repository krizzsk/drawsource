package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdps implements Callable {
    public final /* synthetic */ zzdpu zza;
    public final /* synthetic */ zzfbx zzb;
    public final /* synthetic */ zzfbl zzc;
    public final /* synthetic */ JSONObject zzd;

    public /* synthetic */ zzdps(zzdpu zzdpu, zzfbx zzfbx, zzfbl zzfbl, JSONObject jSONObject) {
        this.zza = zzdpu;
        this.zzb = zzfbx;
        this.zzc = zzfbl;
        this.zzd = jSONObject;
    }

    public final Object call() {
        zzfbx zzfbx = this.zzb;
        zzfbl zzfbl = this.zzc;
        JSONObject jSONObject = this.zzd;
        zzdnh zzdnh = new zzdnh();
        zzdnh.zzV(jSONObject.optInt(ReportDBAdapter.ReportColumns.COLUMN_TEMPATE_ID, -1));
        zzdnh.zzI(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdnh.zzS(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzfcd zzfcd = zzfbx.zza.zza;
        if (zzfcd.zzg.contains(Integer.toString(zzdnh.zzc()))) {
            if (zzdnh.zzc() == 3) {
                if (zzdnh.zzy() == null) {
                    throw new zzeit(1, "No custom template id for custom template ad response.");
                } else if (!zzfcd.zzh.contains(zzdnh.zzy())) {
                    throw new zzeit(1, "Unexpected custom template id in the response.");
                }
            }
            zzdnh.zzT(jSONObject.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzfbl.zzN) {
                zzt.zzp();
                optString = zzs.zzv() + " : " + optString;
            }
            zzdnh.zzU("headline", optString);
            zzdnh.zzU("body", jSONObject.optString("body", (String) null));
            zzdnh.zzU("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzdnh.zzU(TapjoyConstants.TJC_STORE, jSONObject.optString(TapjoyConstants.TJC_STORE, (String) null));
            zzdnh.zzU("price", jSONObject.optString("price", (String) null));
            zzdnh.zzU(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, jSONObject.optString(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, (String) null));
            return zzdnh;
        }
        throw new zzeit(1, "Invalid template ID: " + zzdnh.zzc());
    }
}
