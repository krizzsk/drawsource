package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbwl implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwn zza;

    zzbwl(zzbwn zzbwn) {
        this.zza = zzbwn;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent zzb = this.zza.zzb();
        zzt.zzp();
        zzs.zzI(this.zza.zzb, zzb);
    }
}
