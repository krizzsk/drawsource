package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public interface zzbvt extends IInterface {
    zzdk zze() throws RemoteException;

    zzbwg zzf() throws RemoteException;

    zzbwg zzg() throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzq zzq, zzbvw zzbvw) throws RemoteException;

    void zzi(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvh zzbvh, zzbug zzbug, zzq zzq) throws RemoteException;

    void zzj(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvh zzbvh, zzbug zzbug, zzq zzq) throws RemoteException;

    void zzk(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvk zzbvk, zzbug zzbug) throws RemoteException;

    void zzl(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvn zzbvn, zzbug zzbug) throws RemoteException;

    void zzm(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvn zzbvn, zzbug zzbug, zzbkp zzbkp) throws RemoteException;

    void zzn(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvq zzbvq, zzbug zzbug) throws RemoteException;

    void zzo(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvq zzbvq, zzbug zzbug) throws RemoteException;

    void zzp(String str) throws RemoteException;

    boolean zzq(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException;
}
