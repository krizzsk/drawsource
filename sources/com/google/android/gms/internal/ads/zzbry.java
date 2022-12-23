package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbry implements zzbom {
    final /* synthetic */ zzbrh zza;
    final /* synthetic */ zzca zzb;
    final /* synthetic */ zzbsm zzc;

    zzbry(zzbsm zzbsm, zzaoc zzaoc, zzbrh zzbrh, zzca zzca) {
        this.zzc = zzbsm;
        this.zza = zzbrh;
        this.zzb = zzca;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbom, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzbsn zzbsn = (zzbsn) obj;
        synchronized (this.zzc.zza) {
            zze.zzi("JS Engine is requesting an update");
            if (this.zzc.zzi == 0) {
                zze.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd((zzaoc) null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
