package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgre {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzgre(int i, int i2, zzgrd zzgrd) {
        this.zza = zzgqr.zzc(i);
        this.zzb = zzgqr.zzc(i2);
    }

    public final zzgre zza(zzgrh zzgrh) {
        this.zzb.add(zzgrh);
        return this;
    }

    public final zzgre zzb(zzgrh zzgrh) {
        this.zza.add(zzgrh);
        return this;
    }

    public final zzgrf zzc() {
        return new zzgrf(this.zza, this.zzb, (zzgrd) null);
    }
}
