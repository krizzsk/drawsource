package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdpu {
    private final zzfvm zza;
    private final zzdqh zzb;
    private final zzdqm zzc;

    public zzdpu(zzfvm zzfvm, zzdqh zzdqh, zzdqm zzdqm) {
        this.zza = zzfvm;
        this.zzb = zzdqh;
        this.zzc = zzdqm;
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl, JSONObject jSONObject) {
        zzfvl zzn;
        zzfbx zzfbx2 = zzfbx;
        zzfbl zzfbl2 = zzfbl;
        JSONObject jSONObject2 = jSONObject;
        zzfvl zzb2 = this.zza.zzb(new zzdps(this, zzfbx2, zzfbl2, jSONObject2));
        zzfvl zzf = this.zzb.zzf(jSONObject2, "images");
        zzfvl zzg = this.zzb.zzg(jSONObject2, "images", zzfbl2, zzfbx2.zzb.zzb);
        zzfvl zze = this.zzb.zze(jSONObject2, "secondary_image");
        zzfvl zze2 = this.zzb.zze(jSONObject2, "app_icon");
        zzfvl zzd = this.zzb.zzd(jSONObject2, "attribution");
        zzfvl zzh = this.zzb.zzh(jSONObject2, zzfbl2, zzfbx2.zzb.zzb);
        zzdqh zzdqh = this.zzb;
        if (!jSONObject2.optBoolean("enable_omid")) {
            zzn = zzfvc.zzi((Object) null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzfvc.zzi((Object) null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzfvc.zzi((Object) null);
                } else {
                    zzn = zzfvc.zzn(zzfvc.zzi((Object) null), new zzdpw(zzdqh, optString), zzcfv.zze);
                }
            }
        }
        zzfvl zzfvl = zzn;
        zzfvl zza2 = this.zzc.zza(jSONObject2, "custom_assets");
        return zzfvc.zzb(zzb2, zzf, zzg, zze, zze2, zzd, zzh, zzfvl, zza2).zza(new zzdpt(this, zzb2, zzf, zze2, zze, zzd, jSONObject, zzh, zzg, zzfvl, zza2), this.zza);
    }
}
