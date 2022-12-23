package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbok implements zzbom {
    zzbok() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        if (map.keySet().contains("start")) {
            zzcli.zzau(true);
        }
        if (map.keySet().contains("stop")) {
            zzcli.zzau(false);
        }
    }
}
