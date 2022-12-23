package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzasr extends Thread {
    final /* synthetic */ AudioTrack zza;
    final /* synthetic */ zzatb zzb;

    zzasr(zzatb zzatb, AudioTrack audioTrack) {
        this.zzb = zzatb;
        this.zza = audioTrack;
    }

    public final void run() {
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            this.zzb.zze.open();
        }
    }
}
