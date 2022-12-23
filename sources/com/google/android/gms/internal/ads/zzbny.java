package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbny implements zzbom {
    public static final /* synthetic */ zzbny zza = new zzbny();

    private /* synthetic */ zzbny() {
    }

    public final void zza(Object obj, Map map) {
        zzcmj zzcmj = (zzcmj) obj;
        zzbom zzbom = zzbol.zza;
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgT)).booleanValue()) {
            zze.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get(CampaignEx.JSON_KEY_PACKAGE_NAME);
        if (TextUtils.isEmpty(str)) {
            zze.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzcmj.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        zze.zza("/canOpenApp;" + str + ";" + valueOf);
        ((zzbrd) zzcmj).zzd("openableApp", hashMap);
    }
}
