package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcbb;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbh;
import com.google.android.gms.internal.ads.zzcbl;
import com.google.android.gms.internal.ads.zzcbm;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzew extends zzcbd {
    private static void zzr(zzcbl zzcbl) {
        zzcfi.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcfb.zza.post(new zzev(zzcbl));
    }

    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    public final zzdh zzc() {
        return null;
    }

    public final zzcbb zzd() {
        return null;
    }

    public final String zze() throws RemoteException {
        return "";
    }

    public final void zzf(zzl zzl, zzcbl zzcbl) throws RemoteException {
        zzr(zzcbl);
    }

    public final void zzg(zzl zzl, zzcbl zzcbl) throws RemoteException {
        zzr(zzcbl);
    }

    public final void zzh(boolean z) {
    }

    public final void zzi(zzdb zzdb) throws RemoteException {
    }

    public final void zzj(zzde zzde) {
    }

    public final void zzk(zzcbh zzcbh) throws RemoteException {
    }

    public final void zzl(zzcbs zzcbs) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    public final boolean zzo() throws RemoteException {
        return false;
    }

    public final void zzp(zzcbm zzcbm) throws RemoteException {
    }
}
