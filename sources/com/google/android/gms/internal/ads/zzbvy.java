package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzbvy implements MediationAdLoadCallback {
    final /* synthetic */ zzbvh zza;
    final /* synthetic */ zzbug zzb;

    zzbvy(zzbwe zzbwe, zzbvh zzbvh, zzbug zzbug) {
        this.zza = zzbvh;
        this.zzb = zzbug;
    }

    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        if (mediationBannerAd == null) {
            zzcfi.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzcfi.zzh("", e);
                return null;
            }
        } else {
            try {
                this.zza.zzg(ObjectWrapper.wrap(mediationBannerAd.getView()));
            } catch (RemoteException e2) {
                zzcfi.zzh("", e2);
            }
            return new zzbwf(this.zzb);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
