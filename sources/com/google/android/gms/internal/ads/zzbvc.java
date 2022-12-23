package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbvc extends zzbuf {
    private final Adapter zza;
    private final zzcaw zzb;

    zzbvc(Adapter adapter, zzcaw zzcaw) {
        this.zza = adapter;
        this.zzb = zzcaw;
    }

    public final void zze() throws RemoteException {
        zzcaw zzcaw = this.zzb;
        if (zzcaw != null) {
            zzcaw.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzf() throws RemoteException {
        zzcaw zzcaw = this.zzb;
        if (zzcaw != null) {
            zzcaw.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzg(int i) throws RemoteException {
        zzcaw zzcaw = this.zzb;
        if (zzcaw != null) {
            zzcaw.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    public final void zzh(zze zze) throws RemoteException {
    }

    public final void zzi(int i, String str) throws RemoteException {
    }

    public final void zzj(int i) throws RemoteException {
    }

    public final void zzk(zze zze) {
    }

    public final void zzl(String str) {
    }

    public final void zzm() throws RemoteException {
    }

    public final void zzn() throws RemoteException {
    }

    public final void zzo() throws RemoteException {
        zzcaw zzcaw = this.zzb;
        if (zzcaw != null) {
            zzcaw.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzp() throws RemoteException {
        zzcaw zzcaw = this.zzb;
        if (zzcaw != null) {
            zzcaw.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzq(String str, String str2) throws RemoteException {
    }

    public final void zzr(zzblv zzblv, String str) throws RemoteException {
    }

    public final void zzs(zzcax zzcax) throws RemoteException {
    }

    public final void zzt(zzcbb zzcbb) throws RemoteException {
        zzcaw zzcaw = this.zzb;
        if (zzcaw != null) {
            zzcaw.zzm(ObjectWrapper.wrap(this.zza), new zzcax(zzcbb.zzf(), zzcbb.zze()));
        }
    }

    public final void zzu() throws RemoteException {
        zzcaw zzcaw = this.zzb;
        if (zzcaw != null) {
            zzcaw.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzv() throws RemoteException {
    }

    public final void zzw() throws RemoteException {
    }

    public final void zzx() throws RemoteException {
    }

    public final void zzy() throws RemoteException {
        zzcaw zzcaw = this.zzb;
        if (zzcaw != null) {
            zzcaw.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
