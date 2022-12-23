package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdye implements Runnable {
    public final /* synthetic */ zzdyj zza;
    public final /* synthetic */ zzfcy zzb;
    public final /* synthetic */ zzbqk zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ String zze;

    public /* synthetic */ zzdye(zzdyj zzdyj, zzfcy zzfcy, zzbqk zzbqk, List list, String str) {
        this.zza = zzdyj;
        this.zzb = zzfcy;
        this.zzc = zzbqk;
        this.zzd = list;
        this.zze = str;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
