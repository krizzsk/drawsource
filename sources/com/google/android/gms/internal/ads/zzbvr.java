package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbvr extends zzaqw implements zzbvt {
    zzbvr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final zzdk zze() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzbwg zzf() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        zzbwg zzbwg = (zzbwg) zzaqy.zza(zzbk, zzbwg.CREATOR);
        zzbk.recycle();
        return zzbwg;
    }

    public final zzbwg zzg() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        zzbwg zzbwg = (zzbwg) zzaqy.zza(zzbk, zzbwg.CREATOR);
        zzbk.recycle();
        return zzbwg;
    }

    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzq zzq, zzbvw zzbvw) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzaqy.zze(zza, bundle);
        zzaqy.zze(zza, bundle2);
        zzaqy.zze(zza, zzq);
        zzaqy.zzg(zza, zzbvw);
        zzbl(1, zza);
    }

    public final void zzi(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvh zzbvh, zzbug zzbug, zzq zzq) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzl);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvh);
        zzaqy.zzg(zza, zzbug);
        zzaqy.zze(zza, zzq);
        zzbl(13, zza);
    }

    public final void zzj(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvh zzbvh, zzbug zzbug, zzq zzq) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzl);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvh);
        zzaqy.zzg(zza, zzbug);
        zzaqy.zze(zza, zzq);
        zzbl(21, zza);
    }

    public final void zzk(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvk zzbvk, zzbug zzbug) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzl);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvk);
        zzaqy.zzg(zza, zzbug);
        zzbl(14, zza);
    }

    public final void zzl(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvn zzbvn, zzbug zzbug) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzl);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvn);
        zzaqy.zzg(zza, zzbug);
        zzbl(18, zza);
    }

    public final void zzm(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvn zzbvn, zzbug zzbug, zzbkp zzbkp) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzl);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvn);
        zzaqy.zzg(zza, zzbug);
        zzaqy.zze(zza, zzbkp);
        zzbl(22, zza);
    }

    public final void zzn(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvq zzbvq, zzbug zzbug) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzl);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvq);
        zzaqy.zzg(zza, zzbug);
        zzbl(20, zza);
    }

    public final void zzo(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvq zzbvq, zzbug zzbug) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzl);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvq);
        zzaqy.zzg(zza, zzbug);
        zzbl(16, zza);
    }

    public final void zzp(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(19, zza);
    }

    public final boolean zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(15, zza);
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(17, zza);
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
