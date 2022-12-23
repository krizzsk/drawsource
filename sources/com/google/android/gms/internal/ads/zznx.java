package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zznx extends Thread {
    final /* synthetic */ AudioTrack zza;
    final /* synthetic */ zzom zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zznx(zzom zzom, String str, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.zzb = zzom;
        this.zza = audioTrack;
    }

    public final void run() {
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            this.zzb.zzf.open();
        }
    }
}
