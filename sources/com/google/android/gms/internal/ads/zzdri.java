package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdri extends zzblr {
    private final String zza;
    private final zzdnc zzb;
    private final zzdnh zzc;

    public zzdri(String str, zzdnc zzdnc, zzdnh zzdnh) {
        this.zza = str;
        this.zzb = zzdnc;
        this.zzc = zzdnh;
    }

    public final Bundle zzb() throws RemoteException {
        return this.zzc.zzd();
    }

    public final zzdk zzc() throws RemoteException {
        return this.zzc.zzj();
    }

    public final zzbkt zzd() throws RemoteException {
        return this.zzc.zzl();
    }

    public final zzblb zze() throws RemoteException {
        return this.zzc.zzo();
    }

    public final IObjectWrapper zzf() throws RemoteException {
        return this.zzc.zzt();
    }

    public final IObjectWrapper zzg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    public final String zzh() throws RemoteException {
        return this.zzc.zzv();
    }

    public final String zzi() throws RemoteException {
        return this.zzc.zzw();
    }

    public final String zzj() throws RemoteException {
        return this.zzc.zzx();
    }

    public final String zzk() throws RemoteException {
        return this.zzc.zzz();
    }

    public final String zzl() throws RemoteException {
        return this.zza;
    }

    public final List zzm() throws RemoteException {
        return this.zzc.zzE();
    }

    public final void zzn() throws RemoteException {
        this.zzb.zzV();
    }

    public final void zzo(Bundle bundle) throws RemoteException {
        this.zzb.zzz(bundle);
    }

    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzE(bundle);
    }

    public final boolean zzq(Bundle bundle) throws RemoteException {
        return this.zzb.zzQ(bundle);
    }
}