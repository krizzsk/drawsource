package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfkc implements Runnable {
    zzfkc() {
    }

    public final void run() {
        if (zzfkf.zzc != null) {
            zzfkf.zzc.post(zzfkf.zzd);
            zzfkf.zzc.postDelayed(zzfkf.zze, 200);
        }
    }
}
