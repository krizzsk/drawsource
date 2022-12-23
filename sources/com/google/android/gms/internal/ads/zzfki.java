package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfki {
    private final BlockingQueue zza = new LinkedBlockingQueue();
    private final ThreadPoolExecutor zzb = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.zza);
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfkh zzd = null;

    private final void zzc() {
        zzfkh zzfkh = (zzfkh) this.zzc.poll();
        this.zzd = zzfkh;
        if (zzfkh != null) {
            zzfkh.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfkh zzfkh) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfkh zzfkh) {
        zzfkh.zzb(this);
        this.zzc.add(zzfkh);
        if (this.zzd == null) {
            zzc();
        }
    }
}
