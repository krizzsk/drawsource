package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgiy extends zzgja {
    final /* synthetic */ zzgji zza;
    private int zzb = 0;
    private final int zzc = this.zza.zzd();

    zzgiy(zzgji zzgji) {
        this.zza = zzgji;
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
