package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdwc;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzi implements Runnable {
    public final /* synthetic */ zzaa zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzdwc zzd;

    public /* synthetic */ zzi(zzaa zzaa, String str, String str2, zzdwc zzdwc) {
        this.zza = zzaa;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzdwc;
    }

    public final void run() {
        this.zza.zzI(this.zzb, this.zzc, this.zzd);
    }
}
