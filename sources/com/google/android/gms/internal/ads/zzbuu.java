package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzbuu implements InitializationCompleteCallback {
    final /* synthetic */ zzbqk zza;

    zzbuu(zzbuz zzbuz, zzbqk zzbqk) {
        this.zza = zzbqk;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }
}
