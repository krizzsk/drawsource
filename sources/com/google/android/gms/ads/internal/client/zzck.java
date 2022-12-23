package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbua;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzck extends zzaqw implements zzcm {
    zzck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final float zze() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final String zzf() throws RemoteException {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final List zzg() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        ArrayList<zzbqg> createTypedArrayList = zzbk.createTypedArrayList(zzbqg.CREATOR);
        zzbk.recycle();
        return createTypedArrayList;
    }

    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(10, zza);
    }

    public final void zzi() throws RemoteException {
        zzbl(15, zza());
    }

    public final void zzj() throws RemoteException {
        zzbl(1, zza());
    }

    public final void zzk(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString((String) null);
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(6, zza);
    }

    public final void zzl(zzcy zzcy) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcy);
        zzbl(16, zza);
    }

    public final void zzm(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzbl(5, zza);
    }

    public final void zzn(zzbua zzbua) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbua);
        zzbl(11, zza);
    }

    public final void zzo(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzd(zza, z);
        zzbl(4, zza);
    }

    public final void zzp(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzbl(2, zza);
    }

    public final void zzq(String str) throws RemoteException {
        throw null;
    }

    public final void zzr(zzbqn zzbqn) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbqn);
        zzbl(12, zza);
    }

    public final void zzs(zzez zzez) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzez);
        zzbl(14, zza);
    }

    public final boolean zzt() throws RemoteException {
        Parcel zzbk = zzbk(8, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
