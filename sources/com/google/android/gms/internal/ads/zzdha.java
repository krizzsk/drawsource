package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdha implements Runnable {
    public final /* synthetic */ zzdhb zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzdha(zzdhb zzdhb, Object obj) {
        this.zza = zzdhb;
        this.zzb = obj;
    }

    public final void run() {
        try {
            this.zza.zza(this.zzb);
        } catch (Throwable th) {
            zzt.zzo().zzs(th, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", th);
        }
    }
}
