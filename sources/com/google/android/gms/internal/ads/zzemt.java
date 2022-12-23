package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzemt implements zzdbw {
    public final /* synthetic */ zzemh zza;
    public final /* synthetic */ zzbrb zzb;

    public /* synthetic */ zzemt(zzemh zzemh, zzbrb zzbrb) {
        this.zza = zzemh;
        this.zzb = zzbrb;
    }

    public final void zza(zze zze) {
        zzemh zzemh = this.zza;
        zzbrb zzbrb = this.zzb;
        zzemh.zza(zze);
        if (zzbrb != null) {
            try {
                zzbrb.zzf(zze);
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
        if (zzbrb != null) {
            try {
                zzbrb.zze(zze.zza);
            } catch (RemoteException e2) {
                zzcfi.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
