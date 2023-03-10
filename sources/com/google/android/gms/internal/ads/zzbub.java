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
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbub extends zzaqw implements zzbud {
    zzbub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zzA(zzl zzl, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzB(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbug zzbug) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzl);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbug);
        zzbl(32, zza);
    }

    public final void zzC(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(21, zza);
    }

    public final void zzD() throws RemoteException {
        zzbl(8, zza());
    }

    public final void zzE() throws RemoteException {
        zzbl(9, zza());
    }

    public final void zzF(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzd(zza, z);
        zzbl(25, zza);
    }

    public final void zzG() throws RemoteException {
        zzbl(4, zza());
    }

    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(37, zza);
    }

    public final void zzI(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(30, zza);
    }

    public final void zzJ() throws RemoteException {
        zzbl(12, zza());
    }

    public final boolean zzK() throws RemoteException {
        Parcel zzbk = zzbk(22, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzL() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbul zzM() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 15
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbul
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbul r1 = (com.google.android.gms.internal.ads.zzbul) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbul r2 = new com.google.android.gms.internal.ads.zzbul
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbub.zzM():com.google.android.gms.internal.ads.zzbul");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbum zzN() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 16
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbum
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbum r1 = (com.google.android.gms.internal.ads.zzbum) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbum r2 = new com.google.android.gms.internal.ads.zzbum
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbub.zzN():com.google.android.gms.internal.ads.zzbum");
    }

    public final Bundle zze() throws RemoteException {
        throw null;
    }

    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    public final zzdk zzh() throws RemoteException {
        Parcel zzbk = zzbk(26, zza());
        zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzblv zzi() throws RemoteException {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbuj zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 36
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbuj
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbuj r1 = (com.google.android.gms.internal.ads.zzbuj) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbuh r2 = new com.google.android.gms.internal.ads.zzbuh
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbub.zzj():com.google.android.gms.internal.ads.zzbuj");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbup zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 27
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbup
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbup r1 = (com.google.android.gms.internal.ads.zzbup) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbun r2 = new com.google.android.gms.internal.ads.zzbun
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbub.zzk():com.google.android.gms.internal.ads.zzbup");
    }

    public final zzbwg zzl() throws RemoteException {
        Parcel zzbk = zzbk(33, zza());
        zzbwg zzbwg = (zzbwg) zzaqy.zza(zzbk, zzbwg.CREATOR);
        zzbk.recycle();
        return zzbwg;
    }

    public final zzbwg zzm() throws RemoteException {
        Parcel zzbk = zzbk(34, zza());
        zzbwg zzbwg = (zzbwg) zzaqy.zza(zzbk, zzbwg.CREATOR);
        zzbk.recycle();
        return zzbwg;
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final void zzo() throws RemoteException {
        zzbl(5, zza());
    }

    public final void zzp(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzcaw zzcaw, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzl);
        zza.writeString((String) null);
        zzaqy.zzg(zza, zzcaw);
        zza.writeString(str2);
        zzbl(10, zza);
    }

    public final void zzq(IObjectWrapper iObjectWrapper, zzbqk zzbqk, List list) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbqk);
        zza.writeTypedList(list);
        zzbl(31, zza);
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzcaw zzcaw, List list) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzcaw);
        zza.writeStringList(list);
        zzbl(23, zza);
    }

    public final void zzs(zzl zzl, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzl);
        zza.writeString(str);
        zzbl(11, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, zzbug zzbug) throws RemoteException {
        throw null;
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbug zzbug) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzq);
        zzaqy.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zzg(zza, zzbug);
        zzbl(6, zza);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbug zzbug) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzq);
        zzaqy.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zzg(zza, zzbug);
        zzbl(35, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbug zzbug) throws RemoteException {
        throw null;
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbug zzbug) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zzg(zza, zzbug);
        zzbl(7, zza);
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbug zzbug, zzbkp zzbkp, List list) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zzg(zza, zzbug);
        zzaqy.zze(zza, zzbkp);
        zza.writeStringList(list);
        zzbl(14, zza);
    }

    public final void zzz(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbug zzbug) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzl);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbug);
        zzbl(28, zza);
    }
}
