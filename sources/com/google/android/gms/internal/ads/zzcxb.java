package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzcxb implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcxb(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    public final void run() {
        zzcxd.zzi(this.zza);
    }
}
