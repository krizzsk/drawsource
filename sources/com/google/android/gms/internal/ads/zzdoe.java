package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdoe implements Runnable {
    public final /* synthetic */ zzdoh zza;
    public final /* synthetic */ ViewGroup zzb;

    public /* synthetic */ zzdoe(zzdoh zzdoh, ViewGroup viewGroup) {
        this.zza = zzdoh;
        this.zzb = viewGroup;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
