package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgj {
    private final AudioManager zza;
    private final zzgh zzb;
    private zzgi zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzgj(Context context, Handler handler, zzgi zzgi) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            this.zza = audioManager;
            this.zzc = zzgi;
            this.zzb = new zzgh(this, handler);
            this.zzd = 0;
            return;
        }
        throw null;
    }

    private final void zze() {
        if (this.zzd != 0) {
            if (zzeg.zza < 26) {
                this.zza.abandonAudioFocus(this.zzb);
            }
            zzg(0);
        }
    }

    private final void zzf(int i) {
        zzgi zzgi = this.zzc;
        if (zzgi != null) {
            zzii zzii = (zzii) zzgi;
            boolean zzq = zzii.zza.zzq();
            zzii.zza.zzau(zzq, i, zzim.zzah(zzq, i));
        }
    }

    private final void zzg(int i) {
        if (this.zzd != i) {
            this.zzd = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.zze != f) {
                this.zze = f;
                zzgi zzgi = this.zzc;
                if (zzgi != null) {
                    ((zzii) zzgi).zza.zzar();
                }
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }

    static /* bridge */ /* synthetic */ void zzc(zzgj zzgj, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzgj.zzg(3);
                return;
            }
            zzgj.zzf(0);
            zzgj.zzg(2);
        } else if (i == -1) {
            zzgj.zzf(-1);
            zzgj.zze();
        } else if (i != 1) {
            Log.w("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            zzgj.zzg(1);
            zzgj.zzf(1);
        }
    }
}
