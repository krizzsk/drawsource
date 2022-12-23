package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbru implements Runnable {
    public final /* synthetic */ zzbsm zza;
    public final /* synthetic */ zzbsl zzb;
    public final /* synthetic */ zzbrh zzc;

    public /* synthetic */ zzbru(zzbsm zzbsm, zzbsl zzbsl, zzbrh zzbrh) {
        this.zza = zzbsm;
        this.zzb = zzbsl;
        this.zzc = zzbrh;
    }

    public final void run() {
        this.zza.zzi(this.zzb, this.zzc);
    }
}
