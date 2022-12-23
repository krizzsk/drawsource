package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzebl implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzebl(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
    }

    /* renamed from: zza */
    public final zzebk zzb() {
        Map zzd = ((zzgrb) this.zza).zzd();
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        return new zzebk(zzd, zzfvm, ((zzden) this.zzc).zzb());
    }
}
