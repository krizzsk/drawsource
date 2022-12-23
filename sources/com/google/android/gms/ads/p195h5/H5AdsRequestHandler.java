package com.google.android.gms.ads.p195h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbpo;

/* renamed from: com.google.android.gms.ads.h5.H5AdsRequestHandler */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class H5AdsRequestHandler {
    private final zzbpo zza;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbpo(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.zza.zzb(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return zzbpo.zzc(str);
    }
}
