package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeha extends zzcav implements zzddd {
    private zzcaw zza;
    private zzddc zzb;
    private zzdjr zzc;

    public final synchronized void zza(zzddc zzddc) {
        this.zzb = zzddc;
    }

    public final synchronized void zzc(zzcaw zzcaw) {
        this.zza = zzcaw;
    }

    public final synchronized void zzd(zzdjr zzdjr) {
        this.zzc = zzdjr;
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcaw = this.zza;
        if (zzcaw != null) {
            ((zzejt) zzcaw).zzb.onAdClicked();
        }
    }

    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcaw = this.zza;
        if (zzcaw != null) {
            zzcaw.zzf(iObjectWrapper);
        }
    }

    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzddc zzddc = this.zzb;
        if (zzddc != null) {
            zzddc.zza(i);
        }
    }

    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcaw = this.zza;
        if (zzcaw != null) {
            ((zzejt) zzcaw).zzc.zzb();
        }
    }

    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzddc zzddc = this.zzb;
        if (zzddc != null) {
            zzddc.zzd();
        }
    }

    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcaw = this.zza;
        if (zzcaw != null) {
            ((zzejt) zzcaw).zza.zzb();
        }
    }

    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdjr zzdjr = this.zzc;
        if (zzdjr != null) {
            zze.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzejs) zzdjr).zzc.zza)));
        }
    }

    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdjr zzdjr = this.zzc;
        if (zzdjr != null) {
            ((zzejs) zzdjr).zzd.zzb.execute(new zzejr((zzejs) zzdjr, ((zzejs) zzdjr).zza, ((zzejs) zzdjr).zzb, ((zzejs) zzdjr).zzc));
        }
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzcax zzcax) throws RemoteException {
        zzcaw zzcaw = this.zza;
        if (zzcaw != null) {
            ((zzejt) zzcaw).zzd.zza(zzcax);
        }
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcaw = this.zza;
        if (zzcaw != null) {
            ((zzejt) zzcaw).zzc.zze();
        }
    }

    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcaw = this.zza;
        if (zzcaw != null) {
            ((zzejt) zzcaw).zzd.zzc();
        }
    }
}
