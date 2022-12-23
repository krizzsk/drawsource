package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzccq implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzccq(zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
    }

    /* renamed from: zza */
    public final zzccp zzb() {
        return new zzccp((Clock) this.zza.zzb(), (zzccn) this.zzb.zzb());
    }
}
