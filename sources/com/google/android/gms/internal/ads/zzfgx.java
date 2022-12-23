package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import com.smaato.sdk.core.SmaatoSdk;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfgx {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfgx(Context context, zzcfo zzcfo) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzcfo.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        map.put("device", zzs.zzq());
        map.put(TapjoyConstants.TJC_APP_PLACEMENT, this.zzb);
        zzt.zzp();
        String str = "0";
        map.put("is_lite_sdk", true != zzs.zzA(this.zza) ? str : "1");
        List zzb2 = zzbhz.zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfR)).booleanValue()) {
            zzb2.addAll(zzt.zzo().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb2));
        map.put(SmaatoSdk.KEY_SDK_VERSION, this.zzc);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzix)).booleanValue()) {
            if (true == DeviceProperties.isBstar(this.zza)) {
                str = "1";
            }
            map.put("is_bstar", str);
        }
    }
}
