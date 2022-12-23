package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfje {
    private static final zzfje zza = new zzfje();
    private Context zzb;
    private BroadcastReceiver zzc;
    private boolean zzd;
    private boolean zze;
    private zzfjj zzf;

    private zzfje() {
    }

    public static zzfje zza() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzb(zzfje zzfje, boolean z) {
        if (zzfje.zze != z) {
            zzfje.zze = z;
            if (zzfje.zzd) {
                zzfje.zzh();
                if (zzfje.zzf == null) {
                    return;
                }
                if (zzfje.zzf()) {
                    zzfkf.zzd().zzi();
                } else {
                    zzfkf.zzd().zzh();
                }
            }
        }
    }

    private final void zzh() {
        boolean z = this.zze;
        for (zzfir zzg : zzfjc.zza().zzc()) {
            zzfjp zzg2 = zzg.zzg();
            if (zzg2.zzk()) {
                zzfji.zza().zzb(zzg2.zza(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    public final void zzc(Context context) {
        this.zzb = context.getApplicationContext();
    }

    public final void zzd() {
        this.zzc = new zzfjd(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.zzb.registerReceiver(this.zzc, intentFilter);
        this.zzd = true;
        zzh();
    }

    public final void zze() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.zzb;
        if (!(context == null || (broadcastReceiver = this.zzc) == null)) {
            context.unregisterReceiver(broadcastReceiver);
            this.zzc = null;
        }
        this.zzd = false;
        this.zze = false;
        this.zzf = null;
    }

    public final boolean zzf() {
        return !this.zze;
    }

    public final void zzg(zzfjj zzfjj) {
        this.zzf = zzfjj;
    }
}
