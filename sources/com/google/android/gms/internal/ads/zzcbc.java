package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzcbc extends zzaqw implements zzcbe {
    zzcbc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public final Bundle zzb() throws RemoteException {
        Parcel zzbk = zzbk(9, zza());
        Bundle bundle = (Bundle) zzaqy.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    public final zzdh zzc() throws RemoteException {
        Parcel zzbk = zzbk(12, zza());
        zzdh zzb = zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzcbb zzd() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 11
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzcbb
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzcbb r1 = (com.google.android.gms.internal.ads.zzcbb) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzcaz r2 = new com.google.android.gms.internal.ads.zzcaz
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbc.zzd():com.google.android.gms.internal.ads.zzcbb");
    }

    public final String zze() throws RemoteException {
        throw null;
    }

    public final void zzf(zzl zzl, zzcbl zzcbl) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzl);
        zzaqy.zzg(zza, zzcbl);
        zzbl(1, zza);
    }

    public final void zzg(zzl zzl, zzcbl zzcbl) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzl);
        zzaqy.zzg(zza, zzcbl);
        zzbl(14, zza);
    }

    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzd(zza, z);
        zzbl(15, zza);
    }

    public final void zzi(zzdb zzdb) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzdb);
        zzbl(8, zza);
    }

    public final void zzj(zzde zzde) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzde);
        zzbl(13, zza);
    }

    public final void zzk(zzcbh zzcbh) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcbh);
        zzbl(2, zza);
    }

    public final void zzl(zzcbs zzcbs) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzcbs);
        zzbl(7, zza);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(5, zza);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    public final boolean zzo() throws RemoteException {
        throw null;
    }

    public final void zzp(zzcbm zzcbm) throws RemoteException {
        throw null;
    }
}
