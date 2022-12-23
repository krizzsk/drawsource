package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzdxu extends zzcbk {
    final /* synthetic */ zzdxw zza;

    zzdxu(zzdxw zzdxw) {
        this.zza = zzdxw;
    }

    public final void zze(int i) throws RemoteException {
        zzdxw zzdxw = this.zza;
        zzdxw.zzc.zzm(zzdxw.zza, i);
    }

    public final void zzf(zze zze) throws RemoteException {
        zzdxw zzdxw = this.zza;
        zzdxw.zzc.zzm(zzdxw.zza, zze.zza);
    }

    public final void zzg() throws RemoteException {
        zzdxw zzdxw = this.zza;
        zzdxw.zzc.zzp(zzdxw.zza);
    }
}
