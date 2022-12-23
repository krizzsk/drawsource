package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzoj extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzom zza;
    final /* synthetic */ zzok zzb;

    zzoj(zzok zzok, zzom zzom) {
        this.zzb = zzok;
        this.zza = zzom;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzcw.zzf(audioTrack == this.zzb.zza.zzq);
        zzom zzom = this.zzb.zza;
        if (zzom.zzn != null && zzom.zzO) {
            zzom.zzn.zzb();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzcw.zzf(audioTrack == this.zzb.zza.zzq);
        zzom zzom = this.zzb.zza;
        if (zzom.zzn != null && zzom.zzO) {
            zzom.zzn.zzb();
        }
    }
}
