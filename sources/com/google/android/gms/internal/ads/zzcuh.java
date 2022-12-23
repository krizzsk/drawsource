package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcuh implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;

    public zzcuh(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzcyn) this.zza).zza();
        String str = (String) this.zzd.zzb();
        boolean equals = "native".equals(str);
        zzt.zzp();
        return new zzbaj(UUID.randomUUID().toString(), ((zzcnv) this.zzb).zza(), str, (JSONObject) this.zzc.zzb(), false, equals);
    }
}
