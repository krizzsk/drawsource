package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbct implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbcu zza;

    zzbct(zzbcu zzbcu) {
        this.zza = zzbcu;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzb) {
            this.zza.zze = null;
            zzbcu zzbcu = this.zza;
            if (zzbcu.zzc != null) {
                zzbcu.zzc = null;
            }
            this.zza.zzb.notifyAll();
        }
    }
}
