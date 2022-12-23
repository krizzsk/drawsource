package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzegr implements zzdlg {
    public final /* synthetic */ zzcga zza;

    public /* synthetic */ zzegr(zzcga zzcga) {
        this.zza = zzcga;
    }

    public final void zza(boolean z, Context context, zzdcg zzdcg) {
        zzcga zzcga = this.zza;
        try {
            zzt.zzj();
            zzm.zza(context, (AdOverlayInfoParcel) zzcga.get(), true);
        } catch (Exception unused) {
        }
    }
}
