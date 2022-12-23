package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdse;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzl implements Runnable {
    public final /* synthetic */ zzaa zza;
    public final /* synthetic */ zzdse[] zzb;

    public /* synthetic */ zzl(zzaa zzaa, zzdse[] zzdseArr) {
        this.zza = zzaa;
        this.zzb = zzdseArr;
    }

    public final void run() {
        this.zza.zzH(this.zzb);
    }
}
