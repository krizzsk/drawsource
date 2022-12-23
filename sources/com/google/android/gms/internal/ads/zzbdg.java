package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbdg implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbcy zza;
    final /* synthetic */ zzcga zzb;
    final /* synthetic */ zzbdi zzc;

    zzbdg(zzbdi zzbdi, zzbcy zzbcy, zzcga zzcga) {
        this.zzc = zzbdi;
        this.zza = zzbcy;
        this.zzb = zzcga;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzbdi zzbdi = this.zzc;
            if (!zzbdi.zzb) {
                zzbdi.zzb = true;
                zzbcx zza2 = this.zzc.zza;
                if (zza2 != null) {
                    zzfvl zza3 = zzcfv.zza.zza(new zzbdd(this, zza2, this.zza, this.zzb));
                    zzcga zzcga = this.zzb;
                    zzcga.zzc(new zzbde(zzcga, zza3), zzcfv.zzf);
                }
            }
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
