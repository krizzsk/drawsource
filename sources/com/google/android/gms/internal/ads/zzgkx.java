package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgkx extends AbstractList {
    private final List zza;
    private final zzgkw zzb;

    public zzgkx(List list, zzgkw zzgkw) {
        this.zza = list;
        this.zzb = zzgkw;
    }

    public final Object get(int i) {
        zzbek zzb2 = zzbek.zzb(((Integer) this.zza.get(i)).intValue());
        return zzb2 == null ? zzbek.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
    }

    public final int size() {
        return this.zza.size();
    }
}
