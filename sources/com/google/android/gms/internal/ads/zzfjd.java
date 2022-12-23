package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfjd extends BroadcastReceiver {
    final /* synthetic */ zzfje zza;

    zzfjd(zzfje zzfje) {
        this.zza = zzfje;
    }

    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent != null) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                zzfje.zzb(this.zza, true);
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                zzfje.zzb(this.zza, false);
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                zzfje.zzb(this.zza, false);
            }
        }
    }
}
