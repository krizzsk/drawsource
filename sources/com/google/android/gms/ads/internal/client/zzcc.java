package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcdz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public interface zzcc extends IInterface {
    zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbua zzbua, int i) throws RemoteException;

    zzbs zzc(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbua zzbua, int i) throws RemoteException;

    zzbs zzd(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbua zzbua, int i) throws RemoteException;

    zzbs zze(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbua zzbua, int i) throws RemoteException;

    zzbs zzf(IObjectWrapper iObjectWrapper, zzq zzq, String str, int i) throws RemoteException;

    zzcm zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    zzblf zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    zzbll zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    zzbpk zzj(IObjectWrapper iObjectWrapper, zzbua zzbua, int i, zzbph zzbph) throws RemoteException;

    zzbxl zzk(IObjectWrapper iObjectWrapper, zzbua zzbua, int i) throws RemoteException;

    zzbxv zzl(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzcao zzm(IObjectWrapper iObjectWrapper, zzbua zzbua, int i) throws RemoteException;

    zzcbe zzn(IObjectWrapper iObjectWrapper, String str, zzbua zzbua, int i) throws RemoteException;

    zzcdz zzo(IObjectWrapper iObjectWrapper, zzbua zzbua, int i) throws RemoteException;
}
