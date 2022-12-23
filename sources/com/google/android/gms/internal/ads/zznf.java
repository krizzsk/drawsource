package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zznf implements Runnable {
    public final /* synthetic */ zznj zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zznf(zznj zznj, Exception exc) {
        this.zza = zznj;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzi(this.zzb);
    }
}
