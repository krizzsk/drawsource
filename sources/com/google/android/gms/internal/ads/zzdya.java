package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdya implements Runnable {
    public final /* synthetic */ zzdyj zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ zzcga zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzfhh zzf;

    public /* synthetic */ zzdya(zzdyj zzdyj, Object obj, zzcga zzcga, String str, long j, zzfhh zzfhh) {
        this.zza = zzdyj;
        this.zzb = obj;
        this.zzc = zzcga;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzfhh;
    }

    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
