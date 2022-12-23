package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfqw extends zzfqy {
    zzfqw() {
        super((zzfqw) null);
    }

    static final zzfqy zzf(int i) {
        return i < 0 ? zzfqy.zzb : i > 0 ? zzfqy.zzc : zzfqy.zza;
    }

    public final int zza() {
        return 0;
    }

    public final zzfqy zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    public final zzfqy zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    public final zzfqy zzd(boolean z, boolean z2) {
        return zzf(zzftn.zza(z, z2));
    }

    public final zzfqy zze(boolean z, boolean z2) {
        return zzf(zzftn.zza(false, false));
    }
}
