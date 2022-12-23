package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfcz {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzfvm zzc;

    public zzfcz(Callable callable, zzfvm zzfvm) {
        this.zzb = callable;
        this.zzc = zzfvm;
    }

    public final synchronized zzfvl zza() {
        zzc(1);
        return (zzfvl) this.zza.poll();
    }

    public final synchronized void zzb(zzfvl zzfvl) {
        this.zza.addFirst(zzfvl);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
