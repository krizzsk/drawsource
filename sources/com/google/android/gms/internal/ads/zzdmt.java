package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdmt extends zzbkx {
    private final zzdnh zza;
    private IObjectWrapper zzb;

    public zzdmt(zzdnh zzdnh) {
        this.zza = zzdnh;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    public final float zze() throws RemoteException {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzfj)).booleanValue()) {
            return 0.0f;
        }
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e) {
                zze.zzh("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        } else {
            IObjectWrapper iObjectWrapper = this.zzb;
            if (iObjectWrapper != null) {
                return zzb(iObjectWrapper);
            }
            zzblb zzm = this.zza.zzm();
            if (zzm == null) {
                return 0.0f;
            }
            float zzd = (zzm.zzd() == -1 || zzm.zzc() == -1) ? 0.0f : ((float) zzm.zzd()) / ((float) zzm.zzc());
            return zzd == 0.0f ? zzb(zzm.zzf()) : zzd;
        }
    }

    public final float zzf() throws RemoteException {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfk)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    public final float zzg() throws RemoteException {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfk)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    public final zzdk zzh() throws RemoteException {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzfk)).booleanValue()) {
            return null;
        }
        return this.zza.zzj();
    }

    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzblb zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    public final boolean zzk() throws RemoteException {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfk)).booleanValue() && this.zza.zzj() != null) {
            return true;
        }
        return false;
    }

    public final void zzl(zzbmj zzbmj) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfk)).booleanValue() && (this.zza.zzj() instanceof zzcme)) {
            ((zzcme) this.zza.zzj()).zzv(zzbmj);
        }
    }
}
