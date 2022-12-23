package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdss implements Runnable {
    public final /* synthetic */ zzcli zza;

    public /* synthetic */ zzdss(zzcli zzcli) {
        this.zza = zzcli;
    }

    public final void run() {
        this.zza.destroy();
    }
}
