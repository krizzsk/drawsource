package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzxb implements zzxa {
    private final WindowManager zza;

    private zzxb(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzxa zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzxb(windowManager);
        }
        return null;
    }

    public final void zza() {
    }

    public final void zzb(zzwy zzwy) {
        zzxe.zzb(zzwy.zza, this.zza.getDefaultDisplay());
    }
}
