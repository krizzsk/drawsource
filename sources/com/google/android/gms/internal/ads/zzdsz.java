package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdsz implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdsz(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
    }

    public final /* synthetic */ Object zzb() {
        zzgrh zzgrh = this.zza;
        zzgrh zzgrh2 = this.zzb;
        int i = ((zzdbk) this.zzc).zza().zzo.zza;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            return ((zzeke) zzgrh2).zzb();
        } else {
            return ((zzeke) zzgrh).zzb();
        }
    }
}
