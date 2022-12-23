package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzes extends zzcl {
    private zzbqn zza;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzbqn zzbqn = this.zza;
        if (zzbqn != null) {
            try {
                zzbqn.zzb(Collections.emptyList());
            } catch (RemoteException e) {
                zzcfi.zzk("Could not notify onComplete event.", e);
            }
        }
    }

    public final float zze() throws RemoteException {
        return 1.0f;
    }

    public final String zzf() {
        return "";
    }

    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    public final void zzh(String str) throws RemoteException {
    }

    public final void zzi() {
    }

    public final void zzj() throws RemoteException {
        zzcfi.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzcfb.zza.post(new zzer(this));
    }

    public final void zzk(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzl(zzcy zzcy) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    public final void zzn(zzbua zzbua) throws RemoteException {
    }

    public final void zzo(boolean z) throws RemoteException {
    }

    public final void zzp(float f) throws RemoteException {
    }

    public final void zzq(String str) throws RemoteException {
    }

    public final void zzr(zzbqn zzbqn) throws RemoteException {
        this.zza = zzbqn;
    }

    public final void zzs(zzez zzez) throws RemoteException {
    }

    public final boolean zzt() throws RemoteException {
        return false;
    }
}
