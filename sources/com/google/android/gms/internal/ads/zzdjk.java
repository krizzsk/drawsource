package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdjk {
    private final List zza;
    private final zzfii zzb;
    private boolean zzc;

    public zzdjk(zzfbl zzfbl, zzfii zzfii) {
        this.zza = zzfbl.zzq;
        this.zzb = zzfii;
    }

    public final void zza() {
        if (!this.zzc) {
            this.zzb.zzd(this.zza);
            this.zzc = true;
        }
    }
}
