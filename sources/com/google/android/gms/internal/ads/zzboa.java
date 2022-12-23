package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzboa implements zzbom {
    zzboa() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcli zzcli = (zzcli) obj;
        zzbko zzM = zzcli.zzM();
        if (zzM == null || (zza = zzM.zza()) == null) {
            zzcli.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcli.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
