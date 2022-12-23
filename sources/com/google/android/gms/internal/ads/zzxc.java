package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzxc implements DisplayManager.DisplayListener, zzxa {
    private final DisplayManager zza;
    private zzwy zzb;

    private zzxc(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzxa zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzxc(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        zzwy zzwy = this.zzb;
        if (zzwy != null && i == 0) {
            zzxe.zzb(zzwy.zza, zzd());
        }
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    public final void zzb(zzwy zzwy) {
        this.zzb = zzwy;
        this.zza.registerDisplayListener(this, zzeg.zzC((Handler.Callback) null));
        zzxe.zzb(zzwy.zza, zzd());
    }
}
