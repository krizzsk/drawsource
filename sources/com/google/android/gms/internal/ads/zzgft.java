package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgft extends zzgkm implements zzgmb {
    private zzgft() {
        super(zzgfw.zzb);
    }

    public final zzgft zza(zzgfv zzgfv) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgfw.zzj((zzgfw) this.zza, zzgfv);
        return this;
    }

    public final zzgft zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfw) this.zza).zze = i;
        return this;
    }

    public final List zzc() {
        return Collections.unmodifiableList(((zzgfw) this.zza).zzh());
    }

    /* synthetic */ zzgft(zzgfs zzgfs) {
        super(zzgfw.zzb);
    }
}
