package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbim {
    private final Map zza = new HashMap();
    private final zzbio zzb;

    public zzbim(zzbio zzbio) {
        this.zzb = zzbio;
    }

    public final zzbio zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbil zzbil) {
        this.zza.put(str, zzbil);
    }

    public final void zzc(String str, String str2, long j) {
        zzbio zzbio = this.zzb;
        zzbil zzbil = (zzbil) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbil != null) {
            zzbio.zze(zzbil, j, strArr);
        }
        this.zza.put(str, new zzbil(j, (String) null, (zzbil) null));
    }
}
