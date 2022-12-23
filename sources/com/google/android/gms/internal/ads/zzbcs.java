package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbcs implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbcu zza;

    zzbcs(zzbcu zzbcu) {
        this.zza = zzbcu;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzb) {
            try {
                zzbcu zzbcu = this.zza;
                if (zzbcu.zzc != null) {
                    zzbcu.zze = zzbcu.zzc.zzq();
                }
            } catch (DeadObjectException e) {
                zze.zzh("Unable to obtain a cache service instance.", e);
                zzbcu.zzh(this.zza);
            }
            this.zza.zzb.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzb) {
            this.zza.zze = null;
            this.zza.zzb.notifyAll();
        }
    }
}
