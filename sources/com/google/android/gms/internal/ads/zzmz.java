package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzmz implements Runnable {
    public final /* synthetic */ zznj zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzmz(zznj zznj, Exception exc) {
        this.zza = zznj;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzh(this.zzb);
    }
}
