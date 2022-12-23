package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdyg implements Runnable {
    public final /* synthetic */ zzdyh zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdyg(zzdyh zzdyh, String str) {
        this.zza = zzdyh;
        this.zzb = str;
    }

    public final void run() {
        zzdyh zzdyh = this.zza;
        zzdyj.zzj(zzdyh.zza, this.zzb);
    }
}
