package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzdeh implements Runnable {
    private final WeakReference zza;

    /* synthetic */ zzdeh(zzdei zzdei, zzdeg zzdeg) {
        this.zza = new WeakReference(zzdei);
    }

    public final void run() {
        zzdei zzdei = (zzdei) this.zza.get();
        if (zzdei != null) {
            zzdei.zzo(zzdef.zza);
        }
    }
}
