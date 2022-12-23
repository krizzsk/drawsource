package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgmm extends zzgja {
    final zzgmq zza = new zzgmq(this.zzc, (zzgmp) null);
    zzgjc zzb = zzb();
    final /* synthetic */ zzgms zzc;

    zzgmm(zzgms zzgms) {
        this.zzc = zzgms;
    }

    private final zzgjc zzb() {
        zzgmq zzgmq = this.zza;
        if (zzgmq.hasNext()) {
            return zzgmq.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final byte zza() {
        zzgjc zzgjc = this.zzb;
        if (zzgjc != null) {
            byte zza2 = zzgjc.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza2;
        }
        throw new NoSuchElementException();
    }
}
