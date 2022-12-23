package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgh implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzgj zza;
    private final Handler zzb;

    public zzgh(zzgj zzgj, Handler handler) {
        this.zza = zzgj;
        this.zzb = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.zzb.post(new zzgg(this, i));
    }
}
