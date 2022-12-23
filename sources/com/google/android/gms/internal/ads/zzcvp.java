package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcvp extends zzbcf {
    private final zzcvo zza;
    private final zzbs zzb;
    private final zzexh zzc;
    private boolean zzd = false;

    public zzcvp(zzcvo zzcvo, zzbs zzbs, zzexh zzexh) {
        this.zza = zzcvo;
        this.zzb = zzbs;
        this.zzc = zzexh;
    }

    public final zzbs zze() {
        return this.zzb;
    }

    public final zzdh zzf() {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
            return null;
        }
        return this.zza.zzl();
    }

    public final void zzg(boolean z) {
        this.zzd = z;
    }

    public final void zzh(zzde zzde) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzexh zzexh = this.zzc;
        if (zzexh != null) {
            zzexh.zzp(zzde);
        }
    }

    public final void zzi(IObjectWrapper iObjectWrapper, zzbcn zzbcn) {
        try {
            this.zzc.zzs(zzbcn);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbcn, this.zzd);
        } catch (RemoteException e) {
            zze.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzj(zzbck zzbck) {
    }
}
