package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzke {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Handler zzb;
    private final zzka zzc;
    private final AudioManager zzd;
    private zzkd zze;
    private int zzf = 3;
    private int zzg;
    private boolean zzh;

    public zzke(Context context, Handler handler, zzka zzka) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = handler;
        this.zzc = zzka;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        zzcw.zzb(audioManager);
        this.zzd = audioManager;
        this.zzg = zzg(audioManager, 3);
        this.zzh = zzi(this.zzd, this.zzf);
        zzkd zzkd = new zzkd(this, (zzkc) null);
        try {
            this.zza.registerReceiver(zzkd, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.zze = zzkd;
        } catch (RuntimeException e) {
            zzdn.zzb("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    private static int zzg(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            zzdn.zzb("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* access modifiers changed from: private */
    public final void zzh() {
        int zzg2 = zzg(this.zzd, this.zzf);
        boolean zzi = zzi(this.zzd, this.zzf);
        if (this.zzg != zzg2 || this.zzh != zzi) {
            this.zzg = zzg2;
            this.zzh = zzi;
            zzdm zzz = ((zzii) this.zzc).zza.zzl;
            zzz.zzd(30, new zzid(zzg2, zzi));
            zzz.zzc();
        }
    }

    private static boolean zzi(AudioManager audioManager, int i) {
        if (zzeg.zza >= 23) {
            return audioManager.isStreamMute(i);
        }
        return zzg(audioManager, i) == 0;
    }

    public final int zza() {
        return this.zzd.getStreamMaxVolume(this.zzf);
    }

    public final int zzb() {
        if (zzeg.zza >= 28) {
            return this.zzd.getStreamMinVolume(this.zzf);
        }
        return 0;
    }

    public final void zze() {
        zzkd zzkd = this.zze;
        if (zzkd != null) {
            try {
                this.zza.unregisterReceiver(zzkd);
            } catch (RuntimeException e) {
                zzdn.zzb("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.zze = null;
        }
    }

    public final void zzf(int i) {
        if (this.zzf != 3) {
            this.zzf = 3;
            zzh();
            zzii zzii = (zzii) this.zzc;
            zzr zzy = zzim.zzam(zzii.zza.zzz);
            if (!zzy.equals(zzii.zza.zzac)) {
                zzii.zza.zzac = zzy;
                zzdm zzz = zzii.zza.zzl;
                zzz.zzd(29, new zzie(zzy));
                zzz.zzc();
            }
        }
    }
}
