package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbkg {
    static final AtomicBoolean zza = new AtomicBoolean();
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();

    static zzbke zza() {
        return (zzbke) zzb.get();
    }

    static zzbkf zzb() {
        return (zzbkf) zzc.get();
    }

    public static void zzc(zzbke zzbke) {
        zzb.set(zzbke);
    }
}
