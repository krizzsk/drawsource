package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzkd extends BroadcastReceiver {
    final /* synthetic */ zzke zza;

    /* synthetic */ zzkd(zzke zzke, zzkc zzkc) {
        this.zza = zzke;
    }

    public final void onReceive(Context context, Intent intent) {
        zzke zzke = this.zza;
        zzke.zzb.post(new zzkb(zzke));
    }
}
