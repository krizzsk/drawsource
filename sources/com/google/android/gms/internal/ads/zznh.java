package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zznh implements Runnable {
    public final /* synthetic */ zznj zza;
    public final /* synthetic */ zzad zzb;
    public final /* synthetic */ zzgm zzc;

    public /* synthetic */ zznh(zznj zznj, zzad zzad, zzgm zzgm) {
        this.zza = zznj;
        this.zzb = zzad;
        this.zzc = zzgm;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
