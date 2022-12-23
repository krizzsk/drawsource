package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbds {
    zzarb zza;
    boolean zzb;
    /* access modifiers changed from: private */
    public final ExecutorService zzc = zzcex.zzb;

    public zzbds() {
    }

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final void zzb(Context context) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdV)).booleanValue()) {
            try {
                this.zza = (zzarb) zzcfm.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbdo.zza);
                this.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzb = true;
            } catch (RemoteException | zzcfl | NullPointerException unused) {
                zzcfi.zze("Cannot dynamite load clearcut");
            }
        }
    }

    public zzbds(Context context) {
        zzbhz.zzc(context);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzis)).booleanValue()) {
            this.zzc.execute(new zzbdn(this, context));
        } else {
            zzb(context);
        }
    }
}
