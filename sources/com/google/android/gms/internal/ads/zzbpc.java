package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbpc implements zzbom {
    private final zzbpb zza;

    public zzbpc(zzbpb zzbpb) {
        this.zza = zzbpb;
    }

    public static void zzb(zzcli zzcli, zzbpb zzbpb) {
        zzcli.zzaf("/reward", new zzbpc(zzbpb));
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzcax zzcax = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzcax = new zzcax(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                zze.zzk("Unable to parse reward amount.", e);
            }
            this.zza.zza(zzcax);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
