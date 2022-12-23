package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbwr implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbws zza;

    zzbwr(zzbws zzbws) {
        this.zza = zzbws;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
