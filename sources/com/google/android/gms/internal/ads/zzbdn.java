package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final /* synthetic */ class zzbdn implements Runnable {
    public final /* synthetic */ zzbds zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzbdn(zzbds zzbds, Context context) {
        this.zza = zzbds;
        this.zzb = context;
    }

    public final void run() {
        this.zza.zzb(this.zzb);
    }
}
