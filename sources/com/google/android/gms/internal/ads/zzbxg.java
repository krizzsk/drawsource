package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbxg implements NativeCustomFormatAd {
    private final zzblv zza;
    private final MediaView zzb;
    private final VideoController zzc = new VideoController();
    private NativeCustomFormatAd.DisplayOpenMeasurement zzd;

    public zzbxg(zzblv zzblv) {
        Context context;
        this.zza = zzblv;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzblv.zzg());
        } catch (RemoteException | NullPointerException e) {
            zzcfi.zzh("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.zza.zzq(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzcfi.zzh("", e2);
            }
        }
        this.zzb = mediaView;
    }

    public final void destroy() {
        try {
            this.zza.zzk();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzd == null && this.zza.zzp()) {
                this.zzd = new zzbwy(this.zza);
            }
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
        return this.zzd;
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzblb zzf = this.zza.zzf(str);
            if (zzf != null) {
                return new zzbwz(zzf);
            }
            return null;
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzi(str);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            zzdk zze = this.zza.zze();
            if (zze != null) {
                this.zzc.zzb(zze);
            }
        } catch (RemoteException e) {
            zzcfi.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzc;
    }

    public final MediaView getVideoMediaView() {
        return this.zzb;
    }

    public final void performClick(String str) {
        try {
            this.zza.zzm(str);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzn();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }
}
