package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzaa extends zzav {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzau zzb;

    zzaa(zzau zzau, Activity activity) {
        this.zzb = zzau;
        this.zza = activity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "ad_overlay");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzl(ObjectWrapper.wrap(this.zza));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbhz.zzc(this.zza);
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            return this.zzb.zzf.zza(this.zza);
        }
        try {
            return zzbxu.zzF(((zzbxy) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzz.zza)).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | zzcfl | NullPointerException e) {
            this.zzb.zzh = zzbyy.zza(this.zza.getApplicationContext());
            this.zzb.zzh.zzd(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
