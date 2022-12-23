package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbqd implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcga zza;
    final /* synthetic */ zzbqf zzb;

    zzbqd(zzbqf zzbqf, zzcga zzcga) {
        this.zzb = zzbqf;
        this.zza = zzcga;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzd(this.zzb.zza.zzp());
        } catch (DeadObjectException e) {
            this.zza.zze(e);
        }
    }

    public final void onConnectionSuspended(int i) {
        zzcga zzcga = this.zza;
        zzcga.zze(new RuntimeException("onConnectionSuspended: " + i));
    }
}
