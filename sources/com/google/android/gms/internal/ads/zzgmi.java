package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgmi {
    private static final zzgmi zza = new zzgmi();
    private final zzgmu zzb = new zzgls();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzgmi() {
    }

    public static zzgmi zza() {
        return zza;
    }

    public final zzgmt zzb(Class cls) {
        zzgla.zzf(cls, "messageType");
        zzgmt zzgmt = (zzgmt) this.zzc.get(cls);
        if (zzgmt == null) {
            zzgmt = this.zzb.zza(cls);
            zzgla.zzf(cls, "messageType");
            zzgla.zzf(zzgmt, "schema");
            zzgmt zzgmt2 = (zzgmt) this.zzc.putIfAbsent(cls, zzgmt);
            return zzgmt2 == null ? zzgmt : zzgmt2;
        }
    }
}
