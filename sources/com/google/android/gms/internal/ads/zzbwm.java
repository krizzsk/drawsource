package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbwm implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwn zza;

    zzbwm(zzbwn zzbwn) {
        this.zza = zzbwn;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
