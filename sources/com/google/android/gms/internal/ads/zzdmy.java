package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdmy implements Runnable {
    public final /* synthetic */ zzdnc zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzdmy(zzdnc zzdnc, boolean z) {
        this.zza = zzdnc;
        this.zzb = z;
    }

    public final void run() {
        this.zza.zzs(this.zzb);
    }
}
