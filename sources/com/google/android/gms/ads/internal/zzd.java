package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzd implements zzfuj {
    public final /* synthetic */ zzfhu zza;
    public final /* synthetic */ zzfhh zzb;

    public /* synthetic */ zzd(zzfhu zzfhu, zzfhh zzfhh) {
        this.zza = zzfhu;
        this.zzb = zzfhh;
    }

    public final zzfvl zza(Object obj) {
        zzfhu zzfhu = this.zza;
        zzfhh zzfhh = this.zzb;
        JSONObject jSONObject = (JSONObject) obj;
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzt.zzo().zzh().zzu(jSONObject.getString("appSettingsJson"));
        }
        zzfhh.zze(optBoolean);
        zzfhu.zzb(zzfhh.zzj());
        return zzfvc.zzi((Object) null);
    }
}
