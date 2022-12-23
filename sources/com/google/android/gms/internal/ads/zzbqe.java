package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbqe implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcga zza;

    zzbqe(zzbqf zzbqf, zzcga zzcga) {
        this.zza = zzcga;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zze(new RuntimeException("Connection failed."));
    }
}
