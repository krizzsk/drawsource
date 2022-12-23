package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzor implements zznn {
    final /* synthetic */ zzos zza;

    /* synthetic */ zzor(zzos zzos, zzoq zzoq) {
        this.zza = zzos;
    }

    public final void zza(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    public final void zzb() {
        zzos zzos = this.zza;
        if (zzos.zzl != null) {
            zzos.zzl.zzb();
        }
    }
}
