package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbnn implements zzbom {
    private final zzbno zza;

    public zzbnn(zzbno zzbno) {
        this.zza = zzbno;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zze.zzj("App event with no name parameter.");
        } else {
            this.zza.zzbD(str, (String) map.get(TJAdUnitConstants.String.VIDEO_INFO));
        }
    }
}
