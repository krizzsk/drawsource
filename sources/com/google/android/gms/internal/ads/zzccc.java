package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzccc implements Runnable {
    public final /* synthetic */ zzcce zza;
    public final /* synthetic */ Bitmap zzb;

    public /* synthetic */ zzccc(zzcce zzcce, Bitmap bitmap) {
        this.zza = zzcce;
        this.zzb = bitmap;
    }

    public final void run() {
        this.zza.zzf(this.zzb);
    }
}
