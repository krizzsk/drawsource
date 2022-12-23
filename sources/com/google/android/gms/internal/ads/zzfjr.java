package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfjr implements Runnable {
    final /* synthetic */ zzfjs zza;
    private final WebView zzb = this.zza.zza;

    zzfjr(zzfjs zzfjs) {
        this.zza = zzfjs;
    }

    public final void run() {
        this.zzb.destroy();
    }
}
