package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzdyi extends zzbqj {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfhh zzd;
    final /* synthetic */ zzcga zze;
    final /* synthetic */ zzdyj zzf;

    zzdyi(zzdyj zzdyj, Object obj, String str, long j, zzfhh zzfhh, zzcga zzcga) {
        this.zzf = zzdyj;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfhh;
        this.zze = zzcga;
    }

    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (zzt.zzA().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfhu zze2 = this.zzf.zzp;
            zzfhh zzfhh = this.zzd;
            zzfhh.zze(false);
            zze2.zzb(zzfhh.zzj());
            this.zze.zzd(false);
        }
    }

    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (zzt.zzA().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfhu zze2 = this.zzf.zzp;
            zzfhh zzfhh = this.zzd;
            zzfhh.zze(true);
            zze2.zzb(zzfhh.zzj());
            this.zze.zzd(true);
        }
    }
}
