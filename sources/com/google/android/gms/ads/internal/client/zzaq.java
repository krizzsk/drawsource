package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzbli;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzaq extends zzav {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzau zzd;

    zzaq(zzau zzau, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzau;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zzc, "native_ad_view_delegate");
        return new zzet();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzh(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbhz.zzc(this.zzc);
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            return this.zzd.zzd.zza(this.zzc, this.zza, this.zzb);
        }
        try {
            return zzble.zzbB(((zzbli) zzcfm.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzap.zza)).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 221908000));
        } catch (RemoteException | zzcfl | NullPointerException e) {
            this.zzd.zzh = zzbyy.zza(this.zzc);
            this.zzd.zzh.zzd(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
