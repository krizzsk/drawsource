package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzxm implements Runnable {
    public final /* synthetic */ zzxp zza;
    public final /* synthetic */ zzad zzb;
    public final /* synthetic */ zzgm zzc;

    public /* synthetic */ zzxm(zzxp zzxp, zzad zzad, zzgm zzgm) {
        this.zza = zzxp;
        this.zzb = zzad;
        this.zzc = zzgm;
    }

    public final void run() {
        this.zza.zzl(this.zzb, this.zzc);
    }
}
