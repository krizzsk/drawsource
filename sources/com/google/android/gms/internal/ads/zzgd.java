package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgd extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzgf zza;
    private final zzge zzb;
    private final Handler zzc;

    public zzgd(zzgf zzgf, Handler handler, zzge zzge) {
        this.zza = zzgf;
        this.zzc = handler;
        this.zzb = zzge;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    public final void run() {
    }
}
