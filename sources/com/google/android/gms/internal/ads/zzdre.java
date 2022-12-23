package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdre extends zzbqu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbkm {
    private View zza;
    private zzdk zzb;
    private zzdnc zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdre(zzdnc zzdnc, zzdnh zzdnh) {
        this.zza = zzdnh.zzf();
        this.zzb = zzdnh.zzj();
        this.zzc = zzdnc;
        if (zzdnh.zzr() != null) {
            zzdnh.zzr().zzao(this);
        }
    }

    private final void zzg() {
        View view;
        zzdnc zzdnc = this.zzc;
        if (zzdnc != null && (view = this.zza) != null) {
            zzdnc.zzv(view, Collections.emptyMap(), Collections.emptyMap(), zzdnc.zzP(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbqy zzbqy, int i) {
        try {
            zzbqy.zze(i);
        } catch (RemoteException e) {
            zze.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onGlobalLayout() {
        zzg();
    }

    public final void onScrollChanged() {
        zzg();
    }

    public final zzdk zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        zze.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final zzbky zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zze.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdnc zzdnc = this.zzc;
        if (zzdnc == null || zzdnc.zza() == null) {
            return null;
        }
        return zzdnc.zza().zza();
    }

    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdnc zzdnc = this.zzc;
        if (zzdnc != null) {
            zzdnc.zzV();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdrd(this));
    }

    public final void zzf(IObjectWrapper iObjectWrapper, zzbqy zzbqy) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zze.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbqy, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            zze.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbqy, 0);
        } else if (this.zze) {
            zze.zzg("Instream ad should not be used again.");
            zzi(zzbqy, 1);
        } else {
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            zzt.zzx();
            zzcgi.zza(this.zza, this);
            zzt.zzx();
            zzcgi.zzb(this.zza, this);
            zzg();
            try {
                zzbqy.zzf();
            } catch (RemoteException e) {
                zze.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
