package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.CollectionUtils;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbot implements zzbom {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{MraidJsMethods.RESIZE, MraidJsMethods.PLAY_VIDEO, "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", MraidJsMethods.UNLOAD}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final zzb zzb;
    private final zzbwp zzc;
    private final zzbww zzd;

    public zzbot(zzb zzb2, zzbwp zzbwp, zzbww zzbww) {
        this.zzb = zzb2;
        this.zzc = zzbwp;
        this.zzd = zzbww;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.zzb.zzc()) {
                    this.zzb.zzb((String) null);
                    return;
                } else if (intValue == 1) {
                    this.zzc.zzb(map);
                    return;
                } else if (intValue == 3) {
                    new zzbws(zzcli, map).zzb();
                    return;
                } else if (intValue == 4) {
                    new zzbwn(zzcli, map).zzc();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (intValue != 7) {
                        zze.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzcli == null) {
            zze.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        zzcli.zzas(i);
    }
}
