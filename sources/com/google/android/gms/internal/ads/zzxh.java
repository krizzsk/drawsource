package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzxh implements Runnable {
    public final /* synthetic */ zzxp zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzxh(zzxp zzxp, Exception exc) {
        this.zza = zzxp;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
