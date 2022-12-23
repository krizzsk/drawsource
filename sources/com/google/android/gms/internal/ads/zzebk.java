package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzebk implements zzebm {
    private final Map zza;
    private final zzfvm zzb;
    /* access modifiers changed from: private */
    public final zzdem zzc;

    public zzebk(Map map, zzfvm zzfvm, zzdem zzdem) {
        this.zza = map;
        this.zzb = zzfvm;
        this.zzc = zzdem;
    }

    public final zzfvl zzb(zzbzv zzbzv) {
        this.zzc.zzbE(zzbzv);
        zzfvl zzh = zzfvc.zzh(new zzdzl(3));
        for (String trim : ((String) zzay.zzc().zzb(zzbhz.zzgS)).split(",")) {
            zzgrh zzgrh = (zzgrh) this.zza.get(trim.trim());
            if (zzgrh != null) {
                zzh = zzfvc.zzg(zzh, zzdzl.class, new zzebi(zzgrh, zzbzv), this.zzb);
            }
        }
        zzfvc.zzr(zzh, new zzebj(this), zzcfv.zzf);
        return zzh;
    }
}
