package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbdh implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcga zza;
    final /* synthetic */ zzbdi zzb;

    zzbdh(zzbdi zzbdi, zzcga zzcga) {
        this.zzb = zzbdi;
        this.zza = zzcga;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zze(new RuntimeException("Connection failed."));
        }
    }
}
