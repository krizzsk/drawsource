package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgqy extends zzgqq {
    private static final zzgrh zza = zzgqv.zza(Collections.emptyMap());

    /* synthetic */ zzgqy(Map map, zzgqw zzgqw) {
        super(map);
    }

    public static zzgqx zzc(int i) {
        return new zzgqx(i, (zzgqw) null);
    }

    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzgqr.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzgrh) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
