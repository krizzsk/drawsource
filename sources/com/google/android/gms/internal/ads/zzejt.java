package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzejt extends zzcav {
    final /* synthetic */ zzddz zza;
    final /* synthetic */ zzdbr zzb;
    final /* synthetic */ zzdda zzc;
    final /* synthetic */ zzdjp zzd;

    zzejt(zzeju zzeju, zzddz zzddz, zzdbr zzdbr, zzdda zzdda, zzdjp zzdjp) {
        this.zza = zzddz;
        this.zzb = zzdbr;
        this.zzc = zzdda;
        this.zzd = zzdjp;
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzf(4);
    }

    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzb();
    }

    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper, zzcax zzcax) {
        this.zzd.zza(zzcax);
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzc.zze();
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
