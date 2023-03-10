package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfbh extends zzfko {
    final /* synthetic */ zzbw zza;
    final /* synthetic */ zzfbi zzb;

    zzfbh(zzfbi zzfbi, zzbw zzbw) {
        this.zzb = zzfbi;
        this.zza = zzbw;
    }

    public final void zzv() {
        if (this.zzb.zzd != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zze.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
