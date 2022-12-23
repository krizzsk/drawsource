package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbtt {
    private static zzbtt zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbtt() {
    }

    public static zzbtt zza() {
        if (zza == null) {
            zza = new zzbtt();
        }
        return zza;
    }

    public final Thread zzb(Context context, String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzbts(this, context, str));
        thread.start();
        return thread;
    }
}
