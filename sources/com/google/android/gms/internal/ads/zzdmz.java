package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdmz implements Runnable {
    public final /* synthetic */ zzdnc zza;
    public final /* synthetic */ zzdpc zzb;

    public /* synthetic */ zzdmz(zzdnc zzdnc, zzdpc zzdpc) {
        this.zza = zzdnc;
        this.zzb = zzdpc;
    }

    public final void run() {
        this.zza.zzt(this.zzb);
    }
}
