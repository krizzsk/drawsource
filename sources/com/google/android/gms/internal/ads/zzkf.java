package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzkf {
    private final PowerManager zza;

    public zzkf(Context context) {
        this.zza = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
