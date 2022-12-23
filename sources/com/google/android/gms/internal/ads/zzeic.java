package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzeic extends zzbvm {
    final /* synthetic */ zzeid zza;
    private final zzefg zzb;

    /* synthetic */ zzeic(zzeid zzeid, zzefg zzefg, zzeib zzeib) {
        this.zza = zzeid;
        this.zzb = zzefg;
    }

    public final void zze(String str) throws RemoteException {
        ((zzegz) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzegz) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(zzbup zzbup) throws RemoteException {
        this.zza.zzc = zzbup;
        ((zzegz) this.zzb.zzc).zzo();
    }
}
