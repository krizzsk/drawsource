package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdmq implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzdmq(zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcfo zza2 = ((zzcnv) this.zza).zza();
        zzt.zzp();
        return new zzbaj(UUID.randomUUID().toString(), zza2, "native", new JSONObject(), false, true);
    }
}
