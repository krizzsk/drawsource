package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzepf implements zzetg {
    private final zzfvm zza;
    private final Context zzb;

    public zzepf(zzfvm zzfvm, Context context) {
        this.zza = zzfvm;
        this.zzb = context;
    }

    public final int zza() {
        return 13;
    }

    public final zzfvl zzb() {
        return this.zza.zzb(new zzepe(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzepg zzc() throws Exception {
        int i;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i2 = -1;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zziq)).booleanValue()) {
            i = zzt.zzq().zzi(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
        }
        return new zzepg(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
    }
}
