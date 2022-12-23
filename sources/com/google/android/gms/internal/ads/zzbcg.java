package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public interface zzbcg extends IInterface {
    zzbs zze() throws RemoteException;

    zzdh zzf() throws RemoteException;

    void zzg(boolean z) throws RemoteException;

    void zzh(zzde zzde) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, zzbcn zzbcn) throws RemoteException;

    void zzj(zzbck zzbck) throws RemoteException;
}
