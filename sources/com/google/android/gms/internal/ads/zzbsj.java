package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbsj implements Runnable {
    public final /* synthetic */ zzbsk zza;
    public final /* synthetic */ zzbrh zzb;

    public /* synthetic */ zzbsj(zzbsk zzbsk, zzbrh zzbrh) {
        this.zza = zzbsk;
        this.zzb = zzbrh;
    }

    public final void run() {
        zzbrh zzbrh = this.zzb;
        zzbrh.zzr("/result", zzbol.zzo);
        zzbrh.zzc();
    }
}
